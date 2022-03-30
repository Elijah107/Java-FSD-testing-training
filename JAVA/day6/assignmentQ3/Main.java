package assignmentQ3;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee();
        e1.setEmpno(1);
        e1.setName("swathi");
        e1.setSalary(15000);
        System.out.println("Employee No.:"+e1.getEmpno()+"\tName:"+e1.getName()+"\tSalary:"+e1.getSalary());       
        Employee e2=new Employee();
        e2.setEmpno(2);
        e2.setName("athulya");
        e2.setSalary(10000);
        System.out.println("Employee No.:"+e2.getEmpno()+"\tName:"+e2.getName()+"\tSalary:"+e2.getSalary());       
	}

}
