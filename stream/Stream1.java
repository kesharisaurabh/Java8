package stream;

import java.util.Arrays;
import java.util.List;

public class Stream1 
{
	public static void main(String[] args) 
	{
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7);
		
		
		System.out.println(ls.stream().map(i ->i*2).reduce(0,(c,e) -> c+e));
	}
}
