public class Banana extends Fruit{


    public Banana(int fruitWeight){   // HW 2 (CODE STYLE)- i think the name of the variables should be called using camelCase method, in the video variable fruitWeight is written "weight".
        // constructor delegation (Fruit constructor)
        super(fruitWeight);
        usefulVolume = 40; //%
       
    }

    // HW1
    public Banana(){
        super();    
    }
}
