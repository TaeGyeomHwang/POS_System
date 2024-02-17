package pos;
import java.util.*;

public class DBmanager { // DB(오라클)에 연결하여 쿼리문을 통하여 데이터 베이스를 관리하려 하였으나 DB에 연결을 못하여 내부에서 값을 저장.

    public DBmanager() {
    }
// stockList라는 ArrayList 생성
    public ArrayList<ProductInfo> stockList = new ArrayList<ProductInfo>();
    
    public ArrayList<ProductInfo> getStockList() {
    	return stockList;
    }
    
    public void setStockList(ArrayList<ProductInfo> stockList){
        this.stockList = stockList;
    }
// stockList에 값 넣기    
    public void addStock(ProductInfo product){
    stockList.add(product);
    }
    
// changeReportList라는 ArrayList 생성    
    public ArrayList<LossReason> changeReportList = new ArrayList<LossReason>();
    
    public ArrayList<LossReason> getChangereportList() {
    	return changeReportList;
    }

    public void setchangeReportList(ArrayList<LossReason> changeReportList){
        this.changeReportList = changeReportList;
    }
// changeReportList에 값 넣기    
    public void addloss(LossReason loss){
    changeReportList.add(loss);
    }

}