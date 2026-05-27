class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int d=target-nums[i];//10-4=6,10-5=5,10-6
            if(map.containsKey(d)){
                arr[0]=map.get(d); 
                arr[1]=i;
                return arr;
            }
            map.put(nums[i],i);//4,0  5,1  
        }
        return arr;
    }
}
