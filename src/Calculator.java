import java.util.*;
import java.lang.*;
import java.io.*;

public class Calculator {

        public int addAToB(int a, int b) {
            return a + b;
        }
        public int substractAFromB(int a, int b) {
            return a - b;
        }
        public int aMultiplyB(int a, int b ){
            return a * b;
        }
        public int aDivideB(int a, int b) {
            return a / b;
        }


}
class App {

    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.addAToB(5,5);
        int result1 = calculator.substractAFromB(5,5);
        int result2 = calculator.aMultiplyB(5,5);
        int result3 = calculator.aDivideB(5,5);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}