public class Apple extends Fruit{
   
    

    public Apple (int fruitWeight){
       
       super(fruitWeight);
       usefulVolume = 80;
    }

    public Apple (){
        super();
    }

    public void printVitamines(){
        System.out.println("B- Complex and Minerals");
    }

}
