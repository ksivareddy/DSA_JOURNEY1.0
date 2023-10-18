package OOPS2;

public class Main {
    public static void main(String[] args) {
        Human siva = new Human (24, "Siva", 15000, false);
        Human sravs = new Human(26, "Sravs", 17000, false);
        Human Harshitha = new Human(26, "Harshitha", 20000, false);


        System.out.println(siva.population);
        System.out.println(sravs.population);
      ///By convertion it's better to be denoted by Class . variable or instance 
      System.out.println(Human.population);
    }
}
 