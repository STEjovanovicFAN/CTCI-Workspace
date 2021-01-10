package Ch8;

public class Q4 {
    
    public void allSubsets(int [] nums, int index, String str){
        if(index >= nums.length){
            System.out.println(str);
            return;
        }

        allSubsets(nums, index + 1, str + nums[index] + ",");
        allSubsets(nums, index + 1, str);

    }

    public static void main(String [] args){
        Q4 q4 = new Q4();

        int [] arr = {1,2,3,4,5};
        q4.allSubsets(arr, 0, "");
    }
}
