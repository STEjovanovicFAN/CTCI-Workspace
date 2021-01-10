package Ch8;

public class Q3 {

    public int findMagicIndex(int [] nums){
        for(int i = 0; i < nums.length; i++){
            if(i == nums[i]){
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(int [] nums){

        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int middle = (high + low)/2;
            System.out.println(high + " " + low);
            if(nums[middle] == middle){
                return middle;
            }
            else if(nums[middle] < middle){
                low = middle + 1;
            }
            else{
                high = middle - 1;
            }

        }

        return -1;
    }

    public static void main(String [] args){

        Q3 q3 = new Q3();
        int [] arr = new int [7];
        arr[0] = -5;
        arr[1] = -4;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 3;
        arr[5] = 4;
        arr[6] = 6;

        System.out.println(q3.findMagicIndex(arr));
        System.out.println(q3.binarySearch(arr));
    }
    
}
