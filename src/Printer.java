import java.util.*;
public class Printer {

    public static int height(ArvoreBusca.No raiz) {
        if (raiz == null)
            return 0;
        return Math.max(height(raiz.esquerdo), height(raiz.direito)) + 1;
    }

    public static int getcol(int h) {
        if (h == 1)
            return 1;
        return getcol(h - 1) + getcol(h - 1) + 1;
    }

    public static void printTree(int[][] M, ArvoreBusca.No raiz, int col, int row, int height) {
        if (raiz == null)
            return;
        M[row][col] = raiz.valor;
        printTree(M, raiz.esquerdo, col - (int)Math.pow(2, height - 2), row + 1, height - 1);
        printTree(M, raiz.direito, col + (int)Math.pow(2, height - 2), row + 1, height - 1);
    }

    public static void TreePrinter(ArvoreBusca arvore) {
        int h = height(arvore.raiz);
        int col = getcol(h);
        int[][] M = new int[h][col];
        printTree(M, arvore.raiz, col / 2, 0, h);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 0)
                    System.out.print("  ");
                else
                    System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void impressao(ArvoreBusca arvoreBusca) {
        TreePrinter(arvoreBusca);
    }
}
