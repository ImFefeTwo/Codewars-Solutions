package katas.kyu8;

public class MessiGoalsFunction {

    // Messi is a soccer player with goals in three leagues: LaLiga, Copa Del Rey, Champions
    // Complete the function to return his total number of goals in all three leagues.
    // Note: the input will always be valid.

    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        int resultado = laLigaGoals + copaDelReyGoals + championsLeagueGoals;
        return resultado;
    }

    public static void main(String[] args) {
        int total = goals(0, 0, 0);
        System.out.println("El total de goles es: " + total);
    }
}