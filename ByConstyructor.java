import java.util.Scanner;
class tamil2{
    int num;
    String name;
    int age;
    
    tamil2(int n,int a,String s){
        num = n;
        age =a;
        name = s;
    }
    tamil2 (){
        
    }
    void display(){
        System.out.println(num+" "+age+" "+name);
    }
}
public class tamil1{
    public static void main(String args[]){
        tamil2 t=new tamil2(123,21,"foodie");
        tamil2 t1=new tamil2();
        t1.num =t.num;
        t1.name =t.name;
        t1.age =t.age;
        t.display();
        t1.display();
    }
}
