# Aprendendo a converter os tipos de variáveis
# Inteiro para Float
# Ex: 
preco = 10
print("Preço igual à", preco)

preco = float (preco)
print("Preço igual à", preco)

preco = 10/2
print("Preço igual à", preco)

# Float para Inteiro
# Ex: 
preco2 = 10.30
print("Segundo preço igual à", preco2)

preco2 = int(preco2)
print("Segundo preço igual à", preco2)

# Conversão por divisão
# Ex: 
preco3 = 10
print("Terceiro preço igual à", preco3)

print("Terceiro preço igual à", preco3/2)

print("Terceiro preço igual à", preco3//2)

# Número para String
# Ex: 
preco4 = 10.50
idade = 30
texto = f'A minha idade é {idade}, e o preço é {preco4}'
print(str(preco4))
print(str(idade))
print(texto)

# String para Número
# Ex: 
preco5 = "10.50"
idade = "30"
print(float(preco5))
print(int(idade))

# Erro de conversão
# Ex: 
preco6 = "python" # varável recebe String
print(float(preco6)) # print recebe float para converter a String em float. Mas, a String não é número.
# print(float(preco6))
#          ^^^^^^^^^^^^^
# ValueError: could not convert string to float: 'python'