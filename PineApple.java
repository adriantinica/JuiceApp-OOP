public class PineApple extends Fruit{

    public PineApple(int fruitWeight){
        // constructor delegation (Fruit constructor)
        super(fruitWeight);
        usefulVolume = 90; //%
       
    }

}