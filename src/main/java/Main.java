import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = 5 + 10;
        double something = 33.333333;
        MyClass myClass = new MyClass();
        String name = myClass.getFirstName();

        System.out.println("My name: " + name);


        //What ways do we have to jump the program flow around?
        //branching - if, else, else-if, switch
        //loops - for, enhanced for, while, do-while
        //Jump - invoke behavior, move the next instructions to somewhere else in the program


        //for
        //while
        //do-while
        //for-each - special thing that came later on


        //For loop syntax:
        //for(beginning condition; looping condition/predicate; incrementation)
        for(int i = 0; i < 10; i++) {
            System.out.println("Everything in here happens exactly 10 times");
        }
        System.out.println("After looping 10 times, this is the next thing to happen.");

        //We want to loop through a string, acting once per character, and perhaps doing something
        //we have at our disposal: beginning condition, looping condition, increment, action body do thing.
        String string = "Hello, world!"; //13 characters
        for(int i = 0; i < string.length(); i++) { //N is length, 0 is the first character, 0 to N-1
            System.out.print(string.charAt(i));
        }

        //while loop
        int i = 0;
        while(i < string.length()) {
            System.out.print(string.charAt(i));
            i++;
        }

        //check predicate
        //preform behavior
        //repeat


        //do-while?
        i = 0;
        do {
            System.out.print(string.charAt(i));
            i++;
        } while(i < string.length());

        //preform behavior
        //check predicate
        //repeat


        //for-each AKA enhanced for loop
        //dependent upon the Iterator and Iterable interfaces
        List<String> strList = new LinkedList<>();
        strList.add("Hello");
        strList.add("world!");
        strList.add("I");
        strList.add("AM");
        strList.add("JAVA");
        for(String temp : strList) {
            System.out.println(temp);
        }



    }
}
