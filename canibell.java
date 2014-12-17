 
import java.util.Vector;

class State{
    public int C[] = new int[2], M[] = new int[2], B;
    public State parent;
    public String action="";
    
    public State(){}
    public State(int c1, int c2, int m1, int m2, int b, String act){
        C[0] = c1; C[1] = c2; M[0] = m1; M[1] = m2; B = b;
        action = act;
    }
    boolean isDanger(int c1, int c2, int m1, int m2){
        if((c1 > m1 && m1 != 0) || (c2 > m2 && m2 !=0))
            return true;
        return false;
    }
    public Vector expandNode(){        
        Vector<State> children = new Vector<State>();     
        
        
        State newState;
        
        // 2 Cann sitting in boat
        if(C[B] >=2){
            if (B == 0 && !isDanger(C[0] - 2, C[1] + 2, M[0], M[1])){
                newState = new State(C[0] - 2, C[1] + 2, M[0], M[1], (B+1)%2, "2 Can in Boat at " + (B+1) );
                newState.parent = this;
                children.add(newState);

            }else if(!isDanger(C[0] + 2 , C[1]- 2, M[0], M[1])){
                newState = new State(C[0] + 2 , C[1]- 2, M[0], M[1], (B+1)%2, "2 Can in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }
            
            
        }
        
        // 2 Mis sitting in boat
        if(M[B] >=2 ){
            if (B == 0 && !isDanger(C[0] , C[1], M[0]- 2, M[1] + 2) ){
                newState = new State(C[0] , C[1], M[0]- 2, M[1] + 2, (B+1)%2, "2 Mis in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }else if(!isDanger(C[0] , C[1], M[0] + 2, M[1]- 2)){
                newState = new State(C[0] , C[1], M[0] + 2, M[1]- 2, (B+1)%2, "2 Mis in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }
            
        }
        // 1 Can 1 Mis sitting in boat
        if(C[B] >= 1){
            if (B == 0 && !isDanger(C[0] -1 , C[1] + 1, M[0]- 1, M[1]+1)){
                newState = new State(C[0] -1 , C[1] + 1, M[0]- 1, M[1]+1, (B+1)%2, "1 can 1 Mis in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }else if (!isDanger(C[0] + 1, C[1]-1, M[0] +1 , M[1]- 1)){
                newState = new State(C[0] + 1, C[1]-1, M[0] +1 , M[1]- 1, (B+1)%2, "1 Can 1 Mis in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }
            
        }

        // 1 Can sitting in boat
        if(C[B] >= 1 ){
            if (B == 0 && !isDanger(C[0] -1 , C[1] + 1, M[0], M[1])){
                newState = new State(C[0] -1 , C[1] + 1, M[0], M[1], (B+1)%2, "1 can  in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }else if(!isDanger(C[0]+ 1 , C[1]-1, M[0], M[1])){
                newState = new State(C[0]+ 1 , C[1]-1, M[0], M[1], (B+1)%2, "1 Can  in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }
            
        }

        // 1 Mis sitting in boat
        if(M[B] >= 1 ){
            if (B == 0 && !isDanger(C[0]  , C[1], M[0]-1, M[1]+ 1) ){
                newState = new State(C[0]  , C[1], M[0]-1, M[1]+ 1, (B+1)%2, "1 Mis  in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }else if(!isDanger(C[0] , C[1], M[0] + 1, M[1]-1) ){
                newState = new State(C[0] , C[1], M[0] + 1, M[1]-1, (B+1)%2, "1 Mis in Boat at " +  (B+1));
                newState.parent = this;
                children.add(newState);

            }
            
        }

        
        
        return children;
    }
    public String toString(){
        return "(C1 = " + C[0] + " M1 = " + M[0] + ")(C2 = " + C[1] + " M2 = " + M[1] + ")Boat = " + (B+1) ;//+ " Action = " + action;
    }
    public boolean isGoal(){
        if(C[1] == 3 && M[1] == 3)
            return true;
        return false;
    }
}
public class canibell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        java.util.Stack<State> stack = new java.util.Stack<State>();
        java.util.HashSet<State> seenStates = new java.util.HashSet<State>();
        
        State start = new State(3,0,3,0,0,"start");
        start.parent = null;        
               
        State end = null;
        
        
        stack.push(start);
        
        while( ! stack.empty()){
            //System.out.println("Stack: "+stack);
            //System.out.println("SeenSates: "+seenStates);
            
            State temp = stack.remove(0);  
            //System.out.println("temp: "+temp);
            //stack.remove(temp);
            
            if(temp.isGoal()){
                end = temp;
                break;
            }
            seenStates.add(temp);
            
            Vector<State> children = temp.expandNode();
            
            //System.out.println("states:" + children );
            Object objs[] = children.toArray();
            for(int i=0;i<objs.length;i++){
                State tempstate = (State)objs[i];
                if( !seenStates.contains(tempstate))
                    stack.push(tempstate);
            }
        }

        if(end == null)
            System.out.println("Not Possible");
        else{
            System.out.println();
            while (end != null){
                System.out.print(" <--(" + end + ") <-" + end.action + " ");
                end = end.parent;
            }
        }
    }

}
