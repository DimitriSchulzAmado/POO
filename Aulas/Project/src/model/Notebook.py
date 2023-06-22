from src.model.Product import Product


class Notebook(Product):
    def __int__(self, name, price, brand):
        # colocar herança e depois fazer crud pros produtos
        pass

    def show_info(self):
        print("Nome: ", self.name)
        print("Preço: R$", self.price)
        print("Marca: ", self.brand)
