def numCara(num):
    switch={
        1:"sis",
        2:"cinc",
        3:"quatre",
        4:"tres",
        5:"dos",
        6:"u"
        }
    return switch.get(num, "ERROR: nombre incorrecte")

diceNum = int(input("Indica el nombre que ha sortit al dau: "))

caraOposada = numCara(diceNum)
print(f"Nombre del dau: {diceNum}\nNombre cara oposada (escrit): {caraOposada}")