package pack;

import java.util.Scanner;

class App {
    Scanner sc = new Scanner(System.in);

    String name;
    Integer age;

    public String input(String s)
    {
        System.out.println(s);
        return sc.nextLine();
    }

    public void appRunning()
    {
        name = input("Enter your name: ");

        try {
            age = Integer.parseInt(input("Enter your age: "));
            System.out.printf("Your name is %s, and you are %s years old.", name, age);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

    }
}