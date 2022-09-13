import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(("digite um número")));
        JOptionPane.showMessageDialog(null, " O fatorial é " + calculaFatorialIterativo(n));

    }



    public static int calculaFatorialIterativo(int num) {

        int fat = 1;
        for (int i = num; i > 0; i--) {
            fat *= i;
        }
        return fat;
    }

    public static int calculaFatorialRecursivo(int num) {
        if (num == 0) {
            return 1;
        } else
        {
            return num * calculaFatorialRecursivo(num-1);
        }
    }
}