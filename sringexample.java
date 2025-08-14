import java.io.*;
import java.util.*;
public class sringexample{
public static void main (String args[]){
String name =new String("rohit");
StringBuffer sb=new StringBuffer(name);
sb.append("is back");
System.out.println(sb.toString());
System.out.println("after deleting String");
sb.delete(3,9);
System.out.println(sb.toString());
}
}

