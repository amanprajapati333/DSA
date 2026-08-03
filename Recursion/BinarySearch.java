public class BinarySearch {

    public static int binarySearch(int nums[], int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;

        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, high);

        } else {
            return binarySearch(nums, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {

        int nums[] = {10, 20, 30, 40, 50};

        int result = binarySearch(nums, 40, 5, nums.length - 1);

        System.out.println("Target found at index: " + result);
    }
}