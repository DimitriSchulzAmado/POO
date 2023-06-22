from src.view.interface import header


def existsFile(name):
    try:
        a = open(name, 'rt')
        a.close()
    except FileNotFoundError:
        return False
    else:
        return True

def createFile(name):
    try:
        a = open(name, 'wt+')
        a.close()
    except:
        print('Houve um erro na criação do arquivo!')
    else:
        print(f'Arquivo {name} criado com sucesso!')

def readFile(name):
    try:
        a = open(name, 'rt')
    except:
        print('Erro ao ler o arquivo!')
    else:
        header('Prudotos cadastrados')
        print(a.readlines())