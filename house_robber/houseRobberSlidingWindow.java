/**
 * Sliding Window implementation of House Robber.
 * ValueBeforePrev represents the best value of current - 1
 * ValueBeforeBeforePrev represnets best value of current - 2
 * Idea is that each step, you are trying to maximize between the previous two houses
 * If the previous house value is greater than robbing the current house with the -2, then ignore
 * */
class houseRobberSlidingWindow {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int valueBeforeBeforePrev = nums[0];
        int valueBeforePrev = nums[0] > nums[1]? nums[0]: nums[1];
        for (int i = 2; i < nums.length; ++i) {
            int temp = valueBeforeBeforePrev + nums[i];
            if (temp < valueBeforePrev) {
                temp = valueBeforePrev;
            }
            valueBeforeBeforePrev = valueBeforePrev;
            valueBeforePrev = temp;
        }
        return valueBeforePrev > valueBeforeBeforePrev? valueBeforePrev: valueBeforeBeforePrev;
    }
}
