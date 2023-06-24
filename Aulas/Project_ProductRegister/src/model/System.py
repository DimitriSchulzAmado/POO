from time import sleep

from src.model.Computer import Computer
from src.model.Notebook import Notebook
from src.model.Phone import Phone
from src.controller.file_path import *
from src.controller.interface import *

# Create file
file = 'produtos.txt'

# See if file exists else create
if not existsFile(file):
    createFile(file)

while True:
    unswer = menu(['Ver produtos casdastrados', 'Cadastrar novo pruduto',
                   'Vender produto', 'Comprar produto', 'Sair do menu'])

    # See register product
    if unswer == 1:
        readFile(file)

    # Register product
    elif unswer == 2:
        header('Novo produto')
        choice = menu(['Celular', 'Notebook', 'Computador'])

        if choice == 1:
            # Input properties from selected product
            name = str(input('Modelo: '))
            price = input('Preço:')
            brand = str(input('Marca: '))
            quantity = input('Quantidade: ')

            # Instance Phone
            phone = Phone(name, price, brand, quantity)
            registerProduct(file, name, price, brand, quantity)

        elif choice == 2:
            # Input properties from selected product
            name = str(input('Modelo: '))
            price = input('Preço:')
            brand = str(input('Marca: '))
            quantity = input('Quantidade: ')

            # Instance Notebook
            notebook = Notebook(name, price, brand, quantity)
            registerProduct(file, name, price, brand, quantity)

        elif choice == 3:
            # Input properties from selected product
            name = str(input('Modelo: '))
            price = input('Preço:')
            brand = str(input('Marca: '))
            quantity = input('Quantidade: ')

            # Instance Computer
            computer = Computer(name, price, brand, quantity)
            registerProduct(file, name, price, brand, quantity)

    # Sell Product
    elif unswer == 3:
        header('Opção 3')
        # Select product to sell
        selected_product = input('Produto: ')
        sell = int(input('Quantidade: '))

        if selected_product == 'Celular':
            Phone.sell_product(sell)
        elif selected_product == 'Notebook':
            Notebook.sell_product(sell)
        elif selected_product == 'Computer':
            Computer.sell_product(sell)

    # Buy Product
    elif unswer == 4:
        header('Opção 4')
        # Select product to sell
        selected_product = input('Produto: ')
        buy = input('Quantidade: ')

        if selected_product == 'Celular':
            Phone.sell_product(buy)
        elif selected_product == 'Notebook':
            Notebook.sell_product(buy)
        elif selected_product == 'Computer':
            Computer.sell_product(buy)

    # Exit menu
    elif unswer == 5:
        header('Saída do MENU')
        break
    else:
        print('\033[31mERRO!! Digite uma opção válida\033[m')
    sleep(2)
