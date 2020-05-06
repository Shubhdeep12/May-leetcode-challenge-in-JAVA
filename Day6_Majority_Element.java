//11ms
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<=2){
	            return nums[0];
	        }
	        else{
	        Integer[] nms = new Integer[nums.length];
	        Arrays.setAll(nms, i -> nums[i]);
	        List<Integer> list=Arrays.asList(nms);
	        Set<Integer> sett=new HashSet(list);
	        for(Object a:sett){
	            if(Collections.frequency(list,(int)a)>nums.length/2){
	                return (int)a;
	            }
	        }
	        }
	        return 0;
    }
}