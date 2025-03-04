
import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    UI(){
        setSize(500,500);
        setLayout(new GridLayout(5,4));
        JPanel[] panels = new JPanel[5];
        JButton[] buttons = new JButton[16];
        JTextArea area = new JTextArea("");

        panels[0] = new JPanel();
        panels[1] = new JPanel();
        panels[2] = new JPanel();
        panels[3] = new JPanel();
        add(panels[0]);
        add(panels[1].add(area));
        add(panels[2]);
        add(panels[3]);


        panels[3].setLayout(new BorderLayout());
        buttons[0] = new JButton("/");
        buttons[1] = new JButton("7");
        buttons[2] = new JButton("8");
        buttons[3] = new JButton("9");
        buttons[4] = new JButton("*");
        buttons[5] = new JButton("4");
        buttons[6] = new JButton("5");
        buttons[7] = new JButton("6");
        buttons[8] = new JButton("-");
        buttons[9] = new JButton("1");
        buttons[10] = new JButton("2");
        buttons[11] = new JButton("3");
        buttons[12] = new JButton("+");
        buttons[13] = new JButton("0");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton("del");
        for (int i = 0; i<=12;i++){
            add(buttons[i]);
        }
        add(buttons[13]);
        add(buttons[15]);
        add(buttons[14]);






        setVisible(true);
    }
}
