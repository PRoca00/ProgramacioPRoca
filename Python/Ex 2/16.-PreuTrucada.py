duration = float(input("Indica la duració de la trucada en min: "))
day = input("Indica el dia de la setmana: ")
hour = input("Indica si és torn de matí o de tarda [ m / t ]: ")

if duration <= 5 and duration > 0:
    cost = duration
elif duration <= 8 and duration > 0:
    cost = 5 + ((duration - 5) * 0.8)
elif duration <=  10 and duration > 0:
    cost = 5 + (3 * 0,8) + ((duration - 8) * 0.7)
elif duration > 0:
    cost = 5 + (3 * 0.8) + (2 * 0.7) + ((duration - 10) * 0.5)

if day == "diumenge" or day == "Diumenge":
    cost += cost * 0.3
else:
    if hour == "m":
        cost += cost * 0.15
    else:
        cost += cost * 0.1

print(f"El cost total de la trucada surt per {cost} euros")