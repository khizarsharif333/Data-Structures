package Linked_List;

public class Node {

    int data;
    Node next;

    public Node(){
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node insertBegin(Node head,int x){
        Node node = new Node(x);
        node.next = head;
        return node;
    }

    public Node insertEndIterative(Node head,int x){
        Node node = new Node(x);
        if(head == null) return node;
        Node cur = head;
        while(cur.next != null) cur = cur.next;
        cur.next = node;
        return head;
    }

    public Node deleteFirstNode(Node head){
        return (head == null)? null : head.next;
    }

    public Node deleteTail(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        Node cur = head;
        while(cur.next.next != null){
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }

    public Node insertAtPos(Node head,int pos,int x){
        Node node = new Node(x);
        if(pos == 1) {
            node.next = head;
            return node;
        }
        Node cur = head;
        for(int i=1;i<pos && cur!=null;i++) cur = cur.next;
        if(cur == null) return head;
        node.next = cur.next;
        cur.next = node;
        return head;
    }

    public Node insertAscend(Node head,int x){
        Node node = new Node(x);
        if(head == null) return node;
        if(head.data > x){
            node.next = head;
            return node;
        }
        Node cur = head;
        while(cur.next != null && cur.next.data < x) cur = cur.next;
        node.next = cur.next;
        cur.next = node;
        return head;
    }

    public int middleNaive(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i=0;i<count/2;i++) temp = temp.next;
        return temp.data;
    }

    public int middleOptimal(Node head){
        if(head == null) return -1;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void nFromLast(Node head,int val){
        Node cur = head;
        for(int i=0;i<val && cur!=null;i++) cur = cur.next;
        if(cur == null) return;
        Node res = head;
        while(cur != null){
            res = res.next;
            cur = cur.next;
        }
        if(res != null) System.out.println(res.data);
    }

    public Node reverseIterative(Node head){
        Node prev = null;
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    // Similar to iterative
    public Node reverseRecursive1(Node cur,Node prev){
        if(cur == null) return prev;
        Node next = cur.next;
        cur.next = prev;
        return reverseRecursive1(next,cur);
    }

    public Node reverseRecursive2(Node head){
        if(head == null || head.next == null) return head;

        Node newHead = reverseRecursive2(head.next);
        Node newTail = head.next;
        newTail.next = head;
        head.next = null;
        return newHead;
    }
}
