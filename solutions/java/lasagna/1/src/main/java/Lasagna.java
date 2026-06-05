public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int timeExpected = 40;
        return timeExpected;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualTime){
        return this.expectedMinutesInOven() - actualTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int timeTaken = layers * 2;
        return timeTaken;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int ovenMinutes){
        return this.preparationTimeInMinutes(layers) + ovenMinutes;
    }
}
