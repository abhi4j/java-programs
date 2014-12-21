import java.util.*;

public class MandC {

   static State initial_state = new State(3,3,'L',0,0);

   public static void main(String[] args) {
      Node node = solve( initial_state );
      System.out.println();
      if (node == null)
         System.out.println("No solution exists.");
      else {
         System.out.println("The solution is:\n");
         node.printBackTrace();
      }
      System.out.println();
   }
   
   static class State {
      int ml, cl;  // missionaries and cannibals on left
      int mr, cr;  // missionaries and cannibals on right
      char boat;   // boat position, 'L' or 'R'
      public State(int ml, int cl, char boat, int mr, int cr) {
         this.ml = ml;
         this.cl = cl;
         this.boat = boat;
         this.mr = mr;
         this.cr = cr;
      }
      public boolean goal_test() {
         return ml == 0 && cl == 0;
      }
      public String toString() {
         return "(" + ml + " " + cl + " " + boat + " " + mr + " " + cr + ")";
      }
      public boolean equals(Object obj) {
         if ( ! (obj instanceof State) )
            return false;
         State s = (State)obj;
         return (s.ml == ml && s.cl == cl && s.boat == boat
                       && s.cr == cr && s.mr == mr);
      }
      public Vector successor_function() {
         Vector v = new Vector();
         if (boat == 'L') {
            testAndAdd(v,new StateActionPair(
                          new State(ml-2,cl,'R',mr+2,cr),
                          new Action("Two missionaries cross left to right.")));
            testAndAdd(v,new StateActionPair(
                          new State(ml,cl-2,'R',mr,cr+2),
                          new Action("Two cannibals cross left to right.")));
            testAndAdd(v,new StateActionPair(
                          new State(ml-1,cl-1,'R',mr+1,cr+1),
                          new Action("One missionary and one cannibal cross left to right.")));
            testAndAdd(v,new StateActionPair(
                          new State(ml-1,cl,'R',mr+1,cr),
                          new Action("One missionary crosses left to right.")));
            testAndAdd(v,new StateActionPair(
                          new State(ml,cl-1,'R',mr,cr+1),
                          new Action("One cannibal crosses left to right.")));
         }
         else {
            testAndAdd(v,new StateActionPair(
                          new State(ml+2,cl,'L',mr-2,cr),
                          new Action("Two missionaries cross right to left.")));
            testAndAdd(v,new StateActionPair(
                          new State(ml,cl+2,'L',mr,cr-2),
                          new Action("Two cannibals cross right to left.")));
            testAndAdd(v,new StateActionPair(
                          new State(ml+1,cl+1,'L',mr-1,cr-1),
                          new Action("One missionary and one cannibal cross right to left.")));
            testAndAdd(v,new StateActionPair(
                          new State(ml+1,cl,'L',mr-1,cr),
                          new Action("One missionary crosses right to left.")));
            testAndAdd(v,new StateActionPair(
                          new State(ml,cl+1,'L',mr,cr-1),
                          new Action("One cannibal crosses right to left.")));
         }
         return v;
      }
      private void testAndAdd(Vector v, StateActionPair pair) {
         State state = pair.state;
         if (state.ml >= 0 && state.mr >= 0 && state.cl >= 0 && state.cr >= 0
               && (state.ml == 0 || state.ml >= state.cl)
               && (state.mr == 0 || state.mr >= state.cr))
            v.addElement(pair);
      }
   } // end class State
   

   static class Action {
      String text;
      public Action(String text) {
         this.text = text;
      }
      public String toString() {
         return text;
      }
      public double cost() {
         return 1;
      }
   }

   static class StateActionPair {
      public State state;
      public Action action;
      public StateActionPair(State state, Action action) {
         this.state = state;
         this.action = action;
      }
   }
   

   static class Node {
      public State state;
      public Node parent_node;
      public Action action;
      public double path_cost;
      public int depth;
      public Node(State state) {
         this.state = state;
         parent_node = null;
         action = new Action("Initial state");
         path_cost = 0;
         depth = 0;
      }
      public Node(State state, Node parent, Action action) {
         this.state = state;
         this.parent_node = parent;
         this.action = action;
         this.path_cost = action.cost() + parent.path_cost;
         this.depth = 1 + parent.depth;
      }
      public void printBackTrace() {
         if (parent_node != null)
            parent_node.printBackTrace();
         System.out.println("   " + depth + ". " + action + " ---> " + state);
      }
   }
   
   
   public static Node solve(State initial_state) {
      LinkedList fringe = new LinkedList();
      Vector visited = new Vector();
      fringe.add( new Node(initial_state) );
      while ( true ) {
         if (fringe.isEmpty())
            return null;
         Node node = (Node)fringe.removeFirst();  // or change to removeLast
         Vector successors = node.state.successor_function();
         for (int i = 0; i < successors.size(); i++) {
            StateActionPair successor = (StateActionPair)successors.elementAt(i);
            if ( ! containsState(visited,successor.state) ) {
               Node newNode = new Node(successor.state,node,successor.action);
               if (successor.state.goal_test())
                  return newNode;
               fringe.add(newNode);
               visited.add(successor.state);
            }
         }
      }
   }
   
   public static boolean containsState(Vector visitedStates, State state) {
      for (int i = 0; i < visitedStates.size(); i++) {
         if (visitedStates.elementAt(i).equals(state))
            return true;
      }
      return false;
   }

}