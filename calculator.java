
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class calculator implements ActionListener {
    JFrame f;
    int c;
    double n;
    String s1, s2, s3, s4, s5;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bmin, bdel, badd, bdot, bsub, bmul, bdiv, bpow, beq, bclr, bmod;
    JTextField t1;
    GridLayout g;
    JPanel p, p1;
    JLabel l;

    calculator() {
        f = new JFrame("Simple Calculator");
        f.setResizable(false);
        l = new JLabel("Simple Calculator");
        l.setForeground(Color.BLUE);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(20);
        t1.setBorder(new LineBorder(Color.BLACK, 2));

        b0 = new JButton("0");
        b0.addActionListener(this);

        b1 = new JButton("1");
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.addActionListener(this);

        bmin = new JButton("(-1)");
        bmin.addActionListener(this);

        bdot = new JButton(".");
        bdot.addActionListener(this);

        badd = new JButton("+");
        badd.addActionListener(this);

        bsub = new JButton("-");
        bsub.addActionListener(this);

        bmul = new JButton("*");
        bmul.addActionListener(this);

        bdiv = new JButton("/");
        bdiv.addActionListener(this);

        bmod = new JButton("%");
        bmod.addActionListener(this);

        beq = new JButton("=");
        beq.addActionListener(this);

        bclr = new JButton("CLR");
        bclr.addActionListener(this);

        bpow = new JButton("^");
        bpow.addActionListener(this);

        bdel = new JButton("DEL");
        bdel.addActionListener(this);

        p = new JPanel();
        g = new GridLayout(7, 2);
        p.setLayout(g);
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);

        p.add(badd);
        p.add(bsub);
        p.add(bmul);
        p.add(bdiv);
        p.add(bmod);

        p.add(bdot);
        p.add(bmin);
        p.add(bpow);
        p.add(beq);
        p.add(bdel);
        p.add(bclr);

        f.add(l);
        f.add(t1);
        f.add(p);
   
        f.setSize(300, 300);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            s3 = t1.getText();
            s4 = "0";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == b1) {
            s3 = t1.getText();
            s4 = "1";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == b2) {
            s3 = t1.getText();
            s4 = "2";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == b3) {
            s3 = t1.getText();
            s4 = "3";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == b4) {
            s3 = t1.getText();
            s4 = "4";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == b5) {
            s3 = t1.getText();
            s4 = "5";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == b6) {
            s3 = t1.getText();
            s4 = "6";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == b7) {
            s3 = t1.getText();
            s4 = "7";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == b8) {
            s3 = t1.getText();
            s4 = "8";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == b9) {
            s3 = t1.getText();
            s4 = "9";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == bmin) {
            s1 = t1.getText();
            t1.setText("");
            c = 0;
        }
        if (e.getSource() == badd) {
            s1 = t1.getText();
            t1.setText("");
            c = 1;
        }
        if (e.getSource() == bdot) {
            t1.setText(t1.getText().concat("."));
            c = 7;
        }
        if (e.getSource() == bsub) {
            s1 = t1.getText();
            t1.setText("");
            c = 2;
        }
        if (e.getSource() == bdel) {
            t1.setText(t1.getText().substring(0, (t1.getText().length() - 1)));
        }
        if (e.getSource() == bmul) {
            s1 = t1.getText();
            t1.setText("");
            c = 3;
        }
        if (e.getSource() == bdiv) {
            s1 = t1.getText();
            t1.setText("");
            c = 4;
        }
        if (e.getSource() == bmod) {
            s1 = t1.getText();
            t1.setText("");
            c = 5;
        }
        if (e.getSource() == bpow) {
            s1 = t1.getText();
            t1.setText("");
            c = 6;
        }
        if (e.getSource() == beq) {
            s2 = t1.getText();
            if (c == 0) {
                n = Double.parseDouble(s2) * -1;
                t1.setText(String.valueOf(n));
            }
            if (c == 1) {
                System.out.println(t1.getText());
                n = Double.parseDouble(s1) + Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
            if (c == 2) {
                n = Double.parseDouble(s1) - Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
            if (c == 3) {
                n = Double.parseDouble(s1) * Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
            if (c == 4) {
                n = Double.parseDouble(s1) / Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
            if (c == 5) {
                n = Double.parseDouble(s1) % Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
            if (c == 6) {
                n = (Math.pow(Double.parseDouble(s1), Double.parseDouble(s2)));
                t1.setText(String.valueOf(n));
            }
            if (c == 7) {
                n = Double.parseDouble(s1);
                t1.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == bclr) {
            t1.setText("");
        }

    }

    public static void main(String[] args) {
        calculator c = new calculator();
    }
}