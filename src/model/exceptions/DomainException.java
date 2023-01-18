package model.exceptions;

/**
 * Extends Exception:
 * Compilador obrigar a tratar.
 *
 * Extends RunTimeException
 * Compilador não obrigada a tratar.
 */
public class DomainException  extends Exception {

    public DomainException(String msg){
        super(msg);
    }

}
