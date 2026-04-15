// Array
// To use the array we need to use [].
// Creating the playlist
import java.util.Scanner;
class training9{
    public static void main(String args[])
    {
        // Array is used to arrange and organize the group of code
        //Array position is always starting from 0
        String[]playlist = new String[5];
        // fro example here we give 5, but the array will count from 0 to 4
        // Here we give 1 but the code will consider as 0
        // 1=0, 2=1, 3=2, 4=3, 5=4.
        playlist[1]= "Sundhari kannal oru seathi- from Thalapathi";
        playlist[2]= "Yar alaipathu- from maara";
        playlist[3]= "Adi penna - from albam";
        playlist[4]= "Abinay abinaya - from albam";
        System.out.println(playlist[1]);
        System.out.println(playlist[2]);
        System.out.println(playlist[3]);
        System.out.println(playlist[4]);
        // if we tried more than the capacity it will show the error
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        System.out.println(playlist[5]);
        
    }
}