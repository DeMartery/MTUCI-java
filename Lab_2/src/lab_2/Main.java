package lab_2;

public class Main
{
    public static void main(String[] args)
    {
        arrayList();
        linkedList();
    }
    
    private static void arrayList()
    {
        NewArrayList<String> list = new NewArrayList<>();
        
        list.addToEnd("3");
        list.addToStart("2");
        list.addToEnd("4");
        list.addToStart("1");
        Boolean result = list.search("0");
        result = list.search("2");
        list.remove("4");
        list.addToEnd("4");
        list.addToEnd("5");
        list.addToEnd("6");
        list.addToEnd("7");
        list.addToEnd("8");
        list.addToEnd("9");
        list.addToEnd("10");
        list.addToEnd("11");
        list.remove("8");
    }
    
    private static void linkedList()
    {
        NewLinkedList<String> list = new NewLinkedList<>();
        
        list.addToEnd("3");
        list.addToStart("2");
        list.addToEnd("4");
        list.addToStart("1");
        Boolean result = list.search("0");
        result = list.search("2");
        list.remove("4");
    }
}