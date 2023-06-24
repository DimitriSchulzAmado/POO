from src.model.Product import Product


# Children Class
class Notebook(Product):
    number_instances = 0

    def __init__(self, name, price, brand, quantity):
        super().__init__(name, price, brand, quantity)
        number_instances = Notebook.number_instances + 1
        self.product_id = Notebook.number_instances
        self.product_id = number_instances
