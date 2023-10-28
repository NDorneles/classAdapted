public class Cliente
{
    private String nome, email, senha;
    private char sexo;
    private int idade;
    private Livro livro;
    
    public Cliente(String nome, int idade, char sexo, String email, String senha, Livro livro){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = livro;
    }
    
    public Cliente(String nome, int idade, String email, String senha, Livro livro){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.livro = livro;
    }
    
    public Cliente(String nome, char sexo, String email, String senha, Livro livro){
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = livro;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public char getSexo(){
        return sexo;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public Livro getLivro(){
        return livro;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setEmail(String email){
        this.email = email;
    }
     public void setSenha(String senha){
        this.senha = senha;
    }
    public void setLivro(Livro livro){
        this.livro = livro;
    }
    public void imprimeInformacoes(){
         System.out.println("Nome: " +nome+
         ", Idade: " +idade+
         ", Sexo: " +sexo+
         ", \nEmail: " +email+
         ", Senha: " +senha+
         ", Livro: " +livro);
    }
    public String toString(){
        return "O cliente " +nome+ " está como livro " +livro.getTitulo()+ 
        ", \ne o preço por página deste livro é R$ " +livro.calcularPrecoPorPagina();
    }
}
