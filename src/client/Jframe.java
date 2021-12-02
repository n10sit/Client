package client;

import java.net.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Jframe extends client implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public Jframe(String args[]) {
		super();
		try {
			sign.signlink.startpriv(InetAddress.getByName(server));
			initUI();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void initUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JPopupMenu.setDefaultLightWeightPopupEnabled(false);
			frame = new JFrame("Infinitum");
			frame.setLayout(new BorderLayout());
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel gamePanel = new JPanel();

			gamePanel.setLayout(new BorderLayout());
			gamePanel.add(this);
			gamePanel.setPreferredSize(new Dimension(765, 503));

			new JMenu("Information");
			new JMenu("World Map");
			new JMenu("Item List");

			new JMenuBar();
			new JMenuBar();

			//frame.add(jmenubar);
			//menuBar.add(fileMenu);
			//menuBar.add(toolMenu);
			//menuBar.add(infoMenu);
			//frame.getContentPane().add(menuBar, BorderLayout.NORTH);
			frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
			frame.pack();

			frame.setVisible(true); // can see the client
			frame.setResizable(true); // resizeable frame

			init();
		} catch (Exception e) {
				e.printStackTrace();
		}
	}

	public URL getCodeBase() {
		try {
			return new URL("http://" + server + "/cache");
		} catch (Exception e) {
			return super.getCodeBase();
		}
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public void loadError(String s) {
		System.out.println("loadError: " + s);
	}

	public String getParameter(String key) {
			return "";
	}

	private static void openUpWebSite(String url) {
		Desktop d = Desktop.getDesktop();
		try {
			d.browse(new URI(url)); 	
		} catch (Exception e) {
		}
	}

	public void actionPerformed(ActionEvent evt) {
		String cmd = evt.getActionCommand();
		try {
			if (cmd != null) {
				if (cmd.equalsIgnoreCase("Exit Exion Client")) {
					System.exit(0);
				}
				if (cmd.equalsIgnoreCase("Forums")) {
					openUpWebSite("yourforumlinkhere.com");
				}
				if (cmd.equalsIgnoreCase("World Map")){
				launchURL("1. Load WorldMap.bat");
				}
				if (cmd.equalsIgnoreCase("Item List")){
				launchURL("1. Load Items.bat");
				}		
			}
		} catch (Exception e) {
		}
	}
}