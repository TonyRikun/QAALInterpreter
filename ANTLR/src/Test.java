import org.antlr.v4.runtime.*;

public class Test {

    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
//        Scanner myScan = new Scanner(System.in);
//        System.out.println("Enter");
//        String[] arg = myScan.nextLine().split(" ");
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        QAALLexer lexer = new QAALLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        QAALParser parser = new QAALParser(tokens);
        QAALParser.ProgContext tree = parser.prog(); // begin parsing at prog rule

        QAALChecker checker = new QAALChecker();
        try {
            checker.visit(tree);
        } catch (TypeException ex) {
            System.out.println(ex.report());
            return;
        }

//        QAALInterpreter interpreter = new QAALInterpreter();
//        Integer mainReturnValue = interpreter.visitProgram(tree, args);
        System.out.println();
        System.out.println("NORMAL_TERMINATION");
//        System.out.println(mainReturnValue);

    }
}