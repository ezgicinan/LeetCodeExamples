//Method 1: Use hashmap key-value, increments value of same key (array elements), check values during loop.
class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int majorElement = 0;
        int count = 0;

        for(int i:nums){
            if(!hashMap.containsKey(i)){
                hashMap.put(i,1);
            } else{
                hashMap.put(i, hashMap.get(i)+1);
            }

            if(hashMap.get(i) > count){
                count = hashMap.get(i);
                majorElement = i;
            }
        }
		
        return majorElement;      
    }
}
//Method 2: #Boyer-Moore Algorithm, works in O(N) time complexity and O(1) space complexity.
//Use counter to recognize amount of major element, increase or decrease it traversing array. When it is 0, assign major Element as current element.
class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int majorElement = 0;

        for(int i=0; i<nums.length; i++){
            if(count == 0){
                majorElement = nums[i];
            }
            if(majorElement == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return majorElement;     
    }
}
