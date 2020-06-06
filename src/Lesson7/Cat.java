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
        if(hungry) {
            if (_plate.decreaseFood(this.APPETITE)) {
                hungry = false;
            } else {
                hungry = true;
                System.out.println(this.name + "'у мало еды в этой миске");
                return;
            }
        }
        System.out.println(this.name + " сыт(а)");
    }
}
