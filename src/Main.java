import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao trabalho de BST dos estudantes: Gabriel Molec; Gustavo Luiz e João Gabriel.");
        Scanner teclado = new Scanner(System.in);
        boolean loop = true;
        while (loop == true){
            System.out.println("Digite uma das seguintes opções:\n"
                    + "1. Inserção;\n"
                    + "2. Busca;\n"
                    + "3. Remoção;\n"
                    + "4. Impressão;\n"
                    + "5. Sair.\n");
            int op = Integer.parseInt(teclado.nextLine());
            switch (op){
                case 1:
                    ArrayList<Integer> modulos = new ArrayList<Integer>();
                    System.out.println("Digite a quantidade de nós a serem inseridos: ");
                    int n = Integer.parseInt(teclado.nextLine());
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Digite o valor do " + i + "° nó.");
                        int no = Integer.parseInt(teclado.nextLine());
                        modulos.add(no);}
                    for (int i =0; i <= modulos.size(); i++){
                    }

                    // função de inserção.

                    break;
                case 2: // função de Busca.
                    break;
                case 3: // função de Remoção.
                    break;
                case 4: // função de Impressão.
                    break;
                case 5:
                    System.out.println("Saindo...");
                    loop = false;
                    break;
            }
        }
       /* ArvoreBusca arvoreBusca = new ArvoreBusca();
        ArvoreBusca.No no = new ArvoreBusca.No(50);
        ArvoreBusca.No no2 = new ArvoreBusca.No(25);
        ArvoreBusca.No no3 = new ArvoreBusca.No(22);
        ArvoreBusca.No no4 = new ArvoreBusca.No(55);
        ArvoreBusca.No no5 = new ArvoreBusca.No(80);
        ArvoreBusca.No no6 = new ArvoreBusca.No(50);
        ArvoreBusca.No no7 = new ArvoreBusca.No(85);
        ArvoreBusca.No no8 = new ArvoreBusca.No(86);
        ArvoreBusca.No no9 = new ArvoreBusca.No(87);
        arvoreBusca.inserir(arvoreBusca.raiz,no);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.inserir(arvoreBusca.raiz,no2);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.inserir(arvoreBusca.raiz,no3);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.inserir(arvoreBusca.raiz,no4);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.inserir(arvoreBusca.raiz,no5);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.inserir(arvoreBusca.raiz,no6);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.inserir(arvoreBusca.raiz,no7);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.inserir(arvoreBusca.raiz,no8);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.inserir(arvoreBusca.raiz,no9);
        arvoreBusca.imprimir();
        System.out.println("=============================");
        arvoreBusca.excluir(arvoreBusca.raiz,55);
        arvoreBusca.imprimir();
        System.out.println("=============================");
    }*/
    }
}
