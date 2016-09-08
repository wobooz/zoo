/**
 * Tutaj często pojawiają się informacje o firmie, która jest właścicielem tego kodu.
 */

package zoo.animals;

/**
 * Klasa Mammal (ssak) jest również abstrakcyjna, bo nie chcemy mieć ssaków bez określenia jego gatunku.
 * Konkretne gatunki ssaków mogą być odrębnymi klasami.
 */
public abstract class Mammal extends Animal {

	/**
	 * Informacja, czy ssak ten ma ogon.
	 */
	boolean tail;

	/**
	 * Opis konstruktora z parametrem typu String i typu int.
	 * @param name Nazwa tego ssaka
	 * @param hasTail Czy ssak ma ogon
	 */
	public Mammal(String name, boolean hasTail) {
		super(name);
		tail = hasTail;
	}

	/**
	 * Opis konstruktora z parametrem typu String
	 * @param name Nazwa tego ssaka
	 */
	public Mammal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Opis konstruktora bezparametrowego
	 */
	public Mammal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean hasTail() {
		return tail;
	}

	@Override
	public String toString() {
		return "Obiekt klasy Mammal o nazwie [" + name + "] " + (tail?"z ogonem":"bez ogona");
	}
}
