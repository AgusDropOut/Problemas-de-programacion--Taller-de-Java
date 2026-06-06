package net.agusdropout.taller.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void isBinarySearchTree_isBinary() {
        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(5,
                        new Node(3,
                                new Node(2, null, null),
                                new Node(4, null, null)),
                        new Node(10,
                                new Node(9, null, null),
                                new Node(11, null, null)));

        boolean result = binaryTree.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        assertTrue(result);
    }

    @Test
    void isBinarySearchTree_isNotBinary() {
        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(5,
                new Node(3,
                        new Node(7, null, null),
                        new Node(4, null, null)),
                new Node(10,
                        new Node(9, null, null),
                        new Node(11, null, null)));

        boolean result = binaryTree.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        assertFalse(result);
    }

    @Test
    void isBinarySearchTree_singleNode() {

        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(10, null, null);

        boolean result = binaryTree.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        assertTrue(result);
    }

    @Test
    void isBinarySearchTree_nullRoot() {
        BinaryTree binaryTree = new BinaryTree();

        boolean result = binaryTree.isBinarySearchTree(null, Integer.MIN_VALUE, Integer.MAX_VALUE);

        assertTrue(result);
    }

    @Test
    void isBinarySearchTree_grandChildTrap() {

        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(20,
                new Node(10,
                        null,
                        new Node(25, null, null)),
                new Node(30, null, null));

        boolean result = binaryTree.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        assertFalse(result);
    }

    @Test
    void isBinarySearchTree_duplicateValues() {

        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(10,
                new Node(5, null, null),
                new Node(10, null, null));

        boolean result = binaryTree.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        assertFalse(result);
    }

    @Test
    void isBinarySearchTree_degenerateLeftTreeValid() {
        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(10,
                new Node(8,
                        new Node(6,
                                new Node(4, null, null),
                                null),
                        null),
                null);

        boolean result = binaryTree.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        assertTrue(result);
    }

    @Test
    void isBinarySearchTree_extremeValues() {
        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(0,
                new Node(Integer.MIN_VALUE + 1, null, null),
                new Node(Integer.MAX_VALUE - 1, null, null));

        boolean result = binaryTree.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        assertTrue(result);
    }
}