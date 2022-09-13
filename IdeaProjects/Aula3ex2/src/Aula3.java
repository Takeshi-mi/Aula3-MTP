import javax.swing.JOptionPane;

public class Aula3 {
    public static void main(String[] args) {

        int [][] mat = new int [3][5];
        for(int i = 0; i<3; i++)
        {
            for(int j =0; j<5; j++)
            {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a linha:" + (i+1)+" E coluna " + (j+1)));
            }
        }

    }
}