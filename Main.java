package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    Main(){
        /**
         * Not going to call before main
         */
        System.out.println("it's going to be Called After main.");
        nonStaticFunction();
    }
    public static void main(String[] args) {
//        Printing General Example
        String name = "Abdullah Iqbal";
        int age = 22;
        float salary = 10000;
        System.out.println(name + " and Age is " + age + " and Salary is " + salary);
//        Trying something New with hardCoded Data No User Involvement
//        Date Formatting
        Date date = new Date();
        dateFormatter(date.getTime());
        String dob;
        DateFormat forMat = DateFormat.getDateInstance();
        dob = forMat.format(date.getTime());
        System.out.println(dob);
//        Printing an Array Hard Coded
        int[] numbers = {1, 2, 1, 2, 1, 3};
        for (int number = 0; !(number >= numbers.length); number++) {
            System.out.println("index " + number + " " + numbers[number]);
        }
    }
//    Function Calling for Date Formatting with SimpleDateFormat lib
    public static void dateFormatter(Object date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/YYYY");
        String dob = dateFormat.format(date);
        System.out.println("Formatted Date" + dob);
//        Dealing with classes and Instance
        NewInJava newbie = new NewInJava();
//        Conditional Printing
        boolean newUser = newbie.newBie();
        if (newUser) {
            System.out.println("Hello 'Newbie'");
        } else {
            System.out.println("Hello 'Pro'");
        }
    }
    public void nonStaticFunction(){

//        Calling Static Method in NonStatic Function
        StaticExampleClass.exampleFunction();
    }
};
// Hands-on Classes
class NewInJava {
    NewInJava(){
//        Long Process But Called the Static Function in NonStatic Function
        Main obj=new Main();
        obj.nonStaticFunction();
//        Accessing it in Static Way
//        it's Not There
//        Main.nonStaticFunction();
    }
    public boolean newBie() {
        return true;
    }
}
//Hands-on Static-ness ;-)
class StaticExampleClass{
    public static void exampleFunction(){
        System.out.println("Static Method is Made");
    }
}
