from src.model.Product import Product


# Children Class
class Phone(Product):

    def __int__(self, name, price, brand, quantity):
        super().__init__(name, price, brand, quantity)

    def sell_phone(self, buy):
        # Sell quantity need to be smaller that quantity in stock

        # Open file to read
        with open('produtos.txt', 'r') as file:
            content = file.read()

        if self.quantity >= buy:
            # decrease amount and replace in file
            update_data = self.quantity - buy
            conteudo_modificado = content.replace(self.quantity, update_data)

            with open('produtos.txt', 'w') as file:
                file.write(conteudo_modificado)
        else:
            print(f'Quantidade fora de estoque! Quantidade maxima até {self.quantity}')
