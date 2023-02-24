package Transport;

import java.io.IOException;

public class TransportTypeException extends RuntimeException {

    public TransportTypeException() {}

    public TransportTypeException(String message) {super(message);}

    public TransportTypeException(String message, Throwable cause) {super(message, cause);}

    public TransportTypeException(Throwable cause) {super(cause);}
}
