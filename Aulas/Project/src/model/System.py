from time import sleep

from src.view.file_path import *
from src.view.interface import *

file = 'produtos.txt'

if not existsFile(file):
    createFile(file)

while True:
    unswer = menu(['Ver produtos casdastrados', 'Cadastrar novo pruduto',
                     'Vender produto', 'Comprar prduto', 'Sair do menu'])
    
    if unswer == 1:
        readFile(file)

    elif unswer == 2:
        header('Novo produto')
        name = str(input('Nome: '))
        price = (input('Preço:'))
        brand = str(input('Marca: '))
        registerProduct(file, name, price, brand)

    elif unswer == 3:
        header('Opção 3')

    elif unswer == 4:
        header('Opção 4')

    elif unswer == 5:
        header('Saída do MENU')
        break
    else:
        print('\033[31mERRO!! Digite uma opção válida\033[m')
    sleep(2)
