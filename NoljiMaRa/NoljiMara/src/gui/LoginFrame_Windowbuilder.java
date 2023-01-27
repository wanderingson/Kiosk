package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.MemberDao;
import Kiosk.BiMain_Windowbuilder;
import Kiosk.HuiMain_Windowbuilder;
import Kiosk.BiMain_Windowbuilder;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;

public class LoginFrame_Windowbuilder extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton loginBtn, joinBtn;
	private JButton btn비회원주문Button;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame_Windowbuilder frame = new LoginFrame_Windowbuilder();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame_Windowbuilder() {
		setTitle("\uB85C\uADF8\uC778\uCC3D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(445, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// ID 라벨
		JLabel lblLogin = new JLabel("ID");
		lblLogin.setFont(new Font("굴림", Font.BOLD, 13));
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(41, 52, 69, 35);
		contentPane.add(lblLogin);
		
		// PW 라벨
		JLabel lblPassword = new JLabel("PW");
		lblPassword.setFont(new Font("굴림", Font.BOLD, 13));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(41, 103, 69, 35);
		contentPane.add(lblPassword);
		
		// 아이디 입력창
		tfUsername = new JTextField();
		tfUsername.setBounds(157, 52, 176, 35);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);
		
		// 회원가입버튼
		joinBtn = new JButton("회원가입");
		joinBtn.setForeground(Color.WHITE);
		joinBtn.setBackground(Color.DARK_GRAY);
		joinBtn.setBounds(229, 154, 104, 29);
		contentPane.add(joinBtn);
		
		// 로그인 버튼
		loginBtn = new JButton("로그인");
		loginBtn.setBackground(Color.DARK_GRAY);
		loginBtn.setForeground(Color.WHITE);
		loginBtn.setBounds(108, 154, 106, 29);
		contentPane.add(loginBtn);
		
		// 비밀번호 입력창
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 103, 176, 35);
		passwordField.setColumns(10);
		contentPane.add(passwordField);
		
		// 비회원주문 버튼 
		btn비회원주문Button = new JButton("비회원주문 ");
		btn비회원주문Button.setForeground(Color.WHITE);
		btn비회원주문Button.setBackground(Color.DARK_GRAY);
		btn비회원주문Button.setBounds(108, 237, 225, 29);
		contentPane.add(btn비회원주문Button);
		
		setVisible(true);
		//회원가입 액션
		joinBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JoinFrame_Windowbuilder frame = new JoinFrame_Windowbuilder();
			}
		});
		
		//비회원주문 액션
		btn비회원주문Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					//비회원 주문확이
					JOptionPane.showMessageDialog(null, "비회원이시군요 바로 주문도와드리겠습니다");
					
					//바로 주문 창으로 이동 
					contentPane.add(loginBtn);
				
					
					dispose();
					setVisible(false) ;
					new BiMain_Windowbuilder().setVisible(true) ;
			}
});
		
		//로그인 액션
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				String password = passwordField.getText();
				MemberDao dao = MemberDao.getInstance();
				int result = dao.findByUsernameAndPassword(username, password);
				if(result == 1) {
					//로그인 성공 메시지
					JOptionPane.showMessageDialog(null, "로그인 성공 회원주문은 3000원 할인입니다");
					
					//바로 주문 창으로 이동 
					contentPane.add(loginBtn);
				
					
					dispose();
					setVisible(false) ;
					new HuiMain_Windowbuilder().setVisible(true) ;
					
					
				}else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
				
			}
		});
	}
};
