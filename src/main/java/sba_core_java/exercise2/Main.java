package sba_core_java.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumberArray = {23,12,33,47};

        double sum = 0;

        for (double numberArrayValue :
                myNumberArray) {
            sum += numberArrayValue;
        }
        System.out.println(sum / myNumberArray.length);

        MajorLeagueSoccer newTeam = new MajorLeagueSoccer();

        System.out.println(Arrays.toString(newTeam.playerNumberArray));

        newTeam.sendPlayerToMinorLeague(4);
        System.out.println(Arrays.toString(newTeam.playerNumberArray));
        newTeam.sendPlayerToMinorLeague(4);

        newTeam.transferPlayerToDifferentTeam(6, "Tottenham");

        newTeam.transferPlayerToDifferentTeam(6, "Napoli");

    }
}
