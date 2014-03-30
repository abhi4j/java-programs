class matrix
{
        public int i,j,k,z;
        private int a[][];
        matrix()
        {
                a = new int[3][3];
                a[0][0]=1;
                a[0][1]=2;
                a[0][2]=3;
                a[1][0]=4;
                a[1][1]=5;
                a[1][2]=6;
                a[2][0]=7;
                a[2][1]=8;
                a[2][2]=9;
        }
        matrix(int i)
        {
                a = new int[3][3];
                a[0][0]=2;
                a[0][1]=2;
                a[0][2]=2;
                a[1][0]=2;
                a[1][1]=2;
                a[1][2]=2;
                a[2][0]=2;
                a[2][1]=2;
                a[2][2]=2;
        }
        void disp()
        {
                System.out.println();
                for(i=0;i<3;i++)
                {
                        for(j=0;j<3;j++)
                                System.out.print("\t" + a[i][j]);
                        System.out.println();
                }
                System.out.println();
        }                
        matrix matadd(matrix m1)
        {
                matrix m3 = new matrix();
                for(i=0;i<3;i++)
                        for(j=0;j<3;j++)
                                m3.a[i][j]=a[i][j]+m1.a[i][j];
        return m3;
        }
        matrix matsub(matrix m1)
        {
                matrix m3 = new matrix();
                for(i=0;i<3;i++)
                        for(j=0;j<3;j++)
                                m3.a[i][j]=m1.a[i][j]-a[i][j];
        return m3;
        }
        matrix matmul(matrix m1)
        {
                matrix m3 = new matrix();
                for(i=0;i<3;i++)
                        for(j=0;j<3;j++)
                        {
                                z=0;
                                for(k=0;k<3;k++)
                                        z=z+m1.a[i][j]*a[i][j];
                                m3.a[i][j]=z;
                        }
        return m3;
        }                     
}

class Main
{
        public static void main(String args[])
        {
                matrix m1 = new matrix();
                matrix m2 = new matrix(10);
                matrix m3 = new matrix();

                System.out.println();
                System.out.println("Matrix A Is : ");
                m1.disp();

                System.out.println();
                System.out.println("Matrix B Is : ");
                m2.disp();

                System.out.println("Matrix Addition Is : ");
                m3=m2.matadd(m1);
                m3.disp();

                System.out.println("Matrix Subtraction Is : ");
                System.out.println();
                m3=m2.matsub(m1);
                m3.disp();

                System.out.println("Matrix Multiplication Is : ");
                m3=m2.matmul(m1);
                m3.disp();


        }
}
