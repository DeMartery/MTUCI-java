package lab_2;

import java.util.Arrays;

public class NewArrayList<E>
{
    public int size = 0;
    
    // Private
    private Object[] array;    
    private static int defaultCapasity = 10;
    
    public NewArrayList()
    {
        array = new Object[defaultCapasity];
    }
    
    public void addToStart(E element)
    {
        if (element == null)
            return;
        
        if (size == array.length)
        {
            ensureCapacity();
        }
        
        for (int i = array.length - 1; i > 0; i--)
        {
            if (array[i - 1] == null)
                continue;
            
            array[i] = array[i - 1];
        }
        
        array[0] = element;
        size++;
    }
    
    public void addToEnd(E element)
    {
        if (element == null)
            return;
        
        if (size == array.length)
        {
            ensureCapacity();
        }
        
        array[size++] = element;
    }
    
    public boolean search(E element)
    {
        if (element == null)
            return false;
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == (Object)element)
            {
                return true;
            }
        }
        
        return false;
    }
    
    public void remove(E element)
    {
        if (element == null)
            return;
        
        int index = -1;
        
        for (int i = 0; i < array.length - 1; i++)
        {
            if (index == -1 && array[i] == (Object)element)
            {
                index = i;
            }    
            
            if (index != -1)
            {
                array[i] = array[i + 1];                    
            }
        }
        
        size--;
    }
    
    private void ensureCapacity()
    {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }
}