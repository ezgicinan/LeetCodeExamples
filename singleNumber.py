#136. Single Number
#Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
#You must implement a solution with a linear runtime complexity and use only constant extra space.

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        #Bit manupilation approach, XOR
        result = 0

        for number in nums:
            result = number^result
        
        return result