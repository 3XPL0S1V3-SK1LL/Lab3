import java.util.ArrayList;
import java.util.Objects;

abstract class Human implements Humanity{
	private String name;
	private int age;
	private String cloth;
	private String sex;
	private ArrayList<Abilities> Abilities = new ArrayList<Abilities>(); //список умений
	public void setSex (Sex sex_){
		if (sex_ == Sex.MALE) {sex = "Мальчик";}
		if (sex_ == Sex.FEMALE) {sex = "Девочка";}
	}
	public String getSex(){
		return sex;
	}

	public  void  setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setCloth(String cloth){
		this.cloth = cloth;
	}
	public String getCloth(){
		return cloth;
	}
	public void setAbilities(ArrayList<Abilities> Abilities){
		this.Abilities = Abilities;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(cloth, human.cloth) && Objects.equals(sex, human.sex) && Objects.equals(Abilities, human.Abilities);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, cloth, sex, Abilities);
	}

	@Override
	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", age=" + age +
				", cloth='" + cloth + '\'' +
				", sex='" + sex + '\'' +
				", Abilities=" + Abilities +
				'}';
	}

	//@Override
	//public String toString() {
    //    return "У Human имя" + this.getName();
    //}
    public ArrayList<Abilities> getAbilities() {
        return Abilities;
    }
	public boolean addAbility(Abilities newAbility) {
            System.out.println(this.getName() + " теперь умеет " + newAbility.getName()
					+ " (" + newAbility.getDetails()+ ")");
			Abilities.add(newAbility);
            return true;
	}

	    public void walk(Places fromPlace, Places toPlace){
			Place from = new Place();
			from.setType(fromPlace);
			from.getType();
			Place to = new Place();
			to.setType(toPlace);
			to.getType();
			System.out.println(getName() + " перешел из " + from.getType() + " в " + to.getType());
		}
}
