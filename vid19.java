import java.util.Random;
class vid19{
    public static void main(String args[]){
        Random ran = new Random();
        int ranum = 0;
        while(ranum !=5){
            ranum = ran.nextInt(10);
            System.out.println(ranum);
        }
    }
}
// if we know the starting and ending point of the loop we are using the for loop
//If we don't know the starting and point of the loop we're using the while loop