console.log('=== ARRAY FUNCTIONS ===\n');





// Array de exemplo
const numeros = [1, 2, 3, 4, 5];
const pessoas = ['Ana', 'Bruno', 'Carlos', 'Diana'];

console.log('Array original:', numeros);
console.log('Pessoas:', pessoas);
console.log('---');





// MAP - transforma cada elemento do array
const numerosDobrados = numeros.map(numero => numero * 2);
console.log('MAP - números dobrados:', numerosDobrados);

const pessoasComOla = pessoas.map(pessoa => `Olá, ${pessoa}!`);
console.log('MAP - pessoas com olá:', pessoasComOla);
console.log('---');





// FILTER - filtra elementos baseado em uma condição
const numerosPares = numeros.filter(numero => numero % 2 === 0);
console.log('FILTER - números pares:', numerosPares);

const pessoasComA = pessoas.filter(pessoa => pessoa.includes('a'));
console.log('FILTER - pessoas com "a":', pessoasComA);
console.log('---');





// FIND - encontra o primeiro elemento que atende a condição
const primeiroMaiorQue3 = numeros.find(numero => numero > 3);
console.log('FIND - primeiro > 3:', primeiroMaiorQue3);

const pessoaComC = pessoas.find(pessoa => pessoa.startsWith('C'));
console.log('FIND - pessoa que começa com C:', pessoaComC);
console.log('---');





// REDUCE - reduz o array para um único valor
const soma = numeros.reduce((total, numero) => total + numero, 0);
console.log('REDUCE - soma de todos:', soma);

const todasPessoas = pessoas.reduce((frase, pessoa) => frase + pessoa + ' ', '');
console.log('REDUCE - todas pessoas:', todasPessoas);
console.log('---');





// FOREACH - executa algo para cada elemento (não retorna novo array)
console.log('FOREACH - imprimindo cada número:');
numeros.forEach(numero => console.log(`Número: ${numero}`));

console.log('FOREACH - imprimindo cada pessoa:');
pessoas.forEach((pessoa, index) => console.log(`${index + 1}. ${pessoa}`));
