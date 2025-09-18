console.log('=== FUNCTIONS ===\n');



// FUNÇÃO TRADICIONAL
function somar(a, b) {
    return a + b;
}

console.log('Soma 5 + 3 =', somar(5, 3));





// ARROW FUNCTION - forma mais moderna e curta
const multiplicar = (a, b) => {
    return a * b;
};

console.log('Multiplicação 4 × 2 =', multiplicar(4, 2));





// ARROW FUNCTION ainda mais curta (sem chaves quando tem só uma linha)
const dividir = (a, b) => a / b;

console.log('Divisão 10 ÷ 2 =', dividir(10, 2));





// ARROW FUNCTION com um só parâmetro (sem parênteses)
const dobrar = numero => numero * 2;

console.log('Dobro de 7 =', dobrar(7));





// ARROW FUNCTION sem parâmetros
const cumprimentar = () => 'Olá!';

console.log('Cumprimento:', cumprimentar());