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
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
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
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
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
		return ;
	
}
