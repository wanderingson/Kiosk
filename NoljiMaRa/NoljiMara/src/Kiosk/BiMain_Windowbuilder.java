package Kiosk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Canvas;
import javax.swing.JLayeredPane;
import java.awt.Panel;
import javax.swing.SwingConstants;

public class BiMain_Windowbuilder extends JFrame {

	private JPanel contentPane;
	private JTextField txtMain;
	private JButton btnMara1;
	private JButton btnMara2;
	private JButton btnMara3;
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
	public BiMain_Windowbuilder() {
		setTitle("\uBE44\uD68C\uC6D0 Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMain = new JTextField();
		txtMain.setHorizontalAlignment(SwingConstants.CENTER);
		txtMain.setForeground(new Color(255, 0, 0));
		txtMain.setBackground(new Color(192, 192, 192));
		txtMain.setFont(new Font("굴림", Font.BOLD, 28));
		txtMain.setText("\uB180\uC9C0\uB9C8\uB77C \uBE44\uD68C\uC6D0\uCC3D"); // 인사말
		txtMain.setBounds(84, 10, 581, 75);
		contentPane.add(txtMain);
		txtMain.setColumns(10);
		
		JLabel lblMenuChoice = new JLabel("MENU Choice"); // 메뉴 초이스 라벨
		lblMenuChoice.setFont(new Font("굴림", Font.BOLD, 14));
		lblMenuChoice.setBounds(201, 70, 111, 15);
		contentPane.add(lblMenuChoice);
		
		// 마라탕(1단계) : 15,000
		btnMara1 = new JButton("\uB9C8\uB77C\uD0D5(1\uB2E8\uACC4) : 15,000\uC6D0");
		btnMara1.setFont(new Font("굴림", Font.BOLD, 14));
		btnMara1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ;
				setVisible(false) ;
				new BiChoice_Windowbuilder ( ).setVisible(true) ;
			}
		});
		btnMara1.setBackground(new Color(255, 105, 180));
		btnMara1.setBounds(346, 162, 240, 68);
		contentPane.add(btnMara1);
		
		// 마라탕(2단계) : 15,000
		btnMara2 = new JButton("\uB9C8\uB77C\uD0D5(2\uB2E8\uACC4) : \r\n15,000\uC6D0");
		btnMara2.setFont(new Font("굴림", Font.BOLD, 14));
		btnMara2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ;
				setVisible(false) ;
				new BiChoice_Windowbuilder ( ).setVisible(true) ;
			}
		});
		btnMara2.setBackground(new Color(255, 20, 147));
		btnMara2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMara2.setBounds(346, 262, 240, 68);
		contentPane.add(btnMara2);
		
		// 마라탕(3단계) : 15,000
		btnMara3 = new JButton("\uB9C8\uB77C\uD0D5(3\uB2E8\uACC4) : 15,000\uC6D0");
		btnMara3.setFont(new Font("굴림", Font.BOLD, 14));
		btnMara3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose( ) ;
				setVisible(false) ;
				new BiChoice_Windowbuilder ( ).setVisible(true) ;
			}
		});
		btnMara3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMara3.setBackground(new Color(255, 0, 0));
		btnMara3.setBounds(346, 349, 240, 75);
		contentPane.add(btnMara3);
		
		String path = ".\\image\\MaraTang.jpg"; // String path 새 변수 만들고  = "이미지 주소넣기"
		Image Mara = new ImageIcon(path).getImage(); // 이미지 변수명 정하기.
		
																	// 높이, 넓이, 사진의 화질
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



