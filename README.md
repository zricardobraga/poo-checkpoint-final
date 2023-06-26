
# Programa de cadastro de clientes e funcionários da Livraria da Rua do Limoeiro

A Livraria da Rua do Limoeiro é uma pequena livraria de bairro onde as pessoas podem comprar seus livros e revistas preferidas e relaxar tomando um bom café com biscoitos.
Nos últimos meses, as pessoas do bairro cansadas de receber suas encomendas por drones da Amazon, já que esses drones acabam assustando os passarinhos da rua, voltaram a comprar seus livros na livraria do bairro.

Assim, considerando o expressivo aumento nas vendas, se faz necessária a criação de uma aplicação onde possam ser realizados os cadastros, tanto dos funcionários da livraria, dos seus clientes e dos exemplares disponíveis para venda. O software terá que possibilitar ao atendente cadastrar no sistema: o id, o nome, sobrenome, cpf e salário base, sendo ossível atribuir um bônus para os funcionários, e salário total; o id, o nome, sobrenome, cpf, endereço e o telefone do cliente; retirar uma lista com todos os clientes e funcionários cadastrados; buscar todos os clientes e funcionários pelo número do id; o nome, a editora e a edição do livro ou da revista (nesta última será necessário especificar qual é o seu tema); e por fim, o id, o cliente, a data, o valor e o exemplar(es) vendido(s). 

Detalhamento das classes:

1 - As classes Funcionário e Cliente herdam de Pessoa; 
2 - A classe Cliente se associa com a classe Endereço; 
3 - A interface Buscar é implementada tanto na classe Cliente quanto na classe Funcionário;
4 - A classe Venda é composta pela classe Cliente e está associada com a classe Exemplar; 
5 - As classes Livro e Revista herdam da classe Exemplar.

Na minha regra de negócio aplicada uma venda não existe sem um cliente.