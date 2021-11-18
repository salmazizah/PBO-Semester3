package kasus2;

public class FlyingDutchMan extends SuperHero{

	public FlyingDutchMan(int lvl, String name) {
		super(lvl, name);
		Power fly = new Flying();
		Power laser = new LaserEye();
		super.addPower(fly);
		super.addPower(laser);
	}

	@Override
	public void identity() {
		System.out.println("It's "+ super.getName() + ", the FlyingDutchMan! "
				+ "It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
	}

}
