console.log('=== OBJETOS ===\n');

// CRIANDO UM OBJETO SIMPLES
const pessoa = {
    nome: 'João',
    idade: 30,
    cidade: 'São Paulo'
};

console.log('Objeto pessoa:', pessoa);
console.log('Nome:', pessoa.nome);
console.log('Idade:', pessoa.idade);
console.log('---');





// DIFERENTES FORMAS DE ACESSAR PROPRIEDADES
console.log('Acessando com ponto:', pessoa.nome);
console.log('Acessando com colchetes:', pessoa['nome']);
console.log('---');





// MODIFICANDO PROPRIEDADES
pessoa.idade = 31;
pessoa['cidade'] = 'Rio de Janeiro';
console.log('Depois das modificações:', pessoa);
console.log('---');





// ADICIONANDO NOVAS PROPRIEDADES
pessoa.profissao = 'Desenvolvedor';
pessoa.salario = 5000;
console.log('Com novas propriedades:', pessoa);
console.log('---');





// OBJETOS COM MÉTODOS (funções dentro do objeto)
const calculadora = {
    marca: 'Casio',
    modelo: 'FX-82MS',
    
    somar: function(a, b) {
        return a + b;
    },
    
    // Forma mais moderna de escrever métodos
    multiplicar(a, b) {
        return a * b;
    },
    
    // Arrow function como método
    apresentar: () => {
        return 'Eu sou uma calculadora!';
    }
};

console.log('Calculadora:', calculadora.marca, calculadora.modelo);
console.log('Soma 5 + 3 =', calculadora.somar(5, 3));
console.log('Multiplicação 4 × 2 =', calculadora.multiplicar(4, 2));
console.log(calculadora.apresentar());
console.log('---');




// OBJETO MAIS COMPLEXO
const carro = {
    marca: 'Toyota',
    modelo: 'Corolla',
    ano: 2022,
    cor: 'Prata',
    ligado: false,
    
    ligar() {
        this.ligado = true;
        return 'Carro ligado!';
    },
    
    desligar() {
        this.ligado = false;
        return 'Carro desligado!';
    },
    
    status() {
        return `${this.marca} ${this.modelo} está ${this.ligado ? 'ligado' : 'desligado'}`;
    }
};

console.log(carro.status());
console.log(carro.ligar());
console.log(carro.status());
console.log('---');





// ARRAY DE OBJETOS (muito comum!)
const estudantes = [
    { nome: 'Ana', idade: 20, nota: 8.5 },
    { nome: 'Bruno', idade: 22, nota: 7.0 },
    { nome: 'Carlos', idade: 19, nota: 9.2 },
    { nome: 'Diana', idade: 21, nota: 6.8 }
];

console.log('Lista de estudantes:');
estudantes.forEach(estudante => {
    console.log(`${estudante.nome}, ${estudante.idade} anos, nota: ${estudante.nota}`);
});
