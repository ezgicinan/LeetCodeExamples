#217. Contains Duplicate
#Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
#Time Commplexity: O(n) Space Complexity: O(n)

#First and optimal solution
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        mySet = set()
    
        for num in nums:
          if num in mySet:
              return True
          mySet.add(num)

        return False

#Second Solution
#This is another approach that is firstly sorting the list and check elements two by two.
#Problem: For long lists, time limit could be exceeded.
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        def quickSort(arr, start, end):
            if start >= end:
                return

            pivot = arr[end]
            j = start-1 #imaginary line
            i = start
    
            for i in range(start, end):
                if arr[i] < pivot:
                    j+=1
                    swap(arr, i, j)
    
    
            j+=1
            swap(arr,j,end)
            quickSort(arr, start, j-1)
            quickSort(arr, j+1, end)
    
        def swap(arr, i, j):
           # Swapping element at i with element at j
            (arr[i], arr[j]) = (arr[j], arr[i])
    
        # Driver code
        quickSort(nums, 0, len(nums) - 1)
        print(f'Sorted array: {nums}')
    
        for i in range(1, len(nums)):
            if nums[i-1] == nums[i]:
                return True
        
        return False  

