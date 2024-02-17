package pos;
import java.util.*;

public class OrderInfo { // 사용자로부터 주문할 재고의 정보를 담은 클래스

    public OrderInfo(int productID, int productAmount) {
        this.productID =  productID;
        this.productAmount = productAmount;
    }

    public int productID;
    public int productAmount;
    public Date productArrivalDate;
    public int productPurchsasePrice;

// 주문하려는 상품번호
    public int getProductID() {
        return productID;
    }
    
    public void setProductID(int productID) {
    	this.productID = productID;
    }
    
 // 주문하려는 상품의 개수
    public int getProductAmount() {
        return productAmount;
    }
    
    public void setProductAmount(int productAmount) {
    	this.productAmount = productAmount;
    }

 // 주문한 상품의 도착날짜    
    public Date getProductArrivalDate() {
        return productArrivalDate;
    } 
    
    public void setProductArrivalDate(Date productArrivaldate) {
    	this.productArrivalDate = productArrivaldate;
    }
 // 구매가격 
    public int getProductPurchsasePrice() {
    	return productPurchsasePrice;
    }
    public void setProductPurchsasePrice(int productPurchsasePrice) {
    	this.productPurchsasePrice = productPurchsasePrice;
    }
    
}