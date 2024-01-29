//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Food picnicBasket[] = new Food[3];
        picnicBasket[0] = new Food("carrot", "vegetable");
        picnicBasket[0] = new Food("tomato", "fruit");
        picnicBasket[0] = new Food("porkchop", "meat");

        for(int i = 0; i<picnicBasket.length; i++){
            if(picnicBasket[i].foodName == "porkchop"){
                picnicBasket[i].denyIt();
            }
            else{
                picnicBasket[i].eatIt();
            }
        }

        // System.out.println("Better House Party:");
        // betterHouseParty.printTotalArea();
        // betterHouseParty.foundTheCat();
        // System.out.println("");

    }
}