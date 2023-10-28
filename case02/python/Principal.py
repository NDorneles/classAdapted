from Mercado import Mercado
from Prateleira import Prateleira
from Produto import Produto
from Data import Data

if __name__ == "__main__":
    m1 = Mercado(Prateleira(Produto("Amaciante", 15.8, Data(16, 5, 2015)), Produto("Creme dental", 20.98, Data(5, 5, 2015)), Produto("Leite condensado", 7.98, Data(4, 12, 2012))), Prateleira(Produto("TV", 2000, Data(31, 12, 2300)), Produto("Computador", 1500, Data(8, 10, 2030)), Produto("Maça", 1.05, Data(15, 6, 59))))

    print(m1)
    print(m1.mediaValorProdutos())
    print(m1.get_prat1().produtoMaisCaro())
    print(m1.get_prat2().get_prod3().verificaProdutoVencido(Data(10,10,2015)))
