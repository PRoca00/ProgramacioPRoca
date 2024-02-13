def afegitUnic(llista, elem):
    if elem not in llista:
        llista.append(elem)

    else:
        raise ValueError(f"Impossible afegir elements duplicats => [{elem}]")
    
llista = [1, 2, 3]
elem = 3

try:
    afegitUnic(llista, elem)

except ValueError as err:
    print(err)