public class Question5 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int ans=1;
		for(int i=1;i<=9;i++)
		{
			ans=lcm(i,ans);
 
		}
		System.out.println(ans);
	}
	public static int lcm(int a,int b){
		int lcm=a;
		while(true){
			if(lcm%a ==0 && lcm%b ==0)
			 break;
			 lcm++;
		}
		return lcm;
	}
}
