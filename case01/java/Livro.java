public class Livro
{
    private String titulo, autor;
    private int ano, quantPag;
    private double preco;
    
    public Livro(String titulo, String autor, int ano, int quantPag, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.quantPag = quantPag;
        this.preco = preco;
    }
    
    public Livro(String titulo, String autor, int quantPag, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.quantPag = quantPag;
        this.preco = preco;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return ano;
    }
    public int getQuantPag(){
        return quantPag;
    }
    public double getpreco(){
        return preco;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setQuantPag(int quantPag){
        this.quantPag = quantPag;
    }
    public void sePpreco(double preco){
        this.preco = preco;
    }
    
    public double calcularPrecoPorPagina(){
        return quantPag/preco;
    }
     public String toString(){
         return "Título: " +titulo+
         ", Autor: " +autor+
         ", Ano: " +ano+
         ", \nQuantidade de Páginas: " +quantPag+
         ", Preço: " +preco+
         ", Preço por página: " +calcularPrecoPorPagina();
     }
}
