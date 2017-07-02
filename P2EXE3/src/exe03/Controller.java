package exe03;

public class Controller {
	private IModel model;
	private IView view;
	
	private Controller(IModel model,IView view){
		this.model = model;
		this.view = view;
	}
	
	public static Controller getController(Object model, Object view) {
		Class<?> c = model.getClass();
		Class<?> c1 = view.getClass();
		
		Model newmodel = c.getAnnotation(Model.class);
		View newview = c1.getAnnotation(View.class);
		
		if (newmodel==null||newview==null||newmodel.id()!=newview.id())return null;
		
		return new Controller((IModel)model,(IView)view);
	}

	public void setName(String name) {
		model.setName(name);
	}

	public String getName() {
		return model.getName();
	}

	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printDetails(model.getName(), model.getRollNo());
	}

}
