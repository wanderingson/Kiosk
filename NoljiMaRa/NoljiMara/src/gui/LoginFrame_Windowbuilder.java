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
	private JButton btn��ȸ���ֹ�Button;
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
		
		// ID ��
		JLabel lblLogin = new JLabel("ID");
		lblLogin.setFont(new Font("����", Font.BOLD, 13));
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(41, 52, 69, 35);
		contentPane.add(lblLogin);
		
		// PW ��
		JLabel lblPassword = new JLabel("PW");
		lblPassword.setFont(new Font("����", Font.BOLD, 13));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(41, 103, 69, 35);
		contentPane.add(lblPassword);
		
		// ���̵� �Է�â
		tfUsername = new JTextField();
		tfUsername.setBounds(157, 52, 176, 35);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);
		
		// ȸ�����Թ�ư
		joinBtn = new JButton("ȸ������");
		joinBtn.setForeground(Color.WHITE);
		joinBtn.setBackground(Color.DARK_GRAY);
		joinBtn.setBounds(229, 154, 104, 29);
		contentPane.add(joinBtn);
		
		// �α��� ��ư
		loginBtn = new JButton("�α���");
		loginBtn.setBackground(Color.DARK_GRAY);
		loginBtn.setForeground(Color.WHITE);
		loginBtn.setBounds(108, 154, 106, 29);
		contentPane.add(loginBtn);
		
		// ��й�ȣ �Է�â
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 103, 176, 35);
		passwordField.setColumns(10);
		contentPane.add(passwordField);
		
		// ��ȸ���ֹ� ��ư 
		btn��ȸ���ֹ�Button = new JButton("��ȸ���ֹ� ");
		btn��ȸ���ֹ�Button.setForeground(Color.WHITE);
		btn��ȸ���ֹ�Button.setBackground(Color.DARK_GRAY);
		btn��ȸ���ֹ�Button.setBounds(108, 237, 225, 29);
		contentPane.add(btn��ȸ���ֹ�Button);
		
		setVisible(true);
		//ȸ������ �׼�
		joinBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JoinFrame_Windowbuilder frame = new JoinFrame_Windowbuilder();
			}
		});
		
		//��ȸ���ֹ� �׼�
		btn��ȸ���ֹ�Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					//��ȸ�� �ֹ�Ȯ��
					JOptionPane.showMessageDialog(null, "��ȸ���̽ñ��� �ٷ� �ֹ����͵帮�ڽ��ϴ�");
					
					//�ٷ� �ֹ� â���� �̵� 
					contentPane.add(loginBtn);
				
					
					dispose();
					setVisible(false) ;
					new BiMain_Windowbuilder().setVisible(true) ;
			}
});
		
		//�α��� �׼�
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				String password = passwordField.getText();
				MemberDao dao = MemberDao.getInstance();
				int result = dao.findByUsernameAndPassword(username, password);
				if(result == 1) {
					//�α��� ���� �޽���
					JOptionPane.showMessageDialog(null, "�α��� ���� ȸ���ֹ��� 3000�� �����Դϴ�");
					
					//�ٷ� �ֹ� â���� �̵� 
					contentPane.add(loginBtn);
				
					
					dispose();
					setVisible(false) ;
					new HuiMain_Windowbuilder().setVisible(true) ;
					
					
				}else {
					JOptionPane.showMessageDialog(null, "�α��� ����");
				}
				
			}
		});
	}
};
