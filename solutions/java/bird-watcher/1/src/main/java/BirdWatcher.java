
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int value : birdsPerDay){
            if (value == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if (numberOfDays > birdsPerDay.length){
            for (int i : birdsPerDay){
                count += i;
            }
        } else {
            for (int i = 0; i < numberOfDays; i++){
                count += birdsPerDay[i];
            }
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int bird : birdsPerDay){
            if (bird >= 5){
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
