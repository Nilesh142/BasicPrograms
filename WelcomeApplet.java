import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class WelcomeApplet extends JApplet 
{
   public void init()
    { 
       EventQueue.invokeLater(new Runnable()
      {
       public void run()
         {
            setLayout ( new BorderLayout());
      
        JLabel label = new JLabel(getParameter("greeting"),SwingConstants.CENTER);

 label.setFont(new Font ("Serif", Font.BOLD,18));
 add(label, BorderLayout.CENTER);
 
 JPanel panel = new JPanel();
 
 JButton cayButton = new JButton("Cay Horstmann");
 cayButton.addActionListener(makeAction("http:www.horstmann.com"));
 panel.add(cayButton);

 JButton garyButton = new JButton("Gray Cornell");
 garyButton.addActionListener(makeAction("mailto:gary_cornell@appress.com"));
 panel.add(garyButton);

add(panel, BorderLayout.SOUTH);
    }
  });
}


private ActionListener makeAction(final String urlString)
  {
    return new ActionListener()
      {
        public void actionPerformed(ActionEvent event)
         { 
            try 
             {
                getAppletContext().showDocument(new URL(urlString));
              }
            catch(MalformedURLException e)
              {
                 e.printStcakTrace();
               }
          }
      };
   }
}





















           