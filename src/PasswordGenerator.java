import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswordGenerator extends JFrame {
    public PasswordGenerator(){

        JPanel mainPanel = new JPanel();
        //sets main panel
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));
        mainPanel.setBackground(Color.BLACK);

        //sets up gui
        JTextField randomPwTextfield = new JTextField();
        randomPwTextfield.setBounds(0,0,50,15);
        JButton generatePwButton = new JButton("generate password");

        mainPanel.add(Box.createRigidArea(new Dimension(15,105)));
        mainPanel.add(randomPwTextfield,BorderLayout.CENTER);
        mainPanel.add(Box.createRigidArea(new Dimension(15,105)));
        mainPanel.add(generatePwButton);
        add(mainPanel);

        generatePwButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random number = new Random();
                StringBuilder stringBuilder = new StringBuilder();
                int num;
                for (int i =0;i<15;i++){
                    num = number.nextInt(126-33) + 33;
                    stringBuilder.append((char)num);
                }
                randomPwTextfield.setText(stringBuilder.toString());
            }
        });

        setSize(new Dimension(180,350));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        PasswordGenerator passwordGenerator = new PasswordGenerator();

    }

}
