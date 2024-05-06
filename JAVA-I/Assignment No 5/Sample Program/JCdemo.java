//Sample-3
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JCdemo extends JFrame implements ItemListener
{
     JTextField jtf;
     JCheckBox jcb1,jcb2;
     public JCdemo()
     {
           setLayout(new FlowLayouy());
           jcb1=new JCheckbox("Swing Demos");
           jcb1.addItemListener(this);
           add(jcb1);
           jcb2=new JCheckbox("Java Demos");
           jcb2.addItemListener(this);
           add(jcb2);
           jtf=new JTextField(35);
           add(jtf);
           setSize(200,200);
           setVisible(true);
           setDefaultOperation(JFrame.EXIT_ON_CLOSE);
     }
     public void itemStateChnaged(ItemEvent ie)
     {
           String text="";
           if(jcb1.isSelected())
              text=text+jcbw2.getText();
            jtf.setText(text);
     }
     public static void main(String[] agrs)
     {
        new JCdemo();
     }
}
