import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Bag {

    //create a list
    private List<String> items;

    //constructor
    public Bag() {
        items = new ArrayList<>();
    }

    //add item method
    public void add(String item){
        items.add(item);
    }

    //remove item moethod
    public void remove(String item){
        items.remove(item);
    }

    //contains method
    public boolean contains(String item){
        return items.contains(item);
    }

    //count items method
    public int count(String item){
        int cnt = 0;
        for(String i : items){
            if(Objects.equals(i, item)){
                cnt++;
            }
        }
        return cnt;
    }

    //to string  for printing bag contents
    @Override
    public String toString(){
        return items.toString();
    }

}
