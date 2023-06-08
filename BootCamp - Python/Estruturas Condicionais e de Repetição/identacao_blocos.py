# Identação e Blocos
# Ex
"""def sacar(self, valor: float) -> None: # início do bloco do método

    if self.saldo >= valor: # início do bloco if
        self.saldo -= valor"""
    # fim do bloco do if
# fim do bloco do método

def sacar(valor): # criação do método

    saldo = 500 # variavel que recebe o valor

    if saldo >= valor: # if que condiciona uma ação
        print("Valor sacado!") # imprime uma informação se for atendida dentro do if
        print("Retire o valor na boca do caixa") # # imprime uma informação se for atendida dentro do if
    else: print("Saldo insuficiente") # imprime uma informação se não for atendido o if


    print("Obrigado por ser nosso cliente") # imprime independente do if


sacar(1000) # recebe o valor do saque dentro do método.