// ArrayList
ArrayList<String> arrayList  new ArrayList<>();
arrayList.add("A");
arrayList.add("B");

// LinkedList
LinkedList<Integer> linkedList  new LinkedList<>();
linkedList.add(1);
linkedList.add(2);

// Vector
Vector<Double> vector  new Vector<>();
vector.add(1.1);
vector.add(2.2);

// HashSet
HashSet<String> hashSet  new HashSet<>();
hashSet.add("Hola");
hashSet.add("Mundo");

// LinkedHashSet
LinkedHashSet<Integer> linkedHashSet  new LinkedHashSet<>();
LinkedHashSet.add(10);
LinkedHashSet.add(20);

// TreeSet
TreeSet<String> treeSet = new TreeSet<>();
treeSet.add("Amigo");
treeSet.add("Banana");

//HashMap
HashMap<Integer, String> hashMap  new HashMap<>();
hashMap.put(1, "Uno");
hashMap.put(2, "Dos");

//LinkedHashMap
LinkedHashMap<Integer, String> linkedHashMap  new LinkedHashMap$<>()$;
LinkedHashMap.put(1,
"One");
linkedHashMap.put(2,
"Two");

// TreeMap
TreeMap<String, Integer> treeMap  new TreeMap<>();
treeMap.put("Zoologico", 10);
treeMap.put("Amigo", 20);

// Hashtable
Hashtable<String, String> hashtable
hashtable.put("Clavel", "Valor1");
hashtable.put("Clave2", "Valor2");
new Hashtable<>();

PriorityQueue
PriorityQueue<Integer> priorityQueue new PriorityQueue<>();
priorityQueue.add(3);
priorityQueue.add(1);

LinkedList que implementa Qunue
Queue<String> queue new LinkedList<>();
queue.add("Tarea1");
queue.add("Tarea2");
queue.poll(); // Devuelve el primer valor de la queue y lo elimina
String queuepoll

// ArrayDeque
ArrayDeque<String> arrayDeque = new ArrayDeque<>();
arrayDeque.addFirst(e: "First");
arrayDeque.addLast(e: "Last");

// LinkedList implementa Deque
Deque<Integer> deque  new LinkedList<>();
deque.addFirst(e: 100);
deque.addLast(e: 200);

// Declarar y añadir valores a la coleccion
Collection<String> collection  new ArrayList<>();
collection.add("A");
collection.add("B");

// clear
collection.clear();

// contains
boolean exists
// containsAll
collection.contains("A");
Collection<String> otherCollection
List.of("A", "B");
boolean containsAll  collection.containsAll (otherCollection);

// isEmpty
boolean isEmpty = collection.isEmpty();

iterator
Iterator<String> iterator
while (iterator.hasNext()) {
collection.iterator();
System.out.println(iterator.next());
}

//remove
collection.remove(o: "A");

removeALL
collection.removeAll(otherCollection);

// retainAll
collection.retainAll(List.of(el: "8")); // Crea una lista con el elemento "B"
// para compararlo y mantener los elementos
de esa Lista (que solo contiene B)

//5174
int size collection.size();

//toArray
Object[] array  collection.toArray();
String[] stringArray  collection.toArray(new String[0]);

