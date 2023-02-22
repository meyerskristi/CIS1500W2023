public class Main {
    public static void main(String[] args) {
        Bottle coffee = new Bottle(250, 100, "coffee");

        if ( coffee.drink(50)){
            System.out.println("You took a drink");
        }
        else{
            System.out.println("not enough coffee to drink, big sad");
        }

        if ( coffee.drink(100)){
            System.out.println("You took a drink");
        }
        else{
            System.out.println("not enough coffee to drink, big sad");
        }

        if ( coffee.fill(200)){
            System.out.println("You refilled your coffee");
        }else{
            System.out.println("Don't spill the coffee!");
        }

        if ( coffee.fill(200)){
            System.out.println("You refilled your coffee");
        }else{
            System.out.println("Don't spill the coffee!");
        }


    }
}