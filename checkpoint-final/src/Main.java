import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

		System.out.println("***CADASTRO DE FUNCIONÁRIOS***");

		try {
			System.out.println("Id: ");
			int id = input.nextInt();

			input.nextLine();

			System.out.println("Nome: ");
			String nomeFuncionario = input.nextLine();

			System.out.println("Sobrenome: ");
			String sobrenomeFuncionario = input.nextLine();

			System.out.println("cpf: ");
			String cpfFuncionario = input.nextLine();

			System.out.println("Salário Base: ");
			Double salarioBase = input.nextDouble();

			System.out.println("Informe o valor do bônus: ");
			Double bonus = input.nextDouble();

			Funcionario funcionario1 = new Funcionario(id, nomeFuncionario, sobrenomeFuncionario, cpfFuncionario, salarioBase);
			funcionario1.atribuirBonus(bonus);

			System.out.println();

			System.out.println("***FUNCIONÁRIO CADASTRADO***");
			System.out.println(funcionario1.toString());

			System.out.println();

//			Funcionario funcionario2 = new Funcionario(02,"Eddie", "Brok", "123456", 2000.00);
//			funcionario2.atribuirBonus(600.00);
//			System.out.println(funcionario2.toString());
//
			funcionario1.setFuncionarios(funcionario1);
//			funcionario1.setFuncionarios(funcionario2);

			System.out.println("***LISTAR FUNCIONÁRIOS POR ID");
			System.out.println(funcionario1.buscarPorId(01));

			System.out.println();

			System.out.println(funcionario1.listarFuncionarios());

			System.out.println();

		} catch (InputMismatchException e) {
			System.err.println("Por favor as informações corretamente");
		}

        System.out.println("***CADASTRO DE CLIENTES***");

        Cliente cliente1 = new Cliente(01,"Frodo", "Bolseiro", "999999",
                new Endereco("Rua das tocas", "100", "Condado", "80789000"), 10101010);
        System.out.println(cliente1.toString());

        System.out.println();

        Cliente cliente2 = new Cliente(02,"Sam", "Gamgee", "888888",
                new Endereco("Rua das tocas", "102", "Condado", "80789000"), 10101012);

        System.out.println(cliente2.toString());

        cliente1.setClientes(cliente1);
        cliente1.setClientes(cliente2);

	    System.out.println();

        System.out.println("***LISTAR CLIENTES POR ID");
        System.out.println(cliente1.buscarPorId(01));

		System.out.println();

		System.out.println("***LISTAR TODOS OS CLIENTES***");
	    System.out.println(cliente1.listarClientes());


		//CADASTRO DOS EXEMPLARES

        Livro livro1 = new Livro("O Senhor dos Aneis: A Sociedade do Anel", "Harpers Collins", 1);
        Livro livro2 = new Livro("O Senhor dos Aneis: Duas Torres", "Harpers Collins", 1);
        Livro livro3 = new Livro("O Senhor dos Aneis: O Retorno do Rei", "Harpers Collins", 1);

        Revista revista1 = new Revista("Ação Games", "Editora Abril", 50, "Games");
        Revista revista2 = new Revista("Superinteressante", "Editora Abril", 700, "Ciência/Curiosidade");

        ArrayList<Exemplar> livros = new ArrayList<Exemplar>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        ArrayList<Exemplar> revistas = new ArrayList<Exemplar>();
        revistas.add(revista1);
        revistas.add(revista2);

        System.out.println();

	    //CADASTRO E EXIBIÇÃO DAS VENDAS

        System.out.println("***CADASTRO DA VENDA***");

        Venda venda1 = new Venda(001, cliente1, "04/06/2023", 500.00, livro1.listarExemplares(livros));

		System.out.println(venda1.toString());

        System.out.println();

        Venda venda2 = new Venda(002, cliente2, "04/06/2023", 100.00, livro1.listarExemplares(revistas));
        System.out.println(venda2.toString());
    }
}
