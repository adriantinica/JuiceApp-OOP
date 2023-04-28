class App{
    public static void main(String[] args) {

        // create an blender object
        Blender homBlender = new Blender();

        
        // create an object using uppcasting

        Fruit smallApple = new Apple(50);
        Fruit bigApple = new Apple(200);

        Fruit smallBanana = new Banana(30);
        Fruit bigBanana = new Banana(500);

        Fruit smallAnanas = new Ananas(800);
        Fruit bigAnanas = new Ananas(1200);
        


        // lets dry blend
        Juice smallAppleJuice = homBlender.blend(smallApple);
        System.out.println(smallAppleJuice.volume);

        Juice bigBananaJuice = homBlender.blend(bigBanana);
        System.out.println(bigBananaJuice.volume);

        Juice bigAnanasJuice = homBlender.blend(bigAnanas);
        System.out.println(bigAnanasJuice.volume);


       }
}