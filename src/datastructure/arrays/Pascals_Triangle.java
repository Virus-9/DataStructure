package datastructure.arrays;

public class Pascals_Triangle {
    public static int[][] pascalTriangle(int n) {
        int[][] tri = new int[n][];//second array can have any valuse we need not to specify them

        for (int r = 0; r < tri.length; r++) {
            tri[r] = new int[r + 1];
            tri[r][0] = 1;
            tri[r][r] = 1;
            for (int c = 1; c < r; c++) {
                tri[r][c] = tri[r - 1][c] + tri[r - 1][c - 1];
            }
        }
        return tri;
    }
    public static void main(String[] args) {
        int[][] tri = pascalTriangle(7);

        for (int r = 0; r < tri.length; r++) {
            for (int c = 0; c < tri[r].length; c++) {
                System.out.print(" " + tri[r][c]);
            }
            System.out.println("");
        }
    }
}
