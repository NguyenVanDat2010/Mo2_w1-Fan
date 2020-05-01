public class MainOfFan {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.turnOn();
        fan1.setSpeed(3);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.SpeedDown();
        System.out.println(fan1.FanInfo());

        Fan fan2=new Fan();
        fan2.setSpeed(2);
        System.out.println(fan2.FanInfo());

    }
}
