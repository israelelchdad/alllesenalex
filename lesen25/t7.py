
def hfocha():
    a=input("chois number 3 Sfarot")
    num1= (a%10)*100
    a=a/10
    num2 = (a % 10) * 10
    a=a/10
    print(num1+num2+a)
while True:
  hfocha()

