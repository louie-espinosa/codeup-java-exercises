package after_hours;

import util.Input;

public class BeMyCapstonePartner {

    public static void BeMyCapstonePartner() {

        if(Input.yesNo("")) {
            System.out.println("You wont regret it!");


        } else {
            System.out.println("SO, you're gonna make me stalk you!?");
        }
    }

    public static void main(String[] args) {
        Input choice = new Input();
        System.out.println("Enter y, or n here: ");
        BeMyCapstonePartner();


    }

}

