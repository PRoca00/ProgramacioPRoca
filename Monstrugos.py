def creacioMonstrugos(monstrugos):
    for i, j in monstrugos.items():
        j["vitalitat"] = 0
        j["força"] = 0
        j["resistència"] = 0
        for key, value in j.items():
            if value == "foc":
                j["vitalitat"] = 10
                j["força"] = 10
                j["resistència"] = 6
            elif value == "aigua":
                j["vitalitat"] = 10
                j["força"] = 6
                j["resistència"] = 10
            elif value == "terra":
                j["vitalitat"] = 10
                j["força"] = 8
                j["resistència"] = 8

def menu():
    print()
    print("Menu: \n\n  -Combat [1] \n  -Llistar Monstrugos [2] \n  -Sortir [3]")
    print()

    while True:
        opcioMenu = input("Opció: ")
        if opcioMenu in ("1", "2", "3"):
            break
    print()

    switch = {
        1: "Combat",
        2: "Llistar",
        3: "Sortir"
    }

    return switch[int(opcioMenu)]

def seleccioMonstrugo(mons):
    switch = {
        1: "Pyrofire",
        2: "Flame",
        3: "Hydroia",
        4: "Swimmer",
        5: "Beast"
    }
    return switch[mons]

def attack(mons1, mons2):
    if mons1["tipus"] == "foc":
        focAttack(mons2)
    elif mons1["tipus"] == "aigua":
        aiguaAttack(mons2)
    elif mons1["tipus"] == "terra":
        terraAttack(mons2)
    
    statMenorZero(mons1)
    statMenorZero(mons2)
    
def focAttack(mons):
    mons["vitalitat"] -= 3
    mons["resistència"] -= 2

def aiguaAttack(mons):
    mons["vitalitat"] -= 2
    mons["força"] -= 3

def terraAttack(mons):
    mons["vitalitat"] -= 2
    mons["resistència"] -= 2
    mons["força"] -= 1

def estatMonstrugos(monstrugos, mons1, mons2):
    print(f"Estat {mons1}: \n -Vitalitat: {monstrugos[mons1]['vitalitat']} \n -Força: {monstrugos[mons1]['força']} \n -Resistència: {monstrugos[mons1]['resistència']}")
    print()
    print(f"Estat {mons2}: \n -Vitalitat: {monstrugos[mons2]['vitalitat']} \n -Força: {monstrugos[mons2]['força']} \n -Resistència: {monstrugos[mons2]['resistència']}")

def statMenorZero(mons):
    if mons["vitalitat"] < 0:
        mons["vitalitat"] = 0
    elif mons["força"] < 0:
        mons["força"] = 0
    elif mons["resistència"] < 0:
        mons["resistència"] = 0

def comprovacioCombat(monsDict, mons1, mons2):
    if monsDict[mons2]["vitalitat"] <= 0 or monsDict[mons2]["força"] <= 0 or monsDict[mons2]["resistència"] <= 0:
        print("Combat finalitzat!")
        print()
        print(f"{mons1} ha guanyat!")
        print()
        return True


monstrugos = {
    "Pyrofire": {"tipus": "foc"
            },
    "Flame": {"tipus": "foc"
            },
    "Hydroia": {"tipus": "aigua"
            },
    "Swimmer": {"tipus": "aigua"
            },
    "Beast": {"tipus": "terra"
            }
    }

while True:

    opcioMenu = menu()

    if opcioMenu == "Combat":
        creacioMonstrugos(monstrugos)

        print(f"Monstrugos disponibles: \n\n - Pyrofire (foc) - [1] \n - Flame (foc) - [2] \n - Hydroia (aigua) - [3] \n - Swimmer (aigua) - [4] \n - Beast (terra) - [5]")
        print()

        while True:
            mons1 = input("Selecciona el primer Monstrugo [1 / 2 / 3 / 4 / 5]: ")
            if mons1 in ("1", "2", "3", "4", "5"):
                break
        mons1 = seleccioMonstrugo(int(mons1))
        print()
        
        while True:
            mons2 = input("Selecciona el segon Monstrugo [1 / 2 / 3 / 4 / 5]: ")
            if mons2 in ("1", "2", "3", "4", "5"):
                break
        mons2 = seleccioMonstrugo(int(mons2))
        print("------------------------------------------------------------")

        ronda = 1

        while True:
            print()
            print("Ronda:", ronda)
            print()
            
            print("Ataca:", mons1)

            attack(monstrugos[mons1], monstrugos[mons2])
            
            print()
            estatMonstrugos(monstrugos, mons1, mons2)
            print()

            if comprovacioCombat(monstrugos, mons1, mons2):
                break
            
            pausa = input("Pitja enter per continuar ")

            print()
            print("Ronda:", ronda)
            print()

            print("Ataca:", mons2)

            attack(monstrugos[mons2], monstrugos[mons1])

            print()
            estatMonstrugos(monstrugos, mons1, mons2)
            print()

            if comprovacioCombat(monstrugos, mons2, mons1):
                break
            
            pausa = input("Pitja enter per continuar ")
            ronda += 1
    
    elif opcioMenu == "Llistar":
        print()
        print("Monstrugos disponibles:")
        print()

        for i, j in monstrugos.items():
            print("   ", i, "-", j["tipus"])

        print()
        continuar = input("Prem enter per continuar...")
        print()
    else:
        print("Sortint...")
        print()
        exit()