import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomePage {

	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(0x817ACC));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(0xA299FF));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(0xC7C1FF));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(0xA299FF));
		}
		
	}
	
	
	WelcomePage(String userID){
		
		JFrame frame = new JFrame();
		//frame.setLayout(new FlowLayout());
		frame.setLayout(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 360);
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(0xC8EAF6));
		//frame.add(welcomeLabel);
		//frame.add(label_2);
		//frame.add(label);
		
		//Border label_border=BorderFactory.createLineBorder(Color.white,3);
		
		//////////////////////////////////////
		
		JPanel left_panel=new JPanel();
		left_panel.setBackground(new Color(0x514C7F));
		left_panel.setBounds(0,0,200,360);
		left_panel.setLayout(null);
		
		JPanel right_panel=new JPanel();
		right_panel.setBackground(new Color(0xA299FF));
		right_panel.setBounds(200,0,440,360);
		//right_panel.setLayout(new BorderLayout());
		right_panel.setLayout(null);
		
		////////////////////////////////////////
		
		JPanel meniu_panel_1=new JPanel();
		meniu_panel_1.setBackground(new Color(0xA299FF));
		meniu_panel_1.setBounds(0,20,200,40);
		meniu_panel_1.setLayout(new BorderLayout());
		meniu_panel_1.setVisible(true);
		
		JPanel meniu_panel_2=new JPanel();
		meniu_panel_2.setBackground(new Color(0xA299FF));
		meniu_panel_2.setBounds(0,100,200,40);
		meniu_panel_2.setLayout(new BorderLayout());
		
		JPanel meniu_panel_3=new JPanel();
		meniu_panel_3.setBackground(new Color(0xA299FF));
		meniu_panel_3.setBounds(0,180,200,40);
		meniu_panel_3.setLayout(new BorderLayout());
		
		JPanel meniu_panel_4=new JPanel();
		meniu_panel_4.setBackground(new Color(0xA299FF));
		meniu_panel_4.setBounds(0,260,200,40);
		meniu_panel_4.setLayout(new BorderLayout());
		
		////////////////////////////////////////
		
		JLabel label_products = new JLabel();
		label_products.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_products.setForeground(Color.white);
		label_products.setText("Produse");
		label_products.setBounds(0,20,100,25);
		label_products.setHorizontalAlignment(SwingConstants.CENTER);
		label_products.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel label_categories = new JLabel();
		label_categories.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_categories.setForeground(Color.white);
		label_categories.setText("Comenzi");
		label_categories.setHorizontalAlignment(SwingConstants.CENTER);
		label_categories.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel label_furnisors = new JLabel();
		label_furnisors.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_furnisors.setForeground(Color.white);
		label_furnisors.setText("Clienti");
		label_furnisors.setHorizontalAlignment(SwingConstants.CENTER);
		label_furnisors.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel label_employees = new JLabel();
		label_employees.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_employees.setForeground(Color.white);
		label_employees.setText("Angajati");
		label_employees.setHorizontalAlignment(SwingConstants.CENTER);
		label_employees.setVerticalAlignment(SwingConstants.CENTER);
		
		///////////////////////////////////////////////////////////////////////////
		
		/*JPanel panel_products=new JPanel();
		panel_products.setBackground(Color.gray);
		panel_products.setBounds(20,20,400,280);
		panel_products.setLayout(null);
		
		JPanel panel_categories=new JPanel();
		panel_categories.setBackground(Color.gray);
		panel_categories.setBounds(20,20,400,280);
		panel_categories.setLayout(null);
		
		JPanel panel_furnisors=new JPanel();
		panel_furnisors.setBackground(Color.gray);
		panel_furnisors.setBounds(20,20,400,280);
		panel_furnisors.setLayout(null);
		
		JPanel panel_employees=new JPanel();
		panel_employees.setBackground(Color.yellow);
		panel_employees.setBounds(20,20,400,280);
		panel_employees.setLayout(null);*/
		
		///////////////////////////////////////////////////////////////////////////
		meniu_panel_1.addMouseListener(new PanelButtonMouseAdapter(meniu_panel_1){
			@Override
			public void mouseClicked(MouseEvent e) {
				panelClicked(panel_products);
			}
		});
		
		meniu_panel_2.addMouseListener(new PanelButtonMouseAdapter(meniu_panel_2){
			@Override
			public void mouseClicked(MouseEvent e) {
				panelClicked(panel_categories);
			}
		});
		
		meniu_panel_3.addMouseListener(new PanelButtonMouseAdapter(meniu_panel_3){
			@Override
			public void mouseClicked(MouseEvent e) {
				panelClicked(panel_furnisors);
			}
		});
		
		meniu_panel_4.addMouseListener(new PanelButtonMouseAdapter(meniu_panel_4){
			@Override
			public void mouseClicked(MouseEvent e) {
				panelClicked(panel_employees);
				//employees_commands.setVisible(true);
			}
		});
		///////////////////////////////////////////////////////////////////////////
		frame.add(left_panel);
		frame.add(right_panel);
		
		left_panel.add(meniu_panel_1);
		meniu_panel_1.add(label_products);
		
		left_panel.add(meniu_panel_2);
		meniu_panel_2.add(label_categories);
		
		left_panel.add(meniu_panel_3);
		meniu_panel_3.add(label_furnisors);
		
		left_panel.add(meniu_panel_4);
		meniu_panel_4.add(label_employees);
		
		
		
		right_panel.add(panel_products);
		right_panel.add(panel_categories);
		right_panel.add(panel_furnisors);
		right_panel.add(panel_employees);
		//right_panel.add(employees_commands);
		
		frame.setVisible(true);
		
		
		
	}
	
	panel_products panel_products = new panel_products();
	panel_categories panel_categories = new panel_categories();
	panel_furnisors panel_furnisors = new panel_furnisors();
	panel_employees panel_employees = new panel_employees();
	//employees_commands employees_commands=new employees_commands();
	
	public void panelClicked(JPanel panel) {
		panel_products.setVisible(false);
		panel_categories.setVisible(false);
		panel_furnisors.setVisible(false);
		panel_employees.setVisible(false);
		panel.setVisible(true);
	}
}