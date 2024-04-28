# Task3-CrossPattern  

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
