console.log('=== VARIÁVEIS ===\n');



// VAR - pode ser alterada e redeclarada
var nome = 'João';
console.log('Nome inicial:', nome);

var nome = 'Maria'; // Pode redeclarar
console.log('Nome alterado:', nome);

nome = 'Pedro'; // Pode alterar valor
console.log('Nome final:', nome);

console.log('---');





// LET - pode ser alterada, mas não redeclarada
let idade = 25;
console.log('Idade inicial:', idade);

idade = 30; // Pode alterar valor
console.log('Idade alterada:', idade);

// let idade = 35; // ERRO! Não pode redeclarar

console.log('---');





// CONST - não pode ser alterada nem redeclarada
const cidade = 'São Paulo';
console.log('Cidade:', cidade);

// cidade = 'Rio de Janeiro'; // ERRO! Não pode alterar
// const cidade = 'Brasília'; // ERRO! Não pode redeclarar

// Mas arrays e objetos podem ter seu conteúdo modificado
const frutas = ['maçã', 'banana'];
frutas.push('laranja'); // Isso funciona!
frutas.push(3);
console.log('Frutas:', frutas);
