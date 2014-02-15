class factor
{

public int fact(int n){
int facto=0;
if(n==1)
return 1;
else{
facto=n*fact(n-1);
return facto;
}
}
public static void main(String[] args){
factor fa=new factor();
int q=Integer.parseInt(args[0]);

System.out.println("the factorial is "+fa.fact(q));
}
}