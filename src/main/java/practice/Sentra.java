package practice;

public class Sentra extends Car {
	
	public void sentraShow() {
		Engine sentraEngine = new Engine();
		sentraEngine.starting();
		sentraEngine.running();
		sentraEngine.stopping();
	}
}
