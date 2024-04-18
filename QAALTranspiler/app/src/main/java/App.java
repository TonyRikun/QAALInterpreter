//package org.example;
import org.antlr.v4.runtime.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class App {

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        QAALLexer lexer = new QAALLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        QAALParser parser = new QAALParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());
        QAALParser.ProgContext tree = parser.prog(); // begin parsing at prog rule

        try {
            QAALChecker checker = new QAALChecker();
            checker.visit(tree);
        } catch (TypeException ex) {
            System.out.print(ex.report());
            return;
        }
        QAALCodeGenerator generator = new QAALCodeGenerator();

        String code = generator.visit(tree);
        //System.out.println(code);
        File f = new File("../cpp/test.cpp");
        if(!f.exists()) {
            throw new FileNotFoundException("NO FILE" + new File(".").getAbsolutePath());
        }
        FileOutputStream outputStream = new FileOutputStream(f);
        outputStream.write(code.getBytes());
        outputStream.close();
        System.out.print("NORMAL_TERMINATION");
    }

    static class ErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            throw new RuntimeException("Syntax error at line " + line + ", position " + charPositionInLine + ": " + msg);
        }
    }
}