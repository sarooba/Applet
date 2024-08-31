package prja;
import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Tables extends Applet{
	TextField tfNum=new TextField(10);
	TextArea tfOut=new TextArea();
	Button btnCancel=new Button("Cancel");
	Button btnFind=new Button("Find");
	public void clearTextBox(TextField tf) {
		tf.setText(" ");
		tf.setText(tf.getText().trim());
	}
	public int UString2Int(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(Exception e) {
			return 0;
		}
	}
	ActionListener al=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btnCancel) {

				clearTextBox(tfNum);
			//	TextArea.setText("");
			}
			else if(e.getSource()==btnFind) {
				int num=UString2Int(tfNum.getText());
				int j=0;
			    for(int i=1;i<=20;i++) {
			    	j=num*i;
			        tfOut.append((num+"*"+i+"="+j)+""+"\n");
			    }
			   // tfOut.setText(num+"*"+i+"="+j+"");
			    tfNum.setText(num+"");
			}
			}	
	};
	public Tables() {
		setLayout(new GridLayout(3,2));
		add(new Label("Number"));
		add(tfNum);
		tfOut.setEditable(false);
		add(new Label("Tables"));
		add(tfOut);
		add(btnCancel);
		add(btnFind);
		btnCancel.addActionListener(al);
		btnFind.addActionListener(al);
	}
	}

