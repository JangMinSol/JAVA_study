public class NumOperator{
    public static void main(String[] args) {
    	//Num
        System.out.println(5); //Number
        System.out.println("five"); //String
        System.out.println("5"); //String 5
         
        System.out.println(3+4); //7
        System.out.println("7"+"7"); //77
         
        System.out.println(8*8); // 64
//      System.out.println("8"*"8");
         
        System.out.println("1010".length()); //4
//      System.out.println(1111.length()); //숫자는 문자열의 길이인 length()를 통해 길이 알아내기 불가
         
        System.out.println("Hello World"); //String 문자열
        System.out.println('W'); //Char
        System.out.println("W");
        
        //Operator
        System.out.println(5 + 2); // 7
        System.out.println(5 - 2); // 3
        System.out.println(5 * 2); // 10
        System.out.println(5 / 2); // 2
 
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.floor(Math.PI)); //3.0
        System.out.println(Math.ceil(Math.PI)); //4.0
    }
}