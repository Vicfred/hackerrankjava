import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
        HashMap<String,Integer> hm = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            hm.put(name,phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(null == hm.get(s))
                System.out.println("Not found");
            else
                System.out.println(s+"="+hm.get(s));
		}
	}
}

