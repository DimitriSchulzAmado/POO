def readInt(message):
    while True:
        try:
            n = int(input(message))
        except (ValueError, TypeError):
            print('\033[31mERRO: Please, write a valid option.\033[m')
            continue
        except (KeyboardInterrupt):
            print('\n\033[31mThe user prefers not to enter this number.\033[m')
            return 0
        else:
            return n


def line(size_line = 42):
    return '-' * size_line


def header(txt):
    print(line())
    print(txt)
    print(line())


def menu(lista):
    header('MENU')
    c = 1
    for item in lista:
      print(f'\033[33m{c}\033[m - \033[34m{item}\033[m')
      c += 1
    print(line())
    option = readInt('\033[32mSua Opção: \033[m')
    return option
