package ac;

public class Petrol {
    public static void main(String[] args) {


        PetrolPurchase petrol = new PetrolPurchase("Lagos","Fuel",100,
                250.0,5.0);

        System.out.println("Location is: "+petrol.getLocation());

        System.out.println("Petrol type is: "+petrol.getPetrolType());

        System.out.println("Number of litter is: "+petrol.getQuantity());

        System.out.println("Amount is: "+petrol.getPrice());

        System.out.println("Discounted amount: "+petrol.getDiscount());
        System.out.println("Net amount: "+petrol.getPurchaseAmount());
    }



}
