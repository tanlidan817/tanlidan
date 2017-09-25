package demo;

public class Graph {
	private int index;
	private int value;
	private Graph next;

	public Graph() {

	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Graph getNext() {
		return next;
	}

	public void setNext(Graph next) {
		this.next = next;
	}

}
