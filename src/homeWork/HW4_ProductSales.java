package homeWork;

public class HW4_ProductSales {

	public static void main(String[] args) {
		int [][] sales = {{0,500,200},
				{1,678,3},
				{89,900,89},
				{1,678,3},
				{9,299,49}
				};
		int[] total = new int[3];   //to store total of each product
	//	total = {0,0,0}
		for(int i=0;i<5;i++)//days 
			{
			for(int j=0;j<3;j++) //products
				{
				total[j]+=sales[i][j];  //total of products in each week
				
				//System.out.println(total[j]); // prints all the values
			}
			
		}
		for(int j=0;j<3;j++) //we can give either i or j, its upon to us
		{
			System.out.print("Product " + (j + 1) + " Total: " + total[j] + " → ");
			
			if(total[j]>=500) {
				System.out.println("Target Achieved");
			}
			else if ((total[j]>=300) && (total[j]<=499)) {
				System.out.println("Average Performance");
			}
			else if (total[j]<300) {
				System.out.println("Needs Improvement");
			}
		} 
	}

}
