@@ -0,0 +1,20 @@
package type;

public class CharType extends BaseType{
    private char value;

    public CharType() {
    }

    public CharType(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}