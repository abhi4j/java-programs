import java.io.*;
 
class snode
{
    int info;
     
     snode link;

       snode()
     {
         info=0;
         link=null;
      }
      snode(int x)
     {
       info=x;
       link=null;
      }
    }
   class SList
  {
   DataInputStream inp=new DataInputStream(System.in);

   snode head;
   int count;
    SList()
   {
     head=null;
      count=0;
   }
  snode getnode()throws IOException 
   {
      System.out.println("enter the data :");

        int val=Integer.parseInt(inp.readLine());
       snode nn=new snode(val);
        
      return nn;
    }
    void createnode()throws IOException
   {
     
     int ch;
     snode nn;
     snode last=null;
 do
{
             System.out.println("Do you want to create a node?(1-yes/2-no)"); 
 
                 ch=Integer.parseInt(inp.readLine());
      
        if(ch==1)
    {
             nn=getnode();

            count++;
     
          if (head==null)
               nn=head;
          
             else

        last.link=nn;
          last=nn;
     }
     
    } while(ch==1);

    
    }

     void printlist()
     
       
           {
             snode temp;
              temp=head;
 
                   if(head==null)

                   System.out.println("List is empty.....");
   
             else
              {
                System.out.println("\nTotal number of nodes in the list is="+count);
                 
           System.out.println("the singly linked list is..........");

           while(temp!=null)

     {
          System.out.print(temp.info+"-> ");

         temp=temp.link;

    }
       System.out.println("null");

        } 

     }
     
     class SLList
     {
    
    public static void main(String args[])
    
     {
       SList sl=new SList();
      try
      { 

      
         sl.createnode();
       
        sl.printnode();
       } 
      catch(IOException e)
    {
       System.out.println("input output error"+e);

    }
       
      }

      }
     















 






