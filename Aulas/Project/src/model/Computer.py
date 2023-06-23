from src.model.Product import Product


# Children Class
class Computer(Product):

    def __int__(self, name, price, brand, quantity):
        super().__init__(self, name, price, brand, quantity)

    def display_info(self):
        print(f"ID do produto: {self.id}")
        print(f"Produto: {self.name}")
        print(f"Preço: ${self.price}")
        print(f"Marca: ${self.brand}")
        print(f"Quantidade: ${self.quantity}")

    def sell_computer(self):
        pass
