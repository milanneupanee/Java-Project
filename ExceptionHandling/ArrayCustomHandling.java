package ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;
/*
* Question
* Difference between array, list and arraylist.
* Do but not submit.
* */
class ArrayCustomHandlingExample extends RuntimeException{
    public ArrayCustomHandlingExample(String notify){
        super(notify);
    }
}
public class ArrayCustomHandling {
    ArrayList<String> fruitsItems = new ArrayList<>(Arrays.asList("Apple","Banana","Pineapple"));
    //ArrayList<Object> sample=new ArrayList<>(Arrays.asList(1,1.2,"Milan","Neupane"));
    public void checkFruitItem(String fruitName) throws ArrayCustomHandlingExample{
        if(fruitsItems.contains(fruitName)){
            throw new ArrayCustomHandlingExample(fruitName+"  already exist in list.");
        }
        else {
            fruitsItems.add(fruitName);
            System.out.println(fruitName+"  is added to list.");
        }

    }
    public static void main(String[] args) {
        ArrayCustomHandling obj=new ArrayCustomHandling();
        try{
            obj.checkFruitItem("Grapes");
            obj.checkFruitItem("Banana");
        }
        catch (ArrayCustomHandlingExample e){
            System.out.println(e.getMessage());
        }
    }
}
