import java.util.Scanner;
public class Bubblesort{
    public static void main(String[] args){
   
          Scanner scanner = new Scanner(System.in);
           int n = scanner.nextInt();
           

           int [] arr = new int[n];
           int temp = 0; 
            for(int i = 0; i < n; i++){
                arr[i] =scanner.nextInt();
            }
            System.out.println("Before Sorting");
            
            for(int i = 0 ; i< arr.length ; i++){
               System.out.print(arr[i] + " ");
            }
            
             for (int i = 0 ; i < arr.length; i++){
                for (int j = 0 ; j < arr.length-i-1; j++){

                    // sorting techinque or (logic) for descending order

                    //if(arr[j] < arr[j+1]){
                     ///   temp = arr[j+1];
                      //  arr[j+1] = arr[j];
                      //  arr[j] = temp;
                    //}

                     // sortning techinque or (logic) for ascending order

                     if(arr[j] > arr[j+1])
                     {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                     }
                     
                }
                System.out.println();
                
                for(int k:arr ){
                    System.out.print(k);
                }
                     
             }

            System.out.println();
            System.out.println("After sorting");
        
            for(int i = 0 ;  i < arr.length; i++){
              System.out.print(arr[i]  + " ") ;
            }
            

    }
}