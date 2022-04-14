package Week8;

import java.util.Arrays;

public class AdvancedArrays {
    // Given an Array return true if 9 appears as first or last element 
    // of the array
    // EX. frontEnd([1,3,4,9]) -> true
    // frontEnd[5,6,7,8] -> false
    // frontEnd[0,1,2,3] -> false


    // How to pass in an array as a parameter
    public static boolean frontEnd(int[] nums){
        // if(nums[0] == 9 || nums[nums.length - 1] == 9){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        // if just passing in the return statments for booleans 
        // statement assumes True otherwise returns False
        return nums[0] == 9 || nums[nums.length - 1] == 9;
    }
    // Given an int array if there is a 9 follwed by a 1 and then a 1 return 
    // The police are on their way 
    // [2,1,3,9,1,2,3,4]
    // [0,1,2,3,4,5,6,7]
    public static int[] Call911(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 9 && nums[i+1] == 1){
                if(nums[i+2] == 1){
                    System.out.println("The police are on their way ");
                }
                else if(nums[i+2] != 1){
                    System.out.println("Dialing the number");
                }
                break;
            }
            
        }
        return nums;
        
    }

    public static void main(String[] args) {

        int[] phoneNumber = {9,5,3,0,9};

        System.out.println(frontEnd(phoneNumber));
        // This wont work because we cant syso arrays
        // System.out.println(Call911(phoneNumber));
        System.out.println(Arrays.toString(Call911(phoneNumber)));
        
    }


}
