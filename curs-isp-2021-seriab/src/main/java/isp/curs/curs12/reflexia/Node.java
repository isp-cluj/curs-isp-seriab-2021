/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs12.reflexia;

/**
 *
 * @author mihai.hulea
 */
public class Node<T> {
    private T value;

    private Node next;

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(1,null);
        Node<Integer> n2 = new Node<>(5, n1);
        //...
        Node<String> t1 = new Node<>("ABC",null);
        Node<String> t2 = new Node<>("XYZ", n1);

    }
    
}
