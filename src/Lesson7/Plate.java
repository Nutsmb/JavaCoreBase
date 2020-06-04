package Lesson7;

public class Plate {

    final int VOLUME;
    public int quantity;

    public Plate(int volume) {
        VOLUME = volume;
        fill();
    }

    public void fill(){
        quantity = VOLUME;
    }

    public void infoPlate(){
        System.out.println("В миске осталось " + quantity + " еды");
    }

    public boolean decreaseFood(int _animalAppetite){
        boolean result = false;
        if(_animalAppetite < this.quantity){
            this.quantity -= _animalAppetite;
            result = true;
        }
        return result;
    }
}
