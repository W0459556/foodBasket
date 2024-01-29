public class Food {
    String foodName;
    String foodType;

    // constructor 
    public Food(String foodName, String foodType){
        this.foodName = foodName;
        this.foodType = foodType;
    }

    // functions
    public void eatIt(){
        System.out.println("you eat the" + foodName);
    }

    public void denyIt(){
        System.out.println("you deny the" + foodName);
    }

}
