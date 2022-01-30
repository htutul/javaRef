// Java program to demonstrate
// why collection framework was needed
import java.io.*;
import java.util.*;

class CollectionDemo {
    public static void main(String[] args)
    {
        Collection colA = new ArrayList();
        Collection colB = new ArrayList();

        colA.add("A");
        colA.add("B");
        colA.add("C");

        colB.add("1");
        colB.add("2");
        colB.add("3");

        Collection target = new HashSet();

        target.addAll(colA);     //target now contains [A,B,C]
        target.addAll(colB);     //target now contains [A,B,C,1,2,3]
        
        Iterator iterator = target.iterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }

        target.retainAll(colB);  //target now contains [1,2,3]

        Iterator iterator2 = target.iterator();
        System.out.println("\ntarget collection state after retainAll:");
        while(iterator2.hasNext()){
            Object object = iterator2.next();
            System.out.println(object);
        }

    }
}