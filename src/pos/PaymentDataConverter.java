package pos;

import java.util.*;

public class PaymentDataConverter { // 결제시스템으로부터 읽어온 바코드 정보를 결제 정보로 바꾸기 위한 클래스

    public PaymentDataConverter() {
    }

    // 바코드 정보에서 1번 숫자는 물건, 음식물  3,4번숫자는 제조사 8,9,10번은 상품번호
    public String barcodeData; /13자리 숫자, 리더기로 찍으면 13자리로 가져옴 
    public int paymentData;

// 바코드정보, 바코드가 없어 랜던값 추출
    public String getBarcodeData() {
        return barcodeData;
    }  
    
    public void setBarcodeData(String barcodeData){
        Random random = new Random();
    	int createNum = 0;
    	String ranNum = "";
    	int Num = 13;
    	String resultNum = "";
    	for (int i=0; i<Num;i++) {
    		createNum = random.nextInt(9);
    		ranNum = Integer.toString(createNum);
    		resultNum += ranNum;
    	}
        this.barcodeData = resultNum;
    }
    
// 바코드정보를 결제정보로 전환 
    public void dataConversion(String barcodeData) {
        String paymentData1;
        String paymentData2;
        // 바코드정보를 불러온다.
    // 음식인지 물건인지
    	char con1 = barcodeData.charAt(0);
    	int a = Character.getNumericValue(con1);
    	if (0 <= a && a < 7) {
    		paymentData1 = new String("0");
    	}
    	else {
    		paymentData1 = new String("1");
    	}
    	// 제조회사 (예시로 3개의 회사가 있다고 가장하였으며, 복합상품에 대한 결제정보를 위해 4가지의 경우의 수로 봄)
    	String con2 = barcodeData.substring(3, 5);
    	int b = Integer.parseInt(con2);
    	if(0 < b && b <= 25) {
    		paymentData2 = new String("01");
    	}
    	else if(25 < b && b <= 50) {
    		paymentData2 = new String("02");
    	}
    	else if(50 < b && b <= 75) {
    		paymentData2 = new String("03");
    	}
        else {
            paymentData2 = new String("10");
        }
        
    	// 제품번호
    	String paymentData3 = barcodeData.substring(8,11);	   
    
    	
    	String paymentData4 = paymentData1 + paymentData2 + paymentData3;
        int paymentData = Integer.parseInt(paymentData4);
        this.paymentData = paymentData;
    }
    

// 결제정보
    public int getPaymentdata() {
        return paymentData;
    }

}