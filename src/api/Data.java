package api;

import sun.security.jca.GetInstance.Instance;

public class Data {
	int num;
	String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "고객정보 번호 " + num + " 이름 " + name;
	}
	@Override
	public boolean equals(Object obj) {
		//전달된 타입이 Data인지 확인
		if(obj instanceof Data) {
		Data d = (Data) obj;
		if(this.num==d.num && this.name.equals(d.name)) {
			return true;
			}
			else{
				return false;
			}
		}
		// Data가 아니라면 false
		else {
			return false;
			}
	}
	
	
	
	

}
