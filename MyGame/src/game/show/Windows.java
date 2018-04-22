package game.show;

import java.awt.Dimension;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Windows extends JFrame{
	private Hashtable<String, Button> buttons = new Hashtable<String, Button>();
	private JPanel areaGame;
	private Dimension sizeArea = new Dimension(1000, 700);
	
	public Windows(){ 
		super("Walbreaker");
		
		areaGame = new Menu();
		areaGame.setPreferredSize(sizeArea);

		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		areaGame.setLayout(null);
		this.setResizable(false);
		
		buttons.put("newPlayeur", new Button("newPlayeur", sizeArea));
		buttons.put("continue", new Button("continue", sizeArea));
		//180 46 Taille originale de l'image sans la marge du JButton
		buttons.get("newPlayeur").setBounds(100, 400, 180, 46);
		buttons.get("continue").setBounds(1000 - 100 - 180 , 400, 180, 46);
		areaGame.add(buttons.get("newPlayeur"));
		areaGame.add(buttons.get("continue"));
		
		this.setContentPane(areaGame);
		this.setVisible(true);
		pack();
	}
	
}