package sba_core_java.exercise2;

public class MajorLeagueSoccer {
    int[] playerNumberArray;

    public MajorLeagueSoccer() {
        playerNumberArray = new int[11];
        for (int i = 0; i < playerNumberArray.length; i++) {
            playerNumberArray[i] = i + 1;
        }
    }

    void sendPlayerToMinorLeague(int playerID) {
        if (playerNumberArray[playerID - 1] != (-1)) {
            playerNumberArray[playerID - 1] = -1;
            System.out.println("Player: " + playerID + " has been sent to the minor leagues");
        }
        else System.out.println("Player " + playerID +" is no longer available.");
    }

    void transferPlayerToDifferentTeam(int playerID, String destinationTeam) {

        if (playerNumberArray[playerID - 1] != (-1)) {
            playerNumberArray[playerID - 1] = -1;
            System.out.println("Player: " + playerID + " is transferred to " + destinationTeam);
        } else System.out.println("Player " + playerID +" is no longer available.");
    }


}
