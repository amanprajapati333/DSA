class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr = s1.toCharArray();

        int low = 0;
        int high = 2;
        int count = 2;
        while (count>0) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            if(new String(arr).equals(s2)) return true;

            low++;
            high++;


            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            if(new String(arr).equals(s2)) return true;

            low = 0;
            high = 2;
            count--;
        }

        return false;
    }
}