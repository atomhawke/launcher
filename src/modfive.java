import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;
import java.sql.SQLOutput;
import javax.swing.*;
import javax.swing.plaf.ComponentUI;

public class modfive implements Serializable {
    static class scriptButton1Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent n){
            System.out.println("a thing!");
            try{
                File f = new File("C:\\Users\\WorkUser\\Desktop");
                Process p = Runtime.getRuntime().exec("C:\\Users\\WorkUser\\Desktop\\batch_script.bat");
                System.out.println("Thing did!");
            }catch(Exception e){
                System.out.println("error1");
            }
        }
    }
    static class scriptButton2Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent n){
            System.out.println("a things!");
            try{
                File f = new File("C:\\Users\\WorkUser\\Desktop");
                //Process p = Runtime.getRuntime().exec("C:\\Users\\WorkUser\\Desktop\\batch_script.bat");
                Process p2 = Runtime.getRuntime().exec("C:\\Users\\WorkUser\\Desktop\\batch_script2.bat");
                System.out.println("Things did!");
            }catch(Exception e){
                System.out.println("error1");
            }
        }
    }
    public static void main(String[] args) {
        //create main frame
        JFrame mainframe = new JFrame("Bit by Bit");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nLabel = new JLabel("UHHHHHHHH");
        Button scriptButton1 = new Button("Do a Thing!");
        Button scriptButton2 = new Button("Do Two Things!");

        //Add things to buttons
        scriptButton1.addActionListener(new scriptButton1Listener());
        scriptButton2.addActionListener(new scriptButton2Listener());


        mainframe.getContentPane().add(nLabel, BorderLayout.CENTER);
        mainframe.getContentPane().add(scriptButton1, BorderLayout.PAGE_START);
        mainframe.getContentPane().add(scriptButton2);
        //Display mainframe
        mainframe.pack();
        mainframe.setVisible(true);
    }

}
