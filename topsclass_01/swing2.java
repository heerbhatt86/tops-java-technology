package topsclass_01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class swing2 implements ActionListener {
	JFrame j;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2, b3, b4;

	public swing2() {

		j = new JFrame("swing2");

		j.setVisible(true);
		j.setSize(420, 500);
		j.setLayout(null);
		j.setResizable(false);

		l1 = new JLabel("ID");
		l2 = new JLabel("FIRST NAME");
		l3 = new JLabel("LAST NAME");
		l4 = new JLabel("EMAIL");
		l5 = new JLabel("MOBILE");

		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);

		b1 = new JButton("Insert");
		b2 = new JButton("Search");
		b3 = new JButton("Update");
		b4 = new JButton("Delete");

		j.add(l1);
		j.add(t1);
		j.add(l2);
		j.add(t2);
		j.add(l3);
		j.add(t3);
		j.add(l4);
		j.add(t4);
		j.add(l5);
		j.add(t5);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);

		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(50, 100, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		l4.setBounds(50, 200, 100, 20);
		l5.setBounds(50, 250, 100, 20);

		t1.setBounds(150, 50, 150, 20);
		t2.setBounds(150, 100, 150, 20);
		t3.setBounds(150, 150, 150, 20);
		t4.setBounds(150, 200, 150, 20);
		t5.setBounds(150, 250, 150, 20);

		b1.setBounds(70, 300, 100, 20);
		b2.setBounds(70, 350, 100, 20);
		b3.setBounds(200, 300, 100, 20);
		b4.setBounds(200, 350, 100, 20);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}

	public static void main(String[] args) {

		new swing2();

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b1) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_1", "root", "");
				String sql = "insert into student1(fname,lname,email,mobile) values ('" + t2.getText() + "','"
						+ t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "')";
				Statement stmt = conn.createStatement();
				stmt.execute(sql);
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

				 JOptionPane.showMessageDialog(j,"data inserted sucessfully"); 

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (ae.getSource() == b2) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_1", "root", "");
				String sql = "select * from student1  where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()));
				ResultSet rst = pst.executeQuery();

				if (rst.next()) {

					t2.setText(rst.getString("fname"));
					t3.setText(rst.getString("lname"));
					t4.setText(rst.getString("email"));
					t5.setText(rst.getString("mobile"));

				} else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					
					 JOptionPane.showMessageDialog(j,"data not found");

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (ae.getSource() == b3) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_1", "root", "");
				String sql = "update student1 set fname=?,lname=?,email=?,mobile=? where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);

				pst.setString(1, t2.getText());
				pst.setString(2, t3.getText());
				pst.setString(3, t4.getText());
				pst.setString(4, t5.getText());
				pst.setInt(5, Integer.parseInt(t1.getText()));

				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				 JOptionPane.showMessageDialog(j,"data updated sucessfully");

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (ae.getSource() == b4) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_1","root","");
				String sql = "delete from student1 where id =?";
				
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()) );
				
				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				 JOptionPane.showMessageDialog(j,"data deleted sucessfully");
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	}

}
