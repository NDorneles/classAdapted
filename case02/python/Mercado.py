from Prateleira import Prateleira

class Mercado:
    def __init__(self, prat1: Prateleira, prat2: Prateleira):
        self.prat1 = prat1
        self.prat2 = prat2

    def get_prat1(self):
        return self.prat1
    
    def get_prat2(self):
        return self.prat2
    
    def __str__(self):
        return f"1 - {self.prat1.__str__()}\n2 - {self.prat2.__str__()}"
    
    def mediaValorProdutos(self):
        return (self.prat1.get_prod1().get_preco()+self.prat1.get_prod2().get_preco()+self.prat1.get_prod3().get_preco()+self.prat2.get_prod1().get_preco()+self.prat2.get_prod2().get_preco()+self.prat2.get_prod3().get_preco())/6