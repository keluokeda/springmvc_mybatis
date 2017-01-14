package ssm.po;

public class Orderdetail {
    private Integer id;

    private Integer orderId;

    private Integer itemId;

    private Integer number;

    public Orderdetail(Integer id, Integer orderId, Integer itemId, Integer number) {
        this.id = id;
        this.orderId = orderId;
        this.itemId = itemId;
        this.number = number;
    }

    public Orderdetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}