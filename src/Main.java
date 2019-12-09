import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(101);
        values.add(55);
        values.add(12);
        values.add(90);
        Comparator<Integer> com=new Comimpl(){

        };
        Collections.sort(values,com);
        for(int i : values){
            System.out.println(i);
        }



    }
}
