// Chapter 6 Game-zone project (page 234)

import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {

        // variables and constants
        final int LOW = 1;
        final int HIGH = 10;
        int userGuess;
        int magicNumber;
        int attempts = 1;
        String msg;

        // input phase

        userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW + " and " + HIGH));

        // Processing phase
        magicNumber = (int) (Math.random() * HIGH) * LOW;

        while (userGuess != magicNumber) {
            if (userGuess > magicNumber) {
                msg = "Sorry, your guess was too high!";
            } else {
                msg = "Sorry, your guess is too low!";
            } // end of if/else statement

            userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPlease enter a number between " + LOW + " and " + HIGH));
            // increment the attempts before the guess is checked again
            ++attempts;
        } // end of while loop

        // Output phase
        JOptionPane.showMessageDialog(null, "YOU'VE WON! \nThe magic number was: " + magicNumber + "\nYou guessed it in " + attempts + "attempt(s)!");

    } // end of main()

}// end of class block
