public class Dog
{
  // DOG
    //properties
    int happy;
    int eat;
    int pet;
    int scold;
    


    //constructor(s)
    public Dog(int happy, int pet, int eat, int scold){
        this.pet = pet;
        this.happy = happy;
        this.eat = eat;
        this.scold = scold;

    }

    //abilities
        //getters 
    public int hasPetted(){
        return this.happy + 10;
    }
    public int getScolded(){
        return this.happy - 20;
    }
    public int hasEat(){
    if(this.happy < 25){
        return this.happy;
    }
    if(this.happy>25){
        return this.happy + 10;
    }
    return this.happy;
    }
    public int getHappy(){
       this.happy =  happy + (this.pet * 10) - (this.scold*20) + (this.eat*15);
        return this.happy;
    }
    // setter
    public void setHappy(int happy){
        this.happy = happy;
    }
    public void setPet(int pet){
        this.pet = pet;
    }
    public void setEat(int eat){
        this.eat = eat;
    }
    

}
