package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import utilities.Metodos;
import models.Funcionario;

public class Programa extends Metodos {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int op = -1;

		do {
			mostrarMenu();
			System.out.print("Escolha uma opção listada (Digite e pressione o botão enter): ");
			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				// Registrando um novo empregado
				break;

			case 2:
				// Listar os empregados registrados

				break;

			case 3:
				// Criar uma nova tarefa

				break;

			case 4:
				// Listas todas as tarefas ativas

				break;

			case 5:
				// Editar uma tarefa existente

				break;

			case 6:
				// Excluir uma tarefa

				break;

			case 0:
				System.out.println("""
						\nSaindo do programa...
						Obrigado por utilizar!
						""");
				break;

			default:
				System.out.println("Opção invalida! Por favor tente novamente.");
				break;
			}

		} while (op != 0);

		sc.close();
	}

}