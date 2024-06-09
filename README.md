# Task3-CrossPattern  

https://github.com/Java-PJATK/Task3-CrossPattern/blob/main/ppj03E.pdf  

March 28, 2024

Deadline: Apr 8 (inclusive)

Task 3

Write a program which reads a natural number n and writes on the console a symmetric ‘cross’ consisting of asterisks: each ‘arm’ shoud have width and height equal to n. 

For example, for n = 3 the result should look like this:

```
       ***
       ***
       ***
    *********
    *********
    *********
       ***
       ***
       ***
```

## Solution

```java
import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();
        scanner.close();

        // Print the upper part of the cross
        for (int i = 0; i < n; ++i) {
            System.out.println(" ".repeat(n) + "*".repeat(n) + " ".repeat(n));
        }

        // Print the middle horizontal line repeated by the entered value
        for (int i = 0; i < n; ++i) {
        System.out.println("*".repeat(3*n));
        }
        // Print the lower part of the cross
        for (int i = 0; i < n; ++i) {
            System.out.println(" ".repeat(n) + "*".repeat(n) + " ".repeat(n));
        }
    }
}

```

```java
```

```java

```

## Solution 2

```java
/*
 * TASK 3
 * archived at https://git.femboy.science/femsci/ppj/src/branch/task/3
 * by femsci
 */

public class CrossPrinter {

    public CrossPrinter(int size) {
        _size = size;
        _ast = "*".repeat(_size);
        _whi = " ".repeat(_size);
        // 3n² chars + 3n of \n
        _buf = new StringBuffer((int) Math.pow(size * 3, 2) + size * 3);

        fillBuffer();
    }

    // yes i'm a C# dev
    private final int _size;
    private final StringBuffer _buf;
    // :3333
    private final CharSequence _whi;
    private final CharSequence _ast;

    public StringBuffer getBuffer() {
        return new StringBuffer(_buf);
    }

    public void printToStdout() {
        System.out.println(getBuffer().toString());
    }

    // populate the buffer
    private void fillBuffer() {
        fillTopBottom();
        fillCore();
        fillTopBottom();
    }

    // to fill upper and lower segments for strbuffer
    private void fillTopBottom() {
        _buf.append(String.format("%s%s%s\n", _whi, _ast, _whi).repeat(_size));
    }

    // fill the middle segment
    private void fillCore() {
        _buf.repeat(String.format("%s\n", _ast.toString().repeat(3)), _size);
    }
}
```
