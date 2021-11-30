package JavaBeginners;

public class StringToInteger {

public String test() {
String name="funwithprogramming";
System.out.println("String: "+name);
String newString="";
String alphbets="abcdefghijklmnopqrstuvwxyz";
for(int i=0; i<name.length();i++) {
char temp= name.charAt(i);
System.out.println(i+" position is "+temp);
int position =alphbets.indexOf(temp)+1;
System.out.println("The position character value is :" +position);
String check=Integer.toString(position);
newString+=check;

  }
return newString;
}
public static void main(String[] args) {
StringToInteger si = new StringToInteger();
String test = si.test();

}
}
