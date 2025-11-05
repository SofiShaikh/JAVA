import java.util.*;
class node{
    int data;
    node left;
    node right;
    node(int _data){
        data=_data;
        left=null;
        right=null;     
    }
}
public class Mainn{
    public static void inorder(node root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        //inorder traversal
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }

    
    //public static ArrayList<Integer> inorder(node root){
        //ArrayList<Integer>ans=new ArrayList<>();
        //recursiveInorder(root,ans);
       // return ans;



    //}
    
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);


        ArrayList<Integer>ans= new ArrayList<>();
        inorder(root,ans);
        for(int i:ans){
            System.out.print(i+" ");
        }



    }
} 