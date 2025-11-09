public class produtos {
    private String nome;
    private double preco;
    private int quantidade;
 //cosntrutor padrao
    public produtos () {

    }


    //cosntrutor: obriga a dar entrada antes de instanciar (sobrecarga)
    public produtos (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

   //cosntrutor apenas com nome  preço (sobrecarga)
    public produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;

    }
    public void setNome(String nome){
        this.nome= nome;
    }

    public double valortotalestoque() {
        return preco * quantidade;
    }

    public void entrada(int qte) {
        quantidade = quantidade + qte;
    }

    public void saida(int qte) {
        quantidade = quantidade - qte;
    }

    public String toString() {
        return nome
                + " , rs "
                + String.format("%.2f", preco)
                + " , "
                + quantidade
                + " unidades, total: rs"
                + String.format(" %.2f ", valortotalestoque());

    }

}
