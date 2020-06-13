package Lesson7;

public class Main {

    public static void main(String[] args) {
        Cat[] Cats = new Cat[5];
        Plate plate = new Plate(48);

        plate.infoPlate();
        Cats[0] = new Cat("Matroskin",28);
        Cats[1] = new Cat("Pushok",30);
        Cats[2] = new Cat("Julka",22);
        Cats[3] = new Cat("Belyashik",50);
        Cats[4] = new Cat("Shavuha",2);
        for(int i =0; i < Cats.length; i++){
            Cats[i].eat(plate);
        }
        plate.infoPlate();
    }
}
