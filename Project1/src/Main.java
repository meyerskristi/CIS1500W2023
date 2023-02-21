import java.util.Scanner;

public class Main {

    // just an option to avoid using strings everywhere and having typos
    static String goNorth = "go north";

    public static void main(String[] args) {
        int turnCount = 0;

        String command = "";

        while( !command.equalsIgnoreCase("escape")){
            command = getValidCommand();
            turnCount++;

            if ( command.equalsIgnoreCase(goNorth)) {
                goNorth();
            } else if (command.equalsIgnoreCase("go east")){
                goEast();
            } else if (command.equalsIgnoreCase("go south")){
                goSouth();
            } else if (command.equalsIgnoreCase("go west")){
                goWest();
            }else if (command.equalsIgnoreCase("walk")){
               walk();
            } else if (command.equalsIgnoreCase("fight")){
                fight();
            } else if (command.equalsIgnoreCase("jump")){
                jump();
            }else if (command.equalsIgnoreCase("flip")){
                flip();
            }
        }

        // avoid counting escape word
        turnCount--;
        System.out.println("Thanks for playing our terrible game, it took you "
                + turnCount + " turns to escape!");
    }

    private static void flip() {
        System.out.println("you try and flip and hurt yourself");
        Scanner keyboard = new Scanner(System.in);
        String command = "";

        while ( !command.equalsIgnoreCase("sleep")) {
            System.out.println("you need to sleep it off");
            command = keyboard.nextLine();
        }

        System.out.println("You slept and feel all better!");
    }

    private static void jump() {
        System.out.println("you jump up and down");
    }

    private static void fight() {
        System.out.println("you fight with a troll");
    }

    private static void walk() {
        System.out.println("you went for a walk");
    }

    private static void goWest() {
        System.out.println("you went west");
    }

    private static void goSouth() {
        System.out.println("you went south");
    }

    private static void goEast() {
        System.out.println("you went east");
    }

    private static void goNorth() {
        System.out.println("you went north");
    }

    private static String getValidCommand() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What do you want to do?");

        String command = keyboard.nextLine();

        while ( !command.equalsIgnoreCase("escape") &&
                !command.equalsIgnoreCase(goNorth) &&
                !command.equalsIgnoreCase("go east") &&
                !command.equalsIgnoreCase("go south") &&
                !command.equalsIgnoreCase("go west") &&
                !command.equalsIgnoreCase("walk") &&
                !command.equalsIgnoreCase("fight") &&
                !command.equalsIgnoreCase("jump") &&
                !command.equalsIgnoreCase("flip") ){
            System.out.println("That's not a valid command, you can pick: " +
                    "go north, go east, go south, go west, walk, fight, jump, or flip");

            System.out.println("What do you want to do?");

            command = keyboard.nextLine();

        }

        return command;
    }
}