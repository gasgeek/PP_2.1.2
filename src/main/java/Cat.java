public class Cat {

    public Cat() {

    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "message='" + message + '\'' +
                '}';
    }
}
