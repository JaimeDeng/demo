package practice.InterfacePractice17_4;

public class Fly implements Bird, Me, Airplane {

	@Override
	public void airplaneFly() {
		System.out.println("飛機用引擎飛");
	}

	@Override
	public void meFly() {
		System.out.println("我他媽被電到飛");
	}
	
	@Override
	public void birdFly() {
		System.out.println("鳥用翅膀飛");
	}

}
