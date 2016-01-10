package zad2lab2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Queue<E> {
	protected LinkedList<E> list = new LinkedList<E>();

	public void enqueueFifo(E item) {
		list.addLast(item);
	}

	public void enqueueLifo(E item) {
		list.addFirst(item);
	}

	public E desqueue() {
		return list.poll();

	}

	public boolean hasItems() {
		return !list.isEmpty();
	}

	public void addItems(Queue<? extends E> q) {
		while (q.hasItems())
			list.addLast(q.desqueue());
	}

	public String readLine() {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		return text;
	}

	public int readLineInt() {
		Scanner scanner = new Scanner(System.in);
		int myInt = scanner.nextInt();
		return myInt;

	}

}