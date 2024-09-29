public class StringArrayList extends MyArrayList implements StringList
{
    /**
     *  If obj is *not* an instanceof a String then this method should
     *  NOT add obj to the list and it should return false.
     *  Otherwise, it should do whatever MyArrayList does for this method.
     */
    public boolean add(Object obj)
    {
        if(!(obj instanceof String))
            return false;
        //Do whatever MyArrayList does for this method
        return super.add(obj);
    }
    
    /**
     *  If obj is *not* an instanceof a String then this method should
     *  NOT add obj to the list and it should return false.
     *  Otherwise, it should do whatever MyArrayList does for this method.
     */
    public void add(int index, Object obj)
    {
        if((obj instanceof String))
            super.add(index, obj);
        //Do whatever MyArrayList does for this method
    }
    
    /**
     *  If obj is *not* an instanceof a String then this method should
     *  NOT set the value at index to obj and it should reutnr null.
     *  Otherwise, it should do whatever MyArrayList does for this method
     */
    public Object set(int index, Object obj)
    {
        if(!(obj instanceof String))
            return null;
        //Do  whatever MyArrayList does for this method
        return super.set(index, obj);
    }
    
    public String getStr(int index)
    {
        return (String) super.get(index);
    }
    
    public String removeStr(int index)
    {
      return (String) super.remove(index);
      
    }
    
    public String setStr(int index, String str)
    {
        return (String) super.set(index, str);
        
    }
}