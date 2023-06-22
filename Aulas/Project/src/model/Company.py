from src.model.Product import Product


class Company:
    def __int__(self, cnpj, name):
        self.__cnpj = cnpj
        self.name = name
        self.product = Product()

    def buy_item(self):
        pass

    def sell_item(self):
        pass

    def login_product(self):
        pass