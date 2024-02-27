public class Carro extends Auto implements IVenda {

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
