from src.model.Product import Product
from src.view.file_path import registerProduct


class Computer(Product):

    def __int__(self, product_id, name, price, brand, quantity):
        super().__init__(self, product_id, name, price, brand, quantity)

    def display_info(self):
        print(f"ID do produto: {self.id}")
        print(f"Produto: {self.name}")
        print(f"Preço: ${self.price}")
        print(f"Marca: ${self.brand}")
        print(f"Quantidade: ${self.quantity}")

    def sell_computer(self):
        pass
