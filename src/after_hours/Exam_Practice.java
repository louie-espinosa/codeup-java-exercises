//package after_hours;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Exam_Practice {
//
//        //1a. Write a public static method named square that accepts an integer as input and returns that number times itself.
//        public static int square(int input) {
//            return input*input;
//        }
//        //1b. Write a public static method named sum that accepts two arguments and that works with both integers and doubles (use method overloading) and returns the result of adding the two passed numbers.
//        public static int sum (int x, int y) {
//            return x+y;
//        }
//        public static double sum (double x, double y) {
//            return x+y;
//        }
//        //1c. Write a public static method named average that takes in an array of int numbers (not a List, an array) and returns the average as a double. (Hint: make sure the average of [1, 2] is 1.5)
//        public static double average (int [] nums) {
//            Arrays.sort(nums);
//
//            if(nums.length % 2 == 1) {
//                int middleIndex = nums.length / 2;
//                return nums[middleIndex];
//
//            }
//            int rightIndex = nums.length / 2;
//            int leftIndex = rightIndex - 1;
//
//            return (double) (nums[leftIndex] + nums[rightIndex]) / 2;
//        }
////In the Assessment class, create a static method called namesToLeet.
////Convert the firstName and lastName fields of each User to leetspeak (see below for the leetspeak conversion rules).
////Be sure to use the setters for firstName and lastName to change their respective values.
//// Upper and lowercase L becomes 1 - Upper and lowercase E becomes 3 - Upper and lowercase T becomes 7
//
//    public static void namesToLeet(ArrayList<User> userList) {
//        for (User user : userList) {
//            String fN = user.getFirstName().toLowerCase();
//            String lN = user.getLastName().toLowerCase();
//            //reassigning my first name and last name variables with new rules
//            fN = fN.replaceAll("l", "1").replaceAll("e", "3").replaceAll("t", "7");
//            lN = lN.replaceAll("l", "1").replaceAll("e", "3").replaceAll("t", "7");
//            user.setFirstName(fN);//setting the change in the first name
//            user.setLastName(lN);//setting the change in the last name
//
//        }
//        System.out.println(userList);
//    }
//
//        //MAIN to test
//        public static void main(String[] args) {
//
//            ArrayList peopleList = new ArrayList<>();
//
//            User ronnie = new User("Ronnie", "Cruz", true);
//            User louie = new User("Louie", "Louie", true);
//            User greg = new User("Greg", "Olague", false);
//            User tarzan = new User("Tarzan", "Clayton", false);
//            peopleList.add(ronnie);
//            peopleList.add(louie);
//            peopleList.add(greg);
//            peopleList.add(tarzan);
//
//            namesToLeet(peopleList);
//
//
//            System.out.println(4.5 == average(new int[]{1, 3, 4, 2, 6, 5, 8, 7}));
//            System.out.println(7.0 == average(new int[]{2, 20, 3, 7, 7, 5, 8, 7, 10, 0}));
//        }
//
//    }
//
