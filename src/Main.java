import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArvoreBusca arvoreBusca = new ArvoreBusca();
        System.out.println("Bem vindo ao trabalho de BST dos estudantes: Gabriel Molec; Gustavo Luiz e João Gabriel.");
        Scanner teclado = new Scanner(System.in);
        boolean loop = true;
        while (loop){
            System.out.println("""
                    Digite uma das seguintes opções:
                    1. Inserção;
                    2. Busca;
                    3. Remoção;
                    4. Impressão;
                    5. Sair.
                    """);
            int op = Integer.parseInt(teclado.nextLine());
            switch (op){
                case 1:     // função de Inserção.
                    System.out.println("Digite a quantidade de nós a serem inseridos: ");
                    int n = Integer.parseInt(teclado.nextLine());
                    ArvoreBusca.No [] novosNos = new ArvoreBusca.No[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Digite o valor do " + (i+1) + "° nó.");
                        int no = Integer.parseInt(teclado.nextLine());
                        novosNos[i] = new ArvoreBusca.No(no);
                        arvoreBusca.inserir(arvoreBusca.raiz,novosNos[i]);
                    }
                    break;
                case 2:     // função de Busca.
                    System.out.println("Digite o valor a ser buscado: ");
                    int buscado = Integer.parseInt(teclado.nextLine());
                   if (arvoreBusca.busca(arvoreBusca.raiz, buscado)){
                       System.out.println("Valor encontrado!");
                   }
                   else {
                       System.out.println("Valor não encontrado.");
                   }

                    break;
                case 3: // função de Remoção.
                    System.out.println("Digite qual o valor a ser removido: ");
                    int excluido = Integer.parseInt(teclado.nextLine());
                    arvoreBusca.excluir(arvoreBusca.raiz, excluido);
                    break;
                case 4: // função de Impressão.
                    arvoreBusca.imprimir();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    loop = false;
                    break;
            }
        }
    }
}
