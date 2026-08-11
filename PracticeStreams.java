import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;



public class PracticeStreams {

    public static void main(String[] args){

        List<Integer>  li = Arrays.asList(1,2,32,21,12,45,6,7,8,2,8);

        List<String>   ls = Arrays.asList("hello","Apple","welcome","to","to","java","java","programming");


        if(isPrime(7)){
            System.out.println("it is a prime number");
        }else{
            System.out.println("Not a prime number");
        }



    }

    public static boolean isPrime(int num){
        while(num<=1){
            return false;
        }

        return IntStream.rangeClosed(1,(int)Math.sqrt(num)).noneMatch(i->num%2==0);
    }









}
