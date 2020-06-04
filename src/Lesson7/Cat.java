package Lesson7;

public class Cat {

    private String name;
    private int APPETITE;
    private boolean hungry;

    public Cat(String _name, int _appetite){
        this.name = _name;
        this.APPETITE = _appetite;
        this.hungry = true;
    }

    public void eat(Plate _plate){
        if(!_plate.decreaseFood(this.APPETITE)){
            hungry = true;
            System.out.println(this.name+"'у мало еды в этой миске");
        }
        else {
            hungry = false;
            System.out.println(this.name+" сыт(а)");
        }
    }
}
