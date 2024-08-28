import java.util.*;import java.io.*;
 
class badCode extends Object{
public static void main(String args[]) throws Exception {
System.out.println("This code violates many style guidelines!");
 
// Violating naming conventions
int THIS_IS_not_A_CONSTANT = 42;
String UpperCamelCaseForMethod() { return "Hello"; }
 
// Violating brace style and indentation
if (THIS_IS_not_A_CONSTANT > 0)
{
System.out.println("Positive");
}
else {
    System.out.println("Non-positive");}
 
// Violating column limit and line wrapping
String veryLongString = "This is an extremely long string that goes way beyond the recommended 100 character limit and doesn't use proper line wrapping techniques";
 
// Violating whitespace rules
int[]array={1,2,3,4,5};
 
// Violating comment style
/* This is a multi-line comment
that doesn't follow proper
indentation rules */
 
// Violating switch statement formatting
int x = 1;
switch(x){
case 1: System.out.println("One");break;
case 2:
System.out.println("Two");
break;
default:System.out.println("Other");}
 
// Violating try-catch block formatting and exception handling
try{
File file=new File("nonexistent.txt");
Scanner scanner=new Scanner(file);
}catch(FileNotFoundException e){}
 
// Violating method naming and parameter conventions
public static void BAD_METHOD_NAME(final int X, int Y, int z) {
    // Method body
}
 
// Violating enum formatting
enum Color{RED,GREEN,BLUE};
 
// Violating variable declarations
int a,b,c=1,d=2;
 
// Violating naming for type parameters
class GenericClass<t> {
    // Class body
}
 
}
