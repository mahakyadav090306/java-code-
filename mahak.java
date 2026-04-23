[PROGRAM-1: Create a class with 4 methods: addition,subtraction,multiplication,division and test all 4 methods in public static void main.](#xyz)

[PROGRAM-2: Write a program to test for, while and do-while loop for  the same problem](#abc)

[PROGRAM-3:Write a program using if else to print the grade of input marks](#x)

[PROGRAM-4:Write a program using object and classes for the following problems: a)square of stars for dynamic height and width , b)triangle of stars.](#y)

[PROGRAM-5:Write a program to add 2 distances where each distance is given in m,cm](#z)

[PROGRAM-6:Write a program to add 2 distances where each distance is given in m,cm,mm](#a)

[PROGRAM-7:Write a program to add 2 time in object oriented fashion where each time is given in hr,min](#b)

[PROGRAM-8:Write a program to add 2 time in object oriented fashion where each time is given in hr,min,sec](#c)

[Program-9:Write a program in object oriented fashion for the conversion of c program to java()](#d)








# xyz 
                                              PROGRAM-1
                                              
```import java.util.Scanner;

class Calculator {

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    // Division
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calling methods
        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));

        sc.close();
    }
}
```

Output:





# abc

                                                 PROGRAM-2

                                                 
```public class LoopTest {

    public static void main(String[] args) {

        System.out.println("Using FOR loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nUsing WHILE loop:");
        int j = 1;
        while(j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("\nUsing DO-WHILE loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while(k <= 5);

    }
}
```
Output :

<img width="257" height="446" alt="image" src="https://github.com/user-attachments/assets/d602d395-6f8c-4ed8-a766-9f882b070a4d" />

# x
                                                PROGRAM-3

                                                
```import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 75) {
            System.out.println("Grade: B");
        }
        else if (marks >= 60) {
            System.out.println("Grade: C");
        }
        else if (marks >= 50) {
System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
```

Output:

<img width="199" height="39" alt="image" src="https://github.com/user-attachments/assets/d7235cbd-5bfc-46b7-805f-a216bf86ab83" />

# y

                                              PROGRAM-4

```import java.util.Scanner;

class StarPattern {

    void square(int height, int width) {
        System.out.println("Square Pattern:");
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void triangle(int n) {
        System.out.println("\nTriangle Pattern:");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StarPattern obj = new StarPattern();

        System.out.print("Enter height of square: ");
        int h = sc.nextInt();

        System.out.print("Enter width of square: ");
        int w = sc.nextInt();

        obj.square(h, w);

        System.out.print("\nEnter height of triangle: ");
        int t = sc.nextInt();

        obj.triangle(t);
    }
}
```

Output:

<img width="255" height="349" alt="image" src="https://github.com/user-attachments/assets/41723fed-b188-48e7-8b15-be3ac4a93382" />

# z
                                                Program-5

```import java.util.Scanner;
class Distance {
    int meter, cm;

    void input(Scanner sc) {
        System.out.print("Enter meters: ");
        meter = sc.nextInt();
        System.out.print("Enter centimeters: ");
        cm = sc.nextInt();
    }

    void display() {
        System.out.println(meter + " m " + cm + " cm");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance result = new Distance();

        System.out.println("Enter first distance:");
        d1.input(sc);
        System.out.println("Enter second distance:");
        d2.input(sc);
        
        result.cm = d1.cm + d2.cm;
        result.meter = d1.meter + d2.meter;
        if (result.cm >= 100) {
            result.meter += result.cm / 100;
            result.cm = result.cm % 100;
        }

        System.out.print("Total Distance = ");
        result.display();
    }
}
```              
Output:

<img width="252" height="162" alt="image" src="https://github.com/user-attachments/assets/f4451406-c824-4a19-be9d-fa99bff702dd" />

# a
                                                   Program-6

```import java.util.Scanner;
class Distance {
    int meter, cm, mm;

    void input(Scanner sc) {
        System.out.print("Enter meters: ");
        meter = sc.nextInt();
        System.out.print("Enter centimeters: ");
        cm = sc.nextInt();
        System.out.print("Enter millimeters: ");
mm = sc.nextInt();
    }
    void display() {
        System.out.println(meter + " m " + cm + " cm " + mm + " mm");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance result = new Distance();

        System.out.println("Enter first distance:");
        d1.input(sc);
        System.out.println("Enter second distance:");
        d2.input(sc);
        result.mm = d1.mm + d2.mm;
        result.cm = d1.cm + d2.cm;
        result.meter = d1.meter + d2.meter;
        if (result.mm >= 10) {
            result.cm += result.mm / 10;
            result.mm = result.mm % 10;
        }
        if (result.cm >= 100) {
            result.meter += result.cm / 100;
            result.cm = result.cm % 100;
        }

        System.out.print("Total Distance = ");
        result.display();
    }
}
```

Output:

<img width="354" height="210" alt="image" src="https://github.com/user-attachments/assets/7d760c34-ad09-43a8-bb53-4460637077ae" />


# b
                                                 Program-7

```import java.util.Scanner;

class Time {
    int hr, min;

    void input(Scanner sc) {
        System.out.print("Enter hours: ");
        hr = sc.nextInt();
        System.out.print("Enter minutes: ");
        min = sc.nextInt();
    }
    void add(Time t1, Time t2) {
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr;
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
}
    }

    void display() {
        System.out.println("Total Time = " + hr + " hr " + min + " min");
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();
        
        System.out.println("Enter first time:");
        t1.input(sc);
        System.out.println("Enter second time:");
        t2.input(sc);

        result.add(t1, t2);
        result.display();
    }
}
```

Output:

<img width="245" height="162" alt="image" src="https://github.com/user-attachments/assets/f5ed634e-68ec-401a-8795-f4cf85104aaa" />

# c
                                                  Program-8

```import java.util.Scanner;
class Time {
    int hr, min, sec;

    void input(Scanner sc) {
        System.out.print("Enter hours: ");
        hr = sc.nextInt();
        System.out.print("Enter minutes: ");
        min = sc.nextInt();
        System.out.print("Enter seconds: ");
        sec = sc.nextInt();
    }
    void add(Time t1, Time t2) {
        sec = t1.sec + t2.sec;
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr;
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
    }

    void display() {
        System.out.println("Total Time = " + hr + " hr " + min + " min " + sec + " sec");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        System.out.println("Enter first time:");
        t1.input(sc);
        System.out.println("Enter second time:");
        t2.input(sc);

        result.add(t1, t2);
        result.display();
    }
}
```
Output:

<img width="306" height="212" alt="image" src="https://github.com/user-attachments/assets/b2859523-bcad-4ba9-a5f8-18a259abcdab" />
