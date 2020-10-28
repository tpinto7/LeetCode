class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        fizz = []
        for i in range(1, n + 1):
            repr = ""
            if(i % 3 == 0):
                repr = "Fizz"
            if(i % 5 == 0):
                repr += "Buzz"
            if not repr: 
                repr = str(i)
            fizz.append(repr)
        return fizz