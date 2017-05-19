package sheet4Arrays;

public class Ex3TotalSales {
	public static void main(String[] args) {

		// 2D array, Sales person, product number, total product sale by day
		int [][] salesData = {
				{1, 1, 100}, {1, 2, 200}, {1, 3, 400}, {1, 1, 300},
				{2, 4, 400}, {2, 5, 500}, {2, 3, 600}, {2, 3, 600},
				{3, 2, 1000},{3, 3, 800}, {3, 4, 300}, {3, 4, 500},
				{4, 1, 200}, {4, 3, 300}, {4, 5, 500}
		};
		
		int [] salesPerson = {1,2,3,4,0};
		int [] productNumber = {1,2,3,4,5};
		int [] totalSalesByDay = {100,200,400,300,400,500,600,600,1000,800,300,500,200,300,500};
		
		for (int i = 0; i < salesData.length; i++) {
			for (int j = 0; j < salesData[i].length; j++) {
				System.out.printf("%d\t\t", salesData[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < salesData.length; i++) {
			for (int j = 0; j < salesData[i].length; j++) {
				System.out.printf("%d\t\t", salesData[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
