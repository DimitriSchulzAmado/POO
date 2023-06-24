from src.model.Product import Product


# Children Class
class Computer(Product):
    number_instances = 0

    def __init__(self, name, price, brand, quantity):
        super().__init__(name, price, brand, quantity)
        number_instances = Computer.number_instances + 1
        self.product_id = Computer.number_instances
        self.product_id = number_instances
