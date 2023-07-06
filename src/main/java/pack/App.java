
package pack;

import java.util.Scanner;

/**
 * This class can run the main method.
 */
class App {
    Scanner sc = new Scanner(System.in);
    /**
     * Your name
     */
    String name;

    /**
     * Your age
     */
    Integer age;

    public String input(String s)
    {
        System.out.println(s);
        return sc.nextLine();
    }

    /**
     * Main method to start the application.
     * It will ask you to enter your name and age.
     */
    public void appRunning()
    {
        /**
         * @throws NumberFormatException if age number is not valid format.
         */
        name = input("Enter your name: ");

        try {
            age = Integer.parseInt(input("Enter your age: "));
            System.out.printf("Your name is %s, and you are %s years old.", name, age);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

    }
}