package estruturas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da
		 * Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O
		 * programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar
		 * um novo Cliente na fila. Deve solicitar o nome do Cliente. 2: Listar todos os
		 * Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0: O programa deve
		 * ser finalizado. Caso a fila esteja vazia, o programa deverá informar que a
		 * fila está vazia ao tentar retirar (chamar) um cliente da fila
		 */

		Queue<String> fila = new LinkedList<String>();
		int opcao;
		String opcao1;
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);

		while (true) {
			System.out.println("Selecione uma opção:");
			System.out.println(" 1 - Adicionar um novo Cliente na fila ");
			System.out.println(" 2 - Listar todos os Clientes na fila ");
			System.out.println(" 3 - Chamar (retirar) uma pessoa da fila");
			System.out.println(" 0 - O programa deve ser finalizado.");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.print("Digite um nome para adicionar: ");
				opcao1 = leia2.nextLine();
				fila.add(opcao1);

				System.out.println("\nCliente adicionado!\n");
				break;

			case 2:
				System.out.println("Clientes da fila: " + fila);
				for (String i : fila) {
					System.out.println(i);
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");
				} else {
					fila.poll();
					System.out.println(fila);
					System.out.println("O cliente foi chamado!");
					break;
				}

			} if (opcao == 0) {
				System.out.println("Programa Finalizado!");
				break;
			}
		}
	}
}