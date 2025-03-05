import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobmlAstType, ArithmeticExpr, BooleanExpr, VariableDeclaration } from './generated/ast.ts';
import { RobmlServices } from './robml-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobmlServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobmlValidator;
    const checks: ValidationChecks<RobmlAstType> = {
        ArithmeticExpr: validator.checkArithmeticExpr,
        BooleanExpr: validator.checkBooleanExprOperands,
        VariableDeclaration: validator.checkVariableDeclaration
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class RobmlValidator {

    /**
     * Vérifie qu'une expression arithmétique a bien un opérateur si elle a des opérandes.
     */
    checkArithmeticExpr(expr: ArithmeticExpr, accept: ValidationAcceptor): void {
        if ((expr.left || expr.right) && !expr.operator) {
            accept('error', 'ArithmeticExpr must have an operator if left or right is defined.', {
                node: expr,
                property: 'operator'
            });
        }
    }

    /**
     * Vérifie que les expressions booléennes ont des opérandes valides.
     */
    checkBooleanExprOperands(expr: BooleanExpr, accept: ValidationAcceptor): void {
        if (!expr.operator) {
            accept('error', 'BooleanExpr must have an operator.', { node: expr, property: 'operator' });
        }
        if ((expr.left && expr.right) && (expr.operator === 'NOT')) {
            accept('error', 'BooleanExpr with NOT operator should have only one operand.', {
                node: expr,
                property: 'operator'
            });
        }
    }

    /**
     * Vérifie que les déclarations de variables ont un type défini.
     */
    checkVariableDeclaration(variable: VariableDeclaration, accept: ValidationAcceptor): void {
        if (!variable.type) {
            accept('error', 'VariableDeclaration must have a type.', { node: variable, property: 'type' });
        }
    }

}
