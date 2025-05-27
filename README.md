# FUNZIONI STRING

Metodi di String

### .toCharArray()

Scopo: Converte la stringa in un array di caratteri.
Sintassi: char[] chars = myString.toCharArray();
Restituisce: Un nuovo array char[] contenente i caratteri della stringa.

### .split(String regex)

Scopo: Divide la stringa in un array di sottostringhe usando un delimitatore (RegEx).
Sintassi: String[] parts = myString.split(delimiterRegex);
Restituisce: Un String[] contenente le sottostringhe. Le stringhe vuote finali sono ignorate.

### .split(String regex, int limit)

Scopo: Divide la stringa in un array di sottostringhe, con un limite al numero di parti.
Sintassi: String[] parts = myString.split(delimiterRegex, limit);
Restituisce: Un String[]. limit > 0 limita il numero di parti; limit < 0 include tutte le stringhe vuote.

### String.join(CharSequence delimiter, CharSequence... elements)

Scopo: Unisce una sequenza di stringhe (o CharSequence) in una singola stringa usando un delimitatore. (Metodo statico).
Sintassi: String result = String.join(delimiter, str1, str2, ...);
Restituisce: Una nuova stringa risultante dalla concatenazione.

### String.join(CharSequence delimiter, Iterable<? extends CharSequence> elements)

Scopo: Unisce gli elementi di un Iterable di stringhe (o CharSequence) in una singola stringa usando un delimitatore. (Metodo statico).
Sintassi: String result = String.join(delimiter, listOfStrings);
Restituisce: Una nuova stringa risultante dalla concatenazione.

### .length()

Scopo: Restituisce la lunghezza (numero di caratteri) della stringa.
Sintassi: int len = myString.length();
Restituisce: Un int rappresentante la lunghezza.

### .charAt(int index)

Scopo: Restituisce il carattere all'indice specificato.
Sintassi: char c = myString.charAt(index);
Restituisce: Il char alla posizione index. (Ricorda: il primo carattere è all'indice 0).

### .contains(CharSequence s)

Scopo: Verifica se la stringa contiene la sequenza di caratteri specificata.
Sintassi: boolean hasSequence = myString.contains(otherString);
Restituisce: true se la sequenza è presente, false altrimenti.

### .startsWith(String prefix)

Scopo: Verifica se la stringa inizia con il prefisso specificato.
Sintassi: boolean starts = myString.startsWith(prefix);
Restituisce: true se la stringa inizia con prefix, false altrimenti.

### .endsWith(String suffix)

Scopo: Verifica se la stringa termina con il suffisso specificato.
Sintassi: boolean ends = myString.endsWith(suffix);
Restituisce: true se la stringa termina con suffix, false altrimenti.

### .equals(Object anObject)

Scopo: Confronta se il contenuto di due stringhe è uguale (sensibile alle maiuscole/minuscole).
Sintassi: boolean areEqual = myString.equals(anotherString);
Restituisce: true se il contenuto è identico, false altrimenti.

### .equalsIgnoreCase(String anotherString)

Scopo: Confronta se il contenuto di due stringhe è uguale (ignorando maiuscole/minuscole).
Sintassi: boolean areEqual = myString.equalsIgnoreCase(anotherString);
Restituisce: true se il contenuto è identico ignorando il case, false altrimenti.

### .indexOf(int ch) / .indexOf(String str)

Scopo: Restituisce l'indice della prima occorrenza del carattere (ch) o della sottostringa (str) specificata.
Sintassi: int index = myString.indexOf('c'); / int index = myString.indexOf("sub");
Restituisce: L'indice della prima occorrenza, o -1 se non trovato.

### .lastIndexOf(int ch) / .lastIndexOf(String str)

Scopo: Restituisce l'indice dell'ultima occorrenza del carattere (ch) o della sottostringa (str) specificata.
Sintassi: int index = myString.lastIndexOf('c'); / int index = myString.lastIndexOf("sub");
Restituisce: L'indice dell'ultima occorrenza, o -1 se non trovato.

### .substring(int beginIndex)

Scopo: Estrae una sottostringa da un indice iniziale fino alla fine della stringa.
Sintassi: String sub = myString.substring(beginIndex);
Restituisce: Una nuova stringa contenente la sottostringa.

### .substring(int beginIndex, int endIndex)

Scopo: Estrae una sottostringa da un indice iniziale (incluso) a un indice finale (escluso).
Sintassi: String sub = myString.substring(beginIndex, endIndex);
Restituisce: Una nuova stringa contenente la sottostringa.

### .toLowerCase()

Scopo: Converte tutti i caratteri della stringa in minuscolo.
Sintassi: String lower = myString.toLowerCase();
Restituisce: Una nuova stringa in minuscolo.

### .toUpperCase()

Scopo: Converte tutti i caratteri della stringa in maiuscolo.
Sintassi: String upper = myString.toUpperCase();
Restituisce: Una nuova stringa in maiuscolo.

### .trim()

Scopo: Rimuove gli spazi bianchi (whitespace) all'inizio e alla fine della stringa.
Sintassi: String trimmed = myString.trim();
Restituisce: Una nuova stringa senza spazi bianchi iniziali/finali.

### .replace(char oldChar, char newChar)

Scopo: Sostituisce tutte le occorrenze di un carattere con un altro.
Sintassi: String replaced = myString.replace('a', 'b');
Restituisce: Una nuova stringa con le sostituzioni.

### .replace(CharSequence target, CharSequence replacement)

Scopo: Sostituisce tutte le occorrenze di una sequenza di caratteri con un'altra sequenza.
Sintassi: String replaced = myString.replace("old", "new");
Restituisce: Una nuova stringa con le sostituzioni.

### .replaceAll(String regex, String replacement)

Scopo: Sostituisce tutte le sottostringhe che corrispondono a una RegEx con una stringa di sostituzione.
Sintassi: String replaced = myString.replaceAll("\\s+", "\_");
Restituisce: Una nuova stringa con le sostituzioni basate su RegEx.

### .replaceFirst(String regex, String replacement)

Scopo: Sostituisce solo la prima sottostringa che corrisponde a una RegEx con una stringa di sostituzione.
Sintassi: String replaced = myString.replaceFirst("a", "X");
Restituisce: Una nuova stringa con la prima sostituzione basata su RegEx.

### .matches(String regex)

Scopo: Verifica se l'intera stringa corrisponde all'espressione regolare data.
Sintassi: boolean isMatch = myString.matches("pattern");
Restituisce: true se l'intera stringa corrisponde al pattern, false altrimenti.

# I CICLI IN JAVA

### finche è true esegui il "corpo" del ciclo

## IL CICLO WHILE (FINCHE)

Statemant:
while(predicate){
blocco di codice che si esegue finche la condizione del while non diventa falsa
o si incontra un breack
}
ES:
int num = 1
while(nume < 5){
system.out.println(num);
num ++
}

## breack e continue

ES ciclo infinito, breack:
Scanner scanner = new Scanner(System.in)
while(true){
sys.out.print("ciclo in corso");
sys.out.print("vuoi uscire?");
String uscita = scanner.nextline();
if(uscita.toLowerCase().equals("si")){
breack;
}
}
ES ciclo con continue:
int num = 0;
while(num<10){
num++;
if(num==5){
continue;
}
sys.out.print(num);
}

# Ciclo For

## viene utilizzato per eseguire un blocco di codice per un numero "prestabilito" di volte

for(int i=0; i<array.length; i++){
//stampa elementi di un array
sys.out.print(array[i]);
}

# Gli Array

//dichiarazione inizializzazione
int[] numeri = new int[5];
int[0]=5;
int[1]=7;

---

int[] numeri ={1,2,3,4,5};
sys.out.print(numeri[0]); //1

## funzione fondamentale per iterare gli array .length()

numeri.length() //5

## esempio ciclo for

for(int i = 0; i<numeri.length; i++){
sys.out.print(numeri[i]);
}

## esempio ciclo for - each

for(int numero : numeri)[
sys.out.print(numero);
]

## gli array multidimensionali

## int[][] matrice = new int[5][5];

int[][] matrice = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

## esempio stampa matrice già inizializzata

for(int i=0;i<matrice.legth;i++){
for(int j=0; j<matrice[i].legth; j++)
sys.out.print(matrice[i][j]);
}

## esempio generare e stampare una matrice

public static void main(String[] args) throws Exception {
int[][] matrice = new int[5][5];

        int contatore = 1; // Variabile per tenere traccia del numero corrente da inserire

        // Ciclo esterno per le righe
        for (int riga = 0; riga < matrice.length; riga++) {
            // Ciclo interno per le colonne
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                // Assegna il valore corrente del contatore all'elemento della matrice
                matrice[riga][colonna] = contatore;
                // Incrementa il contatore per il prossimo elemento
                contatore++;
            }
        }

        // Ora stampiamo la matrice per verificare che sia stata riempita correttamente
        System.out.println("Matrice con numeri progressivi:");
        for (int riga = 0; riga < matrice.length; riga++) {
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                // Usiamo System.out.printf per formattare l'output e allineare i numeri
                // "%4d" significa un intero con almeno 4 caratteri, riempito con spazi a
                // sinistra
                System.out.printf("%4d", matrice[riga][colonna]);
            }
            System.out.println(); // Nuova riga dopo ogni riga della matrice
        }
    }

# ArrayList

## Java collection framework

### Iterable->{Set,List,Queue}

.iterator() --> Restituisce un oggetto Iterator per scorrere gli elementi.
.forEach(action) (Java 8+) --> Esegue un'azione specificata per ogni elemento (metodo default).
.spliterator() (Java 8+) --> Crea uno Spliterator per l'iterazione parallela (metodo default).

### Collection<E>

.add(el) --> Aggiunge l'elemento el alla collezione. Restituisce true se la collezione è stata modificata.
Nota: Per Set, aggiunge solo se l'elemento non è già presente.
.remove(el) --> Rimuove una singola occorrenza dell'elemento el dalla collezione. Restituisce true se rimosso.
.addAll(collection) --> Aggiunge tutti gli elementi della collection specificata a questa collezione.
.removeAll(collection) --> Rimuove da questa collezione tutti gli elementi che sono anche nella collection specificata.
.retainAll(collection) --> Rimuove da questa collezione tutti gli elementi non contenuti nella collection specificata (intersezione).
.clear() --> Rimuove tutti gli elementi dalla collezione, rendendola vuota.
.size() --> Restituisce il numero di elementi nella collezione.
.isEmpty() --> Restituisce true se la collezione non contiene elementi.
.contains(el) --> Restituisce true se la collezione contiene l'elemento el.
.containsAll(collection) --> Restituisce true se la collezione contiene tutti gli elementi della collection specificata.
.toArray() --> Converte la collezione in un array di Object.
.toArray(T[] a) --> Converte la collezione in un array del tipo specificato.

### List<E>

.add(idx, el) --> Inserisce l'elemento el nella posizione idx specificata.
.get(idx) --> Restituisce l'elemento nella posizione idx specificata.
.set(idx, el) --> Sostituisce l'elemento nella posizione idx con l'elemento el specificato.
.remove(idx) --> Rimuove l'elemento nella posizione idx specificata.
.addAll(idx, collection) --> Inserisce tutti gli elementi della collection specificata a partire dalla posizione idx.
.indexOf(el) --> Restituisce l'indice della prima occorrenza dell'elemento el, o -1 se non trovato.
.lastIndexOf(el) --> Restituisce l'indice dell'ultima occorrenza dell'elemento el, o -1 se non trovato.
.listIterator() --> Restituisce un ListIterator (permette di iterare avanti/indietro, aggiungere, modificare).
.listIterator(idx) --> Restituisce un ListIterator che inizia dalla posizione idx.
.subList(fromIdx, toIdx) --> Restituisce una "vista" (sotto-lista) della porzione specificata della lista.

### Ok, ho capito! Userò lo stile di scrittura che hai mostrato, raggruppando i metodi per le interfacce e aggiungendo le note e i chiarimenti necessari.

Iterable<E>
L'interfaccia Iterable<E> è la radice per la capacità di scorrere gli elementi (usando il for-each loop).

.iterator() --> Restituisce un oggetto Iterator per scorrere gli elementi.
.forEach(action) (Java 8+) --> Esegue un'azione specificata per ogni elemento (metodo default).
.spliterator() (Java 8+) --> Crea uno Spliterator per l'iterazione parallela (metodo default).
Collection<E>
L'interfaccia Collection<E> estende Iterable<E> e definisce le operazioni fondamentali comuni a quasi tutte le collezioni.

.add(el) --> Aggiunge l'elemento el alla collezione. Restituisce true se la collezione è stata modificata.
Nota: Per Set, aggiunge solo se l'elemento non è già presente.
.remove(el) --> Rimuove una singola occorrenza dell'elemento el dalla collezione. Restituisce true se rimosso.
.addAll(collection) --> Aggiunge tutti gli elementi della collection specificata a questa collezione.
.removeAll(collection) --> Rimuove da questa collezione tutti gli elementi che sono anche nella collection specificata.
.retainAll(collection) --> Rimuove da questa collezione tutti gli elementi non contenuti nella collection specificata (intersezione).
.clear() --> Rimuove tutti gli elementi dalla collezione, rendendola vuota.
.size() --> Restituisce il numero di elementi nella collezione.
.isEmpty() --> Restituisce true se la collezione non contiene elementi.
.contains(el) --> Restituisce true se la collezione contiene l'elemento el.
.containsAll(collection) --> Restituisce true se la collezione contiene tutti gli elementi della collection specificata.
.toArray() --> Converte la collezione in un array di Object.
.toArray(T[] a) --> Converte la collezione in un array del tipo specificato.
List<E>
L'interfaccia List<E> estende Collection<E> e rappresenta una sequenza ordinata di elementi. Permette duplicati e accesso tramite indice.

Metodi ereditati da Collection (e Iterable) +:
.add(idx, el) --> Inserisce l'elemento el nella posizione idx specificata.
.get(idx) --> Restituisce l'elemento nella posizione idx specificata.
.set(idx, el) --> Sostituisce l'elemento nella posizione idx con l'elemento el specificato.
.remove(idx) --> Rimuove l'elemento nella posizione idx specificata.
.addAll(idx, collection) --> Inserisce tutti gli elementi della collection specificata a partire dalla posizione idx.
.indexOf(el) --> Restituisce l'indice della prima occorrenza dell'elemento el, o -1 se non trovato.
.lastIndexOf(el) --> Restituisce l'indice dell'ultima occorrenza dell'elemento el, o -1 se non trovato.
.listIterator() --> Restituisce un ListIterator (permette di iterare avanti/indietro, aggiungere, modificare).
.listIterator(idx) --> Restituisce un ListIterator che inizia dalla posizione idx.
.subList(fromIdx, toIdx) --> Restituisce una "vista" (sotto-lista) della porzione specificata della lista.

### Ok, ho capito! Userò lo stile di scrittura che hai mostrato, raggruppando i metodi per le interfacce e aggiungendo le note e i chiarimenti necessari.

Iterable<E>
L'interfaccia Iterable<E> è la radice per la capacità di scorrere gli elementi (usando il for-each loop).

.iterator() --> Restituisce un oggetto Iterator per scorrere gli elementi.
.forEach(action) (Java 8+) --> Esegue un'azione specificata per ogni elemento (metodo default).
.spliterator() (Java 8+) --> Crea uno Spliterator per l'iterazione parallela (metodo default).
Collection<E>
L'interfaccia Collection<E> estende Iterable<E> e definisce le operazioni fondamentali comuni a quasi tutte le collezioni.

.add(el) --> Aggiunge l'elemento el alla collezione. Restituisce true se la collezione è stata modificata.
Nota: Per Set, aggiunge solo se l'elemento non è già presente.
.remove(el) --> Rimuove una singola occorrenza dell'elemento el dalla collezione. Restituisce true se rimosso.
.addAll(collection) --> Aggiunge tutti gli elementi della collection specificata a questa collezione.
.removeAll(collection) --> Rimuove da questa collezione tutti gli elementi che sono anche nella collection specificata.
.retainAll(collection) --> Rimuove da questa collezione tutti gli elementi non contenuti nella collection specificata (intersezione).
.clear() --> Rimuove tutti gli elementi dalla collezione, rendendola vuota.
.size() --> Restituisce il numero di elementi nella collezione.
.isEmpty() --> Restituisce true se la collezione non contiene elementi.
.contains(el) --> Restituisce true se la collezione contiene l'elemento el.
.containsAll(collection) --> Restituisce true se la collezione contiene tutti gli elementi della collection specificata.
.toArray() --> Converte la collezione in un array di Object.
.toArray(T[] a) --> Converte la collezione in un array del tipo specificato.
List<E>
L'interfaccia List<E> estende Collection<E> e rappresenta una sequenza ordinata di elementi. Permette duplicati e accesso tramite indice.

Metodi ereditati da Collection (e Iterable) +:
.add(idx, el) --> Inserisce l'elemento el nella posizione idx specificata.
.get(idx) --> Restituisce l'elemento nella posizione idx specificata.
.set(idx, el) --> Sostituisce l'elemento nella posizione idx con l'elemento el specificato.
.remove(idx) --> Rimuove l'elemento nella posizione idx specificata.
.addAll(idx, collection) --> Inserisce tutti gli elementi della collection specificata a partire dalla posizione idx.
.indexOf(el) --> Restituisce l'indice della prima occorrenza dell'elemento el, o -1 se non trovato.
.lastIndexOf(el) --> Restituisce l'indice dell'ultima occorrenza dell'elemento el, o -1 se non trovato.
.listIterator() --> Restituisce un ListIterator (permette di iterare avanti/indietro, aggiungere, modificare).
.listIterator(idx) --> Restituisce un ListIterator che inizia dalla posizione idx.
.subList(fromIdx, toIdx) --> Restituisce una "vista" (sotto-lista) della porzione specificata della lista.

### Ok, ho capito! Userò lo stile di scrittura che hai mostrato, raggruppando i metodi per le interfacce e aggiungendo le note e i chiarimenti necessari.

### Iterable<E>

L'interfaccia Iterable<E> è la radice per la capacità di scorrere gli elementi (usando il for-each loop).

.iterator() --> Restituisce un oggetto Iterator per scorrere gli elementi.
.forEach(action) (Java 8+) --> Esegue un'azione specificata per ogni elemento (metodo default).
.spliterator() (Java 8+) --> Crea uno Spliterator per l'iterazione parallela (metodo default).

### Collection<E>

L'interfaccia Collection<E> estende Iterable<E> e definisce le operazioni fondamentali comuni a quasi tutte le collezioni.

.add(el) --> Aggiunge l'elemento el alla collezione. Restituisce true se la collezione è stata modificata.
Nota: Per Set, aggiunge solo se l'elemento non è già presente.
.remove(el) --> Rimuove una singola occorrenza dell'elemento el dalla collezione. Restituisce true se rimosso.
.addAll(collection) --> Aggiunge tutti gli elementi della collection specificata a questa collezione.
.removeAll(collection) --> Rimuove da questa collezione tutti gli elementi che sono anche nella collection specificata.
.retainAll(collection) --> Rimuove da questa collezione tutti gli elementi non contenuti nella collection specificata (intersezione).
.clear() --> Rimuove tutti gli elementi dalla collezione, rendendola vuota.
.size() --> Restituisce il numero di elementi nella collezione.
.isEmpty() --> Restituisce true se la collezione non contiene elementi.
.contains(el) --> Restituisce true se la collezione contiene l'elemento el.
.containsAll(collection) --> Restituisce true se la collezione contiene tutti gli elementi della collection specificata.
.toArray() --> Converte la collezione in un array di Object.
.toArray(T[] a) --> Converte la collezione in un array del tipo specificato.

### List<E>

L'interfaccia List<E> estende Collection<E> e rappresenta una sequenza ordinata di elementi. Permette duplicati e accesso tramite indice.

Metodi ereditati da Collection (e Iterable) +:
.add(idx, el) --> Inserisce l'elemento el nella posizione idx specificata.
.get(idx) --> Restituisce l'elemento nella posizione idx specificata.
.set(idx, el) --> Sostituisce l'elemento nella posizione idx con l'elemento el specificato.
.remove(idx) --> Rimuove l'elemento nella posizione idx specificata.
.addAll(idx, collection) --> Inserisce tutti gli elementi della collection specificata a partire dalla posizione idx.
.indexOf(el) --> Restituisce l'indice della prima occorrenza dell'elemento el, o -1 se non trovato.
.lastIndexOf(el) --> Restituisce l'indice dell'ultima occorrenza dell'elemento el, o -1 se non trovato.
.listIterator() --> Restituisce un ListIterator (permette di iterare avanti/indietro, aggiungere, modificare).
.listIterator(idx) --> Restituisce un ListIterator che inizia dalla posizione idx.
.subList(fromIdx, toIdx) --> Restituisce una "vista" (sotto-lista) della porzione specificata della lista.

### Set<E>

L'interfaccia Set<E> estende Collection<E> e rappresenta una collezione che non contiene elementi duplicati. L'ordine non è generalmente garantito.

.add(el): Restituisce true solo se l'elemento el è stato effettivamente aggiunto (cioè, non era già presente nel Set).

### Queue<E>

L'interfaccia Queue<E> estende Collection<E> e rappresenta una collezione progettata per contenere elementi prima dell'elaborazione (spesso FIFO).

.offer(el) --> Inserisce l'elemento el se possibile. Restituisce true in caso di successo, false se la coda è piena. (Preferito ad add() per code con capacità limitata).
Metodi di Rimozione (dalla testa):
.poll() --> Recupera e rimuove la testa della coda. Restituisce null se la coda è vuota. (Preferito a remove()).
.remove() --> Recupera e rimuove la testa della coda. Lancia NoSuchElementException se la coda è vuota.
Metodi di Esame (della testa senza rimozione):
.peek() --> Recupera, ma non rimuove, la testa della coda. Restituisce null se la coda è vuota. (Preferito a element()).
.element() --> Recupera, ma non rimuove, la testa della coda. Lancia NoSuchElementException se la coda è vuota.

## Classi concrete

### List->{ArrayList,LikedList,Vector,Stack}

### Set->{HashSet,LikedHashSet,TreeSet}

## ArrayList

Descrizione: Implementazione basata su un array dinamico (ridimensionabile). Ottima per l'accesso casuale (random access) agli elementi tramite indice (get(idx)), che è un'operazione molto veloce (O(1)). Le aggiunte/rimozioni alla fine della lista sono veloci (O(1) ammortizzato). Le aggiunte/rimozioni al centro della lista sono lente (O(n)) perché richiedono lo spostamento di molti elementi.
Thread-Safety: Non thread-safe.
Uso Tipico: Quando hai bisogno di accedere spesso agli elementi tramite indice o quando la maggior parte delle operazioni sono aggiunte/rimozioni in coda.

## LinkedList

Descrizione: Implementazione basata su una lista doppiamente concatenata. Ottima per le aggiunte e rimozioni all'inizio o alla fine della lista (O(1)). Le aggiunte/rimozioni al centro sono relativamente veloci una volta trovato l'elemento (O(1)), ma trovare l'elemento richiede uno scorrimento (O(n)). L'accesso casuale tramite indice (get(idx)) è lento (O(n)) perché richiede di attraversare la lista dall'inizio o dalla fine.
Thread-Safety: Non thread-safe.
Uso Tipico: Quando hai bisogno di frequenti inserimenti e rimozioni all'inizio/fine della lista, o quando si itera sequenzialmente sulla lista. Implementa anche l'interfaccia Deque, rendendola utile per code e stack.

## Vector

Descrizione: Simile a ArrayList (anche basato su un array dinamico), ma è sincronizzato (thread-safe). Questo significa che i suoi metodi sono protetti da un lock, rendendolo sicuro per l'uso in ambienti multi-threaded, ma a scapito delle performance (è più lento di ArrayList in ambienti single-threaded).
Thread-Safety: Sì, è thread-safe (sincronizzato).
Uso Tipico: In casi rari dove è richiesta la thread-safety intrinseca e l'overhead delle performance è accettabile. Nella maggior parte dei casi, è preferibile ArrayList con sincronizzazione esterna (es. Collections.synchronizedList) o l'uso di collezioni concorrenti (es. CopyOnWriteArrayList).

## Stack

Descrizione: Rappresenta una struttura dati LIFO (Last-In, First-Out), implementando una pila. Estende Vector, il che significa che è anch'esso basato su array dinamico e sincronizzato, ma con metodi specifici per le operazioni di pila.
Thread-Safety: Sì, è thread-safe (sincronizzato, ereditato da Vector).
Uso Tipico: Quando si ha bisogno di una struttura dati che segua la logica LIFO (es. gestione di chiamate di funzione, parsing di espressioni). Nota: Per stack moderni e più performanti, è generalmente preferibile usare Deque (interfaccia) implementata da ArrayDeque o LinkedList.
Set -> {HashSet, LinkedHashSet, TreeSet}
Queste classi implementano l'interfaccia Set, il che significa che garantiscono l'unicità degli elementi (non contengono duplicati).

## HashSet

Descrizione: Implementazione basata su una tabella hash. Offre prestazioni molto elevate (O(1) in media) per le operazioni di aggiunta, rimozione e ricerca (add, remove, contains), a condizione che la funzione hashCode() degli oggetti sia ben implementata. Non garantisce alcun ordine degli elementi.
Thread-Safety: Non thread-safe.
Uso Tipico: Quando l'obiettivo principale è l'unicità degli elementi e le prestazioni per le operazioni di base, e l'ordine non è importante.

## LinkedHashSet

Descrizione: Estende HashSet e implementa una lista concatenata degli elementi, mantenendo l'ordine di inserimento. Offre prestazioni simili a HashSet per le operazioni di base (O(1) in media), ma con un leggero overhead dovuto al mantenimento dell'ordine.
Thread-Safety: Non thread-safe.
Uso Tipico: Quando l'unicità è richiesta e vuoi mantenere l'ordine in cui gli elementi sono stati aggiunti.

## TreeSet

Descrizione: Implementazione basata su un albero binario di ricerca (Red-Black tree). Gli elementi sono memorizzati in un ordine naturale crescente (se implementano Comparable) o secondo un Comparator fornito al costruttore. Le operazioni di aggiunta, rimozione e ricerca hanno una complessità di O(logn). Fornisce metodi per accedere agli elementi in base all'ordine (es. first(), last(), headSet()).
Thread-Safety: Non thread-safe.
Uso Tipico: Quando l'unicità è richiesta e hai bisogno che gli elementi siano mantenuti in un ordine specifico (ordinati).

# Map

## Map<K, V>

L'interfaccia Map<K, V> (Mappa) è una parte fondamentale del framework delle collezioni di Java, ma non estende l'interfaccia Collection. Questo perché una Map non è una collezione di singoli elementi, ma piuttosto una collezione di coppie chiave-valore (key-value pairs). Ogni chiave (K) è unica, e ad ogni chiave è associato un singolo valore (V).

### Caratteristiche Principali di Map:

Coppie Chiave-Valore: Memorizza i dati come associazioni (mappature) tra chiavi e valori.
Chiavi Uniche: Ogni chiave in una Map è unica. Se tenti di aggiungere una coppia chiave-valore con una chiave già esistente, il vecchio valore associato a quella chiave viene sovrascritto.
Nessun Ordine Garantito (di base): Le implementazioni di Map non garantiscono un ordine specifico delle coppie chiave-valore quando vengono iterate (a meno che non si usino implementazioni specifiche come LinkedHashMap o TreeMap).

### Metodi Comuni di Map:

.put(K key, V value): Associa il value specificato alla key specificata in questa mappa. Se la mappa conteneva già una mappatura per la chiave, il vecchio valore viene sostituito. Restituisce il valore precedentemente associato alla chiave, o null se la chiave non era presente.
.get(Object key): Restituisce il valore a cui è mappata la key specificata, o null se la mappa non contiene una mappatura per la chiave.
.remove(Object key): Rimuove la mappatura per la key specificata da questa mappa, se presente. Restituisce il valore precedentemente associato alla chiave, o null se la chiave non era presente.
.containsKey(Object key): Restituisce true se questa mappa contiene una mappatura per la key specificata.
.containsValue(Object value): Restituisce true se questa mappa mappa una o più chiavi al value specificato.
.size(): Restituisce il numero di mappature chiave-valore in questa mappa.
.isEmpty(): Restituisce true se questa mappa non contiene mappature chiave-valore.
.clear(): Rimuove tutte le mappature da questa mappa.
.keySet(): Restituisce una Set di tutte le chiavi contenute in questa mappa.
.values(): Restituisce una Collection di tutti i valori contenuti in questa mappa.
.entrySet(): Restituisce una Set di Map.Entry<K, V> (coppie chiave-valore) contenute in questa mappa. Questo è il metodo più comune e efficiente per iterare su una Map.

## HashMap<K, V>

HashMap è l'implementazione più utilizzata dell'interfaccia Map. È basata sulla tabella hash, proprio come HashSet (infatti, HashSet è implementata usando internamente una HashMap).

### Caratteristiche di HashMap:

Prestazioni Elevate: Offre prestazioni di tempo costante (O(1) in media) per le operazioni di base come get e put, a condizione che le funzioni hashCode() e equals() delle chiavi siano implementate correttamente.
Nessun Ordine Garantito: HashMap non garantisce alcun ordine di iterazione delle sue coppie chiave-valore. L'ordine può anche cambiare nel tempo.
Consente null: Può contenere una singola chiave null e più valori null.
Non Thread-Safe: Non è sincronizzata. Se utilizzata in un ambiente multi-threaded senza sincronizzazione esterna, può portare a comportamenti imprevedibili e non deterministici. Per ambienti multi-threaded, si può usare ConcurrentHashMap o Collections.synchronizedMap().
Uso Tipico: HashMap è la scelta predefinita quando hai bisogno di memorizzare dati come coppie chiave-valore e le prestazioni sono una priorità, e l'ordine degli elementi non è rilevante.

### Esempio di Ciclo per Map (HashMap)

Esistono diversi modi per iterare su una Map, ma il più efficiente e comune è usare il metodo .entrySet().

Java

import java.util.HashMap;
import java.util.Map; // Importa l'interfaccia Map

public class MapIterationExample {
public static void main(String[] args) {
// 1. Creazione di una HashMap
Map<String, Integer> etaStudenti = new HashMap<>();

        // 2. Aggiunta di elementi alla HashMap
        etaStudenti.put("Alice", 20);
        etaStudenti.put("Bob", 22);
        etaStudenti.put("Charlie", 19);
        etaStudenti.put("David", 20); // Notare che Alice e David hanno la stessa età, va bene per i valori
        etaStudenti.put("Alice", 21); // Questo sovrascriverà l'età di Alice da 20 a 21

        System.out.println("Mappa originale: " + etaStudenti);
        System.out.println("Età di Bob: " + etaStudenti.get("Bob"));
        System.out.println("La mappa contiene Charlie? " + etaStudenti.containsKey("Charlie"));
        System.out.println("La mappa contiene l'età 22? " + etaStudenti.containsValue(22));

        System.out.println("\n--- Iterazione sulla Map (metodo consigliato) ---");
        // Iterazione usando entrySet() con il ciclo for-each
        // Questo è il modo più efficiente perché accedi direttamente a chiave e valore
       ### for (Map.Entry<String, Integer> entry : etaStudenti.entrySet()) {
       ###     String nome = entry.getKey();
       ###     Integer eta = entry.getValue();
       ###     System.out.println(nome + " ha " + eta + " anni.");
       ### }
       ###

        System.out.println("\n--- Iterazione sulle sole chiavi ---");
        // Iterazione solo sulle chiavi usando keySet()
        // Poi recuperiamo il valore per ogni chiave (potrebbe essere meno efficiente)
        for (String nome : etaStudenti.keySet()) {
            Integer eta = etaStudenti.get(nome); // Recupera il valore usando la chiave
            System.out.println("Nome: " + nome + ", Età: " + eta);
        }

        System.out.println("\n--- Iterazione sui soli valori ---");
        // Iterazione solo sui valori usando values()
        // Questo è utile se ti interessano solo i valori
        for (Integer eta : etaStudenti.values()) {
            System.out.println("Un'età presente: " + eta);
        }

        // Rimozione di un elemento
        etaStudenti.remove("David");
        System.out.println("\nMappa dopo la rimozione di David: " + etaStudenti);

        // Pulizia della mappa
        etaStudenti.clear();
        System.out.println("Mappa dopo clear(): " + etaStudenti);
        System.out.println("La mappa è vuota? " + etaStudenti.isEmpty());
    }

}
Spiegazione dell'iterazione con entrySet():

etaStudenti.entrySet(): Questo metodo restituisce una Set di oggetti Map.Entry<String, Integer>. Un Map.Entry è un'interfaccia interna che rappresenta una singola coppia chiave-valore.
for (Map.Entry<String, Integer> entry : etaStudenti.entrySet()): Il ciclo for-each itera su ogni Map.Entry nella Set restituita.
entry.getKey(): All'interno del ciclo, puoi usare questo metodo per ottenere la chiave dell'elemento corrente.
entry.getValue(): E questo metodo per ottenere il valore associato alla chiave corrente.

## LE MAP<KEY,VALUE> ARRAY CHIAVE VALORE

Map<String,String> prof = new HashMap<String,String>();
prof.put("nome","Tommaso");
prof.put("cognome","Muraca");
prof.put("via","Via Roma");

prof.get("via");
prof.get("cognome");
prof.get("nome");

# FUNZIONE E METODI

sono blocchi di codice riutilizabili che POSSONO restituire un determinato tipo di valore

### es return String type

String Saluta(String nome//parametro){
String saluta = ciao + " sono " + nome "
return saluta;
}

### es void function

void sonoVoid(){
sys.out.print("ciao sono void");
}

# Override di un metodo

in Java possiamo creare più metodi con lo stesso nome a patto che si differenzino per tipo di dato restituito
o numero parametri che servono per accedere al metodo
