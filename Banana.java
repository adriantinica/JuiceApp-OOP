public class Banana extends Fruit{


    public Banana(int fruitWeight){
        // constructor delegation (Fruit constructor)
        super(fruitWeight);
        usefulVolume = 40; //%
       
    }

    // HW1
    public Banana(){
        super();    
    }
}
