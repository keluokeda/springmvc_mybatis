package ssm.po;

public class ItemsQueryVo {
    private ItemsCustom itemsCustom;

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }

    @Override
    public String toString() {
       return itemsCustom.toString();
    }
}
