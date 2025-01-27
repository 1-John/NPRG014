import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.Parameter
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformationClass
import groovyjarjarasm.asm.Opcodes
import static org.codehaus.groovy.control.CompilePhase.SEMANTIC_ANALYSIS

@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.TYPE])
@GroovyASTTransformationClass("ZeroTransformation4")
public @interface Zero4 {}

//TASK Complete the transformation code at the indicated position so as the test passes

@GroovyASTTransformation(phase = SEMANTIC_ANALYSIS)
public class ZeroTransformation4 implements ASTTransformation {

    public void visit(ASTNode[] astNodes, SourceUnit source) {

    }
}

final calculator = new GroovyShell(Zero2.class.getClassLoader()).evaluate('''
@Zero2
class Calculator {}

new Calculator()
''')

assert 0 == calculator.zero

println 'done'