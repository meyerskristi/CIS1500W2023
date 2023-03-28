import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("(M)anage shop or (K)iosk mode");

        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("m")) {
            while (!choice.equalsIgnoreCase("q")) {
                System.out.println("Do you want to (A)dd an item, (U)pdate an item, " +
                        "(D)elete and item, or (Q)uit");
                choice = keyboard.nextLine();

                if (choice.equalsIgnoreCase("a")) {
                    File itemFile = getItemFile();

                    if (itemFile.exists()) {
                        System.out.println("This item is already in the store, please use update");
                    } else {
                        System.out.println("Enter the quantity");
                        String quantity = keyboard.nextLine();
                        System.out.println("Enter the price");
                        String price = keyboard.nextLine();

                        writeItemFile(itemFile, quantity, price);
                    }
                } else if (choice.equalsIgnoreCase("u")) {
                    File itemFile = getItemFile();

                    if (!itemFile.exists()) {
                        System.out.println("This item is not in the store, please use add");
                    } else {
                        String[] itemFileDetails = readItemFile(itemFile);

                        String itemName = itemFile.getName().replace(".txt", "");

                        System.out.println("Your current quantity of " + itemName + " is: " + itemFileDetails[0]);
                        System.out.println("Your current price of " + itemName + " is: " + itemFileDetails[1]);

                        System.out.println("Enter the new quantity");
                        String quantity = keyboard.nextLine();
                        System.out.println("Enter the new price");
                        String price = keyboard.nextLine();

                        writeItemFile(itemFile, quantity, price);
                    }
                } else if (choice.equalsIgnoreCase("d")) {
                    File itemFile = getItemFile();

                    if (itemFile.exists()) {
                        itemFile.delete();
                    } else {
                        System.out.println("you don't have that item in the store");
                    }
                }
            }


        } else if (choice.equalsIgnoreCase("k")) {
            System.out.println("Enter the users starting balance");
            double balance = Double.parseDouble(keyboard.nextLine());
            ArrayList<String> receipts = new ArrayList<>();
            double grandTotal = 0;

            while (!choice.equalsIgnoreCase("q")) {
                System.out.println("Do you want (B)uy an item or (Q)uit");
                choice = keyboard.nextLine();

                if ( choice.equalsIgnoreCase("b")){
                    File itemFile = getItemFile();

                    if (itemFile.exists()){
                        String[] itemFileDetails = readItemFile(itemFile);
                        String itemName = itemFile.getName().replace(".txt", "");

                        int itemQuantity = Integer.parseInt(itemFileDetails[0]);
                        double itemPrice = Double.parseDouble(itemFileDetails[1]);

                        System.out.println("There are " + itemQuantity + " available to buy");
                        System.out.println("Price: " + itemPrice);

                        System.out.println("How many do you want to buy?");
                        int quantityToBuy = Integer.parseInt(keyboard.nextLine());
                        double itemTotal = quantityToBuy * itemPrice;
                        if (quantityToBuy <= itemQuantity && itemTotal <= balance){
                            writeItemFile(itemFile, Integer.toString(itemQuantity - quantityToBuy), Double.toString(itemPrice));
                            receipts.add(quantityToBuy + " " + itemName + " total $" + itemTotal);
                            grandTotal += itemTotal;
                            balance -= itemTotal;
                            System.out.println("Your balance is now: $" + balance);
                        } else if (quantityToBuy > itemQuantity){
                            System.out.println("There aren't that many to buy, please try again");
                        } else if ( quantityToBuy * itemPrice > balance){
                            System.out.println("You don't have enough money to buy that many");
                        }

                    } else{
                        System.out.println("Sorry we don't sell that");
                    }
                }
            }
            System.out.println("RECEIPT");
            for( String receipt : receipts ){
                System.out.println(receipt);
            }
            System.out.println("Grand Total: $" + grandTotal);

        } else {
            System.out.println("I don't know how to do that, please try again");
        }

    }

    public static File getItemFile() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the item name");
        String itemName = keyboard.nextLine();

        File itemFile = new File(itemName + ".txt");

        return itemFile;
    }

    public static String[] readItemFile(File itemFile) throws FileNotFoundException {
        Scanner fileReader = new Scanner(itemFile);
        String currentQuantity = fileReader.nextLine();
        String currentPrice = fileReader.nextLine();
        fileReader.close();
        String[] itemFileDetails = { currentQuantity, currentPrice };
        return itemFileDetails;
    }

    private static void writeItemFile(File itemFile, String quantity, String price) throws IOException {
        PrintWriter fileOutput = new PrintWriter(new FileWriter(itemFile.getName()));
        fileOutput.println(quantity);
        fileOutput.println(price);
        fileOutput.close();
    }
}