public class Pig{
 double food;
 double weight;
 int exercise;
 int lastMeal;


    public Pig(double food,double weight, int lastMeal, int exercise){
        this.food = food;
        this.weight = weight;
        this.lastMeal = lastMeal;
        this.exercise = exercise;
    }
    public double setWeight(){
        return this.weight + (this.food * 0.75);
    }
    public double hasExercise(){
        return this.weight -(lastMeal * 0.75)-(exercise) + (food * 0.75);
    }

}