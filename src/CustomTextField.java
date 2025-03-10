import javax.swing.*;
import java.awt.*;

public class CustomTextField extends JTextField {
    private String rezl = "";

    public CustomTextField(String number) {
        super(number);
    }

    public void setRezl(String rezl) {
        this.rezl = rezl;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.setFont(new Font("Arial",Font.BOLD,15));
        g.drawString(rezl,250,25);

    }
}
