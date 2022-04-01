package concurrency;

class Corridore implements Runnable{

	@Override
	public void run() {

		System.out.println("Ehi! Sono il thread");
		
	}
	
}

public class ProvaThread {

	public static void main(String[] args) {
		
		
		Runnable r1 = () -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ehi! Sono il thread"); 
		};
		
		Runnable r2 = () -> System.out.println("Sono il thread r2");
		
//		r1.run();	
		new Thread(r1).start();
		new Thread(r2).start();
		System.out.println("Sono il main thread");
			
		MioThread mt = new MioThread();
		mt.start();
		
		}
		
	}
