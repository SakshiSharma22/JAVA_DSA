import java.sql.SQLOutput;
import java.util.*;
public class company {
    int products[]=new int[3];
    public company(int a, int b, int c)
    {
        products[0]=a;
        products[1]=b;
        products[2]=c;
    }
    public int sum()
    {
        return products[0]+products[1]+products[2];
    }
    public static void main(String args[])
    {
        company salesman[]=new company[5];
        salesman[0]=new company(23,23,45);
        salesman[1]=new company(34,45,63);
        salesman[2]=new company(24,23,60);
        salesman[3]=new company(60,45,23);
        salesman[4]=new company(23,12,11);
        int total=0;
        for(int a=0;a<5;a++)
        {
            System.out.println("Total sales by salesman"+(a+1)+":"+salesman[a].sum());
        }
        for(int a=0;a<3;a++)
        {
            System.out.print("Total sales of item"+(a+1)+"=");
            for(int b=0;b<5;b++)
                 total=salesman[b].products[a]+total;
            System.out.print(total);
        }


    }
}
