package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String useranswers[][]=new String[10][1];
    public static int ans_given=0;
    public static int count=0;
    public static int score=0;
    JButton next,submit,lifeline;
    JLabel qno,question;

    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup group;
    public static int timer=15;
    String name;



    Quiz(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("image/quiz.jpg"));
        Image scaleimage=i1.getImage().getScaledInstance(1800,350, Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(scaleimage);
        JLabel image=new JLabel(i2);
        image.setBounds(-200 ,0,1900,350);
        add(image);

        ImageIcon i3= new ImageIcon(ClassLoader.getSystemResource("image/09136ecd5ab2b12382b8c5178eaa42f4.jpg"));
        Image clockimage=i3.getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
        ImageIcon i4=new ImageIcon(clockimage);
        JLabel image1=new JLabel(i4);
        image1.setBounds(260 ,220,1900,350);
        add(image1);

        qno= new JLabel();
        qno.setBounds(100,380, 50,30);
        qno.setFont(new Font("Times New Roman",Font.BOLD,24));
        add(qno);

        question= new JLabel();
        question.setBounds(150,380, 1600,30);
        question.setFont(new Font("Times New Roman",Font.BOLD,24));
        add(question);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        opt1=new JRadioButton();
        opt1.setBounds(170,450,700,30);
        opt1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        opt1.setBackground(Color.WHITE);
        add(opt1);

        opt2=new JRadioButton();
        opt2.setBounds(170,500,700,30);
        opt2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        opt2.setBackground(Color.WHITE);
        add(opt2);

        opt3=new JRadioButton();
        opt3.setBounds(170,550,700,30);
        opt3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        opt3.setBackground(Color.WHITE);
        add(opt3);

        opt4=new JRadioButton();
        opt4.setBounds(170,600,700,30);
        opt4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        opt4.setBackground(Color.WHITE);
        add(opt4);

        group=new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);


        submit=new JButton("SUBMIT");
        submit.setBounds(1070,680,250,50);
        submit.setBackground(new Color(168,50,68));
        submit.setFont(new Font("Dialog",Font.BOLD,20));
        submit.addActionListener(this);
        submit.setEnabled(false);
        submit.setForeground(Color.WHITE);
        add(submit);

        lifeline=new JButton("50-50 LIFELINE");
        lifeline.setBounds(1070,620,250,50);
        lifeline.setBackground(new Color(62,168,50));
        lifeline.setFont(new Font("Dialog",Font.BOLD,20));
        lifeline.addActionListener(this);
        lifeline.setForeground(Color.WHITE);
        add(lifeline);

        next=new JButton("NEXT");
        next.setBounds(1070,560,250,50);
        next.setFont(new Font("Dialog",Font.BOLD,20));
        next.setBackground(new Color(32,16,82));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        start(count);
        setSize(1900,870);
        //setLocation(200 ,150);
        setVisible(true);

    }
    public void paint(Graphics g){
        super.paint(g);
        String time="Time left: "+ timer+ " seconds";//15
        g.setColor(Color.BLACK);
        g.setFont(new Font("impact",Font.PLAIN,20));



        if (timer>=6){
            g.setColor(Color.BLACK);
            g.drawString(time,1250,435);

        }
        else if(timer>0){
            g.setColor(Color.red);
            g.drawString(time,1250,435);

        }
        else if(timer==0){
            g.setColor(Color.red);
            g.drawString("Times up!!",1250,435);
        }
        timer--;//14
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(ans_given==1){
            ans_given=0;
            timer=15;
        }
        else if(timer<0){
            timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){
                if(group.getSelection()==null){
                    useranswers[count][0]="";
                }
                else{
                    useranswers[count][0]=group.getSelection().getActionCommand();
                }
                for(int i=0;i<useranswers.length;i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score+=10;
                    }
                    else {
                        score+=0;
                    }
                }
                setVisible(false);
                new Score(name,score);
            }
            else{
                if(group.getSelection()==null){
                    useranswers[count][0]="";
                }
                else{
                    useranswers[count][0]=group.getSelection().getActionCommand();
                }
                count++;//0//1
                start(count);
            }
        }
    }





    public void actionPerformed(ActionEvent e){
        if (e.getSource()==next){
            ans_given=1;
            if(group.getSelection()==null){
                useranswers[count][0]="";
            }
            else{
                useranswers[count][0]=group.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);

            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);


        }
        else if(e.getSource()==lifeline){
            if(count==2||count==6||count==8||count==4||count==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);

        }
        else if (e.getSource()==submit) {
            ans_given=1;
            if(group.getSelection()==null){
                useranswers[count][0]="";
            }
            else{
                useranswers[count][0]=group.getSelection().getActionCommand();
            }
            for(int i=0;i<useranswers.length;i++){
                if(useranswers[i][0].equals(answers[i][1])){
                    score+=10;
                }
                else{
                    score+=0;
                }
            }
            setVisible(false);
            new Score(name,score);
        }


    }


    public void start(int count){
        qno.setText("" + (count +1)+". ");
        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        group.clearSelection();

    }


    public static void main(String[]args){
        new Quiz("User");
    }
}
