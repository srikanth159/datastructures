import java.util.Scanner;
import binary.Binarytree;
public class Mainmethod{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Binarytree tree =  new Binarytree();

          int arr[] = new int[n];

        for(int i = 0; i < n; i++){
           arr[i] = scanner.nextInt();
            tree.insert(arr[i]);
            //tree.insert(7);
            //tree.insert(12);
            //tree.insert(15);
           // tree.insert(2);
            //tree.insert(5);
            //inorder l n r
            //preorder n l r
            //postorder l r n 
        }

        //tree.inorder();
        tree.preorder();
        //tree.postorder();
        tree.delete(m);
        System.out.println();
        tree.preorder();
        
    }
}