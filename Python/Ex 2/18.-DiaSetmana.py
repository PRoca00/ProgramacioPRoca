def diaSetmana(dia):
    switch={
        1:"Dilluns",
        2:"Dimarts",
        3:"Dimecres",
        4:"Dijous",
        5:"Divendres",
        6:"Dissabte",
        7:"Diumenge"
        }
    return switch.get(dia,"Error")

dia = int(input("Posa el dia de la setmana indicant un nombre de l'1 al 7: "))

print(diaSetmana(dia))