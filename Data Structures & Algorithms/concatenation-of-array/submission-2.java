class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans1 = new int[nums.length];
        int[] ans2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans1[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            ans2[i] = nums[i];
        }

        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans1[i];
            ans[i + nums.length] = ans2[i];
        }

        return ans;
    }
}