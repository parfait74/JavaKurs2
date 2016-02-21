/**
 * This an interface given to us by teachers. This interface will be implementing in different ways
 */

package fs222mh_assign3.countWords;

@SuppressWarnings("rawtypes")
public interface WordSet extends Iterable{
	
	public void add(Word word); // Add word if not already added
	public boolean contains(Word word); // Return true if word contained
	public int size(); // Return current set size
	public String toString(); // Print contained words
	
	

}