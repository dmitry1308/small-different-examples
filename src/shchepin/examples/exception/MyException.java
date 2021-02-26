package shchepin.examples.exception;

public class MyException extends Exception {
    private String message= "Моя ошибка";

    public MyException() {
    }

    @Override
    public String getMessage() {
        return message;
    }
}
