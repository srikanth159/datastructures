package binary;
class Node{
    int data;
    Node left;
    Node right;
    
    public  Node(int data){
        this.data = data;
    }
}

public class Binarytree{

    Node root;

    public void insert(int data){

        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data); 
        }
        else if(data < root.data){
            root.left = insertRec(root.left, data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }
    public void delete(int data){

        root = deleteRec(root, data);
    }
    public Node deleteRec(Node root, int data){
       
       if(root == null){
           return root;
       }
          if(root.data > data){
               root.left = deleteRec(root.left, data);
          }else if(root.data < data){
               root.right = deleteRec(root.right, data);
               return  root;
          }

          if(root.left == null){
            Node temp = root.right;
            return temp;
          }else if(root.right == null){
            Node temp = root.left;
            return temp;
          }
          else{
            Node succParent = root;

             Node succ = root.right;
            while(succ.left != null){
                succParent = succ;
                succ = succ.left;
            }
            if(succParent != root){
                succParent.left = succ.right;
            }else{
                 succParent.right = succ.right;
            }
            root.data = succ.data;
           
          }
        return root;
        
    }
    public void inorder(){
         
         inorderRec(root);

    }
       public void inorderRec(Node root)
       {
        
            if(root != null){
                inorderRec(root.left);
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }
        
    }
     public void preorder(){
         
         preorderRec(root);

    }
       public void preorderRec(Node root)
       {
        
            if(root != null){
                System.out.print(root.data + " ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        
    }

    public void postorder(){
         
         postorderRec(root);

    }
       public void postorderRec(Node root)
       {
        
            if(root != null){
                
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.print(root.data + " ");
            }
        
    }
}