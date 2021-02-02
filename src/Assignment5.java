
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment5
{
	public static int eChecker(String s1, String s2)
	{
		if(s1.contains("e") && !s2.contains("e"))
			return -1;
		else if(!s1.contains("e") && s2.contains("e"))
			return 1;
		else 
			return 0;
	}
	public static void main(String[] args)
	{
		List<String> strings = new ArrayList<>(Arrays.asList(SortDemo.strings));
		Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
		System.out.println(strings);
//		Collections.sort(strings, Assignment5::eChecker);
		Assignment5 obj = new Assignment5();
//		Collections.sort(strings, obj::eChecker);
		System.out.println(strings);
		
		String lengthier = betterString("hi", "Hello", (s1, s2) -> s1.length() > s2.length());
		System.out.println(lengthier);
	}
	
	public static String betterString(String string1, String string2, TwoStringPredicate decide)
	{
		if(decide.isFirstBetterThanSecond(string1, string2))
			return string1;
		else
			return string2;
	}
}
