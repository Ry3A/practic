package lab4;
/*
import javax.swing.*;
import java.awt.*;

class LabExample extends JFrame
{
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    LabExample()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new LabExample();
    }
}
*/
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);

    JButton button = new JButton(" Add them up");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    LabExample()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    double x1 =
                            Double.parseDouble(jta1.getText().trim());
                    double x2 =
                            Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "
                            +(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !"
                            ," Object alert; alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new LabExample();
    }
}
*/
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextAreaExample extends JFrame
{
    JTextArea jta1 = new JTextArea(10,25);
    JButton button = new JButton("Add some Text");
    public TextAreaExample()
    {
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jta1);
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                        jta1.append(txt);
            }
        });

    }
    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}
*/
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BorderExample extends JFrame
{
    JPanel[] pnl = new JPanel[12];
    public BorderExample()
    {
        setLayout(new GridLayout(3,4));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("two"),BorderLayout.EAST);
        pnl[4].add(new JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new JButton("five"),BorderLayout.CENTER);
        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));
        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton("fve"));
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}
*/
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class NullLayout extends JFrame
{
    JButton but1 = new JButton("One");
    JButton but2 = new JButton("two");
    JButton but3 = new JButton("three");
    public NullLayout()
    {
        setLayout(null);
        but1.setBounds(0,0,100,20); // added at 150,300 width = 100, height=20
        but2.setSize(80,400); // added at 0,0 width = 80, height=400
        but3.setLocation(300,100);
        but3.setSize(200,75);
// those two steps can be combined in one setBounds method call
        add(but1);
        add(but2);
        add(but3);
        setSize(500,500);
    }
    public static void main(String[]args)
    {
        new NullLayout().setVisible(true);
    }
}
 */
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyMouse extends JFrame
{
    JLabel lbl = new JLabel("");
    public MyMouse()
    {
        super("Dude! Where's my mouse ?");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.NORTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            //{lbl.setText("X="+a.getX()+" Y="+a.getY());}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new MyMouse().setVisible(true);
    }
}
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LabExample extends JFrame
{
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");

    LabExample()
    {
        super("Example");
        setLayout(new FlowLayout());
        add(but1);
        add(but2);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        final int[] a = {0};
        final int[] b = {0};
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                a[0] += 1;
                lbl1.setText("Result:"+ a[0] +" X "+b[0]);
                lbl2.setText("Last Scorer: "+"AC Milan");
                if(a[0] > b[0]) {
                    lbl3.setText("Winner: " + "AC Milan");
                }
                else if(a[0] == b[0]){
                    lbl3.setText("Winner: " + "DRAW");
                }
            }
        });
        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                b[0] += 1;
                lbl1.setText("Result:"+ a[0] +" X "+b[0]);
                lbl2.setText("Last Scorer: "+"Real Madrid");
                if(a[0] < b[0]){
                    lbl3.setText("Winner: "+"Real Madrid");
                }
                else if(a[0] == b[0]){
                    lbl3.setText("Winner: " + "DRAW");
                }
            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new LabExample();
    }
}