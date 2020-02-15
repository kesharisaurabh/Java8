package First_InterfaceJava8;

public interface demo2 
{
	int id();
	String name();
	default void scl()
	{
		System.out.println("V.N.Convent");
	}
}
