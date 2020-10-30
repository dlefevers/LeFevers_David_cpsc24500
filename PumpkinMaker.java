//Imports 
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

//Starting pumpkin
class DrawingPanel extends JPanel {
    private int pumpkinLeft = 100;
    private int pumpkinTop = 100;
    private int pumpkinWidth = 100;
    private int pumpkinHeight = 100;
    private String pumpkinEye = "S";
    private String pumpkinNose = "C";   
    private String pumpkinMouth = "O";



    public int getPumpkinLeft() {
        return pumpkinLeft;
    }

    public void setPumpkinLeft(int pumpkinLeft) {
        this.pumpkinLeft = pumpkinLeft;
    }

    public int getPumpkinTop() {
        return pumpkinTop;
    }

    public void setPumpkinTop(int pumpkinTop) {
        this.pumpkinTop = pumpkinTop;
    }

    public int getPumpkinWidth() {
        return pumpkinWidth;
    }

    public void setPumpkinWidth(int pumpkinWidth) {
        this.pumpkinWidth = pumpkinWidth;
    }

    public int getPumpkinHeight() {
        return pumpkinHeight;
    }

    public void setPumpkinHeight(int pumpkinHeight) {
        this.pumpkinHeight = pumpkinHeight;
    }

    public String getPumpkinEye() {
        return pumpkinEye;
    }

    public void setPumpkinEye(String pumpkinEye) {
        this.pumpkinEye = pumpkinEye;
    }

    public String getPumpkinNose() {
        return pumpkinNose;
    }

    public void setPumpkinNose(String pumpkinNose) {
        this.pumpkinNose = pumpkinNose;
    }

    public String getPumpkinMouth() {
        return pumpkinMouth;
    }

    public void setPumpkinMouth(String pumpkinMouth) {
        this.pumpkinMouth = pumpkinMouth;
    }  
    //Draws starting pumpkin + new pumpkin 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillOval(pumpkinLeft,pumpkinTop,pumpkinWidth,pumpkinHeight);
        g.setColor(Color.BLACK);
        
        if (pumpkinEye.equalsIgnoreCase("C")){
            g.fillOval((pumpkinLeft + 20), (pumpkinTop + 20), (pumpkinWidth - 80), (pumpkinHeight - 80));
            g.fillOval((pumpkinLeft + 60), (pumpkinTop + 20), (pumpkinWidth - 80), (pumpkinHeight - 80));
        } 
        else if (pumpkinEye.equalsIgnoreCase("S")){
            g.fillRect((pumpkinLeft + 20), (pumpkinTop + 20), (pumpkinWidth - 80), (pumpkinHeight - 80));
            g.fillRect((pumpkinLeft + 60), (pumpkinTop + 20), (pumpkinWidth - 80), (pumpkinHeight - 80));
        }
        else if (pumpkinEye.equalsIgnoreCase("T")){
            g.fillPolygon(new int[] {pumpkinLeft + 20, pumpkinTop + 20}, new int[] {pumpkinWidth - 80, pumpkinHeight - 80}, 3);
            g.fillPolygon(new int[] {pumpkinLeft + 60, pumpkinTop + 20}, new int[] {pumpkinWidth - 80, pumpkinHeight - 80}, 3);
        }
        if (pumpkinNose.equalsIgnoreCase("C")){
            g.fillOval((pumpkinLeft + 40), (pumpkinTop + 35), (pumpkinWidth - 80), (pumpkinHeight - 80));
            g.fillOval((pumpkinLeft + 60), (pumpkinTop + 20), (pumpkinWidth - 80), (pumpkinHeight - 80));
        } 
        else if (pumpkinNose.equalsIgnoreCase("S")){
            g.fillOval((pumpkinLeft + 40), (pumpkinTop + 35), (pumpkinWidth - 80), (pumpkinHeight - 80));
            g.fillOval((pumpkinLeft + 60), (pumpkinTop + 20), (pumpkinWidth - 80), (pumpkinHeight - 80));
        }
        else if (pumpkinNose.equalsIgnoreCase("T")){
            g.fillPolygon(new int[] {pumpkinLeft + 40, pumpkinTop + 35}, new int[] {pumpkinWidth - 80, pumpkinHeight - 80}, 3);
            g.fillPolygon(new int[] {pumpkinLeft + 60, pumpkinTop + 20}, new int[] {pumpkinWidth - 80, pumpkinHeight - 80}, 3);
        }
        if (pumpkinMouth.equalsIgnoreCase("O")){
            g.fillOval((pumpkinLeft + 10),(pumpkinTop + 65),(pumpkinWidth - 20),(pumpkinHeight - 80));
            g.fillOval((pumpkinLeft + 10),(pumpkinTop + 65),(pumpkinWidth - 20),(pumpkinHeight - 80));
        }
        else if (pumpkinMouth.equalsIgnoreCase("R")){
            g.fillRect((pumpkinLeft + 10),(pumpkinTop + 65),(pumpkinWidth - 20),(pumpkinHeight - 80));
            g.fillRect((pumpkinLeft + 10),(pumpkinTop + 65),(pumpkinWidth - 20),(pumpkinHeight - 80));
        }

    }
}
class TextPanel extends JPanel {
    String text;
    int size;
    public TextPanel() {
        this("",12);
    }
    public TextPanel(String text, int size){
        this.text = text;
        this.size = size;
    }
}
//how everything looks also takes in values
class MyFrame extends JFrame {
    public void setLook(String title, int left, int top, int width, int height) {
        setTitle(title);
        setBounds(left,top,width,height);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel panSouth = new JPanel();
        panSouth.setLayout(new FlowLayout());
        panSouth.add(new JLabel("Left:"));
        JTextField txtLeft = new JTextField(3);
        panSouth.add(txtLeft);
        panSouth.add(new JLabel("Top:"));
        JTextField txtTop = new JTextField(3);
        panSouth.add(txtTop);
        panSouth.add(new JLabel("Width:"));
        JTextField txtWidth = new JTextField(3);
        panSouth.add(txtWidth);
        panSouth.add(new JLabel("Height:"));
        JTextField txtHeight = new JTextField(3);
        panSouth.add(txtHeight);
        panSouth.add(new JLabel("Eye(C S T):"));
        JTextField txtEye = new JTextField(1);
        panSouth.add(txtEye);
        panSouth.add(new JLabel("Nose(C S T):"));
        JTextField txtNose = new JTextField(1);
        panSouth.add(txtNose);
        panSouth.add(new JLabel("Mouth(O R):"));
        JTextField txtMouth = new JTextField(1);
        panSouth.add(txtMouth);
        DrawingPanel panCenter = new DrawingPanel();
        c.add(panCenter,BorderLayout.CENTER);
        JButton btnDraw = new JButton("Draw");
        panSouth.add(btnDraw);
        btnDraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            panCenter.setPumpkinLeft(Integer.parseInt(txtLeft.getText()));  //when you hit the button it will actually do something
            panCenter.setPumpkinTop(Integer.parseInt(txtTop.getText()));
            panCenter.setPumpkinWidth(Integer.parseInt(txtWidth.getText()));
            panCenter.setPumpkinHeight(Integer.parseInt(txtHeight.getText()));
            panCenter.setPumpkinEye(txtEye.getText());
            panCenter.setPumpkinNose(txtNose.getText());
            panCenter.setPumpkinMouth(txtMouth.getText());
            repaint();
            }
        });
        panSouth.add(btnDraw);
        c.add(panSouth,BorderLayout.SOUTH);
    }   
    //the frame
    public MyFrame(){
        setLook("Pumpkin Maker", 200,200,800,480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   

}
//opens frame
public class PumpkinMaker {
    public static void main(String[] args) {
        MyFrame frm = new MyFrame();
        frm.setVisible(true);
    }
}