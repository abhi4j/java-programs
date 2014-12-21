class complex
{
        int real,img,i,j;
        complex()
        {
                real=1;
                img=1;
        }

        complex(int i)
        {
                real=i;
                img=i;
        }

        complex(int i,int j)
        {
                real=i;
                img=j;
        }

        void add(complex a,complex b)
        {
                img=img+a.img+b.img;
                real=real+a.real+b.real;
        }
        void disp()
        {
                System.out.print(+ real +" + "+ img +"i");
                System.out.println();
        }

        public static void main(String args[])
        {
                complex a = new complex();
                complex b = new complex(3);
                complex c = new complex(12,23);
                System.out.println("The Three Complex Numbers Are : ");
                System.out.println();
                System.out.print("no argument  : ");
                a.disp();
                System.out.print("one argument : ");
                b.disp();
                System.out.print("two argument : ");
                c.disp();

                c.add(a,b);
                System.out.print("Addition Is  : ");

                c.disp();
        }
}

                
