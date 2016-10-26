import java.util.*;
import java.util.Map.Entry;
public class CountOccurence {

	public static void main(String[] args) {
		int arr[]={1,3,2,4,5,3,2,5,56,4,3,65,6,4,3,3,4};
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for (int i=0;i<arr.length;i++)
        {
        	if (m.containsKey(arr[i]))
        	{
        		int count=m.get(arr[i]);
        		count++;
        		m.put(arr[i],count);
        	}
        	else
        	{
        		m.put(arr[i],1);
        	}
        }
        TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
   for (Map.Entry e:m.entrySet())
   {
	   tm.put((Integer)e.getValue(),(Integer)e.getKey());
   }
  for (Map.Entry e:tm.entrySet())
  {
	  System.out.println(e.getValue());
  }
	}

}
