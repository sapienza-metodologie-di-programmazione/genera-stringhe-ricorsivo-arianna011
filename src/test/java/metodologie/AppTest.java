package metodologie;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.TestCase;


public class AppTest extends TestCase
{
	private static final Set<Character> c1 = Set.of('a','b','c');
	private static final Set<String> s1 = Set.of("aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc");
	private static final Set<String> s2 = Set.of("aa", "ab", "ac", "ba", "ca");
	
	private static final Set<Character> c2 = Set.of('x','y');
	private static final Set<String> s3 = Set.of("xx", "xy", "yx", "yy");
	private static final Set<String> s4 = Set.of("xy", "yx");
	
	private static final Set<Character> c3 = Set.of('i');
	private static final Set<String> s5 = Set.of("iiiiii");
	
	private static final Set<String> s6 = Set.of("xxx","xyx", "xxy", "xyy", "yyy", "yxy", "yyx", "yxx");
	
	
	@Test
	public void testGenera0() {
	   assertEquals(App.genera(new HashSet<>(), 5), new HashSet<>());
    }
   
	@Test
	public void testGenera1() {
	   assertEquals(App.genera(c1, 2), s1);
    }
	
	@Test
	public void testGenera2() {
	   assertEquals(App.genera(c1, 2, s -> s.contains("a")), s2);
    }
	
	@Test
	public void testGenera3() {
	   assertEquals(App.genera(c2, 2), s3);
    }
	
	@Test
	public void testGenera4() {
	   assertEquals(App.genera(c2, 2, s -> s.chars().filter(c -> c == 'x').count() == 1), s4);
    }
	
	@Test
	public void testGenera5() {
	   assertEquals(App.genera(c3, 6), s5);
    }
	
	@Test
	public void testGenera6() {
	   assertEquals(App.genera(c3, 6, s -> s.contains("x")), Set.of());
    }
	
	@Test
	public void testGenera7() {
	   assertEquals(App.genera(c2, 3), s6);
    }
	
	
	
}
