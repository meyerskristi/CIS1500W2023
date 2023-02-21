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

             if (command.equalsIgnoreCase("flip")){
                flip();
            } else{
                 System.out.println(getCommandResult(command));
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

    private static String getCommandResult(String command){
        if ( command.equalsIgnoreCase(goNorth)) {
            return "You go north";
        } else if (command.equalsIgnoreCase("go east")){
            return "you go east";
        } else if (command.equalsIgnoreCase("go south")){
            return "you go south";
        } else if (command.equalsIgnoreCase("go west")){
            return "you go west";
        }else if (command.equalsIgnoreCase("walk")){
           return "you go for a walk";
        } else if (command.equalsIgnoreCase("fight")){
            return "you fight a twitter trolls";
        } else if (command.equalsIgnoreCase("jump")){
            return "You jump";
        }else{
            return "";
        }
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