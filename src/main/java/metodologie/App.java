package metodologie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Classe contenente il metodo statico ricorsivo "genera"
 */
public class App 
{
	/**
	 * Metodo ricorsivo che, dato in input un insieme di caratteri e un intero k,
	 * restituisce l'insieme di tutte le stringhe di lunghezza k 
	 * che si possono costruire con i caratteri dell'insieme 
	 */
    public static Set<String> genera(Set<Character> chars, int k)
    {
        return genera(chars,k,x -> true);
    }
    
    /**
	 * Metodo ricorsivo che, dato in input un insieme di caratteri, un intero k e un predicato,
	 * restituisce l'insieme di tutte le stringhe di lunghezza k 
	 * che si possono costruire con i caratteri dell'insieme 
	 * e che soddisfano il predicato in input
	 */
    public static Set<String> genera(Set<Character> chars, int k, Predicate<String> pred)
    {
    	Set<String> res = new HashSet<String>();
        
        if (k == 0) { 
        	res.add("");
        	return res;
        }
        
        Set<String> rec = genera(chars, k-1);
        
        for (char c : chars) {
        	res.addAll(rec.stream().map(s -> c + s).filter(pred).collect(Collectors.toList()));
        }
        return res;
    }
    
    public static void main(String[] args) {
    	System.out.println(genera(new HashSet<Character>(Arrays.asList('a', 'b', 'c')), 2));
    	System.out.println(genera(new HashSet<Character>(Arrays.asList('a', 'b', 'c')), 2, s -> s.contains("a")));
	}
}
