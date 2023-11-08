import java.util.Scanner;
public class Quicksort{

  public static void quickSort(int[] arr ,int low, int high){
       if(low < high){
        int pi = paritition(arr, low, high);

        quickSort(arr, low,  pi - 1);
        quickSort(arr, pi + 1, high);
       }
  }
  private static int paritition(int[] arr, int low, int high){
    int pivot = arr[high];
    int i = low - 1;

    for(int j = low; j < high; j++){

       if(arr[j] < pivot){
          i++;
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
       }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return i+1;
  }
  public static void main(String[] args){
 
    
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();

     int arr[] = new int[n];

      for(int i = 0; i < n ;i++){
         arr[i] = input.nextInt();
       } 
      
       System.out.println("Before sorting");
       for(int i = 0; i < arr.length; i++){
         System.out.print(arr[i] + " ");
      }

      quickSort(arr, 0, arr.length-1);
       System.out.println();
       System.out.println("After sorting");

       for(int num : arr){
        System.out.print(num + " ");
       }

       
   }
  
}