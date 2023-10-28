public class Principal
{
    public static void main(String[] args){
        
        Pessoa p1 = new Pessoa("Joaquim", 'M', 19, 1.78, "Rua C, 145", 0);
        Pessoa p2 = new Pessoa("Manuelita", 'F', 30, 1.67, "Rua dos Camelos, 12", 3);
        Pessoa p3 = new Pessoa("Pedro", 'M', 10, 1.91, "Rua dos Gigantes, 189", 1);
    
        System.out.println(p1.imprimeInformacoes());
        System.out.println();
        System.out.println(p2.imprimeInformacoes());
        System.out.println();
        System.out.println(p3.imprimeInformacoes());
        System.out.println();
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
