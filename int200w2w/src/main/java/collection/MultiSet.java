package collection;

import java.util.TreeMap;

/*
MultiSet looks like a Set but it allows duplication.
It counts the number of copies of each element.
*/
public class MultiSet<E> {
   private final TreeMap<E,Integer> bag = new TreeMap<>();

   /*
   1.return -1 if e is null.
   2.add one copy of e into the multiset 
     and return the number of copies of e including the recently added copy.
    */
   public int add(E e) {
      if (e == null) return -1;
      
      // Approach 1: --------------------
      var i = bag.get(e);
      if (i == null) i = 0;
      // Approach 2: --------------------
      // var i = bag.getOrDefault(e, 0);
      // --------------------------------
      
      bag.put(e, ++i);
      return i;
   }

   /*
   1.return -1 if e is null.
   2.return the number of copies of e. (return 0 if no e)
   */
   public int get(E e) {
      // Approach 1: ---------------------
      if (e == null) return -1;
      return bag.getOrDefault(e,0);
      // Approach 2: ---------------------
      // return e == null ? -1 : bag.getOrDefault(e,0);
      // ---------------------------------
   }

   /*
   1.return -1 if e is null.
   2.remove one copies of e from the multiset 
     and return the remaining number of copies of e.
   2.1 if no e in the mutiset, return -1.
   2.2 if there is only copy of e, remove that entry of the bag.
   */
   public int remove(E e) {
      if (e == null) return -1;
      var i = bag.get(e);
      if (i == null) return -1; 
      if (--i == 0) {
         bag.remove(e);
      } else {
         bag.put(e, i);
      }
      return i;
   }
   
   /*
   return 
   */
   @Override
   public String toString() {
      return bag.toString();
   }
}
