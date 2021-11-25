package Hash.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashLeftJoin {
    public static List<String> HashleftJoin(HashMap h1, HashMap h2){
        List<String> Hashlist = new ArrayList<>();
        for(Object k : h1.keySet()){
            if(h1.containsKey(k)){
                Hashlist.add(k +  ": " + h1.get(k)+ ", " + h2.get(k));
            } else{
                Hashlist.add(k + ": " + h1.get(k) + ", " + null);
            }
        }
        return Hashlist;
    }
}
