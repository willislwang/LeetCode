class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int msize = 0;
        int nsize = 0;
        int[] sorted = new int[m+n];
        for (int i = 0; i < m+n; i++) {
            if (msize == m) {
                sorted[i] = nums2[nsize];
                nsize++;
            } else if (nsize == n) {
                sorted[i] = nums1[msize];
                msize++;
            } else {
                if (nums1[msize] > nums2[nsize]) {
                    sorted[i] = nums2[nsize];
                    nsize++;
                } else {
                    
                    sorted[i] = nums1[msize];
                    msize++;
                }
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sorted[i];
        }
    }
}
