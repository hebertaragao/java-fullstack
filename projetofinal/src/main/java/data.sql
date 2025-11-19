-- Script SQL para inserção de dados iniciais no banco de dados
-- Este arquivo é executado automaticamente pelo Spring Boot na inicialização
-- quando spring.jpa.hibernate.ddl-auto está configurado como 'create' ou
'create-drop'
-- Inserção de categorias padrão
-- ON CONFLICT DO NOTHING evita erros se os dados já existirem
INSERT INTO categoria (nome) VALUES ('Romance') ON CONFLICT DO NOTHING;
INSERT INTO categoria (nome) VALUES ('Suspense') ON CONFLICT DO NOTHING;
INSERT INTO categoria (nome) VALUES ('Tecnologia') ON CONFLICT DO NOTHING;
INSERT INTO categoria (nome) VALUES ('Rock') ON CONFLICT DO NOTHING;
INSERT INTO categoria (nome) VALUES ('Pop') ON CONFLICT DO NOTHING;
INSERT INTO categoria (nome) VALUES ('Ciência') ON CONFLICT DO NOTHING;
-- Exemplos de dados de teste (opcional)
-- Descomente as linhas abaixo para inserir dados de exemplo
-- INSERT INTO item (titulo, autor_artista, categoria_id, dtype)
-- VALUES ('Dom Casmurro', 'Machado de Assis', 1, 'Livro') ON CONFLICT DO
NOTHING;
-- INSERT INTO livro (id, isbn, numero_paginas)
-- VALUES (1, '978-85-359-0277-5', 256) ON CONFLICT DO NOTHING;