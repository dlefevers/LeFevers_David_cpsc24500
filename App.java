
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Scanner;

import javax.swing.JFrame;

import org.math.plot.Plot2DPanel; //tried fixng this with the "keyboard magic" but nothing seems to be working.

/**
 * welcome banner that prints to begin the program
 */
public class App {
    public static void welcome() {
        System.out.println("*****************************************");
        System.out.println("        WELCOME TO COVID PLOTTER         ");
        System.out.println("*****************************************");
    }

    public static LinkedHashMap<String, double[]> readData(Scanner fsc) {
        LinkedHashMap<String, double[]> result = new LinkedHashMap<String, double[]>();
        String line = fsc.nextLine();
        String[] parts;
        String name;
        double[] values;
        while (fsc.hasNextLine()) {
            line = fsc.nextLine();
            parts = line.split("\t");
            name = parts[0];
            values = new double[parts.length - 1];
            for (int i = 1; i < parts.length; i++) {
                values[i - 1] = Double.parseDouble(parts[i]);
            }
            result.put(name, values);
        }
        return result;
    }
/**
 * sets up plot
 */
    public static void setUpFrame(Plot2DPanel plot) {
        JFrame result = new JFrame();
        result.setTitle("Cumulative Deaths");
        result.setBounds(100, 100, 500, 500);
        result.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container c = result.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(plot, BorderLayout.CENTER);
        result.setVisible(true);
        result.setAxisLabels("Days","Deaths");
    }

    public static void main(String[] args) {
        welcome();
        LinkedHashMap<String, double[]> countries = null;
        String names;
        String[] parts;
        double[] data;
        double[] data2;
        Scanner sc = new Scanner(System.in);
        try {
            Scanner fsc = new Scanner(new File("countries_deaths.txt")); //uses the countries_deaths.txt 
            countries = readData(fsc);
            fsc.close();
        } catch (Exception ex) {
            countries = null;
        }
        if (countries == null) {
            System.out.println("Could not open file.");
        } else {
            do {
                System.out.print("Enter countries separated by commas: ");
                names = sc.nextLine();
                if (!names.equalsIgnoreCase("exit")) {
                    Plot2DPanel plot = new Plot2DPanel();
                    parts = names.split(",");
                    for (String part : parts) {
                        part = part.trim();
                        if (countries.containsKey(part) == false) {
                            System.out.printf("%s is not found.\n", part);
                        } else {
                            data = countries.get(part);
                            plot.addLinePlot(part,data);
                        }
                    }
                    setUpFrame(plot);
                }
            } while (!names.equalsIgnoreCase("EXIT"));
        }
    }
}