/*
 * Daniel MAchic (22118)
 * Hoja de trabajo #7
 * 25/03/2023
 * Clase que instancia un nodo para el Binary Search Tree
 */

public class Node {
    String english;
    String spanish;
    String french;
    Node left;
    Node right;

    public Node(String english, String spanish, String french) {
        this.english = english;
        this.spanish = spanish;
        this.french = french;
        left = null;
        right = null;
    }
}
