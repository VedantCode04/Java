import java.io.*;
//3.3
class main{
    public static void main(String[] args) {
        System.out.println("Vedant Patel IU2141230208");
        System.out.println("-------------------------");

        StringBuffer s = new StringBuffer("Vedant ");
        System.out.println("current string is: "+s);

        s.insert(7, "Patel");
        System.out.println("after inserting new sub string, string is: "+s);
        s.reverse();
        System.out.println("after reversing, string is "+s);
    }
}
