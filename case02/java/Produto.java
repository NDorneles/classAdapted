public class Produto
{
  private String nome;
  private double preco;
  private Data data;
  
  public Produto(String nome, double preco, Data data){
      this.nome = nome;
      this.preco = preco;
      this.data = data;
  }
  public String getNome(){
      return nome;
  }
  public double getPreco(){
      return preco;
  }
  public Data getData(){
      return data;
  }
  public void setNome(String nome){
      this.nome = nome;
  }
  public void setPreco(double preco){
      this.nome = nome;
  }
  public void setData(Data data){
      this.data = data;
  }
  public String toString(){
      return "Produto: " +nome+ " R$: " +preco+ 
      "\nValidade: " +data;     
  }
  public boolean verificaProdutoVencido(Data hoje){
    int difDia = hoje.getDia() -  data.getDia();
    int difMes = hoje.getMes() -  data.getMes();
    int difAno = hoje.getAno() -  data.getAno();
    if (difAno > 0){
        return false;
    }else if (difAno < 0){
        return true;
    }else{
        if (difMes > 0){
            return false;
        }
        else if (difMes <0){
            return true;
        }else{
           if (difDia >= 0){
               return false; 
           }else{
            return true;
        }
     }
    }
}
}

