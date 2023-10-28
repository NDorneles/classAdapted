from Livro import Livro

class Cliente:
    def __init__(self, nome: str, email: str, senha: str, livro: Livro, sexo = None, idade = None):
        if sexo is not None and idade is not None:
            self.nome = nome
            self.idade = idade
            self.sexo = sexo
            self.email = email
            self.senha = senha
            self.livro = livro
        elif sexo is None and idade is not None:
            self.nome = nome
            self.idade = idade
            self.email = email
            self.senha = senha
            self.livro = livro
        else:
            self.nome = nome
            self.sexo = sexo
            self.email = email
            self.senha = senha
            self.livro = livro

    def get_nome(self):
        return self.nome
    
    def get_idade(self):
        return self.idade
    
    def get_sexo(self):
        return self.sexo
    
    def get_email(self):
        return self.email
    
    def get_senha(self):
        return self.senha
    
    def get_livro(self):
        return self.livro
    
    def set_nome(self, nome):
        self.nome = nome

    def set_idade(self, idade):
        self.idade = idade

    def set_sexo(self, sexo):
        self.sexo = sexo
    
    def set_email(self, email):
        self.email = email

    def set_senha(self, senha):
        self.senha = senha

    def set_livro(self, livro):
        self.livro = livro
        
    def __str__(self):
        return f"Nome: {self.nome}, está com o livro: {self.livro.get_titulo()} \nO preço por página deste livro é R$ {self.livro.calcularPrecoPorPagina()}" 

