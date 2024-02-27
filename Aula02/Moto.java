import javax.swing.JOptionPane;

public class Moto extends Auto implements IVenda {
    
    public void mostruario(){
        this.setMarca("Honda");
        this.setModelo("CBR900");
        this.setAno("2024");

        JOptionPane.showMessageDialog(null,
        "Marca: " + this.getMarca() +
        "\nModelo: " + this.getModelo() +
        "\nAno: " + this.getAno()
        );

    }

    @Override
    public String venda(String marca, String modelo, String ano, String valor) {
        
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setValor(valor);

        String dados = "A marca escolida é: " + this.getMarca() +
         "\nO modelo é: " + this.getModelo() +
         "\nO ano é: " + this.getAno() +
         "\nO valor é: " + this.getValor();

        return dados;
    }

    @Override
    public String compra(String m, String model, String ano, String vl) {
        throw new UnsupportedOperationException("Unimplemented method 'compra'");
    }

    @Override
    public String troca() {
        throw new UnsupportedOperationException("Unimplemented method 'troca'");
    }

}
