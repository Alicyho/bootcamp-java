import java.util.ArrayList;

// ! "T extends Animal" -> T can only be Animal
public class Zoo<T extends Animal> {
  private ArrayList<T> animals;

  // constructor
  public Zoo() {
    this.animals = new ArrayList<>();
  }

  // getAnimals()
  public ArrayList<T> getAnimals() {
    return this.animals;
  }

  // add(T animal)
  public boolean add(T animal) {
    return this.animals.add(animal);
  }

  public static void main(String[] args) {
    // ! Runtime -> Define T
    Zoo<Tiger> zoo1 = new Zoo<>();
    zoo1.add(new Tiger());
    
    Zoo<Panda> zoo2 = new Zoo<>();
    zoo2.add(new Panda());
    
    Zoo<Animal> zoo3 = new Zoo<>();
    zoo3.add(new Tiger());
    zoo3.add(new Panda());

    // ! Good Usage of Generic
    ArrayList<Tiger> tigers = new ArrayList<>();
    ArrayList<Panda> pandas = new ArrayList<>();
    ArrayList<Animal> animals = new ArrayList<>();
  }
}