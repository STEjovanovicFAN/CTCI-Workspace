package sortingalgs;

public class selectionsort {
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length;  i++){
            int lowest = arr[i];
            int pos = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < lowest){
                    pos = j;
                    lowest = arr[j];
                }

            }

            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;

        }

    }
    
    public static void printArr(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n");

    }

    public static void main(String args[]){
        int [] arr = new int[5];
        arr[0] = 5;
        arr[1] = 1;
        arr[2] = 4;
        arr[3] = 2;
        arr[4] = 8;
        printArr(arr);
        sort(arr);
        printArr(arr);
    }
}
