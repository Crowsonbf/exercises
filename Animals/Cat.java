public class Cat
{
int petCount;
int happy;
int scoldCount;

public Cat(int petCount, int happy, int scoldCount){
    this.petCount = petCount;
    this.happy = happy;
    this.scoldCount = scoldCount;
}

    public int hasPetted(){
        return this.petCount;
    }
    public int scoldLast(){
        if(scoldCount >= 3){
            return this.happy + 50;
        }
        else return this.happy - 25;
    }
    public int getHappy(){
        return this.happy - (this.petCount*50) + scoldLast();
    }





}