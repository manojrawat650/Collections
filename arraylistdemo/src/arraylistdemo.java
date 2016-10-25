import java.util.*;
public class arraylistdemo
{
    public static void main(String[] args)
    {
     ArrayList ar=new ArrayList();
     ar.add(new Float(22));
     ar.add(new Float(33));
     ar.add(new Float(44));
     ar.add(new Float(12));
     ar.add(new Float(13));
     ar.add(new Float(14));
     System.out.println("the elements in the arraylist ar are "+ar);
     System.out.println("Manoj Singh is the coder");
     System.out.println("Test Output");
     System.out.println("Test Output2");
     Iterator it=ar.iterator();
     int i=0;
     while((it.hasNext())&&(i<6))
     {
     float f=(Float)it.next();//it.next returns object
     System.out.println("the element at position "+i+" in arraylist ar is "+f);
     i++;
     }
   }
}