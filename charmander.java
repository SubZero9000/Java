class Charmander {
	int size;
	String name;

	void roar() {
		if (size > 60){
			System.out.println("ROARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!");
		} else if (size > 14) {
			System.out.println("Charmander!");
		} else {
			System.out.println("Char! Char!");
		}
	}

}
class charmander {
	public static void main (String[] args){
		Charmander rover = new Charmander();
		rover.size = 100;

		rover.roar();
	}
} 