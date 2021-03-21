package com.ning.excep;

/**
 * @author XUN~MLF
 */


/**自定义的运行时异常
 * @author XUN~MLF*/

public class NotEnoughException extends RuntimeException{
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
