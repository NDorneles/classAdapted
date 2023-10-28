public class Mercado
{
    private Prateleira prateleira1, prateleira2;
    
    public Mercado(Prateleira prateleira1, Prateleira prateleira2){
        this.prateleira1 = prateleira1;
        this.prateleira2 = prateleira2;
    }
    public Prateleira getPrateleira1(){
        return prateleira1;
    }
    public Prateleira getPrateleira2(){
        return prateleira2;
    }
    public double mediaValorProdutos(){
        return (prateleira1.getProduto1().getPreco()+prateleira1.getProduto2().getPreco()+prateleira1.getProduto3().getPreco())/3;
}
}
