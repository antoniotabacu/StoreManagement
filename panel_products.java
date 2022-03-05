import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.util.Random;

public class panel_products extends JPanel {

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
	
	/**
	 * Create the panel.
	 */
	
	public panel_products() {
		
		setBounds(20,20,400,280);
		setBackground(new Color(0x514C7F));
		setLayout(null);
		//setLayout(new BorderLayout());
		
		//label-ul simplu
		/*
		JLabel label_products=new JLabel("Angajati");
		//label_products.setBounds(0,0,50,50);
		label_products.setHorizontalAlignment(SwingConstants.CENTER);
		label_products.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_products);*/
		
		DefaultTableModel tableModel = new DefaultTableModel();
		JTable table=new JTable(tableModel);
		tableModel.addColumn("Denumire");
		tableModel.addColumn("Pret");
		tableModel.addColumn("Disponibilitate");
		tableModel.addColumn("Brand");
		tableModel.addColumn("CPU");
		tableModel.addColumn("GPU");
		tableModel.addColumn("Memorie Video");
		tableModel.addColumn("Stocare");
		tableModel.addColumn("Capacitate");
		tableModel.addColumn("RAM");
		tableModel.addColumn("Greutate");
		tableModel.addColumn("Rezolutie");
		
		display_products_list(table);
		
		JScrollPane sp=new JScrollPane(table);
		sp.setBounds(0,40,400,240);
		add(sp);
		//sp.setVisible(true);
		
		/////////////////////////////////////////////////////COMMANDS BAR
		/*JPanel commands_panel=new JPanel();
		commands_panel.setBounds(0,0,400,40);
		commands_panel.setBackground(new Color(0x000000));
		//setLayout(null);
		commands_panel.setLayout(null);
		
		JPanel insert=new JPanel();
		insert.setBackground(new Color(0xA299FF));
		insert.setBounds(0,0,100,40);
		insert.setLayout(new BorderLayout());
		
		JPanel delete=new JPanel();
		delete.setBackground(new Color(0xA299FF));
		delete.setBounds(200,0,100,40);
		delete.setLayout(new BorderLayout());
		
		JPanel update=new JPanel();
		update.setBackground(new Color(0xA299FF));
		update.setBounds(100,0,100,40);
		update.setLayout(new BorderLayout());
		
		JPanel queries=new JPanel();
		queries.setBackground(new Color(0xA299FF));
		queries.setBounds(300,0,100,40);
		queries.setLayout(new BorderLayout());
		
		JLabel label_insert = new JLabel();
		label_insert.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_insert.setForeground(Color.white);
		label_insert.setText("Insert");
		label_insert.setHorizontalAlignment(SwingConstants.CENTER);
		label_insert.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel label_udpate = new JLabel();
		label_udpate.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_udpate.setForeground(Color.white);
		label_udpate.setText("Update");
		label_udpate.setHorizontalAlignment(SwingConstants.CENTER);
		label_udpate.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel label_delete = new JLabel();
		label_delete.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_delete.setForeground(Color.white);
		label_delete.setText("Delete");
		label_delete.setHorizontalAlignment(SwingConstants.CENTER);
		label_delete.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel label_queries = new JLabel();
		label_queries.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_queries.setForeground(Color.white);
		label_queries.setText("Queries");
		label_queries.setHorizontalAlignment(SwingConstants.CENTER);
		label_queries.setVerticalAlignment(SwingConstants.CENTER);
		
		insert.add(label_insert);
		delete.add(label_delete);
		update.add(label_udpate);
		queries.add(label_queries);
		
		commands_panel.add(insert);
		commands_panel.add(delete);
		commands_panel.add(update);
		commands_panel.add(queries);
		
		add(commands_panel);
		
		///////////////////////////////////////////////////insert_panel
		
		JPanel insert_panel=new JPanel();
		insert_panel.setBounds(0,40,400,240);
		insert_panel.setBackground(new Color(0x514C7F));
		insert_panel.setLayout(null);
		
		
		///////////////////////////////////////////INSERT TEXTBOXES and LABELS
		JTextField text_surname=new JTextField();
		JLabel label_surname=new JLabel("Nume:");
		label_surname.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_surname.setForeground(Color.white);
		label_surname.setHorizontalAlignment(SwingConstants.CENTER);
		label_surname.setVerticalAlignment(SwingConstants.CENTER);
		label_surname.setBounds(0,20,100,40);
		text_surname.setBounds(100,20,100,40);
		
		JTextField text_forename=new JTextField();
		JLabel label_forename=new JLabel("Prenume:");
		label_forename.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_forename.setForeground(Color.white);
		label_forename.setHorizontalAlignment(SwingConstants.CENTER);
		label_forename.setVerticalAlignment(SwingConstants.CENTER);
		label_forename.setBounds(0,60,100,40);
		text_forename.setBounds(100,60,100,40);
		
		JTextField text_address=new JTextField();
		JLabel label_address=new JLabel("Localitate:");
		label_address.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_address.setForeground(Color.white);
		label_address.setHorizontalAlignment(SwingConstants.CENTER);
		label_address.setVerticalAlignment(SwingConstants.CENTER);
		label_address.setBounds(0,100,100,40);
		text_address.setBounds(100,100,100,40);
		
		insert_panel.add(text_surname);
		insert_panel.add(text_forename);
		insert_panel.add(text_address);
		
		insert_panel.add(label_surname);
		insert_panel.add(label_forename);
		insert_panel.add(label_address);
		
		
		
		///////////////////////////////////////////////////////SUBMIT BUTTON
		JPanel submit=new JPanel();
		submit.setBackground(new Color(0xA299FF));
		submit.setBounds(300,180,100,40);
		submit.setLayout(new BorderLayout());
		
		JLabel label_submit=new JLabel();
		label_submit.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		label_submit.setForeground(Color.white);
		label_submit.setText("Submit");
		label_submit.setHorizontalAlignment(SwingConstants.CENTER);
		label_submit.setVerticalAlignment(SwingConstants.CENTER);
		
		submit.add(label_submit);
		insert_panel.add(submit);
		
		add(insert_panel);
		
		
		
		///////////////////////////////////////////////////////////////////////////////////delete_panel
		JPanel delete_panel=new JPanel();
		delete_panel.setBounds(0,40,400,240);
		delete_panel.setBackground(new Color(0x514C7F));
		delete_panel.setLayout(null);
		
		///////////////////////////////////////////INSERT TEXTBOXES and LABELS
		JTextField delete_text_id=new JTextField();
		JLabel delete_label_id=new JLabel("Codul clientului de eliminat:");
		delete_label_id.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		delete_label_id.setForeground(Color.white);
		delete_label_id.setHorizontalAlignment(SwingConstants.CENTER);
		delete_label_id.setVerticalAlignment(SwingConstants.CENTER);
		delete_label_id.setBounds(0,20,200,40);
		delete_text_id.setBounds(200,20,100,40);
		
		delete_panel.add(delete_label_id);
		delete_panel.add(delete_text_id);
		
		
		
		///////////////////////////////////////////////////////DELETE_SUBMIT BUTTON
		JPanel delete_submit=new JPanel();
		delete_submit.setBackground(new Color(0xA299FF));
		delete_submit.setBounds(300,180,100,40);
		delete_submit.setLayout(new BorderLayout());
		
		JLabel delete_label_submit=new JLabel();
		delete_label_submit.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		delete_label_submit.setForeground(Color.white);
		delete_label_submit.setText("Submit");
		delete_label_submit.setHorizontalAlignment(SwingConstants.CENTER);
		delete_label_submit.setVerticalAlignment(SwingConstants.CENTER);
		
		delete_submit.add(delete_label_submit);
		delete_panel.add(delete_submit);
		
		add(delete_panel);
		
		///////////////////////////////////////////////////////////////////////////////////update_panel
		JPanel update_panel=new JPanel();
		update_panel.setBounds(0,40,400,240);
		update_panel.setBackground(new Color(0x514C7F));
		update_panel.setLayout(null);
		
		///////////////////////////////////////////UPDATE TEXTBOXES and LABELS
		JTextField update_text_id=new JTextField();
		JLabel update_label_id=new JLabel("ID:");
		update_label_id.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		update_label_id.setForeground(Color.white);
		update_label_id.setHorizontalAlignment(SwingConstants.CENTER);
		update_label_id.setVerticalAlignment(SwingConstants.CENTER);
		update_label_id.setBounds(200,20,100,40);
		update_text_id.setBounds(300,20,100,40);
		
		JTextField update_text_surname=new JTextField();
		JLabel update_label_surname=new JLabel("surname:");
		update_label_surname.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		update_label_surname.setForeground(Color.white);
		update_label_surname.setHorizontalAlignment(SwingConstants.CENTER);
		update_label_surname.setVerticalAlignment(SwingConstants.CENTER);
		update_label_surname.setBounds(0,20,100,40);
		update_text_surname.setBounds(100,20,100,40);
		
		JTextField update_text_forename=new JTextField();
		JLabel update_label_forename=new JLabel("forename:");
		update_label_forename.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		update_label_forename.setForeground(Color.white);
		update_label_forename.setHorizontalAlignment(SwingConstants.CENTER);
		update_label_forename.setVerticalAlignment(SwingConstants.CENTER);
		update_label_forename.setBounds(0,60,100,40);
		update_text_forename.setBounds(100,60,100,40);
		
		JTextField update_text_address=new JTextField();
		JLabel update_label_address=new JLabel("address:");
		update_label_address.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		update_label_address.setForeground(Color.white);
		update_label_address.setHorizontalAlignment(SwingConstants.CENTER);
		update_label_address.setVerticalAlignment(SwingConstants.CENTER);
		update_label_address.setBounds(0,100,100,40);
		update_text_address.setBounds(100,100,100,40);
		
		update_panel.add(update_label_id);
		update_panel.add(update_text_id);
		update_panel.add(update_label_surname);
		update_panel.add(update_text_surname);
		update_panel.add(update_label_forename);
		update_panel.add(update_text_forename);
		update_panel.add(update_label_address);
		update_panel.add(update_text_address);
		
		///////////////////////////////////////////////////////update_SUBMIT BUTTON
		JPanel update_submit=new JPanel();
		update_submit.setBackground(new Color(0xA299FF));
		update_submit.setBounds(300,180,100,40);
		update_submit.setLayout(new BorderLayout());
		
		JLabel update_label_submit=new JLabel();
		update_label_submit.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN,16));
		update_label_submit.setForeground(Color.white);
		update_label_submit.setText("Submit");
		update_label_submit.setHorizontalAlignment(SwingConstants.CENTER);
		update_label_submit.setVerticalAlignment(SwingConstants.CENTER);
		
		update_submit.add(update_label_submit);
		update_panel.add(update_submit);
		
		add(update_panel);
		
		insert_panel.setVisible(false);
		delete_panel.setVisible(false);
		update_panel.setVisible(false);
		
		/////////////////////////////////////////////////////////////////BUTOANE INSERT
		insert.addMouseListener(new PanelButtonMouseAdapter(insert){
			@Override
			public void mouseClicked(MouseEvent e) {
				insert_panel.setVisible(true);
				delete_panel.setVisible(false);
				update_panel.setVisible(false);
				sp.setVisible(false);
			}
		});
		
		submit.addMouseListener(new PanelButtonMouseAdapter(submit){
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Random rand = new Random(); //instance of random class
			    int upperbound = 250;
			    //generate random values from 0-24
			    int int_random = rand.nextInt(upperbound);
				
				String surname=text_surname.getText();
				String forename=text_forename.getText();
				String address=text_address.getText();
				
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-LHC94QE; instanceName=SQLEXPRESS; databaseName=GiFY8;integratedSecurity=true;";
					Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();
					
					//String display_query="insert into [GiFY8].[dbo].[Angajati] values('"+surname+" ',' "+forename+" ',' "+cnp+" ', "+salary+" , "+store+")";
					Statement st=con.createStatement();
					st.executeUpdate("insert into [GiFY8].[dbo].[Clienti] values('"+surname+"','"+forename+"','"+address+"','"+surname+int_random+"')");
					//ResultSet rs=st.executeQuery(display_query);
					con.close();
				}
				catch(Exception e_submit){
					JOptionPane.showMessageDialog(null,"An error has occurred la insert_submit");
				}
				
				display_clients_list(table);
				insert_panel.setVisible(false);
				sp.setVisible(true);
				
			}
		});
		
		////////////////////////////////////////////////////////////////////BUTOANE DELETE
		delete.addMouseListener(new PanelButtonMouseAdapter(delete){
			@Override
			public void mouseClicked(MouseEvent e) {
				delete_panel.setVisible(true);
				insert_panel.setVisible(false);
				update_panel.setVisible(false);
				sp.setVisible(false);
			}
		});
		
		delete_submit.addMouseListener(new PanelButtonMouseAdapter(delete_submit){
			@Override
			public void mouseClicked(MouseEvent e) {
				String id=delete_text_id.getText();
				
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-LHC94QE; instanceName=SQLEXPRESS; databaseName=GiFY8;integratedSecurity=true;";
					Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();
					
					//String display_query="insert into [GiFY8].[dbo].[Angajati] values('"+surname+" ',' "+forename+" ',' "+cnp+" ', "+salary+" , "+store+")";
					Statement st=con.createStatement();
					st.executeUpdate("delete from [GiFY8].[dbo].[Clienti] where CodClient='"+id+"'");
					//ResultSet rs=st.executeQuery(display_query);
					con.close();
				}
				catch(Exception e_submit){
					JOptionPane.showMessageDialog(null,"An error has occurred la delete_submit");
				}
				
				display_clients_list(table);
				delete_panel.setVisible(false);
				sp.setVisible(true);
				
			}
		});
		
		
		/////////////////////////////////////////////////////BUTOANE UPDATE
		update.addMouseListener(new PanelButtonMouseAdapter(update){
			@Override
			public void mouseClicked(MouseEvent e) {
				update_panel.setVisible(true);
				delete_panel.setVisible(false);
				insert_panel.setVisible(false);
				sp.setVisible(false);
			}
		});
		
		update_submit.addMouseListener(new PanelButtonMouseAdapter(update_submit){
			@Override
			public void mouseClicked(MouseEvent e) {
				String id=update_text_id.getText();
				String surname=update_text_surname.getText();
				String forename=update_text_forename.getText();
				String address=update_text_address.getText();
				
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-LHC94QE; instanceName=SQLEXPRESS; databaseName=GiFY8;integratedSecurity=true;";
					Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();
					Statement st=con.createStatement();
					
					//st.executeUpdate("insert into [GiFY8].[dbo].[Angajati] values('"+surname+" ',' "+forename+" ',' "+cnp+" ', "+salary+" , "+store+")");
					
					if(!surname.equals("")) {
						st.executeUpdate("update [GiFY8].[dbo].[Clienti] set Nume='"+surname+"' where CodClient='"+id+"'");
					}
					
					if(!forename.equals("")) {
						st.executeUpdate("update [GiFY8].[dbo].[Clienti] set Prenume='"+forename+"' where CodClient='"+id+"'");
					}
					
					if(!address.equals("")) {
						st.executeUpdate("update [GiFY8].[dbo].[Clienti] set Adresa='"+address+"' where CodClient='"+id+"'");
					}
					
					con.close();
				}
				catch(Exception e_submit){
					JOptionPane.showMessageDialog(null,"An error has occurred la update_submit");
				}
				
				display_clients_list(table);
				update_panel.setVisible(false);
				sp.setVisible(true);
				
			}
		});
		*/
	}
	
	public void panelClicked(JPanel panel) {
		panel.setVisible(true);
	}
	
	public ArrayList<Product> product_list(){
		
		ArrayList<Product> product_list= new ArrayList<>();
		
		try {
			//conexiunea
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-LHC94QE; instanceName=SQLEXPRESS; databaseName=GiFY8;integratedSecurity=true;";
			Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();
			
			String display_query="select * from [GiFY8].[dbo].[Produse]";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(display_query);
			
			Product product;
			while(rs.next()) {
				product=new Product(rs.getInt("ProdusID"),rs.getInt("CategorieID"),rs.getInt("PretProdus"),rs.getString("DisponibilitateProdus"),rs.getString("DenumireProdus"),rs.getString("Brand"),rs.getString("CPU"),rs.getString("GPU"),rs.getInt("MemorieVideo"),rs.getString("TipStocare"),rs.getInt("CapacitateStocare"),rs.getInt("MemorieRAM"),rs.getInt("Greutate"),rs.getString("RezolutieEcran"));
				product_list.add(product);
			}
			
			stmt.close();
			con.close();
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"An error has occurred la produse acolo");
		}
		
		return product_list;
	}
	
	public void display_products_list(JTable table){
		
		ArrayList<Product> list=product_list();
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		model.setRowCount(0);
		Object[] row=new Object[12];
		
		for(int i=0;i<list.size();i++){
			row[0]=list.get(i).getName();
			row[1]=list.get(i).getPrice();
			row[2]=list.get(i).getDisponibility();
			row[3]=list.get(i).getBrand();
			row[4]=list.get(i).getCpu();
			row[5]=list.get(i).getGpu();
			row[6]=list.get(i).getVideo_memory();
			row[7]=list.get(i).getStorage_type();
			row[8]=list.get(i).getSsd_capacity();
			row[9]=list.get(i).getRam_memory();
			row[10]=list.get(i).getWeight();
			row[11]=list.get(i).getDisplay_resolution();
			
			model.addRow(row);
		}
	}

}