package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Hero implements Serializable {
	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroType() {
		return heroType;
	}

	public void setHeroType(String heroType) {
		this.heroType = heroType;
	}

	public int getHeroDamage() {
		return heroDamage;
	}

	public void setHeroDamage(int heroDamage) {
		this.heroDamage = heroDamage;
	}

	public int getHeroDefence() {
		return heroDefence;
	}

	public void setHeroDefence(int heroDefence) {
		this.heroDefence = heroDefence;
	}

	public int getHeroLife() {
		return heroLife;
	}

	public void setHeroLife(int heroLife) {
		this.heroLife = heroLife;
	}

	public int getHeroMana() {
		return heroMana;
	}

	public void setHeroMana(int heroMana) {
		this.heroMana = heroMana;
	}

	public int getHeroStr() {
		return heroStr;
	}

	public void setHeroStr(int heroStr) {
		this.heroStr = heroStr;
	}

	public int getHeroInt() {
		return heroInt;
	}

	public void setHeroInt(int heroInt) {
		this.heroInt = heroInt;
	}

	public int getHeroDex() {
		return heroDex;
	}

	public void setHeroDex(int heroDex) {
		this.heroDex = heroDex;
	}

	public int getHeroAttackSpeed() {
		return heroAttackSpeed;
	}

	public void setHeroAttackSpeed(int heroAttackSpeed) {
		this.heroAttackSpeed = heroAttackSpeed;
	}

	private String heroName;
	private String heroType;
	private int heroDamage;
	private int heroDefence;
	private int heroLife;
	private int heroMana;
	private int heroStr;
	private int heroInt;
	private int heroDex;
	private int heroAttackSpeed;
	
	public Hero(String name, String type, int damage, int defence, int lifepoints, int mana, int str, int intel, int dex, int attackspeed) {
		this.heroName = name;
		this.heroType = type;
		this.heroDamage = damage;
		this.heroDefence = defence;
		this.heroLife = lifepoints;
		this.heroMana = mana;
		this.heroStr = str;
		this.heroInt = intel;
		this.heroDex = dex;
		this.heroAttackSpeed = attackspeed;
	}
}

public class SerialDeserializationAssignment {

	public static void main(String args[]) throws IOException {
		
		Hero h1 = new Hero("Jaina", "Intellect", 32, 5, 240, 420, 25, 56, 20, 4);
		Hero h2 = new Hero("Arthas", "Strength", 60, 18, 420, 240, 56, 28, 22, 5);
		Hero h3 = new Hero("Malfurion", "Intellect", 44, 8, 300, 300, 30, 54, 22, 5);
		Hero h4 = new Hero("Anduin", "Strength", 56, 24, 480, 280, 52, 34, 20, 5);
		Hero h5 = new Hero("Illidan", "Agility", 60, 13, 320, 220, 34, 30, 52, 6);
		Hero h6 = new Hero("Sylvanas", "Agility", 56, 10, 270, 180, 24, 26, 60, 6);
	
		ArrayList<Hero> heroes = new ArrayList<>();
			heroes.add(h1);
			heroes.add(h2);
			heroes.add(h3);
			heroes.add(h4);
			heroes.add(h5);
			heroes.add(h6);
		
			ObjectOutputStream oos = null;
			FileOutputStream fos = null;
			
			for(int i=0; i<6; i++) {
				try {
					fos = new FileOutputStream("D:\\Computer programming\\eclipse\\workspace\\Hero.ser");
					oos = new ObjectOutputStream(fos);
					oos.writeObject(heroes.get(i));	
					System.out.println("-------------Serializing hero.........");
					System.out.println("Serialization complete!");
					System.out.println();
				} catch (IOException e) {System.out.println(e);}
				finally {
					oos.close();
					fos.close();
				}
				
				Hero h = null;
				ObjectInputStream ois = null;
				FileInputStream fis = null;
				
				try {
					fis = new FileInputStream("D:\\Computer programming\\eclipse\\workspace\\Hero.ser");
					ois = new ObjectInputStream(fis);
					h = (Hero) ois.readObject();
					ois.close();
					fis.close();
				} catch(IOException e) {e.printStackTrace(); return;}
				  catch(ClassNotFoundException e) {e.printStackTrace(); return;}
					System.out.println("Hero name: " + h.getHeroName());
					System.out.println("Hero type: " + h.getHeroType());
					System.out.println("Hero damage:  " + h.getHeroDamage());
					System.out.println("Hero defence: " + h.getHeroDefence());
					System.out.println("Hero lifepoints " + h.getHeroLife());
					System.out.println("Hero mana: " + h.getHeroMana());
					System.out.println("Hero strength: " + h.getHeroStr());
					System.out.println("Hero intelligence: " + h.getHeroInt());
					System.out.println("Hero dexterity: " + h.getHeroDex());
					System.out.println("Hero attack speed: " + h.getHeroAttackSpeed());
				}			
	}
}
