import java.util.*;




public class Filtering {

    public static void main(String[] args){

        int i;
        for( i=1;i<=100;i++){
            System.out.println(i);
        }

        Map<String,Integer> mp = new HashMap<>();

        mp.put("Tony",1);
        mp.put("Steve",10);

        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }

}
