def g(a, b, c):
    if a > b and a > c:
        return a
    elif b > a and b > c:
        return b
    else:
        return c


def z():
    p = input("give namber ")
    f = input("give namber ")
    n = input("give namber ")
    print(g(p,f,n))
z()
