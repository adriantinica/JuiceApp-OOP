public class Blender{

    public Juice blend(Fruit fruit){

        Juice juice = new Juice( fruit.fruitWeight * fruit.usefulVolume /100);
        return juice;
    }


}