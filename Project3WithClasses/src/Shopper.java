import java.util.ArrayList;

public class Shopper {
    private double balance;
    private ArrayList<Item> cart;

    public Shopper(double balance){
        this.balance = balance;
        cart = new ArrayList<>();
    }

    public boolean addItem(Item item){
        if ( balance >= item.getSubtotal()){
            cart.add(item);
            balance -= item.getSubtotal();
            return true;
        }
        return false;

    }

    public String getReceipt(){
        String receipt = "";
        double grandTotal = 0;

        for ( Item item : cart ){
            receipt += item.getQuantity() + " " + item.getName() + " $" + item.getSubtotal() + "\n";
            grandTotal += item.getSubtotal();
        }

        receipt += "Grand Total: " + grandTotal;

        return receipt;
    }

    public double getBalance() {
        return balance;
    }
}
