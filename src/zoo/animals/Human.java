/**
 * 
 */

package zoo.animals;

/**
 * Klasa Human dziedziczy po Mammal (ssaku)
 * @author dev
 */
public class Human extends Mammal {

	/**
	 * Opis konstruktora klasy Human z parametrem typu String
	 * @param name Nazwa tego człowieka
	 */
	public Human(String name) {
		super(name, false);
	}
}
