package entity;

/**
 * @author wangjiantao
 * @date 2020/4/29 17:08
 */
public class SimpleResponse {
    private String message;

    public SimpleResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
