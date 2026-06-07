package net.agusdropout.taller.ejercicio3;

public class BinaryTree {

    /**
     * Se llevan cotas para controlar
     * @param node nodo actual, inicialmente la raiz
     * @param min cota minima global
     * @param max cota maxima global
     * @return true si es un arbol binario de busqueda
     */
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
