package java0309_Thread_Too;
import java.util.Random;
public class Too extends Thread {
	private Random r = new Random();
	private int nowE = 0;
	private String goGr = "";
	private String thisName = "";

	@Override
	public void run() { // start ��� �żҵ� �� run �� ȣ���ؼ� gogogo();�� prt(); �� ��Ƽ ������ �����ڴ� ��� ��

		thisName = Thread.currentThread().getName();
		while (nowE < 100) { // nowE �� nowP ���� ���� 100 �� �ѱ� ������
			gogogo();
			prt();

		}
	}
	private void gogogo() {
		int nowP = r.nextInt(5) + 1; // 1���� 5����
		nowE = nowE + nowP;
		for (int i = 0; i < nowP; i++) {
			goGr = goGr + "#";
		}

		try {
			// ��ǻ�Ͱ� �ӵ��� ���� ������ �̸��� ������ ���ؼ� timesleep�� �ɾ �����ϰ� �̸��� ������ �����
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
