import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n1 , n2 , soma;
        try {


            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
            soma = n1 + n2;

            JOptionPane.showMessageDialog(null, "A soma de " + n1 + " mais " + n2 + " é: " + soma);
        }
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Evite letras\n"+erro, "Erro", 0 );
        }
    }
}