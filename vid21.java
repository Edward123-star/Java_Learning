//Objects and Classes
//Main class
public class vid21{ 
// variables in the class not in the main function
String graphic = "";
String processer = "";
String ram = "";
int price = 0;

// main function

public static void main(String aregs[]){
    // creating the object for the class
    // by using this objects we can access the variables out side the main function
// this is a first object
    vid21 hp =new vid21();
    hp.graphic = "GTX 2060";
    hp.processer = "i5";
    hp.ram= "16gb";
    hp.price = 50000;
    System.out.println(hp.ram);

// this is the second object

vid21 acer =new vid21();
    acer.graphic = "RX7700 XT";
    acer.processer = "5600G";
    acer.ram= "32gb";
    acer.price = 80000;
    System.out.println(acer.graphic);

// we can create multiple objects inside the main function based on the calss.

// object 3

vid21 dell =new vid21();
    //dell.graphic = "RX7700 XT";
    //dell.processer = "5600G";
    //dell.ram= "32gb";
    //acer.price = 80000;
    System.out.println(dell.price);
    // If we didnt give a values fro the created objects the System will take the values from the class

}
}