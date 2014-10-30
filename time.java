import java.util.Scanner;
public class time {
public static void main(String args[]){
Scanner time = new Scanner(System.in);

System.out.println("Enter the number of seconds you want to convert.");
  int sec = time.nextInt();
int hours = sec / 3600;
int remainder = sec % 3600;
int minutes = remainder / 60;
int seconds = remainder % 60;
System.out.println( "Hours in " +sec + " seconds = " + hours);
System.out.println("Minutes in " +sec +" seconds  = " + minutes);
System.out.println("Seconds in " +sec +" seconds  = " + seconds); 
}
}
