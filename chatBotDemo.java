import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class chatBot extends JFrame {
    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();

    chatBot() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setTitle("ChatBot");
        f.add(ca);
        f.add(cf);
        ca.setSize(2000, 600);
        ca.setLocation(2, 1);
        ca.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        ca.setBackground(Color.BLACK);
        cf.setBounds(1, 605, 1000, 40);
        cf.setFont(new Font("Calibri", Font.PLAIN, 20));
        f.add(b);
        l.setText("SUBMIT");
        b.setBounds(1010, 605, 267, 40);
        l.setBounds(3, 3, b.getWidth() + 80, b.getHeight());
        l.setFont(new Font("Robosto", Font.BOLD, 20));

        b.add(l);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b) {
                    String text = cf.getText().toLowerCase();
                    ca.setForeground(Color.GREEN);
                    ca.append("You-->" + text + "\n");
                    cf.setText("");
                    if (text.contains("hi") || text.contains("hello")) {
                        replyMeth("Hello! How can I assist you Today");
                    } else if (text.contains("how are you")) {
                        replyMeth("I'm Good :).Thankyou for asking!");
                    } else if (text.contains("what is your name")) {
                        replyMeth(
                                "I'm an AI language model created by OpenAI, so I don't have a personal name like a human does. You can simply refer to me as ChatGPT or just\n \"assistant.\"How can I assist you further?");
                    } else if (text.contains("suggest me a good personality development book")) {
                        replyMeth(
                                "I would recommend \"The 7 Habits of Highly Effective People\" by Stephen R.Covey as a valuable resource for individuals seeking to cultivate and\n enhance their personal development and character");
                    } else if (text.contains("what is your gender")) {
                        replyMeth(
                                "As an artificial intelligence, I don't have a gender.I'm a machine learning model created by OpenAI, designed to assist users like you with a wide\n range of tasks and inquiries. How can I assist you further?");
                    } else if (text.contains("love you")) {
                        replyMeth(
                                "Thank you for your appreciation!Remember, I'm here to assist you with any questions or tasks you may have.\nIf there's anything you need help with, just let me know!");
                    } else if (text.contains("bye")) {
                        replyMeth(
                                "Too Soon :( \nAnyWays,If you ever need assistance or have questions in the future, don't hesitate to reach out. Take care!");
                    } else if (text.contains("i hate you")) {
                        replyMeth(
                                "I'm sorry to hear that you're feeling that way. If there's anything specific that's bothering you or anything you'd like to discuss,\n please feel free to share. I'm here to assist you in any way I can.");
                    } else {
                        replyMeth(
                                "It seems like you may have accidentally typed a random string of characters. If you have any questions or need assistance, feel free to let me know!");
                    }
                }
            }
        });
    }

    public void replyMeth(String s) {
        ca.append("chatBot-->" + s + "\n");
    }
}

public class chatBotDemo {
    public static void main(String[] args) {
        new chatBot();
    }

}