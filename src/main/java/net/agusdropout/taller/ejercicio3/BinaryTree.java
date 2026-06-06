package net.agusdropout.taller.ejercicio3;

public class BinaryTree {



    public boolean isBinarySearchTree(Node node , int min , int max) {


        if(node == null){
            return true;
        }

        if (node.data >= max || node.data <= min) {
            return false;
        } else {
            return isBinarySearchTree(node.left, min, node.data ) && isBinarySearchTree(node.right, node.data , max );
        }

    }
}
