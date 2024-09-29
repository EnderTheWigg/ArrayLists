public class IntegerArrayList extends MyArrayList implements IntegerList
{
    public boolean add(Object obj)
    {
        if(!(obj instanceof Integer))
            return false;
        //Do whatever MyArrayList does for this method
        return super.add(obj);
    }
    
    public void add(int index, Object obj)
    {
        if(obj instanceof Integer)
            super.add(index, obj);
        //Do whatever MyArrayList does for this method
    }
    
    public Object set(int index, Object obj)
    {
        if(!(obj instanceof Integer))
            return null;
         
        //Do  whatever MyArrayList does for this method
        return super.set(index, obj);
    }
    public Integer getInt(int index)
    {
        return (Integer)get(index);
    }
    public Integer removeInt(int index)
    {
        return (Integer)remove(index);
    }
    public Integer setInt(int index, Integer str)
    { 
        return (Integer) set(index, str);
    }
}