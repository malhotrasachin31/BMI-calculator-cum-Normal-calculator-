package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator extends JFrame implements ActionListener
{
    JPanel p1;
     double num1,num2;
     JLabel l4,l5;
     JLabel ax,bx,cx,dx;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bb,bc;
    JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s;
    Font f1=new Font("Arial",Font.BOLD,20);
    Font f2=new Font("Arial",Font.BOLD,40);
    Font f3=new Font("Arial",Font.BOLD,16);
    JTextField t1,t2,t3,t4,t5,t6,t7;
    
    int calculation;
    double result=0;
    
    
    Calculator()
    { 
        
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.BLACK);
        p1.setBounds(0,0,1100,40);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("calculator/images/sachin.png"));
        Image i2=i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel("first");
        l1.setIcon(i3);
        l1.setBounds(1070,10,20,20);
        p1.add(l1);
        l1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                System.exit(0);
            }
        });
        
        JLabel l2=new JLabel("CALCULATOR");
        l2.setBounds(220,10,200,30);
        l2.setForeground(Color.white);
        l2.setFont(f1);
        p1.add(l2);
        
        t1=new JTextField();
        t1.setBounds(10,50,530,80);
        t1.setFont(f2);
        t1.setEditable(false);
        t1.setBackground(new Color(7,84,95));
        t1.setForeground(Color.WHITE);
        add(t1);
        
        t2=new JTextField();
        t2.setBounds(10,160,390,40);
        t2.setEditable(false);
        t2.setBackground(new Color(7,86,95));
        t2.setForeground(Color.white);
        t2.setFont(f1);
        add(t2);
        
        b1=new JButton("ON");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(480,160,60,40);
        b1.setFocusable(false);
        b1.setEnabled(true);
        add(b1);
        b1.addActionListener(this);
        
        b2=new JButton("OFF");
        b2.setBounds(420,160,60,40);
        b2.setFocusable(false);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setEnabled(true);
        add(b2);
        b2.addActionListener(this);
        
        b3=new JButton("1");
        b3.setBounds(10,220,80,70);
        b3.setFocusable(false);
        b3.setBackground(Color.BLACK);
        b3.setFont(f1);
        b3.setForeground(Color.white);
        add(b3);
        b3.addActionListener(this);
        
        b4=new JButton("2");
        b4.setBounds(100,220,80,70);
        b4.setFocusable(false);
        b4.setFont(f1);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.white);
        add(b4);
        b4.addActionListener(this);
        
        b5=new JButton("3");
        b5.setBounds(190,220,80,70);
        b5.setFocusable(false);
        b5.setFont(f1);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.white);
        add(b5);
        b5.addActionListener(this);
        
        a=new JButton("+");
        a.setBounds(280,220,80,70);
        a.setBackground(Color.black);
        a.setFocusable(false);
        a.setFont(f1);
        a.setForeground(Color.white);
        add(a);
        a.addActionListener(this);
        
        b=new JButton("=");
        b.setBounds(370,220,80,70);
        b.setBackground(Color.black);
        b.setFocusable(false);
        b.setFont(f1);
        b.setForeground(Color.white);
        add(b);
        b.addActionListener(this);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("calculator/images/3.png"));
        Image img2=img.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        e=new JButton("");
        e.setBounds(460,220,80,70);
        e.setBackground(Color.black);
        e.setFocusable(false);
        e.setFont(f1);
        e.setIcon(img3);
        e.setForeground(Color.white);
        add(e);
        e.addActionListener(this);
        
        b6=new JButton("4");
        b6.setBounds(10,300,80,70);
        b6.setFocusable(false);
        b6.setBackground(Color.BLACK);
        b6.setFont(f1);
        b6.setForeground(Color.white);
        add(b6);
        b6.addActionListener(this);
        
        b7=new JButton("5");
        b7.setBounds(100,300,80,70);
        b7.setFocusable(false);
        b7.setBackground(Color.BLACK);
        b7.setFont(f1);
        b7.setForeground(Color.white);
        add(b7);
        b7.addActionListener(this);
        
        b8=new JButton("6");
        b8.setBounds(190,300,80,70);
        b8.setFocusable(false);
        b8.setFont(f1);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.white);
        add(b8);
        b8.addActionListener(this);
        
        b=new JButton("*");
        b.setBounds(280,300,80,70);
        b.setBackground(Color.black);
        b.setFocusable(false);
        b.setFont(f1);
        b.setForeground(Color.white);
        add(b);
        b.addActionListener(this);
        
         d=new JButton("-");
        d.setBounds(370,300,80,70);
        d.setBackground(Color.black);
        d.setFocusable(false);
        d.setFont(f1);
        d.setForeground(Color.white);
        add(d);
        d.addActionListener(this);
        
        c=new JButton("/");
        c.setBounds(460,300,80,70);
        c.setBackground(Color.black);
        c.setFocusable(false);
        c.setFont(f1);
        c.setForeground(Color.white);
        add(c);
        c.addActionListener(this);
        
        b9=new JButton("7");
        b9.setBounds(10,380,80,70);
        b9.setFocusable(false);
        b9.setBackground(Color.BLACK);
        b9.setFont(f1);
        b9.setForeground(Color.white);
        add(b9);
        b9.addActionListener(this);
        
        ba=new JButton("8");
        ba.setBounds(100,380,80,70);
        ba.setFocusable(false);
        ba.setFont(f1);
        ba.setBackground(Color.BLACK);
        ba.setForeground(Color.white);
        add(ba);
        ba.addActionListener(this);
        
        bb=new JButton("9");
        bb.setBounds(190,380,80,70);
        bb.setFocusable(false);
        bb.setFont(f1);
        bb.setBackground(Color.BLACK);
        bb.setForeground(Color.white);
        add(bb);
        bb.addActionListener(this);
       
        bc=new JButton("0");
        bc.setBounds(280,380,80,70);
        bc.setFocusable(false);
        bc.setFont(f1);
        bc.setBackground(Color.BLACK);
        bc.setForeground(Color.white);
        add(bc);
        bc.addActionListener(this);
        
        f=new JButton("x^2");
        f.setBounds(370,380,80,70);
        f.setFocusable(false);
        f.setFont(f1);
        f.setBackground(Color.BLACK);
        f.setForeground(Color.white);
        add(f);
        f.addActionListener(this);
        
        g=new JButton("X^3");
        g.setBounds(460,380,80,70);
        g.setFocusable(false);
        g.setFont(f1);
        g.setBackground(Color.BLACK);
        g.setForeground(Color.white);
        add(g);
        g.addActionListener(this);
        
        h=new JButton("sqrt");
        h.setBounds(10,460,80,70);
        h.setFocusable(false);
        h.setFont(f1);
        h.setBackground(Color.BLACK);
        h.setForeground(Color.white);
        add(h);
        h.addActionListener(this);
        
        i=new JButton("cbrt");
        i.setBounds(100,460,80,70);
        i.setFocusable(false);
        i.setFont(f1);
        i.setBackground(Color.BLACK);
        i.setForeground(Color.white);
        add(i);
        i.addActionListener(this);
        
        j=new JButton("Sin");
        j.setBounds(190,460,80,70);
        j.setFocusable(false);
        j.setFont(f1);
        j.setBackground(Color.BLACK);
        j.setForeground(Color.white);
        add(j);
        j.addActionListener(this);
        
        k=new JButton("Cos");
        k.setBounds(280,460,80,70);
        k.setFocusable(false);
        k.setFont(f1);
        k.setBackground(Color.BLACK);
        k.setForeground(Color.white);
        add(k);
        k.addActionListener(this);
        
        l=new JButton("Tan");
        l.setBounds(370,460,80,70);
        l.setFocusable(false);
        l.setFont(f1);
        l.setBackground(Color.BLACK);
        l.setForeground(Color.white);
        add(l);
        l.addActionListener(this);
        
        m=new JButton("Log");
        m.setBounds(460,460,80,70);
        m.setFocusable(false);
        m.setFont(f1);
        m.setBackground(Color.BLACK);
        m.setForeground(Color.white);
        add(m);
        m.addActionListener(this);
        
        n=new JButton("Cosec");
        n.setBounds(10,540,80,70);
        n.setFocusable(false);
        n.setBackground(Color.BLACK);
        n.setForeground(Color.white);
        add(n);
        n.addActionListener(this);
        
        o=new JButton("Sec");
        o.setBounds(100,540,80,70);
        o.setFocusable(false);
        o.setFont(f1);
        o.setBackground(Color.BLACK);
        o.setForeground(Color.white);
        add(o);
        o.addActionListener(this);
        
        p=new JButton("Cot");
        p.setBounds(190,540,80,70);
        p.setFocusable(false);
        p.setFont(f1);
        p.setBackground(Color.BLACK);
        p.setForeground(Color.white);
        add(p);
        p.addActionListener(this);
        
        q=new JButton("e^");
        q.setBounds(280,540,80,70);
        q.setFocusable(false);
        q.setFont(f1);
        q.setBackground(Color.BLACK);
        q.setForeground(Color.white);
        add(q);
        q.addActionListener(this);
        
        r=new JButton("%");
        r.setBounds(370,540,80,70);
        r.setFocusable(false);
        r.setFont(f1);
        r.setBackground(Color.BLACK);
        r.setForeground(Color.white);
        add(r);
        r.addActionListener(this);
        
        s=new JButton(".");
        s.setBounds(460,540,80,70);
        s.setFocusable(false);
        s.setFont(f1);
        s.setBackground(Color.BLACK);
        s.setForeground(Color.white);
        add(s);
        s.addActionListener(this);
        
         JLabel l3=new JLabel("BODY MASS INDEX CALCULATOR");
        l3.setBounds(650,10,500,30);
        l3.setForeground(Color.white);
        l3.setFont(f1);
        p1.add(l3);
        
         t3=new JTextField();
        t3.setBounds(560,50,530,80);
        t3.setFont(f2);
        t3.setEditable(false);
        t3.setBackground(new Color(7,84,95));
        t3.setForeground(Color.WHITE);
        add(t3);
        
        l4=new JLabel("METRIC");
        l4.setBounds(580,160,100,30);
        l4.setFont(f1);
        l4.setForeground(Color.white);
        add(l4);
        l4.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me1)
            {
               
            }
        });
        
        JLabel l6=new JLabel("Height (in cm)");
        l6.setBounds(580,214,150,30);
        l6.setFont(f1);
        l6.setForeground(Color.white);
        add(l6);
        
        t4=new JTextField();
        t4.setBounds(750,214,70,30);
        t4.setBackground(new Color(7,86,95));
        t4.setForeground(Color.white);
        t4.setFont(f1);
        add(t4);
        
        JLabel l7=new JLabel("Weight (in Kg)");
        l7.setBounds(580,254,150,30);
        l7.setFont(f1);
        l7.setForeground(Color.white);
        add(l7);
        
        t5=new JTextField();
        t5.setBounds(750,254,70,30);
        t5.setBackground(new Color(7,86,95));
        t5.setForeground(Color.white);
        t5.setFont(f1);
        add(t5);
        
        JButton calculate=new JButton("Calculate");
        calculate.setBounds(625,320,150,30);
        calculate.setForeground(Color.BLACK);
        calculate.setBackground(Color.white);
        calculate.setFont(f1);
        calculate.setFocusable(false);
        add(calculate);
         calculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                Double height=Double.parseDouble(t4.getText());
                Double weight=Double.parseDouble(t5.getText());
                double height2=height/100;
                double bmi1=weight/Math.pow(height2, 2);
                if(bmi1<=18.5)
                {
                    ax.setForeground(Color.red);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.white);
                    dx.setForeground(Color.white);
                }
                if(bmi1>=18.5 && bmi1<=24.9)
                {
                    ax.setForeground(Color.white);
                    bx.setForeground(Color.green);
                    cx.setForeground(Color.white);
                    dx.setForeground(Color.white);
                }
                if(bmi1>=25 && bmi1<=29.9)
                {
                    ax.setForeground(Color.white);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.red);
                    dx.setForeground(Color.white);
                }
                if(bmi1>=30)
                {
                    dx.setForeground(Color.red);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.white);
                    ax.setForeground(Color.white);
                }
                t3.setText(String.valueOf(bmi1));
            }
        });
        
        l5=new JLabel("IMPERIAL");
        l5.setBounds(580,370,100,30);
        l5.setFont(f1);
        l5.setForeground(Color.white);
        add(l5);
        l5.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me1)
            {
               
            }
        });
        
         JLabel l8=new JLabel("Height (in Inch)");
        l8.setBounds(580,414,150,30);
        l8.setFont(f1);
        l8.setForeground(Color.white);
        add(l8);
        
        t6=new JTextField();
        t6.setBounds(750,414,70,30);
        t6.setBackground(new Color(7,86,95));
        t6.setForeground(Color.white);
        t6.setFont(f1);
        add(t6);
        
        JLabel l9=new JLabel("Weight (in Lbs)");
        l9.setBounds(580,454,150,30);
        l9.setFont(f1);
        l9.setForeground(Color.white);
        add(l9);
        
        t7=new JTextField();
        t7.setBounds(750,454,70,30);
        t7.setBackground(new Color(7,86,95));
        t7.setForeground(Color.white);
        t7.setFont(f1);
        add(t7);
        
        JButton calculate1=new JButton("Calculate");
        calculate1.setBounds(625,500,150,30);
        calculate1.setForeground(Color.BLACK);
        calculate1.setBackground(Color.white);
        calculate1.setFont(f1);
        calculate1.setFocusable(false);
        add(calculate1);
        calculate1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                  Double height=Double.parseDouble(t6.getText());
                  Double weight=Double.parseDouble(t7.getText());
                  double bmi2=703*weight/Math.pow(height, 2);
                    if(bmi2<=18.5)
                {
                    ax.setForeground(Color.red);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.white);
                    dx.setForeground(Color.white);
                }
                if(bmi2>=18.5 && bmi2<=24.9)
                {
                    ax.setForeground(Color.white);
                    bx.setForeground(Color.green);
                    cx.setForeground(Color.white);
                    dx.setForeground(Color.white);
                }
                if(bmi2>=25 && bmi2<=29.9)
                {
                    ax.setForeground(Color.white);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.red);
                    dx.setForeground(Color.white);
                }
                if(bmi2>=30)
                {
                    dx.setForeground(Color.red);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.white);
                    ax.setForeground(Color.white);
                }
                t3.setText(String.valueOf(bmi2));
            }
        });
        
        ax=new JLabel("Underweight = <18.5");
        ax.setBounds(870,214,200,30);
        ax.setFont(f3);
        ax.setForeground(Color.white);
        add(ax);
        
        bx=new JLabel("Normal weight = 18.5-24.9");
        bx.setBounds(870,244,200,30);
        bx.setFont(f3);
        bx.setForeground(Color.white);
        add(bx);
        
        cx=new JLabel("Overerweight = 25-29.9");
        cx.setBounds(870,274,200,30);
        cx.setFont(f3);
        cx.setForeground(Color.white);
        add(cx);
        
        dx=new JLabel("Obesity = BMI of 30 or greater");
        dx.setBounds(870,304,250,30);
        dx.setFont(f3);
        dx.setForeground(Color.white);
        add(dx);
        
        setLayout(null);
        setSize(1100,650);
        setLocation(500,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setUndecorated(true);
    }
  
    public static void main(String args[])
    {
        new Calculator().setVisible(true);
    }
    public void operation()
    {
        
         switch(calculation)
         {
             case 1:
             {
               num2=Double.parseDouble(t2.getText());
              result=num1+num2;
              t1.setText(Double.toString(result));
              break;
             }
             case 2:
             {
                num2=Double.parseDouble(t2.getText());
                result=num1-num2;
                t1.setText(Double.toString(result));
                break;
             }
             case 3:
             {
                  num2=Double.parseDouble(t2.getText());
                 result=num1*num2;
                 t1.setText(Double.toString(result));
                 break;
             }
             case 4:
             {
                  num2=Double.parseDouble(t2.getText());
                 result=num1/num2;
                 t1.setText(Double.toString(result));
                 break;
             }
             case 5:
             {
                 result=Math.pow(num1, 2);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 6:
             {
                
                 result=Math.pow(num1, 3);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 7:
             {
                 result=Math.sqrt(num1);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 8:
             {
                 result=Math.cbrt(num1);
                 t1.setText(Double.toString(result));
                 break;
             }
              case 9:
             {
                
                 result=Math.sin(num1);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 10:
             {
                 result=Math.cos(num1);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 11:
             {
                 result=Math.tan(num1);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 12:
             {
                result=Math.log(num1);
                 t1.setText(Double.toString(result));
                 break; 
             }
              case 13:
             {
                
                 result=1/Math.sin(num1);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 14:
             {
                 result=1/Math.cos(num1);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 15:
             {
                 result=1/Math.tan(num1);
                 t1.setText(Double.toString(result));
                 break;
             }
             case 16:
             {
                 result=Math.pow(2.718, num1);
                 t1.setText(Double.toString(result));
                 break;
             }        
              case 17:
             {
                 result=num1/100;
                 t1.setText(Double.toString(result));
                 break;
             }
             case 18:
             {
                
             }        
         }
    }
    @Override
    public void actionPerformed(ActionEvent e1) 
    {
     String str=e1.getActionCommand();
     
     if(str.equals("ON"))
     {
         t2.setText("");
         t1.setText("0");
         b3.setEnabled(true);
         b4.setEnabled(true);
         b5.setEnabled(true);
         b6.setEnabled(true); 
         b7.setEnabled(true);
         b8.setEnabled(true);
         b9.setEnabled(true);
         ba.setEnabled(true);
         bb.setEnabled(true);
         bc.setEnabled(true);
         a.setEnabled(true);
         b.setEnabled(true);
         c.setEnabled(true);
         d.setEnabled(true);
         e.setEnabled(true);
         f.setEnabled(true);
         g.setEnabled(true);
         h.setEnabled(true);
         i.setEnabled(true);
         j.setEnabled(true);
         k.setEnabled(true);
         l.setEnabled(true);
         m.setEnabled(true);
         n .setEnabled(true);
         o.setEnabled(true);
         p.setEnabled(true);
         q.setEnabled(true);
         r.setEnabled(true);
         s.setEnabled(true);
     }
     if(str.equals("OFF"))
     {
         t1.setText("OFF");
          b3.setEnabled(false);
         b4.setEnabled(false);
         b5.setEnabled(false);
         b6.setEnabled(false); 
         b7.setEnabled(false);
         b8.setEnabled(false);
         b9.setEnabled(false);
         ba.setEnabled(false);
         bb.setEnabled(false);
         bc.setEnabled(false);
         a.setEnabled(false);
         b.setEnabled(false);
         c.setEnabled(false);
         d.setEnabled(false);
         e.setEnabled(false);
         f.setEnabled(false);
         g.setEnabled(false);
         h.setEnabled(false);
         i.setEnabled(false);
         j.setEnabled(false);
         k.setEnabled(false);
         l.setEnabled(false);
         m.setEnabled(false);
         n.setEnabled(false);
         o.setEnabled(false);
         p.setEnabled(false);
         q.setEnabled(false);
         r.setEnabled(false);
         s.setEnabled(false);
         
     }
     if(str.equals("1"))
     {
        t2.setText(t2.getText()+"1");
     }
     if(str.equals("2"))
     {
         t2.setText(t2.getText()+"2");
     }
     if(str.equals("3"))
     {
         t2.setText(t2.getText()+"3");
     }
     if(str.equals("4"))
     {
         t2.setText(t2.getText()+"4");
     }
     if(str.equals("5"))
     {
         t2.setText(t2.getText()+"5");
     }
     if(str.equals("6"))
     {
         t2.setText(t2.getText()+"6");
     }
     if(str.equals("7"))
     {
         t2.setText(t2.getText()+"7");
     }
       if(str.equals("8"))
     {
         t2.setText(t2.getText()+"8");
     }
     if(str.equals("9"))
     {
         t2.setText(t2.getText()+"9");
     }
       if(str.equals("0"))
     {
         t2.setText(t2.getText()+"0");
     }
     if(str.equals("*"))
     {
          num1=Double.parseDouble(t2.getText());
         calculation=3;
         t2.setText("");
     }
     if(str.equals("+"))
     {
         num1=Double.parseDouble(t2.getText());
        calculation=1;
        t2.setText(""); 
     }
     if(str.equals("-"))
     {
          num1=Double.parseDouble(t2.getText());
         calculation=2;
        t2.setText("");  
     }   
       if(str.equals("/"))
     {
          num1=Double.parseDouble(t2.getText());
         calculation=4;
        t2.setText("");  
     }    
     
     if(str.equals("="))
     {
         operation();
         t2.setText("");
     }
     if(str.equals("x^2"))
     {
          num1=Double.parseDouble(t2.getText());
         calculation=5;
        t2.setText(""); 
     }
     if(str.equals("X^3"))
     {
          num1=Double.parseDouble(t2.getText());
         calculation=6;
        t2.setText(""); 
     }
     if(str.equals("sqrt"))
     {
            num1=Double.parseDouble(t2.getText());
           calculation=7;
           t2.setText("");
     }
     if(str.equals("cbrt"))
     {
            num1=Double.parseDouble(t2.getText());
           calculation=8;
           t2.setText("");
     }
     if(str.equals("Sin"))
     {
           num1=Double.parseDouble(t2.getText());
           calculation=9;
           t2.setText("");
     }
     if(str.equals("Cos"))
     {
          num1=Double.parseDouble(t2.getText());
           calculation=10;
           t2.setText(""); 
     }
     if(str.equals("Tan"))
     {
           num1=Double.parseDouble(t2.getText());
           calculation=11;
           t2.setText("");
     }
     if(str.equals("Log"))
     {
            num1=Double.parseDouble(t2.getText());
           calculation=12;
           t2.setText("");
     }
      if(str.equals("Cosec"))
     {
           num1=Double.parseDouble(t2.getText());
           calculation=13;
           t2.setText("");
     }
     if(str.equals("Sec"))
     {
          num1=Double.parseDouble(t2.getText());
           calculation=14;
           t2.setText(""); 
     }
     if(str.equals("Cot"))
     {
           num1=Double.parseDouble(t2.getText());
           calculation=15;
           t2.setText("");
     }
       if(str.equals("e^"))
     {
           num1=Double.parseDouble(t2.getText());
           calculation=16;
           t2.setText("");
     }
       if(str.equals("%"))
     {
           num1=Double.parseDouble(t2.getText());
           calculation=17;
           t2.setText("");
     }
       if(str.equals("."))
     {
          t2.setText(t2.getText()+".");
     }
       if(str.equals(""))
       {
           int length=t2.getText().length();
           int number=t2.getText().length()-1;
           String store;
           if(length>0)
           {
               StringBuilder back=new StringBuilder(t2.getText());
               back.deleteCharAt(number);
               store=back.toString();
               t2.setText(store);
           }
       }
    }
}