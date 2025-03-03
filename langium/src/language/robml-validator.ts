import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobmlAstType, Person } from './generated/ast.js';
import type { RobmlServices } from './robml-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobmlServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobmlValidator;
    const checks: ValidationChecks<RobmlAstType> = {
        Person: validator.checkPersonStartsWithCapital
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class RobmlValidator {

    checkPersonStartsWithCapital(person: Person, accept: ValidationAcceptor): void {
        if (person.name) {
            const firstChar = person.name.substring(0, 1);
            if (firstChar.toUpperCase() !== firstChar) {
                accept('warning', 'Person name should start with a capital.', { node: person, property: 'name' });
            }
        }
    }

}
