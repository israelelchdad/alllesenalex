class viecl(object):
    def __init__(self,color,spidmax):
        self.color=color
        self.spidmax=spidmax

class mobil(viecl):
    def __init__(self,color,spidmax,wait,id):
        viecl.__init__(self,color,spidmax)
        self.wait=wait
        self.id=id
class car(viecl):
    def __init__(self,color,spidmax,year,id):
        viecl.__init__(self,color,spidmax)
        self.year=year
        self.id=id

    def numrods(self):
        return 4



class biskel(viecl):
    def __init__(self,color,spidmax,id):
        viecl.__init__(self,color,spidmax)
        self.id=id

v=viecl("green",450)
print v.spidmax
mobil=mobil("blu",150,460,12345)
print (mobil.id)
car =car("kk",45,1998,345567)
print car.year
print car.numrods()
b=biskel("ggg",45,654535375)
print b.spidmax


