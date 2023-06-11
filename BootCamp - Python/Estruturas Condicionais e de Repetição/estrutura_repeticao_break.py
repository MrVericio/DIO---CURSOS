# Comando break
# Ex
while True:
    numero = int(input("Informe um número: "))

    if numero == 10:
        break

    print(numero)

for numero in range(100):

    if numero == 12:
        continue # o range pede 100 o continue faz o 12 ser pulado
       # break # o range pede 100 o break faz parar no 12

    print(numero, end=" ")