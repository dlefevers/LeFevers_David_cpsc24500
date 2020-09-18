import java.util.Random;
/**
 * This calculates the area and circumference of a circle using a random radius
 * @author David LeFevers
 */
public class CicleCalc {
    /**
     * Calculates the area using a random radius
     * @param radius
     * @return
     */
        public static double CalcArea(int radius){
            double result = 3.14*(radius*radius);
            return result;
        }
        /**
         * Calculates the circumference using a random radius
         * @param radius
         * @return
         */
        public static double CalcCircum(int radius){
            double result = 2 * 3.14 * radius;
            return result;
        }
        /**
         * Generates a random radius and prints the area and cirumference
         */
        public static void main(String[] args) {
            Random rnd = new Random();
            int radius = rnd.nextInt(25);
            double area = CalcArea(radius);
            System.out.printf("Area is %.2f.\n",(area));
            double circum = CalcCircum(radius);
            System.out.printf("Circumference is %.2f.\n",(circum));
    }  
}
