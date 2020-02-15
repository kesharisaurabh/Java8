package First_InterfaceJava8;

public class define implements demo1,demo2
{	
	@Override
	public int id() {
		return 2;
	}
	@Override
	public String name() {
		return "saurabh";
	}
	@Override
	public void scl() {
		// TODO Auto-generated method stub
		demo2.super.scl();
	}


}
