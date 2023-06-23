from time import sleep

from src.model.Computer import Computer
from src.model.Notebook import Notebook
from src.model.Phone import Phone
from src.view.file_path import *
from src.view.interface import *


file = 'produtos.txt'

# See if file exists else create
if not existsFile(file):
    createFile(file)

while True:
    product_id = 0
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
            name = str(input('Modelo: '))
            price = input('Preço:')
            brand = str(input('Marca: '))
            quantity = input('Quantidade: ')

            phone = Phone()
            registerProduct(file, name, price, brand, quantity)

        elif choice == 2:
            name = str(input('Modelo: '))
            price = input('Preço:')
            brand = str(input('Marca: '))
            quantity = input('Quantidade: ')
            product_id = product_id + 1

            notebook = Notebook()
            registerProduct(file, name, price, brand, quantity)

        elif choice == 3:
            name = str(input('Modelo: '))
            price = input('Preço:')
            brand = str(input('Marca: '))
            quantity = input('Quantidade: ')
            product_id = product_id + 1

            #
            computer = Computer()
            registerProduct(file, name, price, brand, quantity)

    # Sell Product
    elif unswer == 3:
        header('Opção 3')
        buy = input('Quantidade: ')
        phone = Phone()
        phone.sell_phone(buy)

    # Buy Product
    elif unswer == 4:
        header('Opção 4')

    # Exit menu
    elif unswer == 5:
        header('Saída do MENU')
        break
    else:
        print('\033[31mERRO!! Digite uma opção válida\033[m')
    sleep(2)



