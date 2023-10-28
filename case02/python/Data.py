class Data:
    def __init__(self,dia:int,mes:int,ano:int):
        self.dia = dia
        self.mes = mes
        self.ano = ano

    def get_dia(self):
        return self.dia
    
    def get_mes(self):
        return self.mes
    
    def get_ano(self):
        return self.ano
    
    def set_dia(self, dia):
        self.dia = dia

    def set_mes(self, mes):
        self.mes = mes
    
    def set_ano(self, ano):
        self.ano = ano
    
    def __str__(self):
        if self.dia < 10:
            self.dia = str(0)+str(self.dia)
        if self.mes < 10:
            self.mes = str(0)+str(self.mes)
        if self.ano < 10:
            self.ano = "000"+str(self.ano)
        elif self.ano < 100:
            self.ano = "00"+str(self.ano)
        elif self.ano < 1000:
            self.ano = "0"+str(self.ano)
        return f"{self.dia}/{self.mes}/{self.ano}"