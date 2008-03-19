// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Num extends exprType {
    public Object n;

    public static final String[] _fields = new String[] {"n"};

    public Num(Token token, Object n) {
        super(token);
        this.n = n;
    }

    public Num(PythonTree tree, Object n) {
        super(tree);
        this.n = n;
    }

    public String toString() {
        return "Num";
    }

}
