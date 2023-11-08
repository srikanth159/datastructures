import java.util.Scanner;
public class Insertionsort{
    public static void main(String[] args){
         
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();

         int [] arr = new int[n];

         for(int i = 0; i < n; i++ ){
            arr[i] = scanner.nextInt();
         }
          System.out.println();
          System.out.println("Before sorting");
          for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
          }
          for(int i = 1 ; i < arr.length; i++){

             int key = arr[i];
             int j = i - 1;

             while(j >= 0 && arr[j] > key ){
                 arr[j + 1] = arr[j];
                 j--;
             }
             arr[j + 1] = key; 
          }
           System.out.println();
           System.out.println("After sorting");
          for(int num : arr){
            System.out.print(num + " ");
          }
    }
}