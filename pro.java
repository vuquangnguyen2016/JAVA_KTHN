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


public class pro extends JFrame {

	private JPanel contentPane;
	private JTextField txtso1;
	private JTextField txtso2;
	private JTextField txtketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pro frame = new pro();
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
	public pro() {
		setTitle("tinh nhan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSo1 = new JLabel("So 1");
		lblSo1.setBounds(35, 43, 46, 14);
		contentPane.add(lblSo1);
		
		txtso1 = new JTextField();
		txtso1.setBounds(144, 40, 86, 20);
		contentPane.add(txtso1);
		txtso1.setColumns(10);
		
		JLabel lblSo2 = new JLabel("So 2");
		lblSo2.setBounds(35, 88, 46, 14);
		contentPane.add(lblSo2);
		
		txtso2 = new JTextField();
		txtso2.setColumns(10);
		txtso2.setBounds(144, 85, 86, 20);
		contentPane.add(txtso2);
		
		JLabel lblketqua = new JLabel("ketqua");
		lblketqua.setBounds(35, 138, 46, 14);
		contentPane.add(lblketqua);
		
		txtketqua = new JTextField();
		txtketqua.setEditable(false);
		txtketqua.setColumns(10);
		txtketqua.setBounds(144, 135, 86, 20);
		contentPane.add(txtketqua);
		
		JButton btnketqua = new JButton("ketqua");
		btnketqua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,ketqua;
				a=Double.parseDouble(txtso1.getText());
				b=Double.parseDouble(txtso2.getText());				
				ketqua=a*b;
				txtketqua.setText(String.format("%f", ketqua));
			}
		});
		btnketqua.setBounds(144, 186, 89, 23);
		contentPane.add(btnketqua);
	}

}
