package Linked_List;

public class DoublyLinked {

    int data;
    DoublyLinked prev;
    DoublyLinked next;

    DoublyLinked(){
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    DoublyLinked(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    DoublyLinked(int data,DoublyLinked prev,DoublyLinked next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

}
