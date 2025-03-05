package com.sj.demo.dsa.array;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 5, 2, 1, 0, 0, 1, 3};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int arr[]) {

        //initially the final position is the last index
        int finalIndex = arr.length - 1;

        //start with second last index
        for (int i = arr.length - 2; i >= 0; i--) {

            //if you can reach the final position from this index
            //update the final position flag
            if (i + arr[i] >= finalIndex)
                finalIndex = i;
        }
        //if we reach the first index then we can make the jump possible
        return finalIndex == 0;
    }
}
