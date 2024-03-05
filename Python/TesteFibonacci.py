def verifica_fibonacci(numero):
    a, b = 0, 1

    while b <= numero:
        if b == numero:
            return True
        a, b = b, a + b

    return False

numero_informado = int(input("Informe um número para verificar se pertence à sequência de Fibonacci: "))

if verifica_fibonacci(numero_informado):
    print(f"{numero_informado} pertence à sequência de Fibonacci.")
else:
    print(f"{numero_informado} não pertence à sequência de Fibonacci.")
