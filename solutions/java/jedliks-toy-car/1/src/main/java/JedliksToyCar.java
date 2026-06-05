public class JedliksToyCar {
    private int distance = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0){
            return "Battery empty";
        }
        return String.format("Battery at %s%%", batteryPercentage);
    }

    public void drive() {
        if (batteryPercentage == 0){
            return;
        } else {
            distance += 20;
            batteryPercentage -= 1;   
        }
    }
}
