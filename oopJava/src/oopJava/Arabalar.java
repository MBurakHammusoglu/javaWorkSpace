package oopJava;

public class Arabalar {
	
	private String colour;
	private String model;
	private int modelYear;
	private boolean move;
	private int maxSpeed;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public boolean isMove() {
		return move;
	}
	public void setMove(boolean move) {
		this.move = move;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public Arabalar(String colour,String model,int modelYear, boolean move,int maxSpeed) {
		this.colour=colour;
		this.model=model;
		this.modelYear=modelYear;
		this.move=move;
		this.maxSpeed=maxSpeed;
		
	}
	
	

}
