public class DogTest {
    
    
    public static void main(String[]args){
        Dog rover = new Dog(100, 10, 4, 8);
        Dog randomdog = new Dog(1, 3, 2, 0);


        System.out.println("Dog happiness: " + randomdog.getHappy());

    }

}