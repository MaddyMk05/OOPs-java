 import java.util.*;
 class Tamil{
     int id;
     String name;
     Tamil(int r,String n){
         id=r;
         name=n;
     }
 void display(){
     System.out.print(id+" "+name);
 }}
 public class Main{
     public static void main(String arg[]){
        Tamil m =new Tamil(1,"gopal"); //object creation
        Tamil m1 =new Tamil(2,"krishnan");        
        m.display();
        m1.display();
     }
 }

