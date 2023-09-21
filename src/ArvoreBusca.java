public class ArvoreBusca {
    public No raiz;

    public static class No{
        int valor;
        No esquerdo = null;
        No direito = null;

        public No(int valor) {
            this.valor = valor;
            this.esquerdo = esquerdo;
            this.direito = direito;
        }

        @Override
        public String toString() {
            return "Valor: " + valor;
        }
    }

    public No inserir(No arvore, No novo){
        if (this.raiz == null){
            this.raiz = novo;
        }
        else{
            if (arvore == null) {
                return novo;
            } else{
                if (novo.valor < arvore.valor) {
                    arvore.esquerdo = inserir(arvore.esquerdo, novo);
                } else {
                    arvore.direito = inserir(arvore.direito, novo);
                }
            }
        }
        return arvore;
    }
    public Boolean busca(No arvore, int valor){
        if (arvore == null){
            return false;
        }
        if (valor < arvore.valor) {
            return busca(arvore.esquerdo, valor);
        } else if (valor > arvore.valor){
            return busca(arvore.direito, valor);
        } else {
            return true;
        }
    }

    public No excluir(No arvore, int valor){ //Precisa Conferir se o dado existe na arvore antes de remover, validar no main
        return arvore;
    }

    public void imprimir(){
        Printer.impressao(this);
    }

}
