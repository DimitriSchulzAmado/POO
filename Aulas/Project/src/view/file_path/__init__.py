from src.view.interface import header


def existsFile(name):
    """Treat error if the file already exist"""
    try:
        file = open(name, 'rt')
        file.close()
    except FileNotFoundError:
        return False
    else:
        return True


def createFile(name):
    """ Generate file """
    try:
        file = open(name, 'wt+')
        file.close()
    except:
        print('Houve um erro na criação do arquivo!')
    else:
        print(f'Arquivo {name} criado com sucesso!')


def readFile(name):
    """ Read file and return value """
    try:
        file = open(name, 'rt')
    except:
        print('Erro ao ler o arquivo!')
    else:
        header('Produtos cadastrados:')
        cont = 1

        for linha in file:
            dado = linha.split(';')
            dado[2] = dado[2].replace('\n', '')
            print(f'\nPRODUTO: {cont}')
            print(f'Nome: {dado[0]:}')
            print(f'Preço: R${dado[1]:}')
            print(f'Marca: {dado[2]:}')
            print(f'Quantidade: {dado[3]:}')
            cont = cont + 1
    finally:
        file.close()

def registerProduct(arq, name, price, brand, quantity):
    """Register product in file"""
    try:
        file = open(arq, 'at')
    except:
        print('Erro na leitura do arquivo!!')
    else:
        try:
            file.write(f'{name};{price};{brand};{quantity}\n')
        except:
            print('Erro na escrita dos dados!')
        else:
            print(f'Novo produto da marca {brand} cadastrado!')
            file.close()
