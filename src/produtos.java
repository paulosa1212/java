public class produtos {
    public String nome;
    public double preco;
    public int quantidade;




    public double valortotalestoque() {
        return preco * quantidade;
    }

    public void entrada(int qte) {
        quantidade = quantidade + qte;
    }
    public void saida(int qte){
        quantidade=quantidade-qte;
    }
    public String toString(){
        return nome
                + " , rs "
                + String.format("%.2f", preco)
                + " , "
                + quantidade
                + " unidades, total: rs"
                +String.format(" %.2f ", valortotalestoque());

    }

}
