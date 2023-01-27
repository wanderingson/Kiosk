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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class HuiMain_Windowbuilder extends JFrame {

	private JPanel contentPane;
	private JTextField txtHMain;
	private JButton btnHMara1;
	private JButton btnHMara2;
	private JButton btnHMara3;
	private JLabel lblMaratang;
	private JLabel lblMap1;
	private JLabel lblMap2;
	private JLabel lblMap3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BiMain_Windowbuilder frame = new BiMain_Windowbuilder();
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
	public HuiMain_Windowbuilder() {
		setTitle("\uD68C\uC6D0 Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHMain = new JTextField();
		txtHMain.setHorizontalAlignment(SwingConstants.CENTER);
		txtHMain.setForeground(new Color(255, 0, 0));
		txtHMain.setBackground(new Color(192, 192, 192));
		txtHMain.setFont(new Font("����", Font.BOLD, 28));
		txtHMain.setText("\uB180\uC9C0\uB9C8\uB77C \uD68C\uC6D0\uCC3D"); // �λ縻
		txtHMain.setBounds(84, 20, 581, 75);
		contentPane.add(txtHMain);
		txtHMain.setColumns(10);
		
		// ������(1�ܰ�) : 12,000
		btnHMara1 = new JButton("������(1�ܰ�) : 12,000��");
		btnHMara1.setFont(new Font("����", Font.BOLD, 14));
		btnHMara1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ; // �ݱ�
				setVisible(false) ; // �ݱ�
				new HuiChoice_Windowbuilder ( ).setVisible(true) ; // ����ȭ�� �̾��ֱ�.
			}
		});
		btnHMara1.setBackground(new Color(255, 105, 180));
		btnHMara1.setBounds(346, 162, 240, 68);
		contentPane.add(btnHMara1);
		
		// ������(2�ܰ�) : 12,000
		btnHMara2 = new JButton("\uB9C8\uB77C\uD0D5(2\uB2E8\uACC4) : \r\n12,000\uC6D0");
		btnHMara2.setFont(new Font("����", Font.BOLD, 14));
		btnHMara2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ;
				setVisible(false) ;
				new HuiChoice_Windowbuilder ( ).setVisible(true) ;
			}
		});
		btnHMara2.setBackground(new Color(255, 20, 147));
		btnHMara2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHMara2.setBounds(346, 262, 240, 68);
		contentPane.add(btnHMara2);
		
		// ������(3�ܰ�) : 12,000
		btnHMara3 = new JButton("\uB9C8\uB77C\uD0D5(3\uB2E8\uACC4) : 12,000\uC6D0");
		btnHMara3.setFont(new Font("����", Font.BOLD, 14));
		btnHMara3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ;
				setVisible(false) ;
				new HuiChoice_Windowbuilder ( ).setVisible(true) ;
			}
		});
		btnHMara3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// �󺧿� ���� �ֱ�
		btnHMara3.setBackground(new Color(255, 0, 0));
		btnHMara3.setBounds(346, 349, 240, 75);
		contentPane.add(btnHMara3);
		
		String path = ".\\image\\MaraTang.jpg"; // String path �� ���� �����  = "�̹��� �ּҳֱ�"
		Image Mara = new ImageIcon(path).getImage(); // �̹��� ������ ���ϱ�.
		
																	// ����, ����, ������ ȭ��
		lblMaratang = new JLabel(new ImageIcon(Mara.getScaledInstance(250, 250, Mara.SCALE_SMOOTH)));
		lblMaratang.setBounds(84, 162, 250, 262);
		contentPane.add(lblMaratang);
		
		String path1 = ".\\image\\Map1.jpg";
		Image map1 = new ImageIcon(path1).getImage();
		
		lblMap1 = new JLabel(new ImageIcon(map1.getScaledInstance(68, 68, map1.SCALE_SMOOTH)));
		lblMap1.setBounds(597, 162, 68, 68);
		contentPane.add(lblMap1);
		
		String path2 = ".\\image\\Map2.jpg";
		Image map2 = new ImageIcon(path2).getImage();
		
		lblMap2 = new JLabel(new ImageIcon(map2.getScaledInstance(68, 68, map2.SCALE_SMOOTH)));
		lblMap2.setBounds(597, 262, 68, 68);
		contentPane.add(lblMap2);
		
		String path3 = ".\\image\\Map3.jpg"; 
		Image map3 = new ImageIcon(path3).getImage();
		
		lblMap3 = new JLabel(new ImageIcon(map3.getScaledInstance(68, 68, map3.SCALE_SMOOTH)));
		lblMap3.setBounds(597, 356, 68, 68);
		contentPane.add(lblMap3);
		
		
		
		
		}
	
	
	}
