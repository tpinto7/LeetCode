class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        
#         n = len(digits) - 1
    
#         # loop to propagate the carry up the number
#         while(n >= 0):
#             # if the current digit is not 9 we can simply increase it by one and terminate
#             if digits[n] != 9:
#                 digits[n] += 1
#                 return digits
#             digits[n] = 0
#             n -= 1

#         # if while loop terminates, then all digits must be 9
#         digits.insert(0, 1)  
#         return digits 
    
        s = ''.join(map(str, digits))
        intS = int(s)
        intS += 1
        res = [int(x) for x in str(intS)]
        return res