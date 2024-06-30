package GUI;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainAndSystem.AspavaSys;

import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFrame frame = new MainFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
	
	SecondFrame sf = new SecondFrame(this);
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public MainFrame() {
		setTitle("Welcome to Aspava");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1, 40, 499, 115);
		contentPane.add(textArea);
		

		JRadioButton FoodRBN = new JRadioButton("Food");
		buttonGroup.add(FoodRBN);
		FoodRBN.setBounds(223, 79, 109, 23);
		contentPane.add(FoodRBN);
		
		JRadioButton BevRBN = new JRadioButton("Beverage");
		buttonGroup.add(BevRBN);
		BevRBN.setBounds(356, 79, 109, 23);
		contentPane.add(BevRBN);
		
		JRadioButton BothRBN = new JRadioButton("Both");
		buttonGroup.add(BothRBN);
		BothRBN.setBounds(488, 79, 109, 23);
		contentPane.add(BothRBN);
		
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(51, 112, 518, 156); // same as text area
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		// Add the scroll pane to the content pane
		contentPane.add(scrollPane);
		
		JButton readBTN = new JButton("Read Files");
		readBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AspavaSys.readFromFile();
				textArea.setText("file has been readed");
			}
		});
		readBTN.setBounds(51, 33, 137, 23);
		contentPane.add(readBTN);
		
		JButton addDeleteBTN = new JButton("Add/Delete");
		addDeleteBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sf.setVisible(true);
				setVisible(false);
			}
		});
		addDeleteBTN.setBounds(399, 321, 137, 23);
		contentPane.add(addDeleteBTN);
		
		JButton calcBTN = new JButton("Calculate Price");
		calcBTN.setBounds(245, 33, 137, 23);
		contentPane.add(calcBTN);
		
		JButton displayBTN = new JButton("Display");
		displayBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AspavaSys.getAspavaList().isEmpty()) {
					textArea.setText("file has not been readed yet");
				}
				else if(FoodRBN.isSelected()) {
					textArea.setText(AspavaSys.getAspavaString("f"));	
				}
				else if (BevRBN.isSelected()) {
					textArea.setText(AspavaSys.getAspavaString("b"));
				}
				else if(BothRBN.isSelected()) {
					textArea.setText(AspavaSys.display());
				}
				
			}
		});
		displayBTN.setBounds(51, 79, 137, 23);
		contentPane.add(displayBTN);
	}
}
