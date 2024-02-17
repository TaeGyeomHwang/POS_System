package pos;
import java.util.*;

public class LossReason { // 재고수량변동에서 재고손실이유를 담은 클래스

    public int productID;
    public int productAmount;
    public String lossReason;
    public Date productBrokenDate;
    
    public LossReason(int prodctID, int productAmount, String lossReason, Date productBrokenDate) {
        
        this.productID = productID;
        this.productAmount = productAmount;
        this.lossReason = lossReason;
        this.productBrokenDate = productBrokenDate;
    }

// 상품명    
    public int getProductID() {
    	return productID;
    }
    
    public void setProductID(int productID) {
    	this.productID = productID;
    }
    
// 상품수량
    public int getProductAmount() {
        return productAmount;
    }
    public void setProductAmount(int productAmount) {
    	this.productAmount = productAmount;
    }
    
// 이유
    public String getLossReason() {
        return lossReason;
    }
    
    public void setLossReason(String lossReason) {
    	this.lossReason = lossReason;
    }
// 파손 날짜
    public Date getProductBrokenDate(){
        return productBrokenDate;
    }
    public void setProductBrokenDate(Date productBrokenDate){
        this.productBrokenDate = productBrokenDate;
    }
    

}