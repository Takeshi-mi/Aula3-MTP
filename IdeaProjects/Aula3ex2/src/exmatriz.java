import javax.swing.JOptionPane;


public class exmatriz {
    public static void main(String[] args) {

        int[][] mat = new int[3][5];
        int soma = 0;
        for (int j = 0; j < 5; j++) {
            soma = 0;
            for (int i = 0; i < 3; i++) {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a linha:" + (i + 1) + " E coluna " + (j + 1)));
                soma = soma + mat[i][j];
            }
        }
    }
}
