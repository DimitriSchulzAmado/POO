from src.model.Product import Product


class Phone(Product):
    def __int__(self):
        pass

    def show_info(self):
        print("Nome: ", self.name)
        print("Preço: R$", self.price)
        print("Marca: ", self.brand)