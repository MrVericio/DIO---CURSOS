# Operadores Lógicos
# Ex

# Operador E and
"""saldo = 1000
saque = 200
limite = 100"""

# saldo >= saque and <= limite # Operador E

# Operador OU or
"""saldo = 1000
saque = 200
limite = 100"""

# saldo >= saque or <= limite # Operador OU

# Operador NEGAÇÃO not
"""cotantos_emergencia = []

not 1000 > 1500

not cotantos_emergencia

not "saque 1500;"

not """""

# Exemplos dos Operadores
print( True and True)
print( True and False)
print(False and False)
print(True or True)
print(True or False)
print(False or False)

# Parênteses
saldo = 1000
saque = 250
limite = 200
conta_especial = True

# expressão válida mas que pode causar problemas no entendimento
exp = saldo >= saque and saque <= limite or conta_especial and saldo >= saque 
print("Primeira expressão:", exp)

# dessa forma fica melhor de entender o que cada operador está pedindo
exp_2 = (saldo >= saque and saque <= limite) or (conta_especial and saldo >= saque) 
print("Segunda expressão:", exp_2)

# exemplo de melhor divisão da expressão dentro de uma váriavel
conta_normal_com_saldo_suficiente = (saldo >= saque and saque <= limite)
conta_especial_com_saldo_suficiente = (conta_especial and saldo >= saque)

exp_3 = conta_normal_com_saldo_suficiente or conta_especial_com_saldo_suficiente

print("Terceira expressão:", exp_3)