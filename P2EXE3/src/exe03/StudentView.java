package exe03;

@View(id=1)
public class StudentView implements IView{
	public void printDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}

}
