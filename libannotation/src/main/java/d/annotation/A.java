package d.annotation;

import java.util.ArrayList;


//@SuppressWarnings("unchecked")

public class A {
    @SafeVarargs
    public static void main(String... args) {
        ArrayList arr = new ArrayList<Integer>();
        arr.add(20);
        ArrayList<String> arrS = arr;
        System.out.println(arrS.get(0));
    }

}
