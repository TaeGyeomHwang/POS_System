package pos;
import java.util.*;

public class multipleProduct { // 복합상품생산에서 합쳐질 재고와 합쳐진 재고의 정보를 담은 클래스

    public multipleProduct(int firstCombinedProductID, int secondCombinedProductID, String combinedProductName,
                           Date combinedProductLifeDate, int combinedProductAmount, int productSalePrice) {
        this.firstCombinedProductID = firstCombinedProductID;
        this.secondCombinedProductID = secondCombinedProductID;
        this.combinedProductName = combinedProductName;
        this.combinedProductAmount = combinedProductAmount;
        this.productSalePrice = productSalePrice;
    }

    public int firstCombinedProductID;
    public int firstCombinedProductAmount;
    public int secondCombinedProductID;
    public int secondCombinedProductAmount;
    public int combinedProductID;
    public int combinedProductAmount;
    public int productSalePrice;
    public String combinedProductName;

 // 복합상품에서 처음으로 합칠 상품번호
    public int getFirstCombinedProductID() {
  
        return firstCombinedProductID;
    } 
    
    public void setFirstCombinedProductID(int firstCombinedProductID) {
    	this.firstCombinedProductID = firstCombinedProductID;
    }
 
 // 처음올 합칠 상품의 갯수
    public int getFirstCombinedProductAmount() {
        
        return firstCombinedProductAmount;
    }
    public void setFirstCombinedProductAmount(int firstCombinedProductAmount) {
    	this.firstCombinedProductAmount = firstCombinedProductAmount;
    }
    
 // 복합상품에서 두번째로 합칠 상품번호
    public int getSecondCombinedProductID() {
 
        return secondCombinedProductID;
    } 
    
    public void setSecondCombinedProductID(int secondCombinedProductID) {
    	this.secondCombinedProductID = secondCombinedProductID;
    }

 // 두번째로 합칠 상품의 갯수
    public int getSecondCombinedProductAmount() {
        
        return secondCombinedProductAmount;
    } 
    
    public void setSecondCombinedProductAmount(int secondCombinedProductAmount) {
    	this.secondCombinedProductAmount = secondCombinedProductAmount;
    }

 // 합쳐진 상품번호
    public int getCombinedProductID() {
    	
        return combinedProductID;
    } 
    
    public void setCombinedProductID(int combinedProductID) {
    	this.combinedProductID = combinedProductID;
    }

 // 합쳐진 상품의 수
    public int getCombinedProductAmount() {
   
        return combinedProductAmount;
    } 
    
    public void setCombinedProductAmount(int combinedProductAmount) {
    	this.combinedProductAmount = combinedProductAmount;
    }
 // 판매가격 
    public int getProductSalePrice(){
        return productSalePrice;
    }
    public void setProductSalePrice(int productSalePrice){ 
        this.productSalePrice = productSalePrice;
    }
  // 헙쳐진 상품의 이름
    public String getCombinedProductName(){
        return combinedProductName;
    }
    
     public void setCombinedProductName(String combinedProductName){
         this.combinedProductName = combinedProductName;
     }

}