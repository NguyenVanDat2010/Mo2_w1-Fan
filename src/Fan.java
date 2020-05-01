public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int newSpeed) {
        if (on && newSpeed >= SLOW && newSpeed <= FAST) {
            speed = newSpeed;
        }
    }

    public void setColor(String newColor) {
        color=newColor;
    }

    public void setRadius(double newRadius) {
        radius=newRadius;
    }

    public void SpeedUp() {
        if (on && speed <= FAST) {
            speed++;
        }
    }

    public void SpeedDown() {
        if (on && speed >= SLOW) {
            speed--;
        }
    }

    public String FanInfo() {
        if (on) {
            return "Fan is on with speed: " + getSpeed() + ", color: " + getColor() + " and radius: " + getRadius();
        } else {
            return "Fan is off with color: " + getColor() + " and radius: " + getRadius();
        }
    }
}
