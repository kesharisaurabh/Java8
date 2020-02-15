import java.util.Arrays;
import java.util.List;



public class ForEachExample 
{
	public static void main(String[] args) 
	{
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7);
		
		ls.forEach(i ->System.out.println(i));
		
		
		
	}
}
