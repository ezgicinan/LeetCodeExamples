//Use Hashmap, key as elements and value as index values. During assignment of array to Hasmap, 
//take the difference between target and current element, try to find whether map contains it as key.
//Time: O(N) Space:O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int[] result;

        for(int i=0; i<nums.length; i++){
            int output = target - nums[i];
            if(myMap.containsKey(output)){   
                result = new int[]{myMap.get(output), i}; 
                return result;
            }
            myMap.put(nums[i], i);
        }
        return null;
    }
}