print(''' ************** Projeto Interdisciplinar - Grupo 3 ************** 
****  CONVERSOR DE NÚMEROS BINÁRIOS, OCTAL E HEXADECIMAL PARA DECIMAL  ****
 ''')

resposta = 'sim'

while resposta == 'sim' or resposta == 'sim' or resposta == 'SIM':

    if resposta == 'sim' or resposta == 'sim' or resposta == 'SIM':

        base = int(input('''QUAL BASE SERÁ INFORMADA?
    DIGITE 2 -> BINÁRIA 
    DIGITE 8 -> OCTAL
    DIGITE 16 -> HEXADECIMAL
        '''))
        if base == 2:
            binario = input('DIGITE NÚMEROS ENTRE 0 E 1: ')
            b = 0
            cont = int(0)
            num = 0
            for i in binario:
                if 1 >= int(i) >= 0:
                    pass
                else:
                    cont += 1
            if cont > 0:
                print('ATENÇÃO!! PARA NÚMERO BINÁRIO, SOMENTE NÚMEROS ENTRE 0 E 1')
            else:
                while b < len(binario):
                    for j in range(len(binario) - 1, -1, -1):
                        num += int(binario[b]) * (base ** int(j))
                        b += 1
                print('NÚMERO DECIMAL => ', num)
        elif base == 8:
            octal = input('DIGITE NÚMEROS ENTRE 0 E 7: ')
            o = 0
            cont = int(0)
            num = 0
            for i in octal:
                if 7 >= int(i) >= 0:
                    pass
                else:
                    cont += 1
            if cont > 0:
                print('ATENÇÃO!! PARA NÚMERO OCTAL, SOMENTE NÚMEROS ENTRE 0 E 7')
            else:
                while o < len(octal):
                    for j in range(len(octal) - 1, -1, -1):
                        num += int(octal[o]) * (base ** int(j))
                        o += 1
                print('NÚMERO DECIMAL => ', num)
        elif base == 16:
            hexadecimal = input('DIGITE NÚMEROS ENTRE 0 E 9, E LETRAS ENTRE A Á F: ')
            h = 0
            cont = int(0)
            num = 0
            hexa = []
            for i in hexadecimal:
                if i == '0' or i == '1' or i == '2' or i == '3' or i == '4' or i == '5' or i == '6' or i == '7' or i == '8' or i == '9':
                    hexa.append(i)
                elif i == 'a' or i == 'A':
                    hexa.append(10)
                elif i == 'b' or i == 'B':
                    hexa.append(11)
                elif i == 'c' or i == 'C':
                    hexa.append(12)
                elif i == 'd' or i == 'D':
                    hexa.append(13)
                elif i == 'e' or i == 'E':
                    hexa.append(14)
                elif i == 'f' or i == 'F':
                    hexa.append(15)
                else:
                    cont += 1
            if cont > 0:
                print('ATENÇÃO!! PARA NÚMERO HEXADECIMAL, SOMENTE NÚMEROS ENTRE 0 E 9, E LETRAS ENTRE A Á F')
            else:
                while h < len(hexadecimal):
                    for j in range(len(hexadecimal) - 1, -1, -1):
                        num += int(hexa[h]) * (base ** int(j))
                        h += 1
                print('NÚMERO DECIMAL => ', num)
        else:
            print('''BASE INVÁLIDA!!''')

    resposta = input('DESEJA TENTAR NOVAMENTE?')

    if resposta != 'sim' and resposta != 'SIM' and resposta != 'Sim':
        print('''OBRIGADA POR UTILIZAR O PROGRAMA!!''')
