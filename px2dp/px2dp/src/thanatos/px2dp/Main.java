package thanatos.px2dp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame frame = new JFrame();
		 frame.setBounds(800, 300, 400, 300);
		 frame.setTitle("px2dp");
		 frame.setLayout(null);
		 frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		 
		//标题
		 JLabel title=new JLabel("请输入需要转换的像素值");
		 title.setBounds(80, 20, 300, 50);
		 title.setFont(new Font("", Font.BOLD, 20));
		 frame.add(title);
		 //选择像素
		 JRadioButton rb_1080=new JRadioButton();
		 rb_1080.setText("1080");
		 rb_1080.setBounds(120, 10, 60, 20);
		 frame.add(rb_1080);
		 
		 JRadioButton rb_720=new JRadioButton();
		 rb_720.setText("720");
		 rb_720.setBounds(220, 10, 60, 20);
		 frame.add(rb_720);
		 
		 ButtonGroup group=new ButtonGroup();
		 group.add(rb_1080);
		 group.add(rb_720);
		 
		 //输入框
		 JTextField text=new JTextField();
		 text.setBounds(90, 100, 200, 30);
		 text.setFont(new Font("",Font.BOLD,20));
		 frame.add(text);
		 
		 //输入框单位
		 JLabel unit=new JLabel("px");
		 unit.setBounds(300, 100, 50, 30);
		 unit.setFont(new Font("", Font.BOLD, 20));
		 frame.add(unit);
		 
		 
          //原始值
		 
		 JLabel s=new JLabel("输入：0.00px");
		 s.setBounds(80, 150, 150, 30);
		 s.setFont(new Font("", Font.BOLD, 15));
		 frame.add(s);
		 
		 
		 
		 //结果
		 
		 JLabel result=new JLabel("结果：0.00dp");
		 result.setBounds(210, 150, 200, 30);
		 result.setFont(new Font("", Font.BOLD, 15));
		 frame.add(result);
		 
		 //输入框设置回车键监听事件
		 text.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					DecimalFormat df=new DecimalFormat("0.00");
					String res=text.getText();
					if (res.isEmpty()) {
						result.setText("结果：0.00dp");
						s.setText("输入：0.00px");
					}else {
						String str=null;
						if (rb_1080.isSelected()) {
							str=df.format(Double.parseDouble(res)/2.76);
						}else if (rb_720.isSelected()) {
							str=df.format((Double.parseDouble(res)/2.76)*0.65);
						}else {
							JOptionPane.showMessageDialog(null, "请选择像素", "标题", JOptionPane.INFORMATION_MESSAGE);
							str="0.00";
						}
						result.setText("结果："+str+"dp");
						s.setText("输入："+df.format(Double.parseDouble(res))+"px");
						text.setText("");
					}
				
					
				}
			}
		});	 
		 
		 
		 //提示
		 
		 JLabel rip=new JLabel("提示：只适用于1080手机和720手机！");
		 rip.setBounds(10, 220, 260, 30);
		 rip.setFont(new Font("", Font.BOLD, 14));
		 rip.setForeground(Color.RED);
		 frame.add(rip);
		 
		 frame.setVisible(true);
		 
		 
		 frame.addWindowListener(new WindowListener() {
				
				@Override
				public void windowOpened(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
					System.gc();
					System.runFinalization();
					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});



	}

	

}
