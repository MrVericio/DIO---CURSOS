# Exemplo if aninhado
conta_normal = True
conta_universitaria = False

saldo = 2000
saque = 3500

cheque_especial = 500


if conta_normal:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    elif saque <= (saldo + cheque_especial):
        print("Saque realizado com uso de cheque especial!")
    else:
        print("Não foi possível realizar o saque!")

elif conta_universitaria:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    else:
        print("Saldo insuficiente!")