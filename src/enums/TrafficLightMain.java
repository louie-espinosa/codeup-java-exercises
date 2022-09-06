package enums;

public class TrafficLightMain {

    public static void main(String[] args) {
        TrafficLightColor trafficLight = TrafficLightColor.YELLOW;
        makeDrivingDecision(trafficLight);

    }

    public static void makeDrivingDecision(TrafficLightColor color) {
        //sout out what to do at each traffic light
        switch (color) {
            case RED:
                System.out.println("Too late to take it, so must stop :(");
                break;
            case YELLOW:
                System.out.println("You can still make the light, proceed with speed!");
                break;
            case GREEN:
                System.out.println("Coasting ahead at full speed!");
                break;
            default:
                System.out.println("For flashing lights, slow down, or stop and proceed when safe");
        }
    }

}
