import java.util.*;

public class FindDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            if (!s.add(a))
                System.out.println("Duplicate detected: " + a);

        System.out.println(s.size() + " distinct words: " + s);
        
        Set<String> t = new TreeSet<String>();
        for (String a : args)
            if (!t.add(a))
                System.out.println("Duplicate detected: " + a);

        System.out.println(t.size() + " distinct words: " + t);
    }
}