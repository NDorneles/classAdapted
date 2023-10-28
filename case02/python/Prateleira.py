from Produto import Produto

class Prateleira:
    def __init__(self,prod1:Produto,prod2:Produto,prod3:Produto):
        self.prod1 = prod1
        self.prod2 = prod2
        self.prod3 = prod3
    
    def get_prod1(self):
        return self.prod1
    
    def get_prod2(self):
        return self.prod2
    
    def get_prod3(self):
        return self.prod3
    
    def set_prod1(self, prod1):
        self.prod1 = prod1

    def set_prod2(self, prod2):
        self.prod2 = prod2
    
    def set_prod3(self, prod3):
        self.prod3 = prod3

    def __str__(self):
        return f"Produto 1 - {self.prod1.get_nome()}\nProduto 2 - {self.prod2.get_nome()}\nProduto 3 - {self.prod3.get_nome()}"
    
    def produtoMaisCaro(self):
        maiscaro = self.prod1
        if self.prod1.get_preco() < self.prod2.get_preco():
            maisCaro = self.prod2
            if self.prod2.get_preco() < self.prod3.get_preco():
                maisCaro = self.prod3
        elif self.prod1.get_preco() < self.prod3.get_preco():
            maisCaro = self.prod3
        return maisCaro