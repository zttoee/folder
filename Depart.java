package Com.salesforce.pratice03;

public class Depart extends Employee {

    //코드작성
	private String department;
	


	public Depart(String name, int salary, String department) {
		super(name, salary);  //생성자 호출은 가장 먼저!
        this.department = department;
        //this.setName(name);
        //this.setSalary(salary);
        //아니면
        //super.setName(name);
        //super.setSalary(salary);
	}
	

    public void getInformation() {  //오버라이딩
        System.out.println("이름:" + this.getName() + " 연봉:" + this.getSalary() + " 부서:" + department);
    }
	

}
