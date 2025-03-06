// import { ValidationAcceptor } from 'langium';
// import { Program, VariableDeclaration, FunctionDeclaration, VariableAssignement, BooleanExpr, ArithmeticExpr } from './generated/ast.js';
import { RobmlServices } from './robml-module.js';

export function registerValidationChecks(services: RobmlServices) {
    // const registry = services.validation.ValidationRegistry;
    // const validator = services.validation.RobmlValidator;
    // registry.register({
    //     Program: validator.checkProgram,
    //     VariableDeclaration: validator.checkVariableDeclaration,
    //     FunctionDeclaration: validator.checkFunctionDeclaration,
    //     VariableAssignement: validator.checkVariableAssignment,
    //     BooleanExpr: validator.checkBooleanExpr,
    //     ArithmeticExpr: validator.checkArithmeticExpr
    // });
}

export class MyDslValidator {

    // checkProgram(program: Program, accept: ValidationAcceptor): void {
    //     const variableNames = new Set<string>();
    //     program.instruction.forEach((instr: { $type: string; }) => {
    //         if (instr.$type === 'VariableDeclaration') {
    //             const varDecl = instr as VariableDeclaration;
    //             if (variableNames.has(varDecl.name!)) {
    //                 accept('error', `La variable '${varDecl.name}' est déjà déclarée.`, { node: varDecl, property: 'name' });
    //             } else {
    //                 variableNames.add(varDecl.name!);
    //             }
    //         }
    //     });
    // }

    // checkVariableDeclaration(varDecl: VariableDeclaration, accept: ValidationAcceptor): void {
    //     if (!varDecl.name) {
    //         accept('error', 'Une variable doit avoir un nom.', { node: varDecl });
    //     }
    //     if (!varDecl.type) {
    //         accept('error', `La variable '${varDecl.name}' doit avoir un type défini.`, { node: varDecl, property: 'type' });
    //     }
    // }

    // checkFunctionDeclaration(funcDecl: FunctionDeclaration, accept: ValidationAcceptor): void {
    //     if (!funcDecl.name) {
    //         accept('error', 'Une fonction doit avoir un nom.', { node: funcDecl });
    //     }
    //     if (!funcDecl.instruction || funcDecl.instruction.length === 0) {
    //         accept('warning', `La fonction '${funcDecl.name}' ne contient aucune instruction.`, { node: funcDecl });
    //     }
    // }

    // checkVariableAssignment(assign: VariableAssignement, accept: ValidationAcceptor): void {
    //     if (!assign.variabledeclaration) {
    //         accept('error', 'Une affectation doit concerner une variable déclarée.', { node: assign });
    //     }
    //     if (!assign.expression || assign.expression.length === 0) {
    //         accept('error', `Aucune expression attribuée à la variable '${assign.variabledeclaration?.ref?.name}'.`, { node: assign });
    //     }
    // }

    // checkBooleanExpr(boolExpr: BooleanExpr, accept: ValidationAcceptor): void {
    //     if (!boolExpr.operator) {
    //         accept('error', 'Un opérateur booléen doit être spécifié.', { node: boolExpr });
    //     }
    //     if (!boolExpr.left || !boolExpr.right) {
    //         accept('error', 'Une expression booléenne doit avoir deux opérandes.', { node: boolExpr });
    //     }
    // }

    // checkArithmeticExpr(arithExpr: ArithmeticExpr, accept: ValidationAcceptor): void {
    //     if (!arithExpr.operator) {
    //         accept('error', 'Un opérateur arithmétique doit être spécifié.', { node: arithExpr });
    //     }
    //     if (!arithExpr.left || !arithExpr.right) {
    //         accept('error', 'Une expression arithmétique doit avoir deux opérandes.', { node: arithExpr });
    //     }
    // }
}
