/**
 * This is an interface of List. Do not change this interface. 
 * @author SNU 2015 Fall Data Structure T.A.
 *
 */

/** List ADT */
public interface List<E> {
	public void clear();
	public void insert(int pos, E item);
	public E remove(int pos);
	public void moveToStart();
	public void moveToEnd();
	public void prev();
	public void next();
	public int length();
	public int currPos();
	public void moveToPos(int pos);
	public E getValue(int pos);
}