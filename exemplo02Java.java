import javax.swing.*;

class exemplo02
{
    public static void main(String args[]) {
        int n1, n2, div;
        double pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero do tipo inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero do tipo inteiro"));

        div = (int) n1 / (int) n2;
        pot = Math.pow(n1, n2);

        msg = msg + "O quociente da divisao de n1 por n2 = " + div + "\n";
        msg = msg + "Potencia de n1 e n2 = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}