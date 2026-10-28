
import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //So in python is quite easy to create a List,it usually goes as follows
        //nums = [1,2,3]
        //Since python is a scripted language and java is highly OOP with language C++ type of language that are alike is a little different
        //An Arraylist is a list of an array elements inserted into a list
        //In previous versions of Java it used to be written like this

        //Arraylist<INTEGER> i = new ArrayList<INTEGER>();

        ArrayList<String> s = new ArrayList<>();

        s.add("Hello There\n");
        s.add("Welcome To my shop");



        System.out.println(s.get(1));//that's how you would want to print one single element of the list

        //There is also other types of Lists like Lists or Arraylists which will be a topic for another repo
        //I uploaded a few years back a repo about linked lists which ain't sorted lists
        //There are a lot of things you can do using of course the Collections method for either sorting stuff or of course code a binary or linear search in a very understandable way
        //There are also Stack and Queues which are very different data type by their own

        //Apart from ArrayLists there are a dozen more data types as well like HashMap and HashSet
        //Also don't forget Graphs,Trees and Binary Trees...Stacks and Queues as well

        //In the end it's worth to note that the JVM Ecosystem is still quite powerful,it will always be for android,app and backend development
        //Especially when multiple languages like Java,Scala and Kotlin are combined in a single project

    }
}