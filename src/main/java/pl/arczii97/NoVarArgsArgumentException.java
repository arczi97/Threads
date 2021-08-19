package pl.arczii97;

public class NoVarArgsArgumentException extends Exception {

    public NoVarArgsArgumentException () {
        super();
    }

    public NoVarArgsArgumentException (String message) {
        super(message);
    }
}
