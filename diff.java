import java.io.*;
import java.util.*;

class diff{
public static void main(String args[])
{
int sum=0,product=0,diff,di;
for(int i=0;i<=100;i++)
{
sum+=i;
product+=i*i;
}
di=sum*sum;
diff=di-product;
System.out.println(diff);
}
}