package kasus2;

import java.util.ArrayList;
import java.util.List;

public class AvengedSimulator {

	public static void addHero(List<SuperHero> hero, int lvl, String name, String type) {
		SuperHero sh = null;
		if(type.equals("ManRay")) {
			sh = new ManRay(lvl, name);
		}else if(type.equals("FlyingDutchMan")) {
			sh = new FlyingDutchMan(lvl, name);
		}else if(type.equals("DirtyBubble")) {
			sh = new DirtyBubble(lvl, name);
		}
		hero.add(sh);
	}
	
	public static void main(String[] args) {
		List<SuperHero> superhero = new ArrayList<SuperHero>();
		addHero(superhero, 0, "Gennichiro", "ManRay");
		addHero(superhero, 255, "Shirai", "FlyingDutchMan");
		addHero(superhero, 553, "Gyoubu Masataka Oniwa", "ManRay");
		addHero(superhero, 666, "Arnastria", "DirtyBubble");
		addHero(superhero, 36556, "Tatenari", "FlyingDutchMan");
		for (SuperHero sh : superhero) {
			System.out.println("===============================");
			sh.identity();
			sh.showPowers();
			System.out.println("===============================");
		}
	}

}
