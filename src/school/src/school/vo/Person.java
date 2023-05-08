package school.vo;

public abstract class Person {
	private String name;
	private String id;
	private String phone;

	public Person() {
	}
	public Person(String name, String id, String phone) {
		this.name = name;
		this.id = id;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	//Overriding - ��ӹ��� �޼ҵ带 ������.
	//����Ÿ�� ����, ���������ڴ� ���ų� �� ������, �̸��� ����, ���ܴ� ���ų� �� ����Ÿ������
	
	public String toString() {
		String s = "�̸�: " + name + " �й�: " + id + " ��ȭ��ȣ: " + phone;
		return s;
	}
}