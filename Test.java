import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.stream.*;


public class Test {



        public static void main(String[] args) {


            Counter c  = new Counter();

            Thread t1 = new Thread(()->{
                for(int i=1;i<=100000;i++){
                    c.increment();
                }
            });

            Thread t2 = new Thread(()->{
                for(int i=1;i<=50000;i++){
                    c.increment();
                }
            });

            t1.start();
            t2.start();

           try{
               t1.join();
               t2.join();
           }catch (InterruptedException e){
               System.out.println("handling the exception "+e.getMessage());
           }

            System.out.println("Final Count :"+c.count);




        }


}

class Counter{

    int count = 0;

    public  synchronized void increment(){
        count++;
    }

}



