package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.*;

public class Score extends JFrame implements ActionListener {
    Score(String name,int score){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("image/improve-cibil-credit-score-removebg-preview.png"));
        Image scaleimage=i1.getImage().getScaledInstance(800,400, Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(scaleimage);
        JLabel image=new JLabel(i2);
        image.setBounds(-600,100,1900,350);
        add(image);

        JLabel heading= new JLabel("Thank You "+ name +" for playing our java quiz");
        heading.setBounds(150,10, 1900,100);
        heading.setFont(new Font("COPPERPLATE GOTHIC BOLD", CENTER_BASELINE,50));
        add(heading);

        JLabel lblscore= new JLabel("Score:");
        lblscore.setBounds(900,130, 1900,100);
        lblscore.setFont(new Font("Times New Roman", BOLD,30));
        add(lblscore);

        if(score>=80){
            JLabel exscore= new JLabel(String.valueOf(score));
            exscore.setBounds(1000,15, 1900,500);
            exscore.setFont(new Font("Times New Roman", BOLD,150));
            exscore.setForeground(new Color(66,245,75));
            add(exscore);
            JLabel excmd= new JLabel("EXCELLENT ");
            excmd.setBounds(950,330, 1900,100);
            excmd.setFont(new Font("Times New Roman", BOLD,50));
            excmd.setForeground(new Color(66,245,75));
            add(excmd);
        } else if (score>=50 && score<80) {
            JLabel gdscore= new JLabel(String.valueOf(score));
            gdscore.setBounds(1000,15, 1900,500);
            gdscore.setFont(new Font("Times New Roman", BOLD,150));
            gdscore.setForeground(new Color(245,144,66));
            add(gdscore);
            JLabel gdcmd= new JLabel("GOOD");
            gdcmd.setBounds(1000,330, 1900,100);
            gdcmd.setFont(new Font("Times New Roman", BOLD,50));
            gdcmd.setForeground(new Color(245,144,66));
            add(gdcmd);
        } else if (score>=20 && score<50) {
            JLabel pscore= new JLabel(String.valueOf(score));
            pscore.setBounds(1000,15, 1900,500);
            pscore.setFont(new Font("Times New Roman", BOLD,150));
            pscore.setForeground(new Color(245,185,66));
            add(pscore);
            JLabel pcmd= new JLabel("POOR ");
            pcmd.setBounds(1000,330, 1900,100);
            pcmd.setFont(new Font("Times New Roman", BOLD,50));
            pcmd.setForeground(new Color(245,185,66));
            add(pcmd);
        }
        else{
            JLabel vpscore= new JLabel(String.valueOf(score));
            vpscore.setBounds(1000,15, 1900,500);
            vpscore.setFont(new Font("Times New Roman", BOLD,150));
            vpscore.setForeground(new Color(168,47,47));
            add(vpscore);
            JLabel vpcmd= new JLabel("VERY POOR ");
            vpcmd.setBounds(900,330, 1900,100);
            vpcmd.setFont(new Font("Times New Roman", BOLD,50));
            vpcmd.setForeground(new Color(168,47,47));
            add(vpcmd);
        }

        JButton submit=new JButton("QUIZ END...");
        submit.setBounds(920,500,250,50);
        submit.setBackground(new Color(32,16,82));
        submit.setFont(new Font("Dialog", BOLD,20));
        submit.addActionListener(this);
        //submit.setEnabled(false);
        submit.setForeground(Color.WHITE);
        add(submit);

        setSize(1900,870);
        //setLocation(200 ,150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        setVisible(false);
    }
    public static void main(String[]args){

        new Score("User",0);
    }
}
