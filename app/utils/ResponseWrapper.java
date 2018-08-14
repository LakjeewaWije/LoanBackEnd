package utils;

public class ResponseWrapper<T> {
    private String message;
    private T dataA;
    private T dataB;

    public ResponseWrapper(String message, T data) {
        this.message = message;
        this.dataA = data;
    }

    public ResponseWrapper(Integer statusType, String message, T data) {
        this.message = statusType + ": " + message;
        this.dataA = data;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return dataA;
    }

    public void setData(T data) {
        this.dataA = data;
    }

    @Override
    public String toString() {
        return "ResponseWrapper{" +
                "message='" + message + '\'' +
                ", data=" + dataA +
                '}';
    }
}
