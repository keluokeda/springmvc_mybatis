package ssm.po;

public class Order {
    private Integer id;

    private Integer userId;

    private String number;

    public Order(Integer id, Integer userId, String number) {
        this.id = id;
        this.userId = userId;
        this.number = number;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
}