from lib.interface import *
from time import sleep


while True:
    unswer = menu(['Ver produtos casdastrados', 'Cadastrar novo pruduto',
                     'Vender produto', 'Comprar prduto', 'Sair do menu'])
    
    if unswer == 1:
        header('Opção 1')

    elif unswer == 2:
        header('Opção 2')

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
