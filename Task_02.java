public class Task_02 {
    public static void main(String[] args) {
        int num[] = {3,2,2,3};
        System.out.println(removeElement(num,3));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
