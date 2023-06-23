from src.model.Product import Product


# Children Class
class Phone(Product):
    number_instances = 0

    def __init__(self, name, price, brand, quantity):
        number_instances = Phone.number_instances + 1
        self.product_id = Phone.number_instances
        self.product_id = number_instances

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
