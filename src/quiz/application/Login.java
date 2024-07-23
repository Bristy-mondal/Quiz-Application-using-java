package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules,back,submit;
    JTextField tfname,tfname1;
    Login(){
        //getContentPane().setBackground(new Color(32,16,82));
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("image/login1-removebg-preview.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(0 ,0,800,900);
        add(image);

        ImageIcon i2= new ImageIcon(ClassLoader.getSystemResource("image/9cadf0a788e336c54511bc6403929d18_t-removebg-preview.png"));
        Image scaleimage=i2.getImage().getScaledInstance(450,250, Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(scaleimage);
        JLabel image1=new JLabel(i3);
        image1.setBounds(1000 ,0,350,250);
        add(image1);

        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("image/transparent-question-mark-question-mark-coffee-on-saucer-black-1710916068612-removebg-preview.png"));
        Image scaleimage1=i4.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
        ImageIcon i5=new ImageIcon(scaleimage1);
        JLabel image2=new JLabel(i5);
        image2.setBounds(845 ,65,250,250);
        add(image2);

        JLabel heading= new JLabel("Online Quiz...");
        heading.setBounds(1030,200,300,60);
        heading.setFont(new Font("IMPACT", Font.ITALIC,50));
        heading.setForeground(new Color(32,16,82));
        add(heading);

        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("image/free-user-icon-3296-thumb.png"));
        Image scaleimage2= icon.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
        ImageIcon icon1=new ImageIcon(scaleimage2);
        JLabel name= new JLabel("UserName",icon1,JLabel.RIGHT);
        name.setHorizontalTextPosition(JLabel.LEFT);
        name.setVerticalTextPosition(JLabel.HORIZONTAL);
        name.setBounds(810,250,300,200);
        name.setFont(new Font("EUROSTYLE", Font.BOLD,15));
        name.setForeground(new Color(32,16,82));
        add(name);

        tfname= new JTextField();
        tfname.setBounds(1000,370,300,30);
        tfname.setFont(new Font("ENGRAVERGOTHIC BT",Font.PLAIN,15));
        add(tfname);

        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("image/id-card-glyph-black-icon-png_293006-removebg-preview.png"));
        Image scaleimage3= icon2.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
        ImageIcon icon3=new ImageIcon(scaleimage3);
        JLabel studentCode= new JLabel("Student Code",icon3,JLabel.RIGHT);
        studentCode.setHorizontalTextPosition(JLabel.LEFT);
        studentCode.setVerticalTextPosition(JLabel.HORIZONTAL);
        studentCode.setBounds(835,330,300,200);
        studentCode.setFont(new Font("EUROSTYLE", Font.BOLD,15));
        studentCode.setForeground(new Color(32,16,82));
        add(studentCode);

        tfname1= new JTextField("BWU/BTA/22/");
        tfname1.setBounds(1000,450,300,30);
        tfname1.setFont(new Font("ENGRAVERGOTHIC BT",Font.PLAIN,15));
        add(tfname1);

        rules=new JButton("RULES");
        rules.setBounds(900,600,120,25);
        rules.setBackground(new Color(32,16,82));
        rules.addActionListener(this);
        rules.setForeground(Color.WHITE);
        add(rules);

        submit=new JButton("SUBMIT");
        submit.setBounds(1300,600,120,25);
        submit.setBackground(new Color(32,16,82));
        submit.addActionListener(this);
        submit.setForeground(Color.WHITE);
        add(submit);

        back=new JButton("BACK");
        back.setBounds(1100,600,120,25);
        back.setBackground(new Color(32,16,82));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon rulesimage= new ImageIcon(ClassLoader.getSystemResource("image/images-removebg-preview.png"));
        Image scalerulesimage= rulesimage.getImage().getScaledInstance(37,40,Image.SCALE_SMOOTH);
        ImageIcon rulesimage1=new ImageIcon(scalerulesimage);
        JLabel rulesimage2= new JLabel(rulesimage1);
        rulesimage2.setBounds(938,550,40,40);
        add(rulesimage2);

        ImageIcon backimage= new ImageIcon(ClassLoader.getSystemResource("image/63d9a0f0ca26a6a3da699c91132aa03d-removebg-preview.png"));
        Image scalebackimage= backimage.getImage().getScaledInstance(50,60,Image.SCALE_SMOOTH);
        ImageIcon backimage1=new ImageIcon(scalebackimage);
        JLabel backimage2= new JLabel(backimage1);
        backimage2.setBounds(1130,550,50,60);
        add(backimage2);

        ImageIcon nextimage= new ImageIcon(ClassLoader.getSystemResource("image/download-removebg-preview.png"));
        Image scalenextimage= nextimage.getImage().getScaledInstance(40,50,Image.SCALE_SMOOTH);
        ImageIcon nextimage1=new ImageIcon(scalenextimage);
        JLabel nextimage2= new JLabel(nextimage1);
        nextimage2.setBounds(1340,550,50,60);
        add(nextimage2);

        setSize(1900,870);
        //setLocation(200 ,150);
        setVisible(true);



    } @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if (e.getSource()==submit) {
            String name = tfname.getText();
            setVisible(false);
            new Quiz(name);

        }

        else if(e.getSource()==back){
            setVisible(false);
        }
    }

    public static void main(String[]args){

        new Login();

    }
}
