import java.io.*;
public class LA4
{
    public static void main(String[] args) throws Exception
    {
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Masukkan banyak koordinat= ");
        int jum = Integer.parseInt(input.readLine());
        int x[] = new int[jum];
        for (int i = 0; i < jum; i++)
        {
            System.out.print("Masukkan elemen x ke- " +(i+1)+ ": ");
            x[i] = Integer.parseInt(input.readLine());
        }
        int yf[] = new int[jum];
        for (int i = 0; i < jum; i++)
        {
            yf[i] = x[i] * x[i] + x[i] + 1;
        }
        int yg[] = new int[jum];
        for (int i = 0; i < jum; i++)
        {
            yg[i] = x[i] * x[i] + x[i];
        }
        int yfg[] = new int[jum];
        for (int i = 0; i < jum; i++)
        {
            yfg[i] = yg[i] * yg[i] + yg[i] + 1;
        }
        int ygf[]= new int[jum];
        for (int i = 0; i < jum; i++)
        {
            ygf[i] = yf[i] * yf[i] + yf[i];
        }
        System.out.println("fungsi f(x)= x^2 + x+1");
        System.out.println("fungsi g(x)= x^2 + x");
        System.out.print("maka f(x)= ( ");
        for(int i = 0; i < jum; i++)
        {
            System.out.print(yf[i]);
            if(i!= jum-1)
            {
                System.out.print(", ");
            }
        }
        System.out.print(")\n");
        System.out.print("Maka g(x)= ( ");
        for (int i = 0; i < jum; i++)
        {
            System.out.print(yg[i]);
            if(i!= jum-1)
            {
                System.out.print(", ");
            }
        }
        System.out.print(")\n");
        System.out.print("Maka fog(x)= (");
        for (int i = 0; i < jum; i++)
        {
            System.out.print(yfg[i]);
            if(i!= jum-1)
            {
                System.out.print(", ");
            }
        }
        System.out.print(")\n");
        System.out.print("Maka gof(x)= (");
        for(int i = 0; i < jum; i++)
        {
            System.out.print(ygf[i]);
            if(i!= jum-1)
            {
                System.out.print(", ");
            }
        }
        System.out.print(")\n");
        System.out.print("Maka Relasinya Terhadap Fungsi f(x):\n");
        for(int i = 0; i < jum; i++)
        {
            System.out.println("(" +x[i]+ ", " +yf[i]+ ")");
        }
        System.out.print("Maka Invers Terhadap Fungsi f(x):\n");
        for(int i = 0; i < jum; i++)
        {
            System.out.println("(" +yf[i]+ ", " +x[i]+ ")");
        }
        System.out.print("Maka Relasinya Terhadap Fungsi g(x):\n");
        for(int i = 0; i < jum; i++)
        {
            System.out.println("(" +x[i]+ ", " +yg[i]+ ")");
        }
        System.out.print("Maka Invers Terhadap Fungsi g(x):\n");
        for(int i = 0; i < jum; i++)
        {
            System.out.println("(" +yg[i]+ ", " +x[i]+ ")");
        }
    }
}

