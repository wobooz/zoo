/**
 * Tutaj zazwyczaj pojawiają się komentarze odnośnie praw majątkowych.
 */

package zoo;

import zoo.animals.*;

/**
 * @author dev
 */
public class Program {

	/**
	 * Od tej metody zaczyna się wykonanie programu.
	 * @param args Argumenty wywołania programu z linii poleceń
	 */
	public static void main(String[] args) {
		System.out.println("Działa");
		Animal a = new Human("James Bond");
		a.sayYourName();
		System.out.println(a);
	}

}
