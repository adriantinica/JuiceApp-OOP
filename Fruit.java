abstract public class Fruit{
    
    public int fruitWeight;


    public int getFruitWeight() {
        return fruitWeight;
    }

    public void setFruitWeight(int fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    int usefulVolume;

    public Fruit(){}

    public Fruit(int fruitWeight){
        this.fruitWeight = fruitWeight;
    }

    abstract public void printVitamines();
        
    
}
