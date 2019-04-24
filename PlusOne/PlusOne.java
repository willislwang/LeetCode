class Solution {
    public int[] plusOne(int[] digits) {
        return increment(digits, digits.length - 1);
    }
    public int[] increment(int[] digits, int index) {
        if (digits[index] == 9) {
            if (index == 0) {
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                return newArr;
            }
            digits[index] = 0;
            return increment(digits, index - 1);
        } else {
            digits[index] += 1;
            return digits;
        }
    }
}
