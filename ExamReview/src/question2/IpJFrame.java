package question2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class IpJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnCancel;
	private JButton btnOk;
	private JLabel lblNbDeBits;
	private JLabel lblIp;
	private JLabel receiveNb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IpJFrame frame = new IpJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IpJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblIp = new JLabel("IP :");
		GridBagConstraints gbc_lblIp = new GridBagConstraints();
		gbc_lblIp.insets = new Insets(0, 0, 5, 5);
		gbc_lblIp.anchor = GridBagConstraints.EAST;
		gbc_lblIp.gridx = 0;
		gbc_lblIp.gridy = 0;
		contentPane.add(lblIp, gbc_lblIp);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblNbDeBits = new JLabel("Nb de bits \u00E0 1 dans le masque par d\u00E9fault");
		GridBagConstraints gbc_lblNbDeBits = new GridBagConstraints();
		gbc_lblNbDeBits.insets = new Insets(0, 0, 5, 5);
		gbc_lblNbDeBits.gridx = 0;
		gbc_lblNbDeBits.gridy = 1;
		contentPane.add(lblNbDeBits, gbc_lblNbDeBits);
		
		receiveNb = new JLabel("");
		GridBagConstraints gbc_receiveNb = new GridBagConstraints();
		gbc_receiveNb.insets = new Insets(0, 0, 5, 0);
		gbc_receiveNb.gridx = 1;
		gbc_receiveNb.gridy = 1;
		contentPane.add(receiveNb, gbc_receiveNb);
		
		btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 0;
		gbc_btnCancel.gridy = 2;
		contentPane.add(btnCancel, gbc_btnCancel);
		btnCancel.addActionListener(this);
		
		btnOk = new JButton("OK");
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.gridx = 1;
		gbc_btnOk.gridy = 2;
		contentPane.add(btnOk, gbc_btnOk);
		btnOk.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "OK":{
			Ip test = new Ip(this.textField.getText());
			switch (test.getClasse()) {
			case "A": this.receiveNb.setText("8");
				break;
			case "B": this.receiveNb.setText("16");
				break;
			case "C": this.receiveNb.setText("24");
				break;
			default : this.receiveNb.setText("Pas de masque");
				break;
				
			}
		}
		case "Cancel": this.textField.setText("");
			break;
				
		}
		
	}

}
