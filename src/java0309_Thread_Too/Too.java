package java0309_Thread_Too;
import java.util.Random;
public class Too extends Thread {
	private Random r = new Random();
	private int nowE = 0;
	private String goGr = "";
	private String thisName = "";

	@Override
	public void run() { // start 라는 매소드 로 run 을 호출해서 gogogo();와 prt(); 를 멀티 스레드 돌리겠다 라는 뜻

		thisName = Thread.currentThread().getName();
		while (nowE < 100) { // nowE 와 nowP 숫자 합이 100 을 넘기 전까지
			gogogo();
			prt();

		}
	}
	private void gogogo() {
		int nowP = r.nextInt(5) + 1; // 1부터 5까지
		nowE = nowE + nowP;
		for (int i = 0; i < nowP; i++) {
			goGr = goGr + "#";
		}

		try {
			// 컴퓨터가 속도가 빨라서 랜덤한 이름이 나오지 못해서 timesleep을 걸어서 랜덤하게 이름이 나오게 만든것
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void prt() {
		System.out.println(thisName + ":" + goGr);
	}

}
