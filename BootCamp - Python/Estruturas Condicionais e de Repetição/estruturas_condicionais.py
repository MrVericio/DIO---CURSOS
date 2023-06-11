# Estruturas Condicionais
# Ex
import sys


saldo = 2000
saque = float(input("Informe o valore do saque: ")) # variavel recebe valor do usuario

if saldo >= saque: # if condicionando uma ação de MAIOR ou IGUAL
    print("Realizando saque!")

if saldo < saque: # if condicionando uma ação de MENOR. Se colocar MENOR ou IGUAL o programa será executado
    # com um erro, imprimindo os dois IFs
    print("Saldo insuficiente!")

# Exemplo simplificado
saldo = 2000
saque = float(input("Informe o valore do saque: ")) # variavel recebe valor do usuario

if saldo >= saque: # if condicionando uma ação de MAIOR ou IGUAL
    print("Realizando saque!")
else: # else condicionando o resultado após o if
    print("Saldo insuficiente!") # imprime se o usuario informar valor fora do if

# Exemplo de variação maior de casos
opcao = int(input("Informe uma opção: [1] Saque \n[2] Extrato: "))

if opcao == 1:
    valor = float(input("Informe a quantia para o saque: "))

elif opcao == 2:
    print("Exibindo o extrato ... ")

else:
    sys.exit("Opção inválida")


