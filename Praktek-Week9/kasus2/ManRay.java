package kasus2;

public class ManRay extends SuperHero{

	public ManRay(int lvl, String name) {
		super(lvl, name);
		Power laser = new LaserEye();
		Power strength = new Strength();
		super.addPower(laser);
		super.addPower(strength);
	}

	@Override
	public void identity() {
		System.out.println("It's "+ super.getName() + ", the ManRay! "
				+ "It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
	}

}
