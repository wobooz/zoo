/**
 * Tutaj często pojawiają się informacje o firmie, która jest właścicielem tego kodu.
 */

package zoo.animals;

/**
 * Klasa Animal jest klasą abstrakcyjną - nie będą tworzone jej instancje.
 * Jedynie klasy dziedziczące po niej (wyspecjalizowane) będą mogły mieć swoje instancje, o ile te klasy nie będą same klasami abstrakcyjnymi.
 * Klasa ta może się przydać np. przy ewidencji wszystkich zwierząt w ZOO.
 */
public abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public Animal() {
		this("[nie podano imienia]");
	}

	public String getName() {
		return name;
	}

	public void sayYourName() {
		System.out.println(name);
	}

	@Override
	public String toString() {
		return "Obiekt klasy Animal o nazwie [" + name + "]";
	}
}
