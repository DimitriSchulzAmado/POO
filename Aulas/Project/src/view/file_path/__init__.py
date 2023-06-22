from src.view.interface import header


def existsFile(name):
    try:
        file = open(name, 'rt')
        file.close()
    except FileNotFoundError:
        return False
    else:
        return True


def createFile(name):
    try:
        file = open(name, 'wt+')
        file.close()
    except:
        print('Houve um erro na criação do arquivo!')
    else:
        print(f'Arquivo {name} criado com sucesso!')


def readFile(name):
    try:
        file = open(name, 'rt')
    except:
        print('Erro ao ler o arquivo!')
    else:
        header('Prudotos cadastrados')
        cont = 1

        for linha in file:
            dado = linha.split(';')
            dado[2] = dado[2].replace('\n', '')
            print(f'\nProduto: {cont}')
            print(f'Nome: {dado[0]:}')
            print(f'Preço: {dado[1]:}')
            print(f'Marca: {dado[2]:}')
            cont = cont + 1
    finally:
        file.close()

def registerProduct(arq, name, price, brand):
    try:
        file = open(arq, 'at')
    except:
        print('Houve um erro na leitura do arquivo!!')
    else:
        try:
            file.write(f'{name};{price};{brand}\n')
        except:
            print('Houve um erro na hora de escrever os dados')
        else:
            print(f'Novo produto {name} cadastrado.')
            file.close()
