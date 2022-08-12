package ServerNameGenerator;

import java.util.Random;

public class ServerNameGenerator {
    private static Random random = new Random();
    public static String [] adjectives = {"sultry", "stubby", "surly", "thicc", "athletic"};
    public static String [] nouns = {"raspberry", "blueberry", "redcurrant", "boysenberry", "cranberry"};


    public static String getRandomStringFromArr(String[] strings) {
        //1. generate a random index from 0 to last element in strings
//        int rando = (int) (Math.random() * strings.length);//
        int rando = random.nextInt(strings.length);
        //2. return the element at the random index in strings
        return strings[rando];
    }

    public static void main(String[] args) {
        String randomAdjective = getRandomStringFromArr(adjectives);
        System.out.println("Your random adjective is: " + randomAdjective);

        String randomNoun = getRandomStringFromArr(nouns);
        System.out.println("Your random noun is: " + randomNoun);
    }
}
