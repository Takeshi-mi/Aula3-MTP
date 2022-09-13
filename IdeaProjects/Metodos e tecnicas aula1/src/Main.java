import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String nome = null;
        int resposta;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
        if (resposta == JOptionPane.YES_OPTION) {
            // Verifica se o usuário clicou no botão YES
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome , "nome certo", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Seu nome não é " + nome, "Nome errado", 0);
        }
    }
}