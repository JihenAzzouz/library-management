package vue1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.toedter.calendar.JCalendar;

public class C
{
 
	/** */
	static private JCalendar jCalendar = null;
 
	/**
         * @param args
         */
	public static void main(String[] args)
	{
		// Display the frame with the main panel inside
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
 
			public void run()
			{
				// Create and set up the window.
				JFrame frame = new JFrame("Test JCalendar");
				frame.setLayout(new GridBagLayout());
 
				Insets insets0000 = new Insets(0, 0, 0, 0);
				GridBagConstraints c;
 
				jCalendar = new JCalendar();
				c = new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets0000, 0, 0);
				frame.getContentPane().add(jCalendar, c);
 
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			}
		});
 
	}
 
}
