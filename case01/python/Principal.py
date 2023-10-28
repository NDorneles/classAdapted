from Cliente import Cliente
from Livro import Livro

if __name__ == "__main__":
    c1 = Cliente("Cliente_1", "@gmail","sd96234*",Livro("Livro_1", "Autor_1", 200, 58.99, 2023),"M",24)
    c2 = Cliente("Cliente_2", "@gmail","@jdk877s",Livro("Livro_2", "Autor_2", quantPag=150, preco=20.99),"F",21)
    c3 = Cliente(input("Nome do cliente: "), input("E-mail: "),input("Senha: "),Livro(input("Título: "), input("Autor: "), int(input("Número de páginas: ")), float(input("Preço: "))),int(input("Idade: ")),input("Sexo: "))
    
    print(c1)
    print(c2)
    print(c3)

