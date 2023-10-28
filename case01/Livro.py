class Livro:
    def __init__(self, titulo: str, autor: str, quantPag: int, preco: float, ano =None):
        if ano is not None:
            self.titulo = titulo
            self.autor = autor
            self.ano = ano
            self.quantPag = quantPag
            self.preco = preco
        else:
            self.titulo = titulo
            self.autor = autor
            self.quantPag = quantPag
            self.preco = preco

    def get_titulo(self):
        return self.titulo
    
    def get_autor(self):
        return self.autor
    
    def get_ano(self):
        return self.ano
    
    def get_quantPag(self):
        return self.quantPag
    
    def get_preco(self):
        return self.preco
    
    def set_titulo(self, titulo):
        self.titulo = titulo

    def set_autor(self, autor):
        self.autor = autor

    def set_quantPag(self, quantPag):
        self.quantPag = quantPag
    
    def set_preco(self, preco):
        self.preco = preco
        
    def calcularPrecoPorPagina(self):
        return self.quantPag/self.preco
    
    def __str__(self):
        return f"Título: {self.titulo}, Autor: {self.autor}, Ano: {self.autor}"