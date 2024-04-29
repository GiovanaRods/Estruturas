package estruturas;

import java.util.Stack;
import java.util.Scanner;

public class pilha {

	public static void main(String[] args) {
		/*Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, 
		 * para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu 
		 * que aceitará as opções 0, 1, 2 e 3:
		1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		2: Listar todos os livros da Pilha
		3: Retirar um livro da pilha 
		0: O programa deve ser finalizado. 
		Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, 
		ele deverá informar que a pilha está vazia.
		 */
		Stack<String> pilha = new Stack<String>();
		int opcao;
		String opcao1;
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);

		while (true) {
			System.out.println("Selecione uma opção:");
			System.out.println(" 1 - Adicionar um novo livro na pilha.");
			System.out.println(" 2 - Listar todos os livros da Pilha");
			System.out.println(" 3 - Retirar um livro da pilha");
			System.out.println(" 0 - O programa deve ser finalizado.");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.print("Digite um livro para adicionar: ");
				opcao1 = leia2.nextLine();
				pilha.add(opcao1);

				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				System.out.println("Livros na pilha: " + pilha);
				for (String i : pilha) {
					System.out.println(i);
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					pilha.pop();
					System.out.println(pilha);
					System.out.println("O livro foi retirado!");
					break;
				}

			} if (opcao == 0) {
				System.out.println("Programa Finalizado!");
				break;
			}
		}
	}
}