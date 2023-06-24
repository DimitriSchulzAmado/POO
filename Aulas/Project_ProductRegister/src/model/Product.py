class Product:

    def __init__(self, name, price, brand, quantity):
        self.name = name
        self.price = price
        self.brand = brand
        self.quantity = quantity

    def sell_product(self, sell):
        """
            Method for treatment of sell products
        """
        # Open file to read
        with open('produtos.txt', 'r') as file:
            content = file.read()

        # Sell quantity need to be smaller that quantity in stock
        if self.quantity >= sell:
            # decrease amount and replace in file
            update_data = self.quantity - sell
            conteudo_modificado = content.replace(self.quantity, update_data)

            with open('produtos.txt', 'w') as file:
                file.write(conteudo_modificado)
        else:
            print(f'Quantidade fora de estoque! Quantidade maxima até {self.quantity}')

    def buy_product(self, buy):
        """
            Method for treatment of sell products
        """
        # Sell quantity need to be smaller that quantity in stock
        # Open file to read
        with open('produtos.txt', 'r') as file:
            content = file.read()

        if self.quantity >= buy:
            # decrease amount and replace in file
            update_data = self.quantity + buy
            conteudo_modificado = content.replace(self.quantity, update_data)

            with open('produtos.txt', 'w') as file:
                file.write(conteudo_modificado)
        else:
            print(f'Quantidade fora de estoque! Quantidade maxima até {self.quantity}')
