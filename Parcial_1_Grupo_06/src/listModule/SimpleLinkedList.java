package listModule;
class Node<E>{
	E element; 
	Node<E> next;
	Node<E> prev;
	
public Node(E element) {
	this.element = element;
	this.next = null;
	this.prev = null;
}

}
public class SimpleLinkedList<E> implements SimpleList <E> {
	
	private Node<E> head;
	private Node<E> tall;
	private int size;
	public SimpleLinkedList() {
		this.head = null;
		this.tall = null;
		this.size = 0;
		
	}

	@Override
	public boolean add(Object Element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
