public class Main {
    public static void main(String[] args) {
        ArvoreBusca arvoreBusca = new ArvoreBusca();
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

        //System.out.println(arvoreBusca.raiz);
        // System.out.println(arvoreBusca.raiz.esquerdo);
        // System.out.println(no2.esquerdo);
        //System.out.println("Valor direito da raiz: " + arvoreBusca.raiz.direito);
        //System.out.println("Valor direito da direita: " + no4.direito);
        //System.out.println("Valor esquerdo da direita: " + no4.esquerdo);
        //System.out.println(arvoreBusca.busca(arvoreBusca.raiz, 80));

    }
}