public class Recursion
{
    public static void main(String[] args)
    {
        System.out.println(mystery("Hello World")); //What will this really print?
    }
    public static String mystery(String s)
    {
        if(s.length()<1) { //this is called a base case
            return "";
        }
        else {
            return s.substring(s.length()-1)+mystery(s.substring(0,s.length()-1)); //what does this do?
        }
    }
}
