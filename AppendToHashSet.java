import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();

        
        set.add("virat");
        set.add("abd");
        set.add("chikka");

        
        System.out.println("Original HashSet:"); 
        System.out.println(set);  // Print the original HashSet

        
        String newElement = "kane W";
        set.add(newElement); // Append a specified element

        // Print the updated HashSet
        System.out.println("\nUpdated HashSet:");
        System.out.println(set);
    }
}
