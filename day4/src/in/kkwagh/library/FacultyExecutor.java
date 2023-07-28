//program to demonstrate access specifier
//driver class

package in.kkwagh.library;
import in.bkcmet.library.Library;
//import in.bkcmet.library.;

public class FacultyExecutor {

	public static void main(String[] args) {
		
		Library l = new Library();
		l.libraryName = "Bhujbal Knowledge Library";
		l.displayPublic();

		/*UserId and displayPrivate() method is private,
		 * so we can't access into another package of class,
		 * only we can access inside the same class
		 */
		
		//l.userId = 123456;
		//l.displayPrivate();
		
		
		/*bookName and sipalyDefault() method is default,
		 * we can't access into another package, only we can access
		 * it within the same package.
		 */
		
		//l.bookName;
		//l.displayDefault;
		
	}

}
