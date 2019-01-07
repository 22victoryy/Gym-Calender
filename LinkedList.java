public class LinkedList
{
    /*
    The first node in the LinkedList
    */
    private Node head;
    /*
    The reference to the next node in the LinkedList
    */
    private Node next;

    public LinkedList()
    {
        this.head = null;
        this.next = null;
    }

    public void addToBack(Day dayObject)
    {
        Node temp = new Node(dayObject);

        Node curr = this.head;
        while(curr!=null && curr.nextNode!=null)
        {
            curr = curr.nextNode;
        }

        curr.nextNode = temp;
    }

    public void addToFront(Day dayObject)
    {
        Node temp = new Node(dayObject);
        temp.nextNode = this.head;
        this.head = temp.nextNode;
    }

    public void remove()
    {
        if(this.head.nextNode != null)
            this.head = this.head.nextNode;
        else
            this.head = null;
    }

}
