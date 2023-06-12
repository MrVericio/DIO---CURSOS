# Conhecendo métodos úteis da classe String
# Maiúscula, minúscula e título
# Ex
curso = "pYthon"

print(curso.upper()) # Imprime tudo em MAIÚSCULO -> PYTHON
print(curso.lower()) # imprime tudo em minúsculo -> python
print(curso.title()) # imprime a Primeira leram em minúsculo e as demais em maiúsculo -> Python

# Eliminando espaços em branco
# Ex
curso = "    Python  "

print(curso.strip()) # imprime elimando ambos os espaços
print(curso.lstrip()) # imprime eliminando os espaços da esquerda
print(curso.rstrip()) # imprime eliminando os espaços da direita

# Junções e centralização
# Ex
curso = "Python"

print(curso.center(10, "#")) # o 10 significa o número de caracteres que irá ocupar, o "#" é o caracter que vai
# entrar no o espaço em branco -> ##Python##
print(".".join(curso)) # junção junta "." na string que foi desginada, adicionando o . a cada caracter -> P.y.t.h.o.n