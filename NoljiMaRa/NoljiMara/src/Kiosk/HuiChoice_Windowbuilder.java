package Kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HuiChoice_Windowbuilder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblMae;
	private JLabel lblPo;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BiChoice_Windowbuilder frame = new BiChoice_Windowbuilder();
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
	public HuiChoice_Windowbuilder() {
		setTitle("\uD68C\uC6D0 \uB9E4\uC7A5/\uD3EC\uC7A5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		textField.setText("\uB9E4\uC7A5/\uD3EC\uC7A5");
		textField.setBounds(348, 10, 113, 56);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// 사진경로
		// path 라는 변수를 선언을 한 후, 사진의 경로를 넣어줌으로써 사진을 변수에 저장.
		String path = ".\\image\\Maezang.jpg";
		Image mae = new ImageIcon(path).getImage();
		
		JButton btnMae = new JButton(new ImageIcon(mae.getScaledInstance(300, 300, mae.SCALE_SMOOTH)));
		btnMae.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ;
				setVisible(false) ;
				new HuiMaezangjumoon ( ).setVisible(true) ;
			}
		});
		btnMae.setBounds(99, 98, 300, 300);
		contentPane.add(btnMae);
		
		
		// 사진경로
		String path1= ".\\image\\Pozang.jpg";
		Image po = new ImageIcon(path1).getImage();
		
		JButton btnPo = new JButton(new ImageIcon(po.getScaledInstance(300, 300, po.SCALE_SMOOTH)));
		btnPo.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ;
				setVisible(false) ;
				new HuiPozangjumoon ( ).setVisible(true) ;
			}
		});
		btnPo.setBounds(458, 98, 300, 300);
		contentPane.add(btnPo);
		
		lblMae = new JLabel("\uB9E4\uC7A5\uC2DD\uC0AC");
		lblMae.setFont(new Font("굴림", Font.BOLD, 16));
		lblMae.setForeground(Color.WHITE);
		lblMae.setBackground(Color.GRAY);
		lblMae.setBounds(221, 408, 86, 30);
		contentPane.add(lblMae);
		
		lblPo = new JLabel("\uD3EC\uC7A5");
		lblPo.setForeground(Color.WHITE);
		lblPo.setFont(new Font("굴림", Font.BOLD, 16));
		lblPo.setBackground(Color.GRAY);
		lblPo.setBounds(602, 408, 44, 30);
		contentPane.add(lblPo);
		
		lblNewLabel = new JLabel("\uD3EC\uC7A5\uC2DC 1,000\uC6D0 \uCD94\uAC00 \uD560\uC778");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(638, 417, 136, 15);
		contentPane.add(lblNewLabel);
	}

}
