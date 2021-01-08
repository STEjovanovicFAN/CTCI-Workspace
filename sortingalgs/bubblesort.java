package sortingalgs;

public class bubblesort {

    public static void sort(int[] arr){

        for(int i = 0; i < arr.length -1; i++){

            for(int j = 0; j < arr.length -1 - i; j++){
                System.out.println(arr[j] + " " + arr[j+1]);
                printArr(arr);
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

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
