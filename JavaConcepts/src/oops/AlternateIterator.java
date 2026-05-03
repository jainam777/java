package oops;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class AlternateIterator implements Iterator<Integer>{

	private List<Integer> list;
	private int cursor=0;
	public AlternateIterator(List<Integer> list) {
		this.list=list;
	}
	@Override
	public boolean hasNext() {
		return cursor<list.size();
	}
	
	@Override
	public Integer next() {
		if(!hasNext()) throw new NoSuchElementException();
		Integer i =list.get(cursor);
		cursor=+2;
		return i;
	}
}
