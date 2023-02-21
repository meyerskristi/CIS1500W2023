import java.util.Scanner;

public class Main {

    // just an option to avoid using strings everywhere and having typos
    static String goNorth = "go north";
    static boolean wounded = false;

    public static void main(String[] args) {
        int turnCount = 0;

        String command = "";

        while( !command.equalsIgnoreCase("escape")){
            command = getValidCommand();
            turnCount++;
            System.out.println(getCommandResult(command));
        }

        // avoid counting escape word
        turnCount--;
        System.out.println("Thanks for playing our terrible game, it took you "
                + turnCount + " turns to escape!");
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
        }else if ( command.equalsIgnoreCase("flip")){
            wounded = true;
            return "you try and flip and hurt yourself, you need to sleep it off";
        } else if ( command.equalsIgnoreCase("sleep") ) {
            wounded = false;
            return "You sleep and feel better!";
        } else {
            return "";
        }
    }

    private static String getValidCommand() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What do you want to do?");

        String command = keyboard.nextLine();

        while ( (!command.equalsIgnoreCase("escape") &&
                !command.equalsIgnoreCase(goNorth) &&
                !command.equalsIgnoreCase("go east") &&
                !command.equalsIgnoreCase("go south") &&
                !command.equalsIgnoreCase("go west") &&
                !command.equalsIgnoreCase("walk") &&
                !command.equalsIgnoreCase("fight") &&
                !command.equalsIgnoreCase("jump") &&
                !command.equalsIgnoreCase("flip") &&
                !command.equalsIgnoreCase("sleep"))
                || (wounded && !command.equalsIgnoreCase("sleep") ) ){

            if ( wounded ){
                System.out.println("You have to sleep it off");
            } else {
                System.out.println("That's not a valid command, you can pick: " +
                        "go north, go east, go south, go west, walk, fight, jump, or flip");
            }
            System.out.println("What do you want to do?");

            command = keyboard.nextLine();

        }

        return command;
    }
}