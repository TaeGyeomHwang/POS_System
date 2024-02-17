package pos;

public class ShopInfo { // 가게의 정보를 담은 클래스

    public ShopInfo() {
    }

    public String shopName;
    public String shopAddress;
    public String shopTelephone;

//가게이름    
    public String getShopName() {
        return shopName;
    } 
    
    public void setShopName(String shopName) {
    	this.shopName = shopName;
    }
// 가게주소
    public String getShopAddress() {
        return shopAddress;
    }
   
    public void setShopAddress(String shopAddress) {
    	this.shopAddress = shopAddress;
    }
// 가게전화
    public String getShopTelephone() {
        return shopTelephone;
    }
    
    public void setShopTelephone(String shopTelephone) {
    	this.shopTelephone = shopTelephone;
    }
}