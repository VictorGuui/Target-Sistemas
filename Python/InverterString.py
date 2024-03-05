def inverter_string(s):
    caracteres = list(s)

    tamanho = len(caracteres)

    for i in range(tamanho // 2):
        temp = caracteres[i]
        caracteres[i] = caracteres[tamanho - i - 1]
        caracteres[tamanho - i - 1] = temp

    string_invertida = ''.join(caracteres)

    return string_invertida

string_original = input("Digite uma string para inverter: ")
string_invertida = inverter_string(string_original)

print("String Original:", string_original)
print("String Invertida:", string_invertida)
