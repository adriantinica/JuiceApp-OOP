public class Apple extends Fruit{
   
    

    public Apple (int fruitWeight){
       
       super(fruitWeight);
       usefulVolume = 80;
    }

    public Apple (){
        super();         // that's how we delegate an default constructor -> class Fruit : HW1 
    }

}
