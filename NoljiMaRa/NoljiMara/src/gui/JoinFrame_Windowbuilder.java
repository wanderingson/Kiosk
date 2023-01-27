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
	// ������ ����
	public JoinFrame_Windowbuilder() {
		setTitle("ȸ������â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null); // ����� ��� ���
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// ȸ������ ��
		lblJoin = new JLabel("�������� ȸ������â");
		lblJoin.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoin.setForeground(Color.WHITE);
		lblJoin.setBounds(69, 41, 276, 20);
		Font f1 = new Font("����", Font.BOLD, 20); 
		contentPane.setLayout(null);
		lblJoin.setFont(f1);
		contentPane.add(lblJoin);
		
		// PW ��
		JLabel lblUsername = new JLabel("PW");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(69, 163, 69, 20);
		contentPane.add(lblUsername);
		
		// ID ��
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(69, 113, 69, 20);
		contentPane.add(lblId);
		
		// �̸� ��
		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(69, 210, 69, 20);
		contentPane.add(lblName);
		
		// email ��
		JLabel lblEmail = new JLabel("email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(69, 257, 69, 20);
		contentPane.add(lblEmail);
		
		// ��ȭ��ȣ ��
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setBounds(69, 304, 69, 20);
		contentPane.add(lblPhone);
		
		// ���̵� �Է� �ؽ�Ʈ �ʵ�
		tfUsername = new JTextField();
		tfUsername.setBounds(159, 106, 186, 35);
		tfUsername.setColumns(10);
		contentPane.add(tfUsername);
		
		// ��й�ȣ �Է� ��й�ȣ �ʵ�. ��¿��� ) ****
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 156, 186, 35);
		passwordField.setColumns(10);
		contentPane.add(passwordField);
		
		// �̸� �Է� �ؽ�Ʈ �ʵ�
		tfName = new JTextField();
		tfName.setBounds(159, 203, 186, 35);
		tfName.setColumns(10);
		contentPane.add(tfName);
		
		// �̸��� �Է� �ؽ�Ʈ �ʵ�
		tfEmail = new JTextField();
		tfEmail.setBounds(159, 250, 186, 35);
		tfEmail.setColumns(10);
		contentPane.add(tfEmail);
		
		// ��ȭ��ȣ �Է� �ؽ�Ʈ �ʵ�
		tfPhone = new JTextField();
		tfPhone.setBounds(159, 297, 186, 35);
		tfPhone.setColumns(10);
		contentPane.add(tfPhone);
		
		// ȸ������ �Ϸ� ��ư
		joinCompleteBtn = new JButton("���ԿϷ�");
		joinCompleteBtn.setBounds(206, 401, 139, 29);
		contentPane.add(joinCompleteBtn);
		
		// �̺�Ʈ ���� üũ �ڽ�
		JRadioButton rdbtnNewRadioButton = new JRadioButton("���� �޽��� ���� ����");
		rdbtnNewRadioButton.setFont(new Font("����", Font.BOLD, 12));
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
				
				// ���� �Ϸ� �޽��� â
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.");
					contentPane.add(joinCompleteBtn);
					
					dispose();
					setVisible(false) ;
					new LoginFrame_Windowbuilder ( ).setVisible(true) ;
				}else {
					// ���� ���� �޽��� â
					JOptionPane.showMessageDialog(null, "ȸ�����Կ� �����ϼ̽��ϴ�.");
					contentPane.add(joinCompleteBtn);
					
					// �ٽ� �α��� â���� �̵�
					dispose();
					setVisible(false) ;
					new LoginFrame_Windowbuilder ( ).setVisible(true) ;
				}	
			}
		});

	}
};

