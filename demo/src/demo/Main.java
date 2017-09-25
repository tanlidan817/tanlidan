package demo;

public class Main {
	
	private static int Graph_Size = 6;
	private static char ch = 'A';
	
	public static void main(String[] args) {
		Graph[] graphArray = new Graph[Graph_Size];
		
		for (int i = 0; i < Graph_Size; i++) {
			graphArray[i] = new Graph();
			graphArray[i].setName(ch + i + "");
			graphArray[i].setNext(null);
		}
		
		for (int i = 0; i < Graph_Size; i++) {
			System.out.println(graphArray[i].getName()+ " " + graphArray[i].getNext());
		}
		
		
	}
}
