package p2utils;

public class LinkedList<E> {

  private Node<E> first = null;
  private Node<E> last = null;
  private int size = 0;

  /** {@code LinkedList} constructor, empty so far.
   */
  public LinkedList() { }

  /** Returns the number of elements in the list.
   * @return Number of elements in the list
   */
  public int size() { return size; }

  /** Checks if the list is empty.
   * @return  {@code true} if list empty, otherwise {@code false}.
   */
  public boolean isEmpty() { return size == 0; }

  /** Returns the first element in the list.
   * @return  First element in the list
   */
  public E first() {
    assert !isEmpty(): "empty!";

    return first.elem;
  }

  /** Returns the last element in the list.
   * @return Last element in the list
   */
  public E last() {
    assert !isEmpty(): "empty!";

    return last.elem;
  }

  /** Adds the given element to the start of the list.
   * @param e the element to add
   */
  public void addFirst(E e) {
    first = new Node<>(e, first);
    if (isEmpty())
      last = first;
    size++;

    assert !isEmpty(): "empty!";
    assert first().equals(e) : "wrong element";
  }

  /** Adds the given element to the end of the list.
   * @param e the element to add
   */
  public void addLast(E e) {
    Node<E> newest = new Node<>(e);
    if (isEmpty())
      first = newest;
    else
      last.next = newest;
    last = newest;
    size++;

    assert !isEmpty(): "empty!";
    assert last().equals(e) : "wrong element";
  }

  /** Removes the first element in the list.
   */
  public void removeFirst() {
    assert !isEmpty(): "empty!";
    first = first.next;
    size--;
    if (isEmpty())
      last = null;
  }

  /** Removes all elements.
   */
  public void clear() {
    first = last = null;
    size = 0;
  }

  /** Returns a string representing the list contents.
   * @return A string representing the list contents
   */
  public String toString() {
    String sep = "";
    String s = "";
    for (Node<E> n = first; n != null; n = n.next) {
      s += sep + n.elem;
      sep = ", ";
    }
    return "[" + s + "]";
  }

  public int count(E number) {
	  int times = 0;
	  Node<E> temporary = first;
	  
	  for (int i = 0; i < size(); i++) {
		  if (temporary.elem == number) times += 1;
		  temporary = temporary.next;
	  }
	  return times;
  }
  
  public LinkedList<E> cloneReplace(E substituir, E substituto) {
	  return cloneReplace(substituir, substituto, first);
  }

  private LinkedList<E> cloneReplace(E substituir, E substituto, Node<E> n) {
	  if (n == null) return new LinkedList<E>();
	  LinkedList<E> lst = cloneReplace(substituir, substituto, n.next);
	  if (n.elem.equals(substituir)) lst.addFirst(substituto);
	  else lst.addFirst(n.elem);
	  return lst;
  }
  
  public int indexOf(E e) {
	  return indexOf(e, first, 0);
  }
  
  private int indexOf(E e, Node<E> n, int index) {
	  if (n == null) return -1;
	  if (e.equals(n.elem)) {
		  return index;
	  }
	  return indexOf(e, n.next, index + 1);
  }
}

