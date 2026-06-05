public class Lasagna {
    public int expectedMinutesInOven(){
        int timeExpected = 40;
        return timeExpected;
    }

    public int remainingMinutesInOven(int actualTime){
        return this.expectedMinutesInOven() - actualTime;
    }

    public int preparationTimeInMinutes(int layers){
        int timeTaken = layers * 2;
        return timeTaken;
    }

    public int totalTimeInMinutes(int layers, int ovenMinutes){
        return this.preparationTimeInMinutes(layers) + ovenMinutes;
    }
}
