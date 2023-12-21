public class Shorty extends Human{
	public Shorty(){
		System.out.println("Коротышка создана!");
		} //перегружаем конструкторы, поскольку разное количество параметров может быть задано
	public  Shorty(String name, Sex sex){
		setName(name);
		setSex(sex);
		System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + getSex()+ ")");
	}
	public  Shorty(String name, Sex sex, int age){
		setName(name);
		setAge(age);
		setSex(sex);
		System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + getSex()+ ") " +"Ему" + getAge() + "лет!");
	}
	public  Shorty(String name, Sex sex, int age, String cloth){
		setName(name);
		setAge(age);
		setCloth(cloth);
		setSex(sex);
		System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + getSex()+ ") " + "Ему" + getAge() + "лет!" + " На нем " + getCloth());
	}
	public  Shorty(String name, Sex sex, String cloth){
		setName(name);
		setCloth(cloth);
		setSex(sex);
		System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + getSex()+ ") " + "На нем " + getCloth());
	}
	
}