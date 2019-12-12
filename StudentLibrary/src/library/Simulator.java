package library;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Simulator {

	public static void main(String[] args) throws InterruptedException{
		Student[] students = null;
		ExecutorService executorService = null;
		Book[] books = null;
		
		try {
			students = new Student[Constants.NUMBER_OF_STUDENTS];
			books = new Book[Constants.NUMBER_OF_BOOKS];
			executorService = Executors.newFixedThreadPool(Constants.NUMBER_OF_STUDENTS);
			
			for(int i=0;i<Constants.NUMBER_OF_BOOKS;i++)
				books[i] = new Book(i);
			
			for(int i=0;i<Constants.NUMBER_OF_STUDENTS;i++) {
				students[i] = new Student(i,books);
				executorService.execute(students[i]);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
			executorService.shutdown();
		}finally {
			executorService.shutdown();
		}
	}

}
