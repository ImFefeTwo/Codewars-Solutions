package katas.kyu8;

public class WelcomeToTheCity {

    public static void main(String[] args) {
        WelcomeToTheCity sayHello = new WelcomeToTheCity();

        String[] myName = {"Federico", "Berrueta"};
        String city = "Phoenix";
        String state = "Arizona";

        System.out.println(sayHello.sayHello(myName, city, state));
    }

    public String sayHello(String [] name, String city, String state) {
        return "Hello, " + String.join(" ", name) + "!" + " Welcome to " + city + ", " +  state + "!";
    }
}


// ============================================================================
// NOTES
// More readable code:
// return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
// ============================================================================


