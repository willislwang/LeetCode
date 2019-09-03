Class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        else {
            int topRange = x;
            int botRange = 0;
            while (true) {
                int mid = (topRange + botRange) / 2;
                if (mid * mid > x) {
                    topRange = mid;
                } else {
                    botRange = mid;
                }
                if (mid * mid == x || topRange == botRange) {
                    return mid;
                } 
            }
        }
    }
}
