class Solution {
    public int singleNumber(int[] nums) {
        Set s = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                s.remove(nums[i]);
            } else {
                s.add(nums[i]);
            }
        }
        return (int)(s.iterator().next());
    }
}
