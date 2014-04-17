package in.technoscience;

public class Hello {
	private  static final String WELCOME= "Hi";
	private  String name;
	private String welcomeYou;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWelcomeYou() {
		return welcomeYou;
	}
	public void setWelcomeYou(String welcomeYou) {
		this.welcomeYou = welcomeYou;
	}
	
	public String execute() throws Exception{
		setWelcomeYou(WELCOME + getName());
		return "SUCCESS";
		
	}

}
