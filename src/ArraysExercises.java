//import java.util.Arrays;
//import java.io.*;
//import java.lang.*;
//import java.util.*;
//
//public class ArraysExercises {
//
//    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
//
//    waifus = addPerson(waifus, new Person("Erina", "Nakiri"));
//
//
//
//    private static Person [] addPerson(Person [] people, Person newPerson) {
//        //1. create a new array that is size of people + 1
//        Person [] newWaifus.copyOf(people, people.length + 1);//using the Arrays.copyOf java method
//
//        //2. plug newPerson into the last element of the new array.
//        newArray[newArray.length - 1] = newPerson;
//
//        //3. return the new array.
//        return newArray;
//    }
//
//    public static void main(String[] args) {
//
//        int[] numbers = {1, 2, 3, 4, 5}; //in JS: numbers = [1, 2, 3, 4, 5]
//        System.out.println(numbers);// this prints a reference to where this is stored in memory: [I@372f7a8d
//        System.out.println(Arrays.toString(numbers));//This lets us see the elements of the array [1, 2, 3, 4, 5]
//
//        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//        Person[] waifus = {new Person("General", "Esdeath"), new Person("Jill", "Valentine"), new Person("Rin", "Tohsaka")};
//        //print waifus
//        System.out.println(Arrays.toString(waifus));
//        //Iterate through the array and print out the name of each person in the array.
//        for (Person waifu : waifus) {
//            System.out.println(waifu);//I can do this because I have a toString() method
//        }
//    }
//}
