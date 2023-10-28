public class Principal
{
    public static void main(String[] args){
        
        System.out.println("Cliente 1");
        Cliente c1 = new Cliente(Teclado.leString("Nome: "), Teclado.leInt("Idade: "), Teclado.leChar("Sexo: "), 
            Teclado.leString("email: " ), Teclado.leString("Senha: "), new Livro(Teclado.leString("Título: "), 
            Teclado.leString("Autor: "), Teclado.leInt("Ano de publicação: "), Teclado.leInt("Número de páginas: "), 
            Teclado.leDouble("Preço: ")));
    
        System.out.println("Cliente 2");
        Cliente c2 = new Cliente(Teclado.leString("Nome: "), Teclado.leInt("Idade: "), Teclado.leChar("Sexo: "), 
            Teclado.leString("email: " ), Teclado.leString("Senha: "), new Livro(Teclado.leString("Título: "), 
            Teclado.leString("Autor: "), Teclado.leInt("Ano de publicação: "), Teclado.leInt("Número de páginas: "), 
            Teclado.leDouble("Preço: ")));
            
        System.out.println("Cliente 3");
        Cliente c3 = new Cliente(Teclado.leString("Nome: "), Teclado.leInt("Idade: "), Teclado.leChar("Sexo: "), 
            Teclado.leString("email: " ), Teclado.leString("Senha: "), new Livro(Teclado.leString("Título: "), 
            Teclado.leString("Autor: "), Teclado.leInt("Ano de publicação: "), Teclado.leInt("Número de páginas: "), 
            Teclado.leDouble("Preço: ")));
        
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        System.out.println(c3);
        System.out.println();
        
        c1.imprimeInformacoes();
        c2.imprimeInformacoes();
        c3.imprimeInformacoes();
    }
    
}
