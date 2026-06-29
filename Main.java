package BasicLevel.DataType;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Kakashi");
        ninjas.add("Akamaru");
        ninjas.add("Akamaru");
        ninjas.add("Zabuza");
        //print the list normal in the implementation order, with index
        System.out.println("The list of ninjas is: " +  ninjas);

        Set<String> ninjasHash = new HashSet<>();
        ninjasHash.addAll(ninjas);
        //print the list without duplicates and without index
        System.out.println("The HashSet of ninjas is: " + ninjasHash);

        Set<String> ninjasTree = new TreeSet<>();
        ninjasTree.addAll(ninjas);
        //print the list without duplicates, without index and in order
        System.out.println("The TreeSet of ninjas is: " +  ninjasTree);

        Set<String> ninjasLinked = new LinkedHashSet<>();
        ninjasLinked.addAll(ninjas);
        //print the list without duplicates, without index and in order of implementation
        System.out.println("The LinkedHashSet of ninjas is: " +  ninjasLinked);
    }
}
