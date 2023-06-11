# Função range
# range(stop) -> range object
# range(start, stop[, step]) -> range object

# Utilizando range com for
"""for numero in range(0, 11): # colocar o 0 é opcional, já que a contagem sempre inicia com 0
    print(numero, end=" ")""" # imprime de 0 à 10

# Exibindo a tabuada de 5
for numero in range(0, 51, 5): # O for range vai caminhar de 5 em 5. 0 é o start, 51 é o número exclusivo pra para no 50
    # e o 5 é o multiplo, se mudar para 2 e vai contar de 2 em 2
    print(numero, end=" ") # o end= serve para exibir a sequencia lateralmente (horizontal)

