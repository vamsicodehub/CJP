import java.io.DataInputStream;
import java.io.IOException;


public class BaytTest
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException
	{
		String line;
		DataInputStream in = new DataInputStream(System.in);
		while((line=in.readLine())!=null)
		{
			String[] s = line.split(",");
			int j=0;
			long k=0;
			long l=0l;
			for(String s1:s)
			{
				int i= 0;
			    for (char c : s1.toCharArray())
			    {
			    	i+=(int)c;
			    	
			    }
			    if(j==0)
			    {
			    	l = i;
			    	System.out.println("S1 ascii is :" +l);
			    }
			    
			    if(j==1)
			    {
			    	k=i;
			    	System.out.println("S2 ascii is :" +k);
			    	long z=l-k;
			    	System.out.println("Diff is :" + z);
			    }
			    
			    j++;
			}
		}
	}

}
