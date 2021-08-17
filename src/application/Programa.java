package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Ordem;
import entities.OrdemPedido;
import entities.Produto;
import entities.enums.OrdemStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente:");
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Email:");
		String email = sc.nextLine();
		System.out.println("Data de nascimento: ");
		Date nascimento = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, nascimento);

		System.out.println("Entre com os dados do pedido:");
		System.out.println("Status:");
		OrdemStatus status = OrdemStatus.valueOf(sc.next());
		
		Ordem ordem = new Ordem(new Date(),status, cliente);

		System.out.println("Quantos itens tem esse pedido: ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Entre com os dados do #" + (i + 1) + "pedido");
			System.out.println("Nome do produto:");
			sc.nextLine();
			String produto_nome = sc.nextLine();
			System.out.println("Preço do produto:");
			double preco = sc.nextDouble();
			System.out.println("Quantidade:");
			int quantidade = sc.nextInt();

			Produto produto = new Produto(produto_nome, preco);
			OrdemPedido ordem_pedido = new OrdemPedido(quantidade, preco, produto);
			ordem.adicionaItem(ordem_pedido);
		}
		System.out.println("");
		System.out.println(ordem);
		sc.close();
	}

}
