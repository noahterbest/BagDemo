public class MovieNightVoting {
    public static void main(String[] args){
        Bag movieVotes = new Bag();

        //Print to console:
        System.out.println("Movie Night Voting System");
        System.out.println("9 people are voting for the next movie night:");

        //add the elements (votes) which includes duplicates
        movieVotes.add("Inception");
        movieVotes.add("Dune: Part Two");
        movieVotes.add("The Matrix");
        movieVotes.add("Inception");
        movieVotes.add("Barbie");
        movieVotes.add("Inception");
        movieVotes.add("Dune: Part Two");
        movieVotes.add("Barbie");
        movieVotes.add("Oppenheimer");

        //print the votes (contents of bag)
        System.out.println("Votes" + movieVotes.toString());
        System.out.println(" "); //spacer

        //test the contains method
        System.out.println("Contains 'Inception'?     " + movieVotes.contains("Inception"));
        System.out.println("Contains 'Barbie'?        " + movieVotes.contains("Barbie"));
        System.out.println("Contains 'Oppenheimer'?   " + movieVotes.contains("Oppenheimer"));
        System.out.println("Contains 'The Godfather'? " + movieVotes.contains("The Godfather"));

        //test the count method
        System.out.println("Current vote counts:");
        System.out.println("Inception:      " + movieVotes.count("Inception") + " votes");
        System.out.println("Dune: Part Two: " + movieVotes.count("Dune: Part Two") + " votes");
        System.out.println("Barbie:         " + movieVotes.count("Barbie") + " votes");
        System.out.println("Oppenheimer:    " + movieVotes.count("Oppenheimer") + " votes");

        //remove an element
        System.out.println("\nOne person changed their mind and removed their vote for 'Oppenheimer'...");
        movieVotes.remove("Oppenheimer");

        //print the bag contents again
        System.out.println("Updated votes cast: " + movieVotes);

        //test contains and count for the removed element
        System.out.println("\n--- After Removal ---");
        System.out.println("Contains 'Oppenheimer'? " + movieVotes.contains("Oppenheimer"));
        System.out.println("Count of 'Oppenheimer': " + movieVotes.count("Oppenheimer") + " votes");
    }

}
