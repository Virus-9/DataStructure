package src.datastructure.array_practise;

import java.util.Arrays;

public class Two_Sum {
        public int[] twoSum(int[] nums, int target) {
            int[] list = new int[2];
            for(int i=0;i<nums.length-1;i++){
                for(int j=1+i;j<nums.length;j++){
                    if(nums[i]+nums[j] == target){
                        list[0] = i;
                        list[1] = j;
//                        System.out.println(i);
//                        System.out.println(j);
                    }
                }
            }
            return list;
        }

    public static void main(String[] args) {
        Two_Sum abc = new Two_Sum();
        int[] input = {3,3} ;
        int[] x = abc.twoSum(input,6);
        System.out.println(Arrays.toString(x));
    }
}
