
public class Counter {
	
	public static void main(String[] args) {

		Counter test = new Counter();
		
		test.countDown(10);
		
	}
	
	public void countDown(int startNumber){
		if(startNumber <=0)return;
			System.out.println(startNumber);
			countDown(startNumber -1);
	}

}
