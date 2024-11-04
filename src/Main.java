import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Step 1: Create a List to hold your favorite songs/books/movies.

        List<String> favourites = new ArrayList<>();

        //Step 2: Add at least five songs/books/movies to your playlist.

        favourites.add("Toy Story");
        favourites.add("Spirited Away");
        favourites.add("Inception");
        favourites.add("Parasite");
        favourites.add("The Shawshank");

        //Step 3: Remove the third song from the playlist.

        favourites.remove(2);

        //Step 4: Use a loop to display your playlist.

        //7 ways and i gave you 2 :)
        //        for(int i =0 ; i<favourites.size();i++){
         // System.out.println(favourites.get(i));
        //}

        for (String favourite : favourites) {
            System.out.println(favourite);
        }



    }
}