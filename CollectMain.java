package collection;
--amardeep shinde
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CollectMain {
	
static int count=0;
	
	public static void main(String[] args) 
	{
	
		
		Scanner sc=new Scanner(System.in);
		ArrayList<collection> coin=new ArrayList();
	
		String wish;
		do
		{
			System.out.println("Choose Option: 1.Add coin. \n 2.Display \n 3.Create List");
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					
					System.out.println("Enter Country:");
					String country=sc.next();
					System.out.println("Enter Denomination:");
					String denomination=sc.next();
					System.out.println("Enter year of minting:");
					int yearOfMinting=sc.nextInt();
					System.out.println("Enter current values:");
					int currVal=sc.nextInt();
					Date acqDate=new Date();
					
					collection collect=new collection(country,denomination,yearOfMinting,currVal,acqDate);
					coin.add(collect);
					collect.display();
					
					break;
					
				case 2:
					for(int i=0;i<coin.size();i++)
					{
						coin.get(i).display();
					}
					
					break;
					
				case 3:
					System.out.println("Choose Option: 1.Country \n 2.year of minting. \n 3.current value.");
					int ch1=sc.nextInt();
					
					switch(ch1)
					{
					case 1:
						System.out.println("Enter Country and denomination:");
						String c=sc.next();
						String d=sc.next();
						boolean flag=false;
						for(int i=0;i<coin.size();i++)
						{
							if(c.equals(coin.get(i).getCountry())&&d.equals(coin.get(i).getDenomination()))
							{
								coin.get(i).display();
								flag=true;
							}
						}
						
						if(flag==false)
						{
							System.out.println("Invalid entry...");
						}
					break;
					
					case 2:
						System.out.println("Enter year of minting:");
						int y=sc.nextInt();
						boolean flag1=false;
						for(int i=0;i<coin.size();i++)
						{
							if(y==(coin.get(i).getYearOfMinting()))
							{
								coin.get(i).display();
								flag1=true;
							}
						}
						
						if(flag1==false)
						{
							System.out.println("Invalid entry...");
						}
					break;
					
					case 3:
						System.out.println("Enter current value:");
						int v=sc.nextInt();
						boolean flag11=false;
						for(int i=0;i<coin.size();i++)
						{
							if(v==(coin.get(i).getCurrVal()))
							{
								coin.get(i).display();
								flag11=true;
							}
						}
						
						if(flag11==false)
						{
							System.out.println("Invalid entry...");
						}
					break;
					
					}
					
			}
			System.out.println("Do you want to perfor more operations::");
			 wish=sc.next();
		}while (wish.equals("y")||wish.equals("Y"));
	}

}
