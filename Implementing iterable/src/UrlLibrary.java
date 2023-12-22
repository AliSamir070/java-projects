import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<String>();
	private class Urliterator implements Iterator<String>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	public UrlLibrary() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.facebook.com/caveofprogramming");
		urls.add("http://www.news.bbs.co.uk");
	}
	/*
	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}*/

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
