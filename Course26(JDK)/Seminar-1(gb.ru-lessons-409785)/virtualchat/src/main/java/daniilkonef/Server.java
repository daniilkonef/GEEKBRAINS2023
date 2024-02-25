package daniilkonef;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Server extends JFrame{
    private static final int WIDTH =555;
    private static final int HEIGHT =55*2;
    private final JButton buttonStart = new JButton("Start");
    private final JButton buttonStop = new JButton("Stop");
    private final JTextArea logArea = new JTextArea();
    private boolean isServerWorking;


    Server(){
        isServerWorking = false;
        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = false;
                System.out.println("Server is stopped ");
            }
        });

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = true;
                System.out.println("Server is started ");
            }
        });


        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLayout(new GridLayout(1,2));
        add(buttonStart);
        add(buttonStop);

        setVisible(true);
    }

}
