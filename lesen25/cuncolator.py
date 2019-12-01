def choise( ):
    opererator = input("select operetion.\n1.add\n2.subtract\n3.cefel\n4.chilik\n enter chise(1/2/3/4) ")
    return opererator
def cuncolator():
    oper=choise()
    num1 = float(input("give namber 1 "))
    nvm2 = float(input("give namber 2 "))
    if oper==1:
        print (num1+nvm2)
    elif oper==2:
        print(num1-nvm2)
    elif oper == 3:
        print(num1 * nvm2)
    else:
        print(num1/nvm2)

while True:
    cuncolator()