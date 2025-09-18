console.log('=== EXEMPLO PRÁTICO - LOJA ===\n');

// Array de produtos de uma loja
const produtos = [
    { nome: 'Notebook', preco: 2000 },
    { nome: 'Mouse', preco: 50 },
    { nome: 'Teclado', preco: 150 },
    { nome: 'Monitor', preco: 800 }
];

console.log('Produtos da loja:', produtos);
console.log('---');





// Aplicar desconto de 10% em todos os produtos
const produtosComDesconto = produtos.map(produto => ({
    nome: produto.nome,
    precoOriginal: produto.preco,
    precoComDesconto: produto.preco * 0.9
}));

console.log('Produtos com 10% de desconto:');
produtosComDesconto.forEach(produto => {
    console.log(`${produto.nome}: R$ ${produto.precoOriginal} → R$ ${produto.precoComDesconto}`);
});
console.log('---');





// Filtrar produtos baratos (menos de R$ 200)
const produtosBaratos = produtos.filter(produto => produto.preco < 200);
console.log('Produtos baratos (< R$ 200):', produtosBaratos);
console.log('---');





// Encontrar produto mais caro
const produtoMaisCaro = produtos.reduce((maior, produto) => {
    return produto.preco > maior.preco ? produto : maior;
});
console.log('Produto mais caro:', produtoMaisCaro);





// Calcular valor total de todos os produtos
const valorTotal = produtos.reduce((total, produto) => total + produto.preco, 0);
console.log('Valor total dos produtos: R$', valorTotal);