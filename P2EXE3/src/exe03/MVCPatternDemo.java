package exe03;

public class MVCPatternDemo {
	public static void main(String[] args) {
		Object samples[] = {
				retriveStudentFromDatabase(),new StudentView(),
				retriveProfessorFromDatabase(),new ProfessorView(),
				retriveStudentFromDatabase(),new ProfessorView(),
				retriveProfessorFromDatabase(),new StudentView(),
				"",0
		};
		
		for (int i=0;i<samples.length;i+=2){
			
			Object model = samples[i];
			Object view = samples[i+1];
	
			Controller controller = Controller.getController(model, view);
			
			if (controller!=null){
				controller.updateView();
		
				// update model data
				controller.setName("John");
				controller.updateView();
			}else{
				System.out.println("Modelo ou vista errado");
			}
		}
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	private static Professor retriveProfessorFromDatabase() {
		Professor professor = new Professor();
		professor.setName("Julius");
		professor.setRollNo("11");
		return professor;
	}

}
