import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Carro car = new Carro();

        String m = JOptionPane.showInputDialog("Qual a marca do carro?");
        String model = JOptionPane.showInputDialog("Qual o modelo que deseja?");
        String ano = JOptionPane.showInputDialog("Qual o ano que você deseja?");
        String vl = JOptionPane.showInputDialog("Qual o valor que deseja?");

        JOptionPane.showMessageDialog(null, car.venda(m, model, ano, vl));
    }
    
}
