public class MovieNightCombinedVoting {
    public static void main(String[] args){
        //create two bags
        Bag fridayVotes = new Bag();
        Bag saturdayVotes = new Bag();

        System.out.println("Combined Movie Night Voting System");
        System.out.println("Friday group + Saturday group = Weekend votes!");

        // Friday votes
        fridayVotes.add("Inception");
        fridayVotes.add("Dune: Part Two");
        fridayVotes.add("Inception");
        fridayVotes.add("Barbie");
        fridayVotes.add("The Matrix");

        // Saturday votes
        saturdayVotes.add("Dune: Part Two");
        saturdayVotes.add("Barbie");
        saturdayVotes.add("Barbie");
        saturdayVotes.add("Oppenheimer");
        saturdayVotes.add("Inception");
        saturdayVotes.add("The Matrix");

        //print the size of each bag
        System.out.println("Friday group size: " + fridayVotes.size() + " votes");
        System.out.println("Saturday group size: " + saturdayVotes.size() + " votes");

        //merge
        System.out.println("Merging Saturday votes into Friday votes for the full weekend...");
        fridayVotes.merge(saturdayVotes);
        System.out.println("Merged weekend votes: " + fridayVotes.toString());

        // distinct new bag
        Bag uniqueMovies = fridayVotes.distinct();

        // Print the distinct bag contents
        System.out.println("Unique movie titles that received votes: " + uniqueMovies.toString());

    }
}
