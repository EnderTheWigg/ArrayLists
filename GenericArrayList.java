import java.util.*;
public class GenericArrayList<E> implements GenericList <E>
{
    List <E> data;
    public GenericArrayList()
    {
        data =  new ArrayList<E>(0);
    }
    public boolean add(E obj)
    {
        return data.add(obj);
    }
    public void add(int index, E obj){
        data.add((index < 0? 0: index >= data.size()? data.size()-1: index), obj);
    }
    public boolean contains(E obj)
    {
        return data.contains(obj);
    }
    public E get(int index){
        if(index < 0 || index >= data.size())
            return null;
        return data.get(index);
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
    public E remove(int index){
        if(index < 0 || index >= data.size())
            return null;
        return data.remove(index);
    }
    public boolean remove(E obj){
        return data.remove(obj);
    }
    public E set(int index, E obj){
        if(index < 0 || index >= data.size() || obj == null)
            return null;
        return data.set(index, obj);
    }
    public int size(){
        return data.size();
    }
    
}