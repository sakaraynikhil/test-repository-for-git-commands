import java.util.*;

public class Calculator {

    public static int a,b;

    public static void main(String[] args){

        Person person = new Person();

        person.setId(56);
        person.setName("Spiderman");
        person.setAge(24);

        person.setId(23);
        person.setName("Spiderman");
        person.setAge(24);



        System.out.println("Performing the addition");

        int sum = add(12,13);

        System.out.println(sum);

        System.out.println("Performing the multiplication");

        int product = multiply(12,24);

        System.out.println(product);

        System.out.println("Name:"+person.getName());

        System.out.println("Age:"+person.getAge());

        System.out.println(person.getId()+person.getName()+person.getAge());

        System.out.println("Successfully printed the person details");



    }


    public static int add(int a,int b){
        return a+b;
    }

    public static int multiply(int a,int b){
        return a*b;
    }

}


class Person{
    int id;
    public String name;
    public int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
