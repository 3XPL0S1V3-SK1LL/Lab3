import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Abilities> abilities = new ArrayList<>();
		Shorty secondBaby =new Shorty("Лена", Sex.FEMALE, "передник с красной белочкой");
		Shorty firstBaby = new Shorty("Маша", Sex.FEMALE, "передник с зеленым зайчиком");
		firstBaby.addAbility(new Abilities("спорить", "c другой малышкой"));
		secondBaby.addAbility(new Abilities("спорить", "c другой малышкой"));
		Shorty Neznaika = new Shorty("Незнайка", Sex.MALE, "Большая синия шляпа");
		Neznaika.addAbility(new Abilities("хотеть", "посмотреть кто там спорит"));
		Neznaika.addAbility(new Abilities("вскочить с постели"));
		Doors theDoorFromBedToHall = new Doors(Places.BEDROOM, Places.HALL);
		theDoorFromBedToHall.setStatus(false);
		theDoorFromBedToHall.printStatus();
		Neznaika.addAbility(new Abilities("открыть дверь"));
		theDoorFromBedToHall.setStatus(true);
		theDoorFromBedToHall.printStatus();
		Neznaika.walk(Places.BEDROOM, Places.HALL);
		firstBaby.addAbility(new Abilities("отскочить", "в сторону"));
		secondBaby.addAbility(new Abilities("отскочить", "в сторону"));
		firstBaby.addAbility(new Abilities("схватиться за лоб"));
		secondBaby.addAbility(new Abilities("схватиться за лоб"));
		firstBaby.addAbility(new Abilities("смотреть на Незнайку", "c испугом"));
		secondBaby.addAbility(new Abilities("смотреть на Незнайку", "c испугом"));
		firstBaby.addAbility(new Abilities("заморгать глазами"));
		secondBaby.addAbility(new Abilities("заморгать глазами"));
		firstBaby.addAbility(new Abilities("заплакать"));
		secondBaby.addAbility(new Abilities("заплакать"));
		firstBaby.addAbility(new Abilities("повернуться"));
		secondBaby.addAbility(new Abilities("повернуться"));
		firstBaby.walk(Places.HALL, Places.STAIRS);
		secondBaby.walk(Places.HALL, Places.STAIRS);
		firstBaby.addAbility(new Abilities("подниматься"));
		secondBaby.addAbility(new Abilities("подниматься"));
	}
}
