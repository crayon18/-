package array;

public class ObjectCoppy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���1", "������1");
		bookArray1[1] = new Book("�¹���2", "������2");
		bookArray1[2] = new Book("�¹���3", "������3");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i = 0; i<bookArray1.length; i++ )
		bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		
		
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
