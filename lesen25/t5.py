class person(object):
    ("the class person")
    def __init__(self,a,b):
        self.a=a
        self.b=b



    def printpersoin(self):
        print ("a:%s\n b:%s"%(self.a,self.b))

    #def move(self d="a"):
    @staticmethod
    def printpersoin2(p):
        print ("a:%s b:%s" % (p.a, p.b))

    def __cmp__(self, other):
        if self.b>other.b:
            return 1
        elif self.b<other.b:
            return -1
        else:
            return 0
    def __eq__(self, other):
        if isinstance(other,person):
            return self.a==other.a and self.b==other.b

class student(person):
    def __init__(self,a,b,c):
        person.__init__(self,a,b)
        self.c=c

    def printpersoin(self):
        print ("a:%s\n b:%s\n c:%s"%(self.a,self.b,self.c))











p1=person("bb",33)
p2=person("bb",33)
print p1.a
p1.printpersoin()
person.printpersoin2(p1)
print (p1.__doc__)
print(p1.__cmp__(p2))
print (p1.__eq__(p2))
p3=student("mose",44,100)
p3.printpersoin()
print(p3.__eq__(p2))
print(p3.__cmp__(p2))

