package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import utilities.Metodos;
import models.Funcionario;

public class Programa extends Metodos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op = -1;

        do {
            mostrarMenu();
            System.out.print("ESCOLHA: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    registrarFuncionario();
                    break;

                case 2:
                    listarFuncionarios();
                    break;

                case 3:
                    criarTarefas();
                    break;

                case 4:
                    listarTarefas();
                    break;

                case 5:
                    editarTarefas();
                    break;

                case 6:
                    excluirTarefas();
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
