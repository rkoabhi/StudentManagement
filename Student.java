package StudentManagement;

public class Student {
	private int id;
	private String name;
	private float mark1, mark2;
	private float totalMarks;
	private boolean status;
	
	public float getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks() {
		this.totalMarks = this.mark1+this.mark2;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String isStatus() {
		if(this.status)
			return "P";
		else
			return "F";
	}
	public void setStatus() {
		if(this.totalMarks >= 50)
			this.status = true;
		else
			this.status = false;
	}
	
	public float getMark1() {
		return mark1;
	}
	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}
	public float getMark2() {
		return mark2;
	}
	public void setMark2(float mark2) {
		this.mark2 = mark2;
	}
	public String toString()
	{
		return "Student ID : "+this.getId()+" \n"+"Student Name : "+this.getName()+" \n"+"Student Mark1 : "+this.getMark1()+" \n"+"Student Mark2 : "+this.getMark2()+
		"\n Student Total : "+this.getTotalMarks()+" \n"+"Student Status : "+this.isStatus();	
		//return this.getId()+" "+this.getName()+" "+this.getMark1()+" "+this.getMark2();
	}
	
}
