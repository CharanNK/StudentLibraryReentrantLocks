package library;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {
	private int id;
	private Lock lock;
	
	public Book(int id) {
		this.id = id;
		lock = new ReentrantLock();
	}
	
	public void read(Student student) throws InterruptedException{
		lock.lock(); //we do not use lock.tryLock() because it acquires the lock only if it is available at the time of invocation
		System.out.println(student+" started reading "+this);
		Thread.sleep(2000);
		lock.unlock();
		System.out.println(student+" finished reading "+this);
	}
	
	@Override
	public String toString() {
		return "Book"+this.id;
	}
}
