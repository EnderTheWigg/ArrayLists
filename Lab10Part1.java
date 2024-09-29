import java.util.*;
public class Lab10Part1
{
    public static void main(String[] args)
    {
        MyArrayList list = new MyArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int rand = (int)(Math.random()) * list.size();
        String randString = (String) list.get(rand);
        randString = randString.toUpperCase();
        System.out.println(randString);
    }
}