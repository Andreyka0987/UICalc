
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;



public class UI extends JFrame implements ActionListener {
  private CustomTextField area;
    private int num1, num2, rez;
    private String operator;
    private JTextArea CustomTextArea;
   public UI(){




        setSize(400,500);
        setLayout(null);



        area = new CustomTextField("0");
        area.setFont(new Font("Arial",Font.BOLD,30));
        area.setHorizontalAlignment(JTextField.RIGHT);
        area.setEditable(true);
        area.setBounds(0,0,385,45);


        JPanel panel = new JPanel(new GridLayout(5,4));
        panel.setBounds(0,45,400,455);


       CustomTextArea = new JTextArea();
       CustomTextArea.setFont(new Font("Arial", Font.BOLD, 15));
       CustomTextArea.setEditable(false);
       CustomTextArea.setBackground(Color.green);
       CustomTextArea.setLayout(new FlowLayout(FlowLayout.RIGHT));
       CustomTextArea.setBounds(0,409,400,60);



        JButton[] buttons = new JButton[16];
        add(area, BorderLayout.NORTH);
        add(CustomTextArea);






        buttons[0] = new JButton("/");
        buttons[0].addActionListener(this);

        buttons[0] = new JButton("7");
        buttons[0].addActionListener(this);

        buttons[1] = new JButton("8");
        buttons[1].addActionListener(this);

        buttons[2] = new JButton("9");
        buttons[2].addActionListener(this);

        buttons[3] = new JButton("/");
        buttons[3].addActionListener(this);

        buttons[4] = new JButton("4");
        buttons[4].addActionListener(this);

        buttons[5] = new JButton("5");
        buttons[5].addActionListener(this);

        buttons[6] = new JButton("6");
        buttons[6].addActionListener(this);

        buttons[7] = new JButton("*");
        buttons[7].addActionListener(this);

        buttons[8] = new JButton("1");
        buttons[8].addActionListener(this);

        buttons[9] = new JButton("2");
        buttons[9].addActionListener(this);

        buttons[10] = new JButton("3");
        buttons[10].addActionListener(this);

        buttons[11] = new JButton("-");
        buttons[11].addActionListener(this);

        buttons[12] = new JButton("0");
        buttons[12].addActionListener(this);

        buttons[13] = new JButton("=");
        buttons[13].addActionListener(this);

        buttons[14] = new JButton("del");
        buttons[14].addActionListener(this);

        buttons[15] = new JButton("+");
        buttons[15].addActionListener(this);
        add(panel);

       for (int i = 0; i<=15;i++){
           buttons[i].setBackground(Color.white);
           buttons[i].setForeground(Color.DARK_GRAY);
           panel.add(buttons[i]);

       }












        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String getBtnName = e.getActionCommand();
        switch (getBtnName){
            case "/": case "*": case "-": case "+":
                if (area.getText() != null && !area.getText().isEmpty()){
                    num1 = Integer.parseInt(area.getText());
                    operator = getBtnName;
                    area.setText("");
                    area.setRezl(num1+" "+ operator);
                }
                else {
                    operator = getBtnName;
                    area.setText("");
                    area.setRezl(num1+" "+ operator);
                    break;
                }
                break;
            case "=":
                if (operator == null || area.getText().isEmpty())return;
                num2 = Integer.parseInt(area.getText());


                switch (operator){
                    case "/":
                        if (num2 != 0){
                            rez = num1/num2;
                        }
                        break;
                    case "*":
                        rez = num1*num2;
                        break;
                    case "-":
                        rez = num1-num2;
                        break;
                    case "+":
                        rez = num1+num2;
                        break;
                }
                if (num2 !=0) {
                    area.setText(String.valueOf(rez));
                }
                else {area.setText("Доброго вечора, ІДІ НАХУЙ");}
                area.setRezl("");

                String StringRez = num1 + " " + operator + " " + num2 + " = "+ rez ;
                String temp = CustomTextArea.getText();
                if (temp.equals("")){
                    CustomTextArea.setText(StringRez);
                }
                else {
                    CustomTextArea.setText(temp+", "+StringRez);
                }
                DataBase dataBase = new DataBase(StringRez);
                dataBase.load();

                break;






            case "del":
                area.setText("");
                area.setRezl("");
                CustomTextArea.setText("");
                break;

            default:
                if(area.getText().equals("0")) {
                    area.setText("");
                }
                area.setText(area.getText() + getBtnName);
                break;

        }

    }
}
