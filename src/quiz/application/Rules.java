package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton back,submit;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        /*ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("image/rules-list-3d-icon-regulation-company-compliance-vector-47964712-removebg-preview.png"));
        Image scaleimage=i1.getImage().getScaledInstance(900,700, Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(scaleimage);
        JLabel image1=new JLabel(i2);
        image1.setBounds(-70 ,-10,900,700);
        add(image1);*/

        JLabel heading= new JLabel(". . . RULES . . .");
        heading.setBounds(300,20,250,40);
        heading.setFont(new Font("IMPACT", Font.PLAIN,40));
        heading.setForeground(new Color(168,47,47));
        add(heading);

        JLabel heading1= new JLabel("Welcome "+name+" to our java quiz challenge");
        heading1.setBounds(130,60,800,40);
        heading1.setFont(new Font("COPPERPLATE GOTHIC BOLD", Font.ROMAN_BASELINE,20));
        heading1.setForeground(new Color(32,16,82));
        add(heading1);

        JLabel rules1= new JLabel();
        rules1.setBounds(20,50,700,500);
        rules1.setFont(new Font("BernhardMod BT", Font.HANGING_BASELINE,15));
        rules1.setText("<html>" +
                "1. Each quiz may have a specified time limit. Ensure you complete all questions within the allotted time.<br><br>" +
                "2. The number of allowed attempts for the quiz might be limited.<br><br>" +
                "3. Each question usually has several answer options. Select the best answer from the given options.<br><br>" +
                "4. Cheating is strictly prohibited. Using unauthorized resources (e.g., internet, books, or help from others) is not allowed.<br><br>" +
                "5. Points are typically awarded for each correct answer. There are no negative marking  <br><br>" +
                "6.Ensure all answers are submitted before the quiz time expires. Some quizzes may auto-submit when time runs out. <br><br>"+
                "7.Read all the provided instructions carefully before starting the quiz. Maintain honesty and integrity throughout the quiz.<br><br>"+
                "</html>"

        );
        add(rules1);

        submit=new JButton("SUBMIT");
        submit.setBounds(570,550,100,25);
        submit.setBackground(new Color(32,16,82));
        submit.addActionListener(this);
        submit.setForeground(Color.WHITE);
        add(submit);

        back=new JButton("BACK");
        back.setBounds(70,550,100,25);
        back.setBackground(new Color(32,16,82));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon backimage= new ImageIcon(ClassLoader.getSystemResource("image/63d9a0f0ca26a6a3da699c91132aa03d-removebg-preview.png"));
        Image scalebackimage= backimage.getImage().getScaledInstance(50,60,Image.SCALE_SMOOTH);
        ImageIcon backimage1=new ImageIcon(scalebackimage);
        JLabel backimage2= new JLabel(backimage1);
        backimage2.setBounds(85,500,50,60);
        add(backimage2);

        ImageIcon nextimage= new ImageIcon(ClassLoader.getSystemResource("image/download-removebg-preview.png"));
        Image scalenextimage= nextimage.getImage().getScaledInstance(40,50,Image.SCALE_SMOOTH);
        ImageIcon nextimage1=new ImageIcon(scalenextimage);
        JLabel nextimage2= new JLabel(nextimage1);
        nextimage2.setBounds(585,500,50,60);
        add(nextimage2);

        setSize(800,650);
        setLocation(350 ,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==submit) {
            setVisible(false);
            new Quiz(name);
        }

        else if(e.getSource()==back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[]args){
        new Rules("User");
    }
}
