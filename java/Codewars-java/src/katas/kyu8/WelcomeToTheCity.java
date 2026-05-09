package katas.kyu8;

public class WelcomeToTheCity {
    /*
    Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array consisting of one or more values that should be joined together with one space between each, and the length of the name array in test cases will vary.

    Example:
    ['John', 'Smith'], 'Phoenix', 'Arizona'
    This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
    */
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


