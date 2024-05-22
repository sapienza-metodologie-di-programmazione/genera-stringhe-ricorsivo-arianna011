# Genera-stringhe ricorsivo

Scrivere un **metodo ricorsivo *genera* ** che, dato in input un
insieme di caratteri e un intero *k*, restituisca l’insieme di tutte le possibili
stringhe di lunghezza *k* contenenti caratteri dall’insieme in input. 

Ad esempio,

```
genera(new HashSet<Character>(Arrays.asList(’a’, ’b’, ’c’)), 2); 
```

restituisce l'insieme 
``{ “aa”, “ab”, “ac”, “ba”, “bb”, “bc”, “ca”, “cb”, “cc”}``


Successivamente, creare una **seconda versione del metodo *genera* ** che prende in input
un terzo parametro di tipo *java.util.function.Predicate*. Essa restituisce l'insieme di tutte le possibili stringhe di lunghezza
*k* contenenti caratteri dall’insieme in input per le quali il metodo *test* del
predicato passato in input restituisce ``true``. 

Ad esempio,

```
genera(new HashSet<Character>(Arrays.asList(’a’, ’b’, ’c’)), 2, s -> s.contains(a));
```

restituisce l'insieme `` { “aa”, “ab”, “ac”, “ba”, “ca” }``