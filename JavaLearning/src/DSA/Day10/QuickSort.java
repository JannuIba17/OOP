package DSA.Day10;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums={6,5,8,9,3,10,15,12,16,75};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[]nums, int start,int end){
        if(start<end){
            int j=partition(nums,start,end);
            quickSort(nums,start,j-1);
            quickSort(nums,j+1,end);
        }
    }
    public static int partition(int[]nums,int start,int end){
        int pivot=nums[start];
        int i=start;
        int j=end;
        while(i<j){
            while(nums[i]<=pivot && i<=j){
                i++;
            }
            while(nums[j]>=pivot && i<=j){
                j--;
            }
            if(i<j){
                swap(nums,i,j);
            }
        }
        swap(nums,start,j);
        return j;
    }
    public static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

}
