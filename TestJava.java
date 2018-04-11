//练习Java 68页12题
import java.util.Scanner;//导入输入模块
public class TestJava
{
	public static void main(String args[])
	{
		int n=0;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		int i=1;//确定行数标志位
		while(i!=n+1)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");//此种输入每次语句后不加换行
			System.out.println();//换行
			i++;
		}
		return;
	}
}
