package assignment15;


	import java.util.LinkedList;

	public class ProducerConsumer {
	    private static final int CAPACITY = 5;
	    private LinkedList<Integer> buffer = new LinkedList<>();

	    public void produce() throws InterruptedException {
	        int value = 0;
	        while (true) {
	            synchronized (this) {
	                while (buffer.size() == CAPACITY) {
	                    System.out.println("Buffer is full, waiting for consumer to consume...");
	                    wait();
	                }
	                System.out.println("Producer produced: " + value);
	                buffer.add(value++);
	                notify();
	                Thread.sleep(1000); 
	            }
	        }
	    }

	    public void consume() throws InterruptedException {
	        while (true) {
	            synchronized (this) {
	                while (buffer.isEmpty()) {
	                    System.out.println("Buffer is empty, waiting for producer to produce...");
	                    wait();
	                }
	                int consumedValue = buffer.removeFirst();
	                System.out.println("Consumer consumed: " + consumedValue);
	                notify();
	        }
	    }

	    public static void main(String[] args) {
	        ProducerConsumer pc = new ProducerConsumer();

	        Thread producerThread = new Thread(() -> {
	            try {
	                pc.produce();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread consumerThread = new Thread(() -> {
	            try {
	                pc.consume();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        producerThread.start();
	        consumerThread.start();
	    }
	}


