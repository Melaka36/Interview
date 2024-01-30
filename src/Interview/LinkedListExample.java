package Interview;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static LinkedListExample insert(LinkedListExample list,int d){
        Node new_node=new Node(d);

        if(list.head==null){
            list.head=new_node;
        }
        else {
            Node last=list.head;
            while (last.next !=null){
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }

    public static void printList(LinkedListExample list){
        Node currentNode=list.head;
        System.out.println("List :");
        while (currentNode!=null){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListExample list=new LinkedListExample();

        list=insert(list,1);
        list=insert(list,4);
        printList(list);

        LinkedList <String> myList= new LinkedList<String>();
        myList.add("daa");
        myList.add("sdk");
        System.out.println(myList);


    }
}
