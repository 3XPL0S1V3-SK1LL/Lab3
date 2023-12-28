import java.util.ArrayList;
import inanimateobjects.*;
import livingthings.abilities.Abilities;
import livingthings.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList<Abilities> abilities = new ArrayList<>();
		Shorty secondBaby =new Shorty("Лена", Human.Sex.FEMALE);
		secondBaby.setHeaddress(ChildClothing.Headdress.BOW);
		secondBaby.setTopOuterWear(ChildClothing.TopOuterWear.DRESS);
		secondBaby.setShoes(ChildClothing.Shoes.SHOES);
		secondBaby.setAccessories(ChildClothing.Accessories.APRON);
		secondBaby.getAccessories().setAccessoriesColor(ChildClothing.Colors.PINK);
		secondBaby.getAccessories().setAccessoriesPicture(ChildClothing.Picture.SQUIRREL);
		secondBaby.getAccessories().setAccessoriesPictureColor(ChildClothing.Colors.RED);
		secondBaby.setPlace(Places.HALL);
		Shorty firstBaby = new Shorty("Маша", Human.Sex.FEMALE);
		firstBaby.setPlace(Places.HALL);
		firstBaby.setHeaddress(ChildClothing.Headdress.BOW);
		firstBaby.setTopOuterWear(ChildClothing.TopOuterWear.T_SHIRT);
		firstBaby.setDownOuterWear(ChildClothing.DownOuterWear.SKIRT);
		firstBaby.setShoes(ChildClothing.Shoes.SHOES);
		firstBaby.setAccessories(ChildClothing.Accessories.APRON);
		firstBaby.getAccessories().setAccessoriesColor(ChildClothing.Colors.ORANGE);
		firstBaby.getAccessories().setAccessoriesPicture(ChildClothing.Picture.RABBIT);
		firstBaby.getAccessories().setAccessoriesPictureColor(ChildClothing.Colors.GREEN);
		firstBaby.addAbility(new Abilities("спорить", "c другой малышкой"));
		secondBaby.addAbility(new Abilities("спорить", "c другой малышкой"));
		Shorty neznaika = new Shorty("Незнайка", Human.Sex.MALE);
		firstBaby.setHeaddress(ChildClothing.Headdress.HAT);
		neznaika.setTopOuterWear(ChildClothing.TopOuterWear.SHIRT);
		neznaika.getTopOuterWear().setTopOuterWearColor(ChildClothing.Colors.ORANGE);
		neznaika.setDownOuterWear(ChildClothing.DownOuterWear.TROUSERS);
		neznaika.getDownOuterWear().setDownOuterWearColor(ChildClothing.Colors.YELLOW);
		neznaika.setShoes(ChildClothing.Shoes.BOOTS);
		neznaika.getShoes().setShoesColor(ChildClothing.Colors.ORANGE);
		neznaika.setAccessories(ChildClothing.Accessories.TIE);
		neznaika.getAccessories().setAccessoriesColor(ChildClothing.Colors.GREEN);
		neznaika.setPlace(Places.BEDROOM);
		neznaika.addAbility(new Abilities("хотеть", "посмотреть кто там спорит"));
		neznaika.addAbility(new Abilities("вскочить с постели"));
		Doors theDoorFromBedToHall = new Doors(Places.BEDROOM, Places.HALL);
		neznaika.addAbility(new Abilities("открыть дверь"));
		theDoorFromBedToHall.open();
		neznaika.changePlace(Places.HALL);
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
		Stairs stairsFromHallToAttic = new Stairs(Places.HALL, Places.ATTIC, 10, 0.4);
		firstBaby.changePlace(Places.STAIRS);
		secondBaby.changePlace(Places.STAIRS);
		firstBaby.addAbility(new Abilities("подниматься"));
		secondBaby.addAbility(new Abilities("подниматься"));
		firstBaby.climbTheStairs(Places.HALL, Places.ATTIC, 10, 0.4);
		firstBaby.climbTheStairs(Places.HALL, Places.ATTIC, 10, 0.4);
	}
}
