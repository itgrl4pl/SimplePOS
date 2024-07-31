import java.util.Scanner;
public class SimplePOS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("Enter Product: ");
				String prodName = input.nextLine();
			System.out.print("Enter Price: ");
				double prodPrice = input.nextDouble();
			System.out.print("Enter Quantity: ");
				int prodQuantity = input.nextInt();
			System.out.print("Enter Discount: ");
				double prodDiscount = input.nextDouble();	
					String Product = setProductName(prodName);
					int Total = calcuateTotalPrice(prodQuantity, prodPrice);
					double Bill = calcuateTotalBill(Total, prodDiscount);
					double Payable = calcuateTotalPay(Total,Bill);
			System.out.print("Total payable for" + " " + Product + " " + "is" + " " + Payable);
	}
	private static String setProductName(String prodName) {
		String ProductLabel = (prodName);
		return ProductLabel;
	}
	private static int calcuateTotalPrice(int prodQuantity, double prodPrice) {
		int TotalPrice = (int) (prodPrice * prodQuantity);
		return TotalPrice;
	}
	private static double calcuateTotalBill(double totalPrice, double discount) {
		double TotalBill = (totalPrice * discount);
		return TotalBill;
	}
	private static double calcuateTotalPay(double TotalPrice, double TotalBill) {
		double TotalPay = (TotalPrice - TotalBill);
		return TotalPay;
	}
		}