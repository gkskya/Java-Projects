package GUI;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainAndSystem.AspavaSys;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SecondFrame extends JFrame {

	private JPanel contentPane;
	MainFrame mf1 = null; 
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SecondFrame frame = new SecondFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SecondFrame(MainFrame mf) {
		setTitle("Aspava Secondary Frame");
		mf1 = mf;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton closeBTN = new JButton("Close");
		closeBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mf1.setVisible(true);
				dispose();
			}
		});
		closeBTN.setBounds(347, 358, 89, 23);
		contentPane.add(closeBTN);
		
		JTextArea idTF = new JTextArea();
		idTF.setBounds(93, 31, 95, 23);
		contentPane.add(idTF);
		
		JTextArea nameTF = new JTextArea();
		nameTF.setBounds(93, 65, 95, 23);
		contentPane.add(nameTF);
		
		JRadioButton discountRBN = new JRadioButton("Discount?");
		discountRBN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		discountRBN.setBounds(306, 47, 109, 23);
		contentPane.add(discountRBN);
		
		JLabel lblNewLabel = new JLabel("Id: ");
		lblNewLabel.setBounds(10, 36, 48, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 210, 419, 108);
		contentPane.add(textArea);
		
		JButton searchBTN = new JButton("Search with ID");
		searchBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTF.setEditable(false);
				int id = Integer.parseInt(idTF.getText());
				if (AspavaSys.findItem(id)!= null) {
					textArea.setText(AspavaSys.findItem(id).toString());
				}
				else {
					textArea.setText("order ID does not exist!");
				}
			}
		});
		searchBTN.setBounds(27, 145, 133, 23);
		contentPane.add(searchBTN);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 70, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton deleteBTN = new JButton("Delete with ID");
		deleteBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(idTF.getText());
						if(AspavaSys.deleteItem(id) != null) {
							textArea.setText(AspavaSys.deleteItem(id).toString());
							textArea.setText("id number "+id+" has been deleted");
							}
						else {
							textArea.setText("id has been either deleted or not existed ");
						}
						
			}
			
		});
		deleteBTN.setBounds(170, 145, 128, 23);
		contentPane.add(deleteBTN);
		
		JButton addBTN = new JButton("Add with ID");
		addBTN.setBounds(306, 145, 130, 23);
		contentPane.add(addBTN);
		
	}
}
