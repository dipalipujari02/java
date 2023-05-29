package com.bridgelabz;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators where a=10 and b=20");
     arithmeticOperators();
        System.out.println("Relational Operators where a=10 and b=20");
     relationalOperators();
        System.out.println("BiteWise Operators where a=30 and b=20");
     bitwiseOperators();
        System.out.println("Logical Operators where a=true and b=false");
     logicalOperators();
        System.out.println("Assignment Operators where a=90 and b=60");
     assignmentOperators();
        System.out.println("Conditional Operators where a=10");
     conditionalOperators();
    }


    public static void arithmeticOperators() {
        int a = 10;
        int b = 20;
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a % b = "+(a%b));
        System.out.println("a++ = "+(a++));
        System.out.println("a-- = "+(a--));
        System.out.println("++a = "+(++a));
    }

    public static void relationalOperators() {
        int a = 10;
        int b = 20;
        System.out.println("a == b = "+(a==b));
        System.out.println("a != b = "+(a!=b));
        System.out.println("a < b = "+(a<b));
        System.out.println("a > b = "+(a>b));
        System.out.println("a <= b = "+(a<=b));
        System.out.println("a >= b = "+(a>=b));
    }

    public static void bitwiseOperators() {
        int a = 30;
        int b = 20;
        int c = 0;

        c = a & b;
        System.out.println("a & b = "+c);

        c = a | b;
        System.out.println("a | b = "+c);

        c = a ^ b;
        System.out.println("a ^ b = "+c);

        c = ~a;
        System.out.println("~a = "+c);

        c = a << 2;
        System.out.println("a << 2 = "+c);

        c = a >> 2;
        System.out.println("a >> 2 = "+c);

        c = a >>> 2;
        System.out.println("a >>> 2 = "+c);
    }

    public static void logicalOperators() {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = "+(a&&b));
        System.out.println("a || b = "+(a||b));
        System.out.println("!(a && b) = "+ !(a&&b));
    }

    public static void assignmentOperators() {
        int a = 90;
        int b = 60;
        int c = 0;

        c=a+b;
        System.out.println("c = a + b = "+c);

        c+=a;
        System.out.println("c += a ="+c);

        c-=a;
        System.out.println("c -= a ="+c);

        c*=a;
        System.out.println("c *= a ="+c);

        c/=a;
        System.out.println("c /= a ="+c);

        c%=a;
        System.out.println("c %= a ="+c);

        c<<=2;
        System.out.println("c <<= 2 ="+c);

        c>>=2;
        System.out.println("c >>= 2 ="+c);

        c>>=2;
        System.out.println("c >>= 2 ="+c);

        c&=a;
        System.out.println("c &= a ="+c);

        c^=a;
        System.out.println("c ^= a ="+c);

        c|=a;
        System.out.println("c |= a ="+c);
    }

    public static void conditionalOperators() {
        int a , b;
        a = 10;
        b = (a == 1) ? 40 : 50;
        System.out.println("value of b is "+b);

        b = (a == 10) ? 40 : 50;
        System.out.println("value of b is "+b);
    }
}
