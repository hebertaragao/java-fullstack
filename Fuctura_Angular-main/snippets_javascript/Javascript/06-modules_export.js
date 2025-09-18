// Exportando uma função
function somar(a, b) {
    return a + b;
}





// Exportando uma variável
const PI = 3.14159;





// Exportando uma classe
class Calculadora {
    multiplicar(a, b) {
        return a * b;
    }
}





// Diferentes formas de exportar
module.exports = {
    somar,
    PI,
    Calculadora
};