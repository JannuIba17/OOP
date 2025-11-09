package DSA.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int target=4;
        int[] nums={1,2,3,4,5};
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                index=mid;
                break;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        long end_time=System.nanoTime();
//        System.out.println(end_time-start_time);
        System.out.println("Target is found at "+index);
    }
}
