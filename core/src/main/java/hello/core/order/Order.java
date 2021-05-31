package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int dicounmtPrice;

    public Order(Long memberId, String itemName, int itemPrice, int dicounmtPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.dicounmtPrice = dicounmtPrice;
    }

    //비즈니스
    public int calculatePrice(){
        return itemPrice - dicounmtPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getDicounmtPrice() {
        return dicounmtPrice;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setDicounmtPrice(int dicounmtPrice) {
        this.dicounmtPrice = dicounmtPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", dicounmtPrice=" + dicounmtPrice +
                '}';
    }
}
