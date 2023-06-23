
class Product:

    def __int__(self, name, price, brand, quantity):

        self.name = name
        self.price = price
        self.brand = brand
        self.quantity = quantity

    def display_info(self):
        '''show info from product'''
        print(f"Produto: {self.name}")
        print(f"Preço: ${self.price}")
        print(f"Marca: ${self.brand}")
        print(f"Quantidade: ${self.quantity}")
