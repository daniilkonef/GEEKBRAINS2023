package daniilkonef;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Server extends JFrame{
    private static final int WIDTH =555;
    private static final int HEIGHT =555;
    private final JButton buttonStart = new JButton("Start");
    private final JButton buttonStop = new JButton("Stop");
    private final JTextArea logArea = new JTextArea();
    private boolean isServerWorking;


    Server(){
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Server Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLayout(new GridLayout(1,2));
        add(buttonStart);
        add(buttonStop);

        setVisible(true);
    }

}
