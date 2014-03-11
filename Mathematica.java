

public class Mathematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y = 0;
        
            
        outerloop:  
        
            for(x=1;x<10000000;x++){
                    for(y=1;y<1000000;y++){
                    if((x+y)%10==2){
                        int sum=x+y;
                        if((x+sum)%10==5){
                  sum=x+sum;
                  if((y+sum)%10==2){
                      sum=y+sum;
                      if((x+sum)%10==5)
                           sum=x+sum;
                    if((y+sum)%10==2){
                      sum=y+sum;
                      if((x+sum)%10==5){
                          sum=x+sum;
                          break outerloop;
                      }
                    }   
                    
                    }
                   
                    }
                    
            }
            
    }
}
            System.out.println(x+"\n"+y);
}
    
}
