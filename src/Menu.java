package zad2lab2;

import java.util.InputMismatchException;

public class Menu {
	Queue queue = new Queue();

	public static void main(String[] args) {

		Queue<Message> queue = new Queue<Message>();

		while (true) {

			System.out
					.println("Select: sendingFifo or sendingLifo or receiving ");

			String sendingFifoOrSendingLifo = queue.readLine();
			switch (sendingFifoOrSendingLifo) {
			case ("sendingFifo"):
				try {
					System.out.println("Sending Fifo");
					queue.enqueueFifo(new Message(queue.readLineInt(), queue
							.readLine(), Priority.valueOf(queue.readLine())));
				} catch (IllegalArgumentException e) {
					System.out.println("not recognized priority");
				} catch (InputMismatchException e) {
					System.out.println("not recognized number");
				}
				;
				break;

			case ("sendingLifo"):
				try {
					System.out.println("Sending Lifo");
					queue.enqueueLifo(new Message(queue.readLineInt(), queue
							.readLine(), Priority.valueOf(queue.readLine())));
				} catch (IllegalArgumentException e) {
					System.out.println("not recognized priority");
				} catch (InputMismatchException e) {
					System.out.println("not recognized number");
				}
				;
				break;
			case ("receiving"):
				System.out.println("Receiving:");

				while (queue.hasItems()) {
					Message mes = queue.desqueue();
					System.out.println(mes.id + " " + mes.text + " "
							+ mes.priority);
				}
				break;

			}

		}

	}
}
