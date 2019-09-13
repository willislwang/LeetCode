#Two Pointer Method (minimal memory usage!)

void moveZeroes(int* nums, int numsSize){
    int lastElem = 0;
    int i;
    for (i = 0; i < numsSize; i++) {
        if (nums[i] != 0) {
            nums[lastElem++] = nums[i];
        } 
    } 
    for (; lastElem < numsSize; lastElem++) {
        nums[lastElem] = 0;
    }
}

