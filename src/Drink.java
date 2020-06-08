public class Drink {     // klasa opisuje szablon drinku

    String  name;
    double price;
    String alcohol;

}

class Suplement{     // klasa składniki drinku -szablon

    String fruit;
    String ilqueur;
    String addition;

}

class Drinks{
    public static void main(String[] args) {

        Drink drink = new Drink();// tworze zmienną drink jako referecje do nowego odiektu newDrink
        drink.name = " Sex on the beach";
        drink.price = 22.50;
        drink.alcohol = "True 200 ml.";
        double alc = 200;

        Suplement suplement = new Suplement();//tworze nowy obiekt i zmienną
        suplement.ilqueur= "25 ml.orange with 25ml.mint";
        suplement.fruit = " 1/2 lemon";
        suplement.addition = "50 ml. tonic ";
        double ilq = 50;
        double add = 50;

        System.out.println( "Drink"+ drink.name + ", price "+ drink.price +",  "+"contains alcohol" +
                "- "+drink.alcohol );
        System.out.println("Ingredient of drink :"+ suplement.ilqueur +", "+ suplement.fruit +
                ", "+suplement.addition);
        System.out.println("Copacity of drink :"+ " Alcohol "+alc+ " ml. +"+ " ilquerur "+
                ilq + " ml. +"+ " addition - tonic "+ add + " ml. is "+(alc+ilq+add)+ " ml.");
        System.out.println( "UWAGA - Nadużywanie alkoholu może być powodem wielu problemów !!!");
    }
}

