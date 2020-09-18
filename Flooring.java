/**
 * This program determines how many packages of laminated boards you will need to buy and the cost.
 */
public class Flooring {
    public static double Cost(double numberOfPackages) {
        double money = numberOfPackages * 24.99;
        return money;
    }
    public static void main(String[] args) {
        double area = (25*12)*(20*12)-(.5*((12*12)*(10*12)));
        double extraFlooring = area*.2;
        double trueArea = extraFlooring + area;
        double numberOfPackages = trueArea/(30*6*6) + 1;
        double packages = Cost(numberOfPackages);
        System.out.printf("The area is %f\n",(trueArea));
        System.out.printf("The number of packages needed is %.0f\n",(numberOfPackages));
        System.out.printf("The cost is $%.2f.\n",(packages));
    }
}