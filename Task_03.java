public class Task_03 {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int nums2[] = {2, 5, 6};
        int n = 3;
       System.out.println(merge(nums1, m, nums2, n));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        n -= 1;
        m -= 1;
        int copyInd = nums1.length - 1;
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[copyInd] = nums1[m--];
            }
            else {
                nums1[copyInd] = nums2[n--];
            }
            copyInd -= 1;
        }
    }
}
