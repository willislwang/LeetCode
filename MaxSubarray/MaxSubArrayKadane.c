//The iterative KADANE!! solution (O(n))

int maxSubArray(int* nums, int numsSize){
    int currSum = 0;
    int largestSum = nums[0];
    for (int i = 0; i < numsSize; i++) {
        currSum += nums[i];
        if (currSum > largestSum) {
            largestSum = currSum;
        }
        if (currSum < 0) {
            currSum = 0;
        }
    }
    return largestSum;
}


