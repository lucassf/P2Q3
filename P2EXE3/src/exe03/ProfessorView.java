package exe03;

@View(id=2)
public class ProfessorView implements IView{
	public void printDetails(String professorName, String professorRollNo) {
		System.out.println("Professor: ");
		System.out.println("Name: " + professorName);
		System.out.println("Roll No: " + professorRollNo);
	}
}
