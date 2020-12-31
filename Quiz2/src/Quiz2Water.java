import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Color;

public class Quiz2Water {

	private JFrame frame;
	private JTextField textField;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2Water window = new Quiz2Water();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz2Water() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 204, 255));
		frame.setBounds(100, 100, 671, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHowMuchWater = new JLabel("How much water should you drink per day?");
		lblHowMuchWater.setBackground(new Color(0, 51, 102));
		lblHowMuchWater.setFont(new Font("Permanent Marker", Font.BOLD, 25));
		lblHowMuchWater.setBounds(39, 13, 614, 121);
		frame.getContentPane().add(lblHowMuchWater);
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your weight in kg: ");
		lblPleaseEnterYour.setBackground(new Color(0, 0, 153));
		lblPleaseEnterYour.setFont(new Font("Lemon", Font.PLAIN, 18));
		lblPleaseEnterYour.setBounds(49, 147, 339, 77);
		frame.getContentPane().add(lblPleaseEnterYour);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(388, 159, 192, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Hydrate Me");
		btnNewButton.setBackground(new Color(0, 153, 255));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num, ans;
				try {
						num = Double.parseDouble(textField.getText());
						
						ans = num*0.033;
						JOptionPane.showMessageDialog(null, "You should drink " + ans + " litres of water a day, good luck! ");
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number. ");
				}
			}
		});
		btnNewButton.setFont(new Font("Permanent Marker", Font.PLAIN, 23));
		btnNewButton.setBounds(239, 237, 181, 56);
		frame.getContentPane().add(btnNewButton);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	}

