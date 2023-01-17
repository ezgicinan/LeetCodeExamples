#169. Majority Element
#Given an array nums of size n, return the majority element.
#The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #Boyer-Moore Algorithm, works in O(N) time complexity and O(1) space complexity.
        majorElement = 0
        count = 0

        for i in range(len(nums)):    
            if count == 0:
                majorElement = nums[i]
            if majorElement == nums[i]:
                count +=1
            else:
                count -=1
        print(majorElement)
        return majorElement 

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #The next solution is based on dictinary, key-value, time and space complexity is O(n)
        myMap = {} #dictionary, hashmap
        maxValue = 0
        result = 0
        
        for number in nums:
            myMap[number] = 1 + myMap.get(number,0)
            
            if myMap[number] > maxValue:
                result = number
                maxValue = myMap[number]
        
        print(f"result: {result}")
        return result