class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }
        for(int num2:nums2){
            if(set1.contains(num2)){
                result.add(num2);
            }
        }
        int arr[]=new int[result.size()];
        int i=0;
        for(int n:result){
            arr[i++]=n;
        }
        return arr;
    }
}