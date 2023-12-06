package fc.java.part2;

public class BinaryExam {
    public static void main(String[] args) {
        int decimal=123;
        System.out.println("decimal = " + decimal);
        int bin=0b01111011;
        System.out.println("bin = " + bin);
        int oct=0173;
        System.out.println("oct = " + oct);
        int hexa=0x7b;
        System.out.println("hexa = " + hexa);
        int data=123;
        String binary=Integer. toBinaryString(data);
        System.out.println("binary = " + binary);
    }
}
