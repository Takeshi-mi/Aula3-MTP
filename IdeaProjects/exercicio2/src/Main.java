import javax.swing.JOptionPane;

public class main {
    public static void {String [] args} {
        int[][] mat = new int [3][3];
        for(int i = 0;i<3;i++)
        {
            for (int j = 0; j < 3,j++)
            {
                mat[i][j] = 0;
                if (i == j || i + j == 2) {
                    mat[i][j] = 1;
                }
            }
        }

    }
}
