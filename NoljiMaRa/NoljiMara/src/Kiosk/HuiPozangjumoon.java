package Kiosk;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.image.*;


public class HuiPozangjumoon extends JFrame {
    
	int count = 0;
	int total = 11000;
    String show = "";
    
    
    
    public HuiPozangjumoon() {
        // �����δ�
        // ������ ������
        JFrame frame = new JFrame("ȸ�� ����");
        frame.setBounds(0, 0, 1050, 1000);
        frame.setBackground(Color.black);
 
        // ��Ʈ
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);
 
        // ����
        Panel pNorth = new Panel();
        pNorth.setBackground(Color.black);
        pNorth.setLayout(null);
        pNorth.setSize(0, 580);
        pNorth.setFont(new Font("���� ���", Font.BOLD, 18));
 
        // �迭 ���� �κ�
        String menu[] = { "�߰�","���̹���", "���̹���", "���縮", "�߱����", 
        		"�������", "�Ұ��", "����", "�ҽ���", 
        		"û��ä", "����", "���ä��", "����", "�����"};
        int price[] = { 15000, 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8500,5000, 5500, 6000, 6500, 1200 };
        
        JButton bt[] = new JButton[menu.length];      
        TextField suja[] = new TextField[menu.length];
        Button minus[] = new Button[menu.length];
        Button plus[] = new Button[menu.length];
        JButton ok[] = new JButton[menu.length];
        
        Label l[] = new Label[menu.length]; // ���� ��
        
        Label name[] = new Label[menu.length]; // �޴� ��
        
        ImageIcon icon[] = new ImageIcon[menu.length];
        Image Img[] = new Image[menu.length];
        Image changedIcon[] = new Image[menu.length];
        ImageIcon picture[] = new ImageIcon[menu.length];
        

 
        // ��ư ���� �κ�
        for (int i = 0; i < menu.length; i++) {
 
            // �޴� ��ư

            bt[i] = new JButton(menu[i]);
            if (i < 7) {
                bt[i].setBounds(25 + i * 150, 50, 100, 100);
            } else {
                bt[i].setBounds(25 + (i -7) * 150, 350, 100, 100);
            }    
           
               
            icon[0] = new ImageIcon(".\\image\\MaraTang.jpg");
            icon[1] = new ImageIcon(".\\image\\Mokyi.jpg");
            icon[2] = new ImageIcon(".\\image\\Paengyi.jpg");
            icon[3] = new ImageIcon(".\\image\\Lamyeon.jpg");
            icon[4] = new ImageIcon(".\\image\\Dangmyeon.jpg");
            icon[5] = new ImageIcon(".\\image\\Pig.jpg");
            icon[6] = new ImageIcon(".\\image\\Cow.jpg");
            icon[7] = new ImageIcon(".\\image\\Sheep.jpg");
            icon[8] = new ImageIcon(".\\image\\Soxiji.jpg");
            icon[9] = new ImageIcon(".\\image\\Chenggyeng.jpg");
            icon[10] = new ImageIcon(".\\image\\Yengun.jpg");
            icon[11] = new ImageIcon(".\\image\\Allvagetable.jpg");
            icon[12] = new ImageIcon(".\\image\\Gamja.jpg");
            icon[13] = new ImageIcon(".\\image\\Drink.jpg");
            
            Img[i] = icon[i].getImage();
            changedIcon[i] = Img[i].getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            picture[i]= new ImageIcon(changedIcon[i]);
            bt[i].setIcon( picture[i]);

 
            // ���� txt ��ư
            suja[i] = new TextField("0");
            suja[i].setBackground(Color.white);
            suja[i].setEditable(false);
            suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 150, 40, 20);
 
            // "-" ��ư
            minus[i] = new Button("-");
            minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
            minus[i].setEnabled(false);
 
            // "+" ��ư
            plus[i] = new Button("+");
            plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
            plus[i].setEnabled(false);
            
            // �޴��̸�
            name[i] = new Label(menu[i]);
            name[i].setFont(font1);
            name[i].setBounds(bt[i].getX() + 15, bt[i].getY() + 105, 100, 20);
            name[i].setForeground(Color.white);
                        
            // ����
            l[i] = new Label(price[i] + "��");
            l[i].setBounds(bt[i].getX() + 20, suja[i].getY() - 25, 100, 20);
            l[i].setForeground(Color.white);
 
            // Ȯ�� ��ư
            ok[i] = new JButton("Ȯ��");
            ok[i].setBounds(bt[i].getX(), suja[i].getY() + 30, 100, 20);
            ok[i].setEnabled(false);
            
 
            pNorth.add(bt[i]);
            pNorth.add(suja[i]);
            pNorth.add(minus[i]);
            pNorth.add(plus[i]);
            pNorth.add(l[i]);
            pNorth.add(ok[i]);
            pNorth.add(name[i]); // �߰�
        }
        // �߾�
        TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n   �⺻���\t    11000\t\t  1\n");
        ta.setBackground(Color.white);
        ta.setEditable(false);
        ta.setFont(font1);
 
        // ����
        Panel pSouth = new Panel();
        pSouth.setFont(font);
        pSouth.setBackground(new Color(255, 255, 215));
 
        Button bt1 = new Button("�ֹ�");
        Button bt2 = new Button("�ʱ�ȭ");
        Button bt3 = new Button("�ݱ�");
        pSouth.add(bt1);
        pSouth.add(bt2);
        pSouth.add(bt3);  
        
        // �ֹ���ư
        bt1.addActionListener(new ActionListener() {
 
        	@Override
            public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, ta.getText() + "�� �ݾ� :" + total + "��\n" + " �ֹ��Ǿ����ϴ�. \n �̿����ּż� �����մϴ�. \n �����Ǳ���� 40�� �ҿ�˴ϴ�.");
                for (int i = 0; i < menu.length; i++) {
                    bt[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    suja[i].setText("0");
                    ta.setText("   ��ǰ��        �ܰ�        ����       �հ�\n\n");
                    
 
                }
            }
        });

        

    // �ʱ�ȭ ��ư
    bt2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < menu.length; i++) {
                bt[i].setEnabled(true);
                minus[i].setEnabled(false);
                plus[i].setEnabled(false);
                suja[i].setText("0");
            }
        }
    });
    //bt3 �ݱ��ư
    bt3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    // ������Ʈ
    frame.getContentPane().add(pNorth, BorderLayout.NORTH);
    frame.getContentPane().add(ta, BorderLayout.CENTER);
    frame.getContentPane().add(pSouth, BorderLayout.SOUTH);
    frame.setVisible(true);
    
 // �̺�Ʈ��
    for (int i = 0; i < menu.length; i++) {
        int j = i;

        // �޴� ��ư �̺�Ʈ + - ok ��ư Ȱ��ȭ
        bt[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minus[j].setEnabled(true);
                plus[j].setEnabled(true);
                bt[j].setEnabled(false);
                ok[j].setEnabled(true);

                
                count = 0;
            }
        });

        // "-" ��ư �̺�Ʈ
        minus[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count > 0) {
                    count = count - 1;
                    suja[j].setText(count + "");
                    ok[j].setEnabled(true);
                } else {
                    minus[j].setEnabled(false);
                }
            }
        });
        
        // "+" ��ư �̺�Ʈ
        plus[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                count = count + 1;
                suja[j].setText(count + "");
                ok[j].setEnabled(true);
                if (count > 0) {
                    minus[j].setEnabled(true);
                }
            }
        });
        //Ȯ�� ��ư �̺�Ʈ
        ok[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show = bt[j].getActionCommand();
                ta.append("   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
                        + "��" + "\n");
                ok[j].setEnabled(false);
                total = total + price[j] * count;
            }
        });
    }
    // ����
    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}
// ����
public static void main(String[] args) {
    new HuiPozangjumoon();
}



	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

 }
