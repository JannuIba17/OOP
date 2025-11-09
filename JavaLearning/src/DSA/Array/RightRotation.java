package DSA.Array;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        for(int i=0;i<k;i++){//0<3 1<3
            int j;
            int temp=nums[nums.length-1];//6
            for(j=nums.length-1;j>0;j--){//6>0 5>0 4>0
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));
    }
}
