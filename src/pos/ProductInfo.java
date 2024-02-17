package pos;
import java.util.*;

public class ProductInfo { // 재고의 상세한 정보를 담은 클래스

    public int productID;
    public String productName;
    public String productProducer;
    public Date productLifeDate;
    public int productAmount;
    public int productPurchasePrice;
    public int productSalePrice;
    public Date productArrivalDate;
    public Boolean isMultipleProduct;
    
    public ProductInfo(int productID, String productName, String productProducer, int productAmount, Date productLifeDate, 
                  int productPurchasePrice, int productSalePrice, Date productArrivalDate){
        
        this.productID = productID;
        this.productName = productName;
        this.productProducer = productProducer;
        this.productAmount = productAmount;
        this.productPurchasePrice = productPurchasePrice;
        this.productSalePrice = productSalePrice;
        this.productArrivalDate = productArrivalDate;    
        
    }
    
 // 상품번호  
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
    
 // 상품명
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
    	this.productName = productName;
    }
    
 // 상품회사
    public String getProductProducer() {
        return productProducer;
    }
    public void setProductProducer(String productProducer) {
    	this.productProducer = productProducer;
    }
    
 //유통기한
    public Date getProductLifeDate() {
        return productLifeDate;
    }
    public void setProductLifeDate(Date productLifeDate) {
    	this.productLifeDate = productLifeDate;
    }
    
 // 구매가격
    public int getProductPurchsasePrice() {
        return productPurchasePrice;
    }
    public void setProductPurchasePrice(int productPurchasePrice) {
    	this.productPurchasePrice = productPurchasePrice;
    }
    
 // 판매가격
    public int getProductSalePrice() {
        return productSalePrice;
    }
    public void setProductSalePrice(int productSalePrice) {
    	this.productSalePrice = productSalePrice;
    }
    
 // 입고날짜
    public Date getProductArrivalDate() {
        return productArrivalDate;
    }
    public void setProductArrivalDate(Date productArrivalDate) {
    	this.productArrivalDate = productArrivalDate;
    }
    
 // 복합상품
    public Boolean getIsMultipleProduct() {
        return isMultipleProduct;
    }
    public void setIsMultipleProduct(Boolean isMultipleProduct) {
    	this.isMultipleProduct = isMultipleProduct;
    }
    
}