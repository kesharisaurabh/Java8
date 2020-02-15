package First_InterfaceJava8;

public interface demo1 
{
	int id();
	String name();
	default void scl()
	{
		System.out.println("Christa Jyoti");
	}
}
