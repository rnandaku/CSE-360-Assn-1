package cse360assignment02;

// Git Repository: https://github.com/rnandaku/CSE-360-Assn-1/tree/master/src/cse360assignment02
public class AddingMachine {
    //Private variables
    private int total;
    private String history = "";

    // Constructor for the class
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    // Get total
    public int getTotal () {
        return total;
    }

    // Add value to total
    public void add (int value) {
        history = history.concat(" + " + value);
        total += value;
    }

    // Subtract value for total
    public void subtract (int value) {
        history = history.concat(" - " + value);
        total -= value;
    }

    // Custom to string statement that shows
    public String toString () {
        return "0".concat(history);
    }

    // Clear history and make total 0 (complete reset of variables)
    public void clear() {
        history = "";
        total = 0;
    }
}