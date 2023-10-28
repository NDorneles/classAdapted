public class Prateleira
{
    private Produto produto1, produto2, produto3;
    
    public Prateleira(Produto produto1, Produto produto2, Produto produto3){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }
    
    public Prateleira(){};
    
    public Produto getProduto1(){
        return produto1;
    }
    public Produto getProduto2(){
        return produto2;
    }
    public Produto getProduto3(){
        return produto3;
    }
    public void setProduto1(Produto produto1){
        this.produto1 = produto1;
    }
    public void setProduto2(Produto produto2){
        this.produto2 = produto2;
    }
    public void setProduto3(Produto produto3){
        this.produto3 = produto3;
    }
    public Produto produtoMaisCaro(){
        Produto maisCaro = produto1;
        if (produto1.getPreco() < produto2.getPreco()){
            maisCaro = produto2;
            if (produto2.getPreco() < produto3.getPreco()){
                maisCaro = produto3;
            }
        }else if (produto1.getPreco() < produto3.getPreco()){
            maisCaro = produto3;
            if(produto2.getPreco() < produto3.getPreco()){
            }
        }
        return maisCaro;
    }
    public String toString(){
        return "Produto 1:\n" +produto1.toString()+ "\n\nProduto 2:\n" +produto2.toString() + "\n\nProduto 3:\n" +produto3.toString();
    }
}
