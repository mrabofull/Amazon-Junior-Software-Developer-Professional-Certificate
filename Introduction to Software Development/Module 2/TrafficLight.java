public class TrafficLight {
    public static void main(String[] args) {
        String color = "green";

        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop!");
                System.out.println("Wait until light turns green");
                break;
            case "yellow":
                System.out.println("Slow down!");
                System.out.println("Prepare to stop");
                break;
            case "green":
                System.out.println("Go!");
                System.out.println("Drive safely");
                break;
            default:
                System.out.println("Invalid traffic light color");
                System.out.println("Please check the signal");
        }
    }
}