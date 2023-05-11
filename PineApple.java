public class PineApple extends Fruit{

    public PineApple(int fruitWeight){
        // constructor delegation (Fruit constructor)
        super(fruitWeight);
        usefulVolume = 95; //%
       
    }

    public PineApple(){
        super();
    }

    public void printVitamines(){
        System.out.println("Vitamines A, B6, E, and K. Calcium");
    }


   
}
