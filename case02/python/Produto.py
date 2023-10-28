from Data import Data

class Produto:
    def __init__(self,nome:str,preco:float,data:Data):
        self.nome = nome
        self.preco = preco
        self.data = data
    
    def get_nome(self):
        return self.nome
    
    def get_preco(self):
        return self.preco
    
    def get_data(self):
        return self.data
    
    def set_nome(self, nome):
        self.nome = nome
    
    def set_preco(self, preco):
        self.preco = preco

    def set_data(self, data):
        self.data = data

    def __str__(self):
        return f"Produto {self.nome}, R$ {self.preco}, Validade: {self.data}"
    
    def verificaProdutoVencido(self,hoje:Data):
        difDia = hoje.get_dia() - self.data.get_dia()
        difMes = hoje.get_mes() - self.data.get_mes()
        difAno = hoje.get_ano() - self.data.get_ano()
        if(difAno > 0):
            return False
        elif (difAno < 0):
            return True
        else:
            if(difMes > 0):
                return False
            elif(difMes < 0):
                return True
            else:
                if(difDia >= 0):
                    return False
                else:
                    return True

                