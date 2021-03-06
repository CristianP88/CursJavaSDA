import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TVOps {

    TextFileReader textFileReader = TextFileReader.getInstance();


    public void displayTV(){
        ArrayList tvList = textFileReader.readFile();
        TVComparator tvComparator = new TVComparator();
        Collections.sort(tvList, tvComparator);
        Collections.reverse(tvList);
        Iterator iterator = tvList.iterator();
        System.out.println("Lista tv-urilor afisate descrescator in fct de diagonala este: ");
        while(iterator.hasNext()) {
            TV tv = (TV) iterator.next();
            System.out.println(tv);
        }
    }
}
