try:
    colors = { 'vermell':'red', 'verd':'green', 'negre':'black ' } 

    colors['blanc']

except KeyError:
    print("Error degut a que la clau que s'està especificant no existeix")