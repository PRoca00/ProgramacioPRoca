try:
    llista = [1, 2, 3, 4, 5]

    llista[10]

except IndexError:
    print("Error degut a que l'index al qual s'està intentant accedir dins la llista no existeix")