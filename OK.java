import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class OK extends JFrame {

	private JPanel contentPane;
	private JTextField txthoten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OK frame = new OK();
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
	public OK() {
		setTitle("Nhap ho ten");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblhoten = new JLabel("Ho ten");
		lblhoten.setBounds(10, 45, 46, 14);
		contentPane.add(lblhoten);
		
		txthoten = new JTextField();
		txthoten.setBounds(122, 42, 86, 20);
		contentPane.add(txthoten);
		txthoten.setColumns(10);
		
		JLabel lblketqua = new JLabel("");
		lblketqua.setBounds(10, 85, 352, 38);
		contentPane.add(lblketqua);
		
		JButton btnxuat = new JButton("xuat");
		btnxuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoten=txthoten.getText();
				lblketqua.setText("CHAO"+hoten+"CAM ON");
			}
		});
		btnxuat.setBounds(119, 146, 89, 23);
		contentPane.add(btnxuat);
	}

}
