import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Shop shop = new Shop();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("(M)anage shop or (K)iosk mode");

        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("m")) {
            while (!choice.equalsIgnoreCase("q")) {
                System.out.println("Do you want to (A)dd an item, (U)pdate an item, " +
                        "(D)elete and item, or (Q)uit");
                choice = keyboard.nextLine();

                if (choice.equalsIgnoreCase("a")) {
                    System.out.println("Enter the item name");
                    String name = keyboard.nextLine();
                    System.out.println("Enter the quantity");
                    int quantity = Integer.parseInt(keyboard.nextLine());
                    System.out.println("Enter the price");
                    double price = Double.parseDouble(keyboard.nextLine());

                    Item item = new Item(name, quantity, price);
                    if ( !shop.addItem(item) ){
                        System.out.println("That item is already in the shop, use update");
                    }

                } else if (choice.equalsIgnoreCase("u")) {
                    System.out.println("Enter the item name");
                    String name = keyboard.nextLine();

                    Item item = shop.getItem(name);

                    if ( item == null ){
                        System.out.println("That isn't in the shop, use add");
                    }
                    else{

                        System.out.println("Current quantity: " + item.getQuantity());
                        System.out.println("Current Price: " + item.getPrice());
                        System.out.println("Enter the new quantity");
                        int quantity = Integer.parseInt(keyboard.nextLine());
                        System.out.println("Enter the new price");
                        double price = Double.parseDouble(keyboard.nextLine());
                        item.setQuantity(quantity);
                        item.setPrice(price);
                        shop.updateItem(item);

                    }
                } else if (choice.equalsIgnoreCase("d")) {
                    System.out.println("Enter the item name");
                    String name = keyboard.nextLine();

                    if (!shop.deleteItem(name)){
                        System.out.println("That item wasn't in the store");
                    }
                }
            }


        } else if (choice.equalsIgnoreCase("k")) {
            System.out.println("Enter the users starting balance");
            double balance = Double.parseDouble(keyboard.nextLine());

            Shopper shopper = new Shopper(balance);


            while (!choice.equalsIgnoreCase("q")) {
                System.out.println("Do you want (B)uy an item or (Q)uit");
                choice = keyboard.nextLine();

                if ( choice.equalsIgnoreCase("b")){
                    System.out.println("Enter the item name");
                    String itemName = keyboard.nextLine();
                    Item item = shop.getItem(itemName);

                    if (item != null){
                        System.out.println("There are " + item.getQuantity() + " available to buy");
                        System.out.println("Price: " + item.getPrice());

                        System.out.println("How many do you want to buy?");
                        int quantityToBuy = Integer.parseInt(keyboard.nextLine());
                        double itemTotal = quantityToBuy * item.getPrice();
                        if (quantityToBuy <= item.getQuantity()){
                            Item itemToBuy = new Item(item.getName(),quantityToBuy, item.getPrice() );
                            if ( shopper.addItem(itemToBuy)){
                                item.setQuantity(item.getQuantity() - quantityToBuy);
                                shop.updateItem(item);
                                System.out.println("Your new balance is: $" + shopper.getBalance());
                            } else{
                                System.out.println("You don't have enough money to buy that many");
                            }
                        } else {
                            System.out.println("There aren't that many to buy, please try again");
                        }

                    } else{
                        System.out.println("Sorry we don't sell that");
                    }
                }
            }
            System.out.println(shopper.getReceipt());

        } else {
            System.out.println("I don't know how to do that, please try again");
        }

    }
}