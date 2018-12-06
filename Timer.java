
public class Timer {
 public Timer(String string) {
		// TODO Auto-generated constructor stub
	}

public class TimeCounter {
  final Thread thread = new Thread();
   public void main(String args[]) 
		{
			for(int i = 30 ;i>0;i--)
			{
				try {
					thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
	}
}
