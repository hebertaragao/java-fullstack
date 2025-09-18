console.log('=== CLASSES ===\n');





// Criando uma classe simples
class Pessoa {
    // Constructor é executado quando criamos uma nova pessoa
    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Método da classe
    apresentar() {
        return `Oi, eu sou ${this.nome} e tenho ${this.idade} anos`;
    }
    
    // Outro método
    aniversario() {
        this.idade++;
        return `Agora tenho ${this.idade} anos!`;
    }
}





// Criando objetos da classe
const pessoa1 = new Pessoa('Carlos', 25);
const pessoa2 = new Pessoa('Luciana', 30);

console.log(pessoa1.apresentar());
console.log(pessoa2.apresentar());

console.log(pessoa1.aniversario());
console.log(pessoa1.apresentar()); // Idade mudou!





// HERANÇA - uma classe filha da classe Pessoa
class Estudante extends Pessoa {
    constructor(nome, idade, curso) {
        super(nome, idade); // Chama o constructor da classe pai
        this.curso = curso;
    }
    
    apresentar() {
        return `${super.apresentar()} e estudo ${this.curso}`;
    }
}

const estudante = new Estudante('Marina', 22, 'Engenharia');
console.log(estudante.apresentar());