import java.io.*;
import java.util.*;
public class Stringbuilderexample{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("this is my car");
sb.append("hi");
sb.insert(11,"red");
System.out.println("println your String "+sb);
System.out.println("after deleting your String");
sb.delete(14,17);
System.out.println(sb);
}
}
