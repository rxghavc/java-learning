class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
            return knightIsAwake || archerIsAwake || prisonerIsAwake;
        } else {
            return knightIsAwake || archerIsAwake || prisonerIsAwake;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!archerIsAwake && prisonerIsAwake){
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent == false && prisonerIsAwake == false && knightIsAwake == false && archerIsAwake == false){
            return false;
        } else if (petDogIsPresent == true && prisonerIsAwake == false && knightIsAwake == false && archerIsAwake == false) {
            return true;
        } else if (petDogIsPresent == true && prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false) {
            return true;
        } else if (petDogIsPresent == true && prisonerIsAwake == true && knightIsAwake == true && archerIsAwake == false) {
            return true;
        } else if (petDogIsPresent == true && prisonerIsAwake == false && knightIsAwake == true && archerIsAwake == false) {
            return true;
        } else if (petDogIsPresent == false && prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false) {
            return true;
        } else {
            return false;
        }
    }
}
