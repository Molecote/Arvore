public class Main {
    public static void main(String[] args) {
        ArvoreBusca arvoreBusca = new ArvoreBusca();
        ArvoreBusca.No no = new ArvoreBusca.No(50);
        ArvoreBusca.No no2 = new ArvoreBusca.No(25);
        ArvoreBusca.No no3 = new ArvoreBusca.No(22);
        ArvoreBusca.No no4 = new ArvoreBusca.No(55);
        ArvoreBusca.No no5 = new ArvoreBusca.No(80);
        ArvoreBusca.No no6 = new ArvoreBusca.No(50);
        arvoreBusca.inserir(arvoreBusca.raiz,no);
        arvoreBusca.inserir(arvoreBusca.raiz,no2);
        arvoreBusca.inserir(arvoreBusca.raiz,no3);
        arvoreBusca.inserir(arvoreBusca.raiz,no4);
        arvoreBusca.inserir(arvoreBusca.raiz,no5);
        arvoreBusca.inserir(arvoreBusca.raiz,no6);

        System.out.println(arvoreBusca.raiz);
       // System.out.println(arvoreBusca.raiz.esquerdo);
       // System.out.println(no2.esquerdo);
        System.out.println("Valor direito da raiz: " + arvoreBusca.raiz.direito);
        System.out.println("Valor direito da direita: " + no4.direito);
        System.out.println("Valor esquerdo da direita: " + no4.esquerdo);
        System.out.println(arvoreBusca.busca(arvoreBusca.raiz, 80));

    }
}