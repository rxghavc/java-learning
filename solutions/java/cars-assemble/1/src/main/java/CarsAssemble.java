public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carsBase = 221;
        if (speed >= 1 && speed <= 4){
            return speed * carsBase * 1;
        } else if (speed >= 5 && speed <= 8) {
            return speed * carsBase * 0.9;
        } else if (speed == 9){
            return speed * carsBase * 0.8;
        } else if (speed == 10){
            return speed * carsBase * 0.77;
        } else {
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (this.productionRatePerHour(speed) / 60.0);
    }
}
