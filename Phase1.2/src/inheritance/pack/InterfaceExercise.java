package inheritance.pack;

	interface Arthas {
		String heroType = "Strength";
		void bash();
		void regularAttack();
	}
	
	interface JainaProudmore {
		String heroType = "Intellect";
		void iceBlast();
		void regularAttack();
	}
	
public class InterfaceExercise implements Arthas, JainaProudmore {
	
	@Override
	public void bash() {
		System.out.println("Hero bashes the enemy!");
	}
	
	@Override
	public void iceBlast() {
		System.out.println("Hero uses Ice Blast on the enemy!");
	}
	
	public void regularAttack() {
		System.out.println("Hero wacks the enemy in the head.");
	}
	
	public static void main(String args[]) {
		
		InterfaceExercise hero = new InterfaceExercise();
		hero.bash();
		hero.iceBlast();
		hero.regularAttack();
		
		Arthas a = new InterfaceExercise();
		System.out.println("Arthas' hero type is: " + a.heroType);
	}
	
	
	
}
