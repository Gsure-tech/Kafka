package com.gsuretech.kafka.tutor;

public class MyTutor {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6};
        System.out.println(oddNumbers(nums).toString());
    }
    private static int[]oddNumbers(int[]nums){
        int[]odd = new int[nums.length];
        for(int n: nums){
            if (n % 2!=0){

                odd[0]=n;
            }
        }

        return odd;
    }
}
