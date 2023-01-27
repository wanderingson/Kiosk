package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Kiosk.HuiChoice_Windowbuilder;
import dao.MemberDao;
import models.Member;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class JoinFrame_Windowbuilder extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPhone;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinFrame_Windowbuilder frame = new JoinFrame_Windowbuilder();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	// 프레임 설정
	public JoinFrame_Windowbuilder() {
		setTitle("회원가입창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null); // 모니터 가운데 출력
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 회원가입 라벨
		lblJoin = new JLabel("놀지마라 회원가입창");
		lblJoin.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoin.setForeground(Color.WHITE);
		lblJoin.setBounds(69, 41, 276, 20);
		Font f1 = new Font("돋음", Font.BOLD, 20); 
		contentPane.setLayout(null);
		lblJoin.setFont(f1);
		contentPane.add(lblJoin);
		
		// PW 라벨
		JLabel lblUsername = new JLabel("PW");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(69, 163, 69, 20);
		contentPane.add(lblUsername);
		
		// ID 라벨
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(69, 113, 69, 20);
		contentPane.add(lblId);
		
		// 이름 라벨
		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(69, 210, 69, 20);
		contentPane.add(lblName);
		
		// email 라벨
		JLabel lblEmail = new JLabel("email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(69, 257, 69, 20);
		contentPane.add(lblEmail);
		
		// 전화번호 라벨
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setBounds(69, 304, 69, 20);
		contentPane.add(lblPhone);
		
		// 아이디 입력 텍스트 필드
		tfUsername = new JTextField();
		tfUsername.setBounds(159, 106, 186, 35);
		tfUsername.setColumns(10);
		contentPane.add(tfUsername);
		
		// 비밀번호 입력 비밀번호 필드. 출력예시 ) ****
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 156, 186, 35);
		passwordField.setColumns(10);
		contentPane.add(passwordField);
		
		// 이름 입력 텍스트 필드
		tfName = new JTextField();
		tfName.setBounds(159, 203, 186, 35);
		tfName.setColumns(10);
		contentPane.add(tfName);
		
		// 이메일 입력 텍스트 필드
		tfEmail = new JTextField();
		tfEmail.setBounds(159, 250, 186, 35);
		tfEmail.setColumns(10);
		contentPane.add(tfEmail);
		
		// 전화번호 입력 텍스트 필드
		tfPhone = new JTextField();
		tfPhone.setBounds(159, 297, 186, 35);
		tfPhone.setColumns(10);
		contentPane.add(tfPhone);
		
		// 회원가입 완료 버튼
		joinCompleteBtn = new JButton("가입완료");
		joinCompleteBtn.setBounds(206, 401, 139, 29);
		contentPane.add(joinCompleteBtn);
		
		// 이벤트 수신 체크 박스
		JRadioButton rdbtnNewRadioButton = new JRadioButton("광고성 메시지 수신 동의");
		rdbtnNewRadioButton.setFont(new Font("굴림", Font.BOLD, 12));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setBackground(Color.BLACK);
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(159, 356, 186, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		
		setVisible(true);
		
		joinCompleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Member member = new Member();
				member.setUsername(tfUsername.getText());
				member.setPassword(passwordField.getText());
				member.setName(tfName.getText());
				member.setEmail(tfEmail.getText());
				member.setPhone(tfPhone.getText());
				
				MemberDao dao = MemberDao.getInstance();
				int result = dao.save(member);
				
				// 가입 완료 메시지 창
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					contentPane.add(joinCompleteBtn);
					
					dispose();
					setVisible(false) ;
					new LoginFrame_Windowbuilder ( ).setVisible(true) ;
				}else {
					// 가입 실패 메시지 창
					JOptionPane.showMessageDialog(null, "회원가입에 실패하셨습니다.");
					contentPane.add(joinCompleteBtn);
					
					// 다시 로그인 창으로 이동
					dispose();
					setVisible(false) ;
					new LoginFrame_Windowbuilder ( ).setVisible(true) ;
				}	
			}
		});

	}
};

