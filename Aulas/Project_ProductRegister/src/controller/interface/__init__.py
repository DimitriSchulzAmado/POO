def readInt(message):
    """ Treat choice option error """
    while True:
        try:
            n = int(input(message))
        except (ValueError, TypeError):
            print('\033[31mERRO: Please, write a valid option.\033[m')
            continue
        except KeyboardInterrupt:
            print('\n\033[31mThe user prefers not to enter this number.\033[m')
            return 0
        else:
            return n


def line(size_line=42):
    """ Put line to separe menu of rest """
    return '-' * size_line


def header(txt):
    """ Header to menu and your options """
    print(line())
    print(txt)
    print(line())


def menu(menu_list):
    """ Put color in words and header at menu items """
    header('MENU')
    c = 1
    for item in menu_list:
        print(f'\033[33m{c}\033[m - \033[34m{item}\033[m')
        c += 1
    print(line())
    option = readInt('\033[32mSua Opção: \033[m')
    return option
