package Kiosk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BiChoice_Windowbuilder extends JFrame {

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
	// ������ ����
	public BiChoice_Windowbuilder() {
		setTitle("\uBE44\uD68C\uC6D0 \uB9E4\uC7A5/\uD3EC\uC7A5"); // �ֻ�� Ÿ��Ʋ(��ȸ�� ����/����)
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
		textField.setFont(new Font("���� ���", Font.BOLD, 24));
		textField.setText("\uB9E4\uC7A5/\uD3EC\uC7A5");
		textField.setBounds(348, 10, 113, 56);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// �������
		// path ��� ������ ������ �� ��, ������ ��θ� �־������ν� ������ ������ ����.
		String path = ".\\image\\Maezang.jpg";
		Image mae = new ImageIcon(path).getImage();
		
		JButton btnMae = new JButton(new ImageIcon(mae.getScaledInstance(300, 300, mae.SCALE_SMOOTH)));
		btnMae.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ;
				setVisible(false) ;
				new BiMaezangjumoon ( ).setVisible(true) ;
			}
		});
		btnMae.setBounds(99, 98, 300, 300);
		contentPane.add(btnMae);
		
		// �������
		// path1 ��� ������ ������ �� ��, ������ ��θ� �־������ν� ������ ������ ����.
		String path1= ".\\image\\Pozang.jpg";
		
		// ���� �ҷ�����.
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
				new BiPozangjumoon ( ).setVisible(true) ;
			}
		});
		btnPo.setBounds(458, 98, 300, 300);
		contentPane.add(btnPo);
		
		lblMae = new JLabel("\uB9E4\uC7A5\uC2DD\uC0AC");
		lblMae.setFont(new Font("����", Font.BOLD, 16));
		lblMae.setForeground(Color.WHITE);
		lblMae.setBackground(Color.GRAY);
		lblMae.setBounds(221, 408, 86, 30);
		contentPane.add(lblMae);
		
		lblPo = new JLabel("\uD3EC\uC7A5");
		lblPo.setForeground(Color.WHITE);
		lblPo.setFont(new Font("����", Font.BOLD, 16));
		lblPo.setBackground(Color.GRAY);
		lblPo.setBounds(602, 408, 44, 30);
		contentPane.add(lblPo);
		
		// ���� �޼��� ��
		lblNewLabel = new JLabel("\uD3EC\uC7A5\uC2DC 1,000\uC6D0 \uD560\uC778");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(645, 423, 113, 15);
		contentPane.add(lblNewLabel);
	}

}
