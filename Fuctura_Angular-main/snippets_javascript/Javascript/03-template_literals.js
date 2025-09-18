console.log('=== TEMPLATE LITERALS ===\n');

const nome = 'Ana';
const idade = 28;



// Forma antiga de juntar strings
const apresentacaoAntiga = 'Oi, eu sou ' + nome + ' e tenho ' + idade + ' anos';
console.log('Forma antiga:', apresentacaoAntiga);





// Forma moderna com template literals (use crases `` ao invés de aspas)
const apresentacaoNova = `Oi, eu sou ${nome} e tenho ${idade} anos`;
console.log('Forma nova:', apresentacaoNova);





// Fazendo cálculos dentro do template literal (não é uma boa prática)
const preco = 100;
const desconto = 20;
const mensagem = `Preço original: R$ ${preco}, com desconto: R$ ${preco - desconto}`;
console.log(mensagem);





// Texto em múltiplas linhas (sem precisar usar \n)
const texto = `
    Esta é uma mensagem
    que tem várias linhas
    e fica mais fácil de ler
`;
console.log(texto);