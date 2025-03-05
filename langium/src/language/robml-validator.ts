import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobmlAstType, ArithmeticExpr, BooleanExpr, VariableDeclaration } from './generated/ast.js';
import { RobmlServices } from './robml-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobmlServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobmlValidator;
    const checks: ValidationChecks<RobmlAstType> = {
        ArithmeticExpr: validator.checkArithmeticExpr,
        BooleanExpr: validator.checkBooleanExpr,
        VariableDeclaration: validator.checkVariableDeclaration
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class RobmlValidator {
    

    /**
     * Vérifie qu'une expression arithmétique a bien un opérateur et deux opérandes valides.
     */
     checkArithmeticExpr(expr: ArithmeticExpr, accept: ValidationAcceptor): void {
        if (!expr.operator) {
            accept('error', 'Une expression arithmétique doit avoir un opérateur.', { node: expr });
        }
        if (!expr.left || !expr.right) {
            accept('error', 'Une expression arithmétique doit avoir deux opérandes (left et right).', { node: expr });
        }
    }

    /**
     * Vérifie que les expressions booléennes ont bien un opérateur et des expressions valides.
     */
     checkBooleanExpr(expr: BooleanExpr, accept: ValidationAcceptor): void {
        if (!expr.operator) {
            accept('error', 'Une expression booléenne doit avoir un opérateur.', { node: expr });
        }
        if (!expr.left || !expr.right) {
            accept('error', 'Une expression booléenne doit avoir deux opérandes (left et right).', { node: expr });
        }
    }

    /**
     * Vérifie qu'une déclaration de variable a bien un nom et un type.
     */
     checkVariableDeclaration(decl: VariableDeclaration, accept: ValidationAcceptor): void {
        if (!decl.name) {
            accept('error', 'Une variable doit avoir un nom.', { node: decl });
        }
        if (!decl.type) {
            accept('error', 'Une variable doit avoir un type.', { node: decl });
        }
    }
}
