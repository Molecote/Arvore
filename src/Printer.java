public class Printer {
    static int Height(ArvoreBusca root) {
        if (root == null) {
            return 0;
        }
        return Math.Max(Height(root.left), Height(root.right)) + 1;
    }

    static int GetCol(int h) {
        if (h == 1) {
            return 1;
        }
        return GetCol(h - 1) + GetCol(h - 1) + 1;
    }

    static void PrintTree(int[][] M, ArvoreBusca root, int col, int row, int height) {
        if (root == null) {
            return;
        }
        M[row][col] = root.data;
        PrintTree(M, root.left, col - (int)Math.Pow(2, height - 2), row + 1, height - 1);
        PrintTree(M, root.right, col + (int)Math.Pow(2, height - 2), row + 1, height - 1);
    }

    static void TreePrinter() {
        int h = Height(myTree.root);
        int col = GetCol(h);
        int[][] M = new int[h][];
        for (int i = 0; i < h; i++) {
            M[i] = new int[col];
            Array.Fill(M[i], 0);
        }
        PrintTree(M, myTree.root, col / 2, 0, h);

        for (int i = 0; i < M.Length; i++) {
            string row = "";
            for (int j = 0; j < M[i].Length; j++) {
                if (M[i][j] == 0) {
                    row += " ";
                } else {
                    row += M[i][j] + " ";
                }
            }
            Console.WriteLine(row);
        }
    }
}
