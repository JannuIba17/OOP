package DSA.Day10;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={8,5,7,3,2};
        int n=nums.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int temp=nums[i];
            while(j>-1 && nums[j]>temp){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
