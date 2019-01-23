package virtualpet;

public class VirtualPet {
//instance variables
	private String name;
	private int hunger=50;
	private int energy=50;
	private int thirst=50;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		this.hunger=hunger;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy=energy;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public void setThirst(int thirst) {
		this.thirst=thirst;
	}
	
	public void tick() {
	hunger+=2;
	energy-=2;
	thirst+=2;
	
	}
	
	
	public VirtualPet(String name, int hunger, int energy, int thirst) {
		
	}
	
public void feedPet(){
	this.hunger=-5;
	this.thirst=+5;
}
public void giveWater() {
	this.thirst=-5;
}
public void layDownForNap() {
	this.energy=+5;
}
}

