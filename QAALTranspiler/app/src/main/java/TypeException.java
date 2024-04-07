//package org.example;

public class TypeException extends RuntimeException
{

    private String msg;

    public TypeException()
    {
        super();
    }

    // Error information is to be determined separately on a case-by-case basis (see below).
    public TypeException(String errmsg)
    {
        msg = errmsg;
    }

    // A method to generate a report of the error as a string.
    public String report()
    {
        return msg;
    }


    // A method to produce an exception for duplicated function names
    public TypeException duplicatedFuncError()
    {
        msg = "Duplicated function names";
        return this;
    }

    // A method to produce an exception for duplicated parameter or local variable names
    public TypeException duplicatedVarError()
    {
        msg = "Duplicated variable names";
        return this;
    }

    // A method to produce an exception for parameter or local variable names that clashes with function names
    public TypeException clashedVarError()
    {
        msg = "A variable name clashed with a function name";
        return this;
    }

    // A method to produce an exception for undefined function name
    public TypeException undefinedFuncError()
    {
        msg = "Unknown subroutine name";
        return this;
    }

    //New type exceptions
    //_________________________________________________________________________________________________________________________________

    public TypeException outputTypeError(){
        msg = "Object is not of the declared output type";
        return this;
    }

    public TypeException operandError(){
        msg = "Registers initialised at the start of the program cannot be operands";
        return this;
    }

    public TypeException unknownOperandError(){
        msg = "The operand name was not found in the signature of the subroutine";
        return this;
    }

    public TypeException unusedParameterError(){
        msg = "A parameter is not declared as operand in the subroutine";
        return this;
    }

    // A method to produce an exception for undefined parameter or local variable name
    public TypeException undefinedVarError()
    {
        msg = "Unknown variable name";
        return this;
    }

    // A method to produce an exception related to assignment.
    public TypeException assignmentError()
    {
        msg = "Incompatible types in assignment";
        return this;
    }

    public TypeException randomisedVarError()
    {
        msg = "Variable to be randomised is not a bit or a register";
        return this;
    }

    public TypeException invalidJumpVariableError()
    {
        msg = "Variable used in the jump statement has an invalid type";
        return this;
    }

    public TypeException mismatchedJumpTypesError()
    {
        msg = "The two compared variables have mismatched types";
        return this;
    }

    public TypeException labelTypeError()
    {
        msg = "The provided identifier is not a label";
        return this;
    }

    public TypeException indexingError()
    {
        msg = "Non-register cannot be indexed";
        return this;
    }

    // A method to produce an exception related to argument list mismatches.
    public TypeException argumentNumberError()
    {
        msg = "Invalid number of arguments in subroutine invocation";
        return this;
    }

    // A method to produce an exception related to argument type mismatches.
    public TypeException argumentError()
    {
        msg = "Invalid argument type in subroutine invocation";
        return this;
    }

}