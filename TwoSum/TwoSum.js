var twoSum = function(nums, target) {
  for (let i = 0; i < nums.length - 1; i++) {
    let rem = target - nums[i]
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[j] == rem) return [i, j]
    }
  }
  return false
};
