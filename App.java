class App{
    public static void main(String[] args) {

        // create an blender object
        Blender homeBlender = new Blender();

        
        // create an object using uppcasting

        Fruit smallApple = new Apple(50);
        Fruit bigApple = new Apple(200);

        Fruit smallBanana = new Banana(30);
        Fruit bigBanana = new Banana(500);

        Fruit smallPineApple = new PineApple(800);
        Fruit bigPineApple = new PineApple(1200);

        bigPineApple.printVitamines();
        bigBanana.printVitamines();;
        


        // lets dry blend
        Juice smallAppleJuice = homeBlender.blend(smallApple);
        System.out.println(smallAppleJuice.volume);

        Juice bigBananaJuice = homeBlender.blend(bigBanana);
        System.out.println(bigBananaJuice.volume);

        Juice bigPineAppleJuice = homeBlender.blend(bigPineApple);
        System.out.println(bigPineAppleJuice.volume);


       }
}
