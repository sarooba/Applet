package prja;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;

public class EmployeeSalary extends Applet {
		TextField tfeid=new TextField(10);
		TextField tfEname=new TextField(10);
		TextField tfSal=new TextField(10);
		TextField tfHra=new TextField(10);
		TextField tfDa=new TextField(10);
		TextField tfPf=new TextField(10);
		TextField tfGp=new TextField(10);
		TextField tfNp=new TextField(10);
		
		Button btnCancel=new Button("Cancel");
		Button btnFind=new Button("Find");
		
		public void clearTextBox(TextField tf) {
		
			tf.setText(" ");
			tf.setText(tf.getText().trim());
		}
		
		public double UString2Double(String str) {
			try {
				return Double.parseDouble(str);
			}
			catch(Exception e) {
				return 0;
			
			}
		}
		ActionListener al=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource()== btnCancel ) {
					
					clearTextBox(tfeid);
					clearTextBox(tfEname);
					clearTextBox(tfSal);
					clearTextBox(tfHra);
					clearTextBox(tfDa);
					clearTextBox(tfPf);
					clearTextBox(tfGp);
					clearTextBox(tfNp);
					
				}else if(e.getSource()== btnFind) {
					
					double Sal=UString2Double(tfSal.getText());
					double hra=Sal*(20.0/100);
					double da=Sal*(15.0/100);
					double pf=Sal*(35.0/100);
					
					double gp=Sal+hra+da;
					double np=gp-pf;
					
					tfHra.setText(hra+"");
					tfDa.setText(da+"");
					tfPf.setText(pf+"");
					tfGp.setText(gp+"");
					tfNp.setText(np+"");
					tfSal.setText(Sal+"");
				}
			}
		};
		public EmployeeSalary() {
			setLayout(new GridLayout(9,2));
			add(new Label("Employee ID"));
			add(tfeid);
			add(new Label("Employee name"));
			add(tfEname);
			add(new Label("Salary"));
			add(tfSal);
			
			tfHra.setEditable(false);
			tfDa.setEditable(false);
			tfPf.setEditable(false);
			tfGp.setEditable(false);
			tfNp.setEditable(false);
			
			add(new Label("House rent allowance"));
			add(tfHra);
			add(new Label("Dearness allowance"));
			add(tfDa);
			add(new Label("Provident fund"));
			add(tfPf);
			add(new Label("Gross pay"));
			add(tfGp);
			add(new Label("Net pay"));
			add(tfNp);
			
			add(btnCancel);
			add(btnFind);
			
			btnCancel.addActionListener(al);
			btnFind.addActionListener(al);
		}
}
