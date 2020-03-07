package lab_2;

public class NewLinkedList<E>
{
    public int size = 0;
    
    // Private
    private Node<E> first;
    private Node<E> last;
    
    public void addToStart(E element)
    {
        size++;
        
        if (first == null || last == null)
        {
            first = last = new Node<E>(null, element, null);
            return;
        }
        
        Node<E> newNode = new Node<E>(null, element, first);
        first.prev = newNode;
        first = newNode;
    }
    
    public void addToEnd(E element)
    {
        size++;
        
        if (first == null || last == null)
        {
            first = last = new Node<E>(null, element, null);
            return;
        }
        
        Node<E> newNode = new Node<E>(last, element, null);
        last.next = newNode;
        last = newNode;
    }
    
    public boolean search(E element)
    {
        Node<E> node = first;
        
        if (node == null)
            return false;
        
        while(node != null)
        {
            if (node.item == element)
            {
                return true;
            }
            
            node = node.next;
        }
        
        return false;
    }
    
    public void remove(E element)
    {
        Node<E> node = first;
        
        if (node == null)
            return;
        
        while(node != null)
        {
            if (node.item == element)
            {
                if (first == node)
                {
                    first = first.next;
                    first.prev = null;
                }
                else if (last == node)
                {
                    last = last.prev;
                    last.next = null;
                }
                else
                {
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
                
                size--;                
                return;
            }
            
            node = node.next;
        }
    }
    
    private class Node<E>
    {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next)
        {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}