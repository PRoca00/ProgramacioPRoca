from random import randint

#Comprova si un caràcter està dins d'una cadena
def stringConte(str, char):
    for i in str:
        if i == char:
            return True
    return False

#Mostra el ninot en consola
def ninotPenjat(hp, difficulty):
    if difficulty == "1":
        if hp == 10 :
            print("""|  |
|  O
| /|\\
| /\\
""")
        elif hp > 8:
            print("""|  |
|  O
| /|\\
| /
""")
        elif hp > 6:
            print("""|  |
|  O
| /|\\
| 
""")
        elif hp > 4:
            print("""|  |
|  O
| /|
| 
""")
        elif hp > 2:
            print("""|  |
|  O
|  |
| 
""")
        elif hp > 0:
            print("""|  |
|  O
| 
| 
""")
        elif hp == 0:
            print("""|  |
|  
| 
| 
""")
    elif difficulty == "2":
        if hp == 6 :
            print("""|  |
|  O
| /|\\
| /\\
""")
        elif hp == 5:
            print("""|  |
|  O
| /|\\
| /
""")
        elif hp == 4:
            print("""|  |
|  O
| /|\\
| 
""")
        elif hp == 3:
            print("""|  |
|  O
| /|
| 
""")
        elif hp == 2:
            print("""|  |
|  O
|  |
| 
""")
        elif hp > 0:
            print("""|  |
|  O
| 
| 
""")
        elif hp == 0:
            print("""|  |
|  
| 
| 
""")
    elif difficulty == "3":
        if hp == 3 :
            print("""|  |
|  O
| /|\\
| /\\
""")
        elif hp == 2:
            print("""|  |
|  O
| /|\\
| 
""")
        elif hp == 1:
            print("""|  |
|  O
| 
| 
""")
        elif hp == 0:
            print("""|  |
|  
| 
| 
""")

#Afegeix lletres a la llista de lletres fallades
def lletresFallats(wrongChars):
    fallades = ""
    for i in wrongChars:
        if i not in fallades:
            fallades += f"{i} "
    print("Lletres fallades: " + fallades)

#Actualitze la paraula en base la lletra ingresada
def paraulaActual(word, updatedWord, char):
    newWord = ""
    for i in range(len(word)):
        if word[i] != char and updatedWord[i] == "_":
            newWord += "_"
        else:
            newWord += word[i]
    return newWord

#Mostra el missatge final en consola
def missatgeFinal(hp, word):
    print()
    print("La paraula era:", word)
    print()
    if hp == 0:
        print("Has perdut, t'has quedat sense vides!")
    elif hp > 0:
        print("Has guanyat, enhorabona!")

print()
print("Ara jugarem al joc del penjat!")
print()

hp = 0
wordGuessed = False

#Llista de possibles paraules
wordList = ["campana", "ampolla", "portatil", "quelcom", "temor", "blau", "fort", "dinar", "macarrons", "llibre"]

while True:
    difficulty = input("""Dificulats:
        - Dificultat 1: 10 vides
        - Dificultat 2: 6 vides
        - Dificultat 3: 3 vides
    Introdueix la dificultat desitjada [1 / 2 / 3]: """)

    if difficulty == "1":
        hp = 10
    elif difficulty == "2":
        hp = 6
    elif difficulty == "3":
        hp = 3
    else:
        print("Dificultat no trovada")
        continue
    break

for i in range(3):
    print()
    print(f"Ronda: {i + 1} / 3")
    print()

    currentWord = wordList[randint(0, 9)] #Aquí està la paraula que s'ha d'encertar
    wordList.remove(currentWord)
    updatedWord = "_" * len(currentWord) #Aquí està la paraula que es mostra en consola

    wrongChars = [] #Llista on es guarden els caràcters fallats

    while hp > 0:
        ninotPenjat(hp, difficulty)
        lletresFallats(wrongChars)      

        print("Paraula: " + updatedWord)

        if currentWord == updatedWord:
            break

        #Demana input per al valor de currentChar i no deix introduïr valors que no siguin UNA lletra
        while True:
            print()
            currentChar = input("Introdueix un caràcter: ").lower()
            print()
            if currentChar.isalpha() and len(currentChar) == 1:
                break
            else:
                print("Ha de ser UNA lletra")

        #Comprova si la paraula a encertar conté el caràcter introduït. 
        # Si està actualitze la paraula, si ja has posat el caràcter abans no fa res, i si no la conté reste 1 a hp i afegeix el caràcter a lletres fallades
        if stringConte(currentWord, currentChar):
            updatedWord = paraulaActual(currentWord, updatedWord, currentChar)
        elif currentChar in wrongChars or stringConte(updatedWord, currentChar):
            print("Lletra ja utilitzada")
        else:
            wrongChars.append(currentChar)
            hp -= 1
    
ninotPenjat(hp, difficulty)
missatgeFinal(hp, currentWord)
        
