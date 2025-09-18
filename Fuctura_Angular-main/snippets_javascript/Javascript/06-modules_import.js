console.log('=== MÓDULOS ===\n');

// Importando do arquivo 05-modules-exporta.js
import { somar, PI, Calculadora } from './05-modules-exporta.js';

console.log('Soma importada 5 + 3 =', somar(5, 3));
console.log('Valor de PI =', PI);

const calc = new Calculadora();
console.log('Multiplicação 4 × 6 =', calc.multiplicar(4, 6));