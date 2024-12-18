package Linked_List;

public class Traversal {

    // Tc-o(n)
    public static void iterativeTraversal(Node head){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    // Auxillary space  - The temporary space used by the algorithm.
    // TC-O(n) AS-O(n)
    public static void recursiveTraversal(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        recursiveTraversal(head.next);
    }

    public static void recursiveReverseTraversal(Node head){
        if(head == null) return;
        recursiveReverseTraversal(head.next);
        System.out.print(head.data+" ");
    }

    public static void main(String[] args) {
//        System.out.println(new Node().middleOptimal(null));
        Node head = new Node(2);
//        System.out.println(head.middleOptimal(head));
        head = head.insertEndIterative(head,3);
        head = head.insertAscend(head,4);
        head = head.insertEndIterative(head,5);
//        iterativeTraversal(head);
//        System.out.println(head.middleOptimal(head));
        head = head.insertBegin(head,1);

//        head.nFromLast(head,1);

        iterativeTraversal(head);
        head = head.reverseRecursive2(head);
        iterativeTraversal(head);

//        iterativeTraversal(head);
//        System.out.println(head.middleOptimal(head));

//        iterativeTraversal(head);

//        head = head.deleteTail(head);

//        System.out.println();
//        iterativeTraversal(head);

//        recursiveReverseTraversal(head);
    }
}
