package ch06.bank;

import java.util.Random;

//계좌번호 자동생성 클래스
//형식: 은행no-지점no-일련번호 -> xxx-xxxx-xxxx
public class AccountIDGen { 
	
	public static String genAccID(String bankNo, String areaNo) {
		String accID = bankNo +"-"+areaNo+"-";
		Random r = new Random();
		int no = r.nextInt(10000);
		if (no<10) accID = accID+"000"+no;
		else if (no<100) accID= accID+"00"+no;
		else if (no<1000) accID= accID+"0"+no;
		else accID= accID+no;
		
		return accID;
	}
	
	
}
