class Solution {
    public Object twoSum(int[] nums, int target) {
        
           
        int size = nums.length;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
               if ((nums[i]+ nums[j]) == target && i!=j){
                    return +i +j ;
           
                    }
            }
        }

       return null;
        
    }
}