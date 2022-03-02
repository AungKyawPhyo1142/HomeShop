import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/*--------------------------------------------------------------*/

class Manager extends JFrame implements ActionListener { 

JButton b1 = new JButton ("a\'wmrsm;topfxyfxnfhrnf/");

JButton b2 = new JButton ("a\'wmrsm;udkMunfhrnf/");

JButton b3 = new JButton ("a\'wmrsm;udkzsufrnf/");

public Manager( ) { 

super("Manager");
setSize(300,400);

JPanel pane = new JPanel( );
pane.setBackground(new Color(128,225,225));
GridLayout gl = new GridLayout(3,4,10,10);
pane.setLayout(gl);

Font f = new Font("W53Art House",Font.PLAIN,18);

b1.setFont(f);
b1.setBackground(new Color(128,225,225));
b1.setForeground(Color.RED);
pane.add(b1);

b2.setFont(f);
b2.setBackground(new Color(128,225,225));
b2.setForeground(Color.RED);
pane.add(b2);

b3.setFont(f);
b3.setBackground(new Color(128,225,225));
b3.setForeground(Color.RED);
pane.add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );


if (source==b1) { Insert i = new Insert( ); i.InsertData( ); }

if (source==b2) { Read i = new Read( ); i.ReadData( ); }

if (source==b3) { Delete i = new Delete( ); i.DeleteData( ); }


}

}

/*--------------------------------------------------------------*/
/*
class Voucher extends JFrame implements ActionListener { 

String ss;
long pay;

JButton b1 = new JButton("aemufxyfaps;0,fol");

JButton b2 = new JButton("rlvpmrsufESm");

JButton b3 = new JButton("xGufrnf/");

public Voucher( ) {

super("Menu");
//setSize(500,90);
setBounds(600,250,200,200);
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel pane = new JPanel ( );
pane.setBackground(new Color(32,147,147));
//pane.setLayout(null);

FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
pane.setLayout(fl);

Font f = new Font("W42Art House",Font.PLAIN,25);

b1.setFont(f);
b1.setBackground(new Color(32,147,147));
b1.setForeground(Color.RED);
pane.add(b1);

b2.setBackground(new Color(32,147,147));
b2.setForeground(Color.RED);
b2.setFont(f);
pane.add(b2);

b3.setBackground(new Color(32,147,147));
b3.setForeground(Color.RED);
b3.setFont(f);
pane.add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

System.out.println("\n\n\t\t\t\tVoucher\n\t\t\t\t- - - -");

//------------------------DATE AND TIME-------------------------------

SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy");
System.out.print("\n\tDate : ");
System.out.print(dateTimeInGMT.format(new Date( )) );
System.out.println("\n");

//--------------------------------------------------------------------

System.out.println("\t- - - - - - - - - - - - - - - - - - - - - - -");
System.out.println("\tName\t\t\tQuantity\tPrice");
System.out.println("\t- - - - - - - - - - - - - - - - - - - - - - -");

Face ff = new Face( ); ff.setVisible(false);
Hand hh = new Hand( ); hh.setVisible(false);
Dish dd = new Dish( ); dd.setVisible(false);
Shampoo ss = new Shampoo( ); ss.setVisible(false);

String s; long paid;

long total = 0;

total = ff.face_total+hh.hand_total+dd.dish_total+ss.shampoo_total;

if (hh.q1>0) { System.out.println("\n\tGreen Gel\t\t"+hh.q1+"\t\t"+hh.h1+" k"+"\n\t(Lemon Flavour)"); }

if (hh.q2>0) { System.out.println("\n\tGreen Gel\t\t"+hh.q2+"\t\t"+hh.h2+" k"+"\n\t(Strawberry Flavour)"); }

if (hh.q3>0) { System.out.println("\n\tGreen Gel\t\t"+hh.q3+"\t\t"+hh.h3+" k"+"\n\t(Jasmine Flavour)"); }

if (hh.q4>0) { System.out.println("\n\tOrange Gel\t\t"+hh.q4+"\t\t"+hh.h4+" k"+"\n\t(Orange Flavour)"); }

if (hh.q5>0) { System.out.println("\n\tYellow Soap\t\t"+hh.q5+"\t\t"+hh.h5+" k"+"\n\t(Orange Flavour)"); }


if (ff.q1>0) { System.out.println("\n\tGold Soap\t\t"+ff.q1+"\t\t"+ff.f1+" k"); }

if (ff.q2>0) { System.out.println("\n\tCoffee Soap\t\t"+ff.q2+"\t\t"+ff.f2+" k"); }

if (ff.q3>0) { System.out.println("\n\tTumeric Soap\t\t"+ff.q3+"\t\t"+ff.f3+" k"); }

if (ff.q4>0) { System.out.println("\n\tCharcoal Soap\t\t"+ff.q4+"\t\t"+ff.f4+" k"); }

if (ff.q5>0) { System.out.println("\n\tBamboo-Charcoal\t\t"+ff.q4+"\t\t"+ff.f4+" k"+"\n\tSoap"); }


if (dd.q1>0) { System.out.println("\n\tGreen Gel\t\t"+dd.q1+"\t\t"+dd.d1+" k"+"\n\t(Lemon Flavour)"); }

if (dd.q2>0) { System.out.println("\n\tGreen Gel\t\t"+dd.q2+"\t\t"+dd.d2+" k"+"\n\t(Jasmine Flavour)"); }

if (dd.q3>0) { System.out.println("\n\tYellow Gel\t\t"+dd.q3+"\t\t"+dd.d3+" k"+"\n\t(Lemon Flavour)"); }

if (dd.q4>0) { System.out.println("\n\tYellow Gel\t\t"+dd.q4+"\t\t"+dd.d4+" k"+"\n\t(Orange Flavour)"); }

if (dd.q5>0) { System.out.println("\n\tRED Gel\t\t\t"+dd.q5+"\t\t"+dd.d5+" k"+"\n\t(Strawberry Flavour)"); }


if (ss.q1>0) { System.out.println("\n\tAcacia Shampoo\t\t"+ss.q1+"\t\t"+ss.s1+" k"); }

if (ss.q2>0) { System.out.println("\n\tGreen Color\t\t"+ss.q2+"\t\t"+ss.s2+" k"+"\n\t(Lemon Flavour)"); }

if (ss.q3>0) { System.out.println("\n\tGreen Color\t\t"+ss.q3+"\t\t"+ss.s3+" k"+"\n\t(Jasmine Flavour)"); }

if (ss.q4>0) { System.out.println("\n\tOrange Flavour\t\t"+ss.q4+"\t\t"+ss.s4+" k"+"\n\tShampoo"); }

if (ss.q5>0) { System.out.println("\n\tRed Color\t\t"+ss.q5+"\t\t"+ss.s5+" k"+"\n\t(Strawberry Flavour)"); }

System.out.println("\t- - - - - - - - - - - - - - - - - - - - - - -");
System.out.println("\t\tTotal Cost : "+total+" k");
System.out.println("\t- - - - - - - - - - - - - - - - - - - - - - -");

s = JOptionPane.showInputDialog(null,"Enter Your Payment","Payment",JOptionPane.PLAIN_MESSAGE);
paid = Integer.parseInt(s);

long change = 0;
long req = 0; long rr;
long re = 0;
if (paid >= total) { change = paid - total;
                     System.out.println("\t\tPaid : "+paid+" k");
                     System.out.println("\t\tChange : "+change+" k");
                     System.out.println("\t- - - - - - - - - - - - - - - - - - - - - - -");
                   } 

if (paid < total) { req = total - paid;
                    JOptionPane.showMessageDialog(null,"Required Money : "+req+" k","Required Money",JOptionPane.PLAIN_MESSAGE);

                    s = JOptionPane.showInputDialog(null,"Paid Again","Please Enter Again",JOptionPane.PLAIN_MESSAGE);
                    rr = Integer.parseInt(s);
                    
                    long money = 0;

                    money = rr + paid;

                    re = rr - req;

                    System.out.println("\t\tPaid : "+money+" k"); 
                    System.out.println("\t\tChange : "+re+" k");

                  }

setContentPane(pane);
setVisible(true);
 
}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

Shampoo ss = new Shampoo ( ); ss.setVisible(false);
Dish dd = new Dish ( ); dd.setVisible(false);
Face ff = new Face ( ); ff.setVisible(false);
Hand hh = new Hand ( ); hh.setVisible(false);

ss.q1 = 0;
ss.q2 = 0;
ss.q3 = 0;
ss.q4 = 0;
ss.q5 = 0;
ss.s1 = 0;
ss.s2 = 0;
ss.s3 = 0;
ss.s4 = 0;
ss.s5 = 0;
ss.shampoo_total = 0;

dd.q1 = 0;
dd.q2 = 0;
dd.q3 = 0;
dd.q4 = 0;
dd.q5 = 0;
dd.d1 = 0;
dd.d2 = 0;
dd.d3 = 0;
dd.d4 = 0;
dd.d5 = 0;
dd.dish_total = 0;

ff.q1 = 0;
ff.q2 = 0;
ff.q3 = 0;
ff.q4 = 0;
ff.q5 = 0;
ff.f1 = 0;
ff.f2 = 0;
ff.f3 = 0;
ff.f4 = 0;
ff.f5 = 0;
ff.face_total = 0;

hh.q1 = 0;
hh.q2 = 0;
hh.q3 = 0;
hh.q4 = 0;
hh.q5 = 0;
hh.h1 = 0;
hh.h2 = 0;
hh.h3 = 0;
hh.h4 = 0;
hh.h5 = 0;
hh.hand_total = 0;


if (source==b1) { 

setVisible(false);

for(int i=0;i<30;i++) { System.out.println("\t"); }                

Customer cs = new Customer( );

                } 

if (source==b2) { setVisible(false); 
                  Home_Project cs = new Home_Project( ); }

if (source==b3) { setVisible(false);
                  Exit e = new Exit( ); }




}

}

*/

class Voucher extends JFrame implements ActionListener { 

JMenuItem m1 = new JMenuItem("aemufxyfaps;0,fol/");
JMenuItem m2 = new JMenuItem("rlvpmrsufESm/");
JMenuItem m3 = new JMenuItem("xGufrnf/");

JTextArea t1 = new JTextArea( );
JTextArea t2 = new JTextArea( );



String data = "";

public Voucher( ) {
 
super("Voucher");
setBounds(350,100,800,500);
setResizable(false);

JPanel pane = new JPanel( );
BorderLayout bl = new BorderLayout( );
pane.setLayout(bl);

Font f = new Font ("W42Art House",Font.PLAIN,18);

m1.setFont(f);
m2.setFont(f);
m3.setFont(f);

m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);

JMenu m = new JMenu ("a&G;cs,frIrsm;");
m.setFont(f);
m.add(m1);
m.addSeparator( );
m.add(m2);
m.addSeparator( );
m.add(m3);

JMenuBar b = new JMenuBar( );
b.add(m);
setJMenuBar(b);


Shampoo ss = new Shampoo( ); ss.setVisible(false);
Hand hh = new Hand( ); hh.setVisible(false);
Face ff = new Face( ); ff.setVisible(false);
Dish dd = new Dish( ); dd.setVisible(false);

SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy");
//System.out.print("\n\tDate : ");
//System.out.print(dateTimeInGMT.format(new Date( )) );
//System.out.println("\n");

t1.setText("\t\t\t\tVoucher\n\nDate : "+dateTimeInGMT.format(new Date( ))+"\n\nName\t\t\tQuantity\t\tPrice\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - -- - - - - - - - - -- - - - - - - - - -- - - - - - - - - -\n");
t1.setEditable(false);
pane.add("North",t1);

long total = ss.shampoo_total + hh.hand_total + dd.dish_total+ff.face_total;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement s = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = s.executeQuery("SELECT * FROM Voucher");

r.last( );
r.beforeFirst( );

while (r.next( )) { 

String name = r.getString(2);
String quan = r.getString(3);
String pric = r.getString(4);

data += name+"\t\t"+quan+"\t\t"+pric+"\n";

}


r.close( );
s.close( );
obj.close( );

} catch (SQLException se) { }

t2.setText(data+"\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - -- - - - - - - - - -- - - - - - - - - -- - - - - - - - - -\n\t\t\t\tTotal Cost : "+ total );

pane.add("Center",t2);

setContentPane(pane);
setVisible(true);

}

public void actionPerformed (ActionEvent ae) { 

Object source = ae.getSource( );

Shampoo ss = new Shampoo ( ); ss.setVisible(false);
Dish dd = new Dish ( ); dd.setVisible(false);
Face ff = new Face ( ); ff.setVisible(false);
Hand hh = new Hand ( ); hh.setVisible(false);

ss.q1 = 0;
ss.q2 = 0;
ss.q3 = 0;
ss.q4 = 0;
ss.q5 = 0;
ss.s1 = 0;
ss.s2 = 0;
ss.s3 = 0;
ss.s4 = 0;
ss.s5 = 0;
ss.shampoo_total = 0;

dd.q1 = 0;
dd.q2 = 0;
dd.q3 = 0;
dd.q4 = 0;
dd.q5 = 0;
dd.d1 = 0;
dd.d2 = 0;
dd.d3 = 0;
dd.d4 = 0;
dd.d5 = 0;
dd.dish_total = 0;

ff.q1 = 0;
ff.q2 = 0;
ff.q3 = 0;
ff.q4 = 0;
ff.q5 = 0;
ff.f1 = 0;
ff.f2 = 0;
ff.f3 = 0;
ff.f4 = 0;
ff.f5 = 0;
ff.face_total = 0;

hh.q1 = 0;
hh.q2 = 0;
hh.q3 = 0;
hh.q4 = 0;
hh.q5 = 0;
hh.h1 = 0;
hh.h2 = 0;
hh.h3 = 0;
hh.h4 = 0;
hh.h5 = 0;
hh.hand_total = 0;

if(source==m1) {

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

    } catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

int i;

r.last( );
r.beforeFirst( );

while (r.next( )) { 

String id = r.getString(1);

i = Integer.parseInt(id);

r.absolute(i);

r.deleteRow( );

}

r.close();
st.close( );
obj.close( );

    } catch (SQLException se) { }


 } // close m1

}

}

/*---------------------------- Shampoo ----------------------------*/

class Shampoo extends JFrame implements ActionListener {

JCheckBox cb1 = new JCheckBox( );
JCheckBox cb2 = new JCheckBox( );
JCheckBox cb3 = new JCheckBox( );
JCheckBox cb4 = new JCheckBox( );
JCheckBox cb5 = new JCheckBox( );

JMenuItem menu = new JMenuItem("aemufodkU");

public static int price = 0;
//public static int quantity = 0;
//public long sub_total = 0;

public static int q1 = 0;
public static int q2 = 0;
public static int q3 = 0;
public static int q4 = 0;
public static int q5 = 0;

public static long s1 = 0;
public static long s2 = 0;
public static long s3 = 0;
public static long s4 = 0;
public static long s5 = 0;

public static long shampoo_total = 0;

int shampoo[ ] = new int [5];

public Shampoo( ) { 

super("SHAMPOO");
//setSize(600,500);
setBounds(350,100,600,500);
setResizable(false);

JPanel pane = new JPanel ( );
pane.setLayout(null);
pane.setBackground(new Color(62,191,179));

Font ef = new Font ("W42Art House",Font.PLAIN,18);

JMenu mm = new JMenu ("a½G;cs,frIrsm;");
mm.setBackground(new Color(62,191,179));
mm.setFont(ef);
menu.setBackground(new Color(62,191,179));
menu.addActionListener(this);
menu.setFont(ef);
mm.add(menu);

JMenuBar ba = new JMenuBar( );
ba.setBackground(new Color(62,191,179));
ba.add(mm);
setJMenuBar(ba);
//pane.add(ba);

Font f = new Font ("W63ArtHouse",Font.PLAIN,30);
JLabel tit = new JLabel ("acgif;avQmf&nf trsdL;tpm;rsm;");
tit.setFont(f);
tit.setForeground(Color.RED);
tit.setBounds(150,20,350,50);
pane.add(tit);

JLabel lb = new JLabel ("No.");
JLabel lb1 = new JLabel ("Name ");
JLabel lb2 = new JLabel ("Price ");

lb.setBounds(50,80,50,30);
pane.add(lb);

lb1.setBounds(200,80,50,30);
pane.add(lb1);

lb2.setBounds(450,80,50,30);
pane.add(lb2);

/*
ButtonGroup bb = new ButtonGroup ( );
bb.add(cb1);
bb.add(cb2);
bb.add(cb3);
bb.add(cb4);
bb.add(cb5);
*/

cb1.addActionListener(this);
cb2.addActionListener(this);
cb3.addActionListener(this);
cb4.addActionListener(this);
cb5.addActionListener(this);

cb1.setBounds(10,120,20,30);
cb1.setBackground (new Color(62,191,179));
pane.add(cb1);

JLabel l1 = new JLabel ("1");
JLabel l2 = new JLabel ("Acacia Shampoo");
JLabel l3 = new JLabel ("2500 k");

l1.setBounds(50,120,20,30);
l2.setBounds(200,120,200,30);
l3.setBounds(450,120,100,30);
pane.add(l1);
pane.add(l2);
pane.add(l3);

cb2.setBounds(10,170,20,30);
cb2.setBackground (new Color(62,191,179));
pane.add(cb2);

JLabel l4 = new JLabel ("2");
JLabel l5 = new JLabel ("Green-Color (Lemon Flavour)");
JLabel l6 = new JLabel ("1800 k");

l4.setBounds(50,170,20,30);
l5.setBounds(200,170,200,30);
l6.setBounds(450,170,100,30);
pane.add(l4);
pane.add(l5);
pane.add(l6);

cb3.setBounds(10,220,20,30);
cb3.setBackground (new Color(62,191,179));

pane.add(cb3);

JLabel l7 = new JLabel ("3");
JLabel l8 = new JLabel ("Green-Color (Jasmine Flavour)");
JLabel l9 = new JLabel ("1800 k");
l7.setBounds(50,220,20,30);
l8.setBounds(200,220,200,30);
l9.setBounds(450,220,100,30);
pane.add(l7);
pane.add(l8);
pane.add(l9);

cb4.setBounds(10,270,20,30);
cb4.setBackground (new Color(62,191,179));
pane.add(cb4);

JLabel l10 = new JLabel ("4");
JLabel l11 = new JLabel ("Orange Flavour Shampoo");
JLabel l12 = new JLabel ("2000 k");
l10.setBounds(50,270,20,30);
l11.setBounds(200,270,200,30);
l12.setBounds(450,270,100,30);
pane.add(l10);
pane.add(l11);
pane.add(l12);

cb5.setBounds(10,320,20,30);
cb5.setBackground (new Color(62,191,179));
pane.add(cb5);

JLabel l13 = new JLabel ("5");
JLabel l14 = new JLabel ("Red Color (Strawberry Flavour)");
JLabel l15 = new JLabel ("1800 k");
l13.setBounds(50,320,20,30);
l14.setBounds(200,320,200,30);
l15.setBounds(450,320,100,30);
pane.add(l13);
pane.add(l14);
pane.add(l15);

/*
Font af = new Font ("W61Art House",Font.PLAIN,25);
buy.setFont(af);
buy.setBackground(new Color(62,191,179));
buy.setBounds(230,380,100,40);
buy.addActionListener(this);
pane.add(buy);
*/

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) {

Object source = ae.getSource( ); 

String s;

if (source==menu) {
                      setVisible(false);
                      Customer cus = new Customer( ); }

if (source==cb1) { price = 2500; }

if (source==cb2) { price = 1800; }

if (source==cb3) { price = 1800; }

if (source==cb4) { price = 2000; }

if (source==cb5) { price = 1800; }


if (source==cb1) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Acacia Shampoo","ACACIA",JOptionPane.PLAIN_MESSAGE); 
                   q1 = Integer.parseInt(s);
                   shampoo[0] += q1;
                   s1 = q1 * price;
                   shampoo_total += s1;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q1>0) {  
r.moveToInsertRow( );
r.updateString(1,"Acacia Shampoo");
r.updateString(2," "+q1);
r.updateString(3," "+s1);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }

                 }

if (source==cb2) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Green-Color (Lemon Falvour)","LEMON Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q2 = Integer.parseInt(s);
                   shampoo[1] += q2;
                   s2 = q2 * price;
                   shampoo_total += s2;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q2>0) {  
r.moveToInsertRow( );
r.updateString(1,"Green-Color(Lemon Flavour) Shampoo");
r.updateString(2," "+q2);
r.updateString(3," "+s2);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }

 }

if (source==cb3) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Green-Color (Jasmine Falvour)","JASMINE Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q3 = Integer.parseInt(s);
                   shampoo[2] += q3;
                   s3 = q3 * price;
                   shampoo_total += s3;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q3>0) {  
r.moveToInsertRow( );
r.updateString(1,"Green-Color(Jasmine Flavour) Shampoo");
r.updateString(2," "+q3);
r.updateString(3," "+s3);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }




 }

if (source==cb4) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Orange Falvour Shampoo","ORANGE Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q4 = Integer.parseInt(s);
                   shampoo[3] += q4;
                   s4 = q4 * price;
                   shampoo_total += s4;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q4>0) {  
r.moveToInsertRow( );
r.updateString(1,"Orange Flavour Shampoo");
r.updateString(2," "+q4);
r.updateString(3," "+s4);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }




 }

if (source==cb5) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Red-Color (Strawberry Falvour) Shampoo","STRAWBERRY Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q5 = Integer.parseInt(s);
                   shampoo[4] += q5;
                   s5 = q5 * price;
                   shampoo_total += s5;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q5>0) {  
r.moveToInsertRow( );
r.updateString(1,"Red-Color(StrawberryFlavour) Shampoo");
r.updateString(2," "+q5);
r.updateString(3," "+s5);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }


 }


}

}

/*---------------------------------------------------------------------------------*/


/*---------------------------- Dish-Washing Gel ----------------------------*/

class Dish extends JFrame implements ActionListener {

JCheckBox cb1 = new JCheckBox( );
JCheckBox cb2 = new JCheckBox( );
JCheckBox cb3 = new JCheckBox( );
JCheckBox cb4 = new JCheckBox( );
JCheckBox cb5 = new JCheckBox( );


JMenuItem menu = new JMenuItem("aemufodkU");

public static int price = 0;
//public static int quantity = 0;
//public long sub_total = 0;

public static int q1 = 0;
public static int q2 = 0;
public static int q3 = 0;
public static int q4 = 0;
public static int q5 = 0;

public static long d1 = 0;
public static long d2 = 0;
public static long d3 = 0;
public static long d4 = 0;
public static long d5 = 0;

public static long dish_total = 0;

int dish [ ] = new int [5];

public Dish( ) { 

super("Dish-Washing Soap & Gel");
//setSize(600,500);
setBounds(350,100,600,500);
setResizable(false);

JPanel pane = new JPanel ( );
pane.setLayout(null);
pane.setBackground(new Color(62,191,179));

Font ef = new Font ("W42Art House",Font.PLAIN,18);

JMenu mm = new JMenu ("a½G;cs,frIrsm;");
mm.setBackground(new Color(62,191,179));
mm.setFont(ef);
menu.setBackground(new Color(62,191,179));
menu.addActionListener(this);
menu.setFont(ef);
mm.add(menu);

JMenuBar ba = new JMenuBar( );
ba.setBackground(new Color(62,191,179));
ba.add(mm);
setJMenuBar(ba);
//pane.add(ba);

Font f = new Font ("W63ArtHouse",Font.PLAIN,30);

JLabel tit = new JLabel ("yef;uefaq;qyfjymtrdsK;tpm;rsm;");
tit.setFont(f);
tit.setForeground(Color.RED);
tit.setBounds(150,20,350,50);
pane.add(tit);

JLabel lb = new JLabel ("No.");
JLabel lb1 = new JLabel ("Name ");
JLabel lb2 = new JLabel ("Price ");

lb.setBounds(50,80,50,30);
pane.add(lb);

lb1.setBounds(200,80,50,30);
pane.add(lb1);

lb2.setBounds(450,80,50,30);
pane.add(lb2);

/*
ButtonGroup bb = new ButtonGroup ( );
bb.add(cb1);
bb.add(cb2);
bb.add(cb3);
bb.add(cb4);
bb.add(cb5);
*/

cb1.addActionListener(this);
cb2.addActionListener(this);
cb3.addActionListener(this);
cb4.addActionListener(this);
cb5.addActionListener(this);

cb1.setBounds(10,120,20,30);
cb1.setBackground (new Color(62,191,179));
pane.add(cb1);

JLabel l1 = new JLabel ("1");
JLabel l2 = new JLabel ("Green Gel (Lemon Flavour)");
JLabel l3 = new JLabel ("850 k");

l1.setBounds(50,120,20,30);
l2.setBounds(200,120,200,30);
l3.setBounds(450,120,100,30);
pane.add(l1);
pane.add(l2);
pane.add(l3);

cb2.setBounds(10,170,20,30);
cb2.setBackground (new Color(62,191,179));
pane.add(cb2);

JLabel l4 = new JLabel ("2");
JLabel l5 = new JLabel ("Green Gel (Jasmine Flavour)");
JLabel l6 = new JLabel ("850 k");

l4.setBounds(50,170,20,30);
l5.setBounds(200,170,200,30);
l6.setBounds(450,170,100,30);
pane.add(l4);
pane.add(l5);
pane.add(l6);

cb3.setBounds(10,220,20,30);
cb3.setBackground (new Color(62,191,179));

pane.add(cb3);

JLabel l7 = new JLabel ("3");
JLabel l8 = new JLabel ("Yellow Gel (Lemon Gel)");
JLabel l9 = new JLabel ("850 k");
l7.setBounds(50,220,20,30);
l8.setBounds(200,220,200,30);
l9.setBounds(450,220,100,30);
pane.add(l7);
pane.add(l8);
pane.add(l9);

cb4.setBounds(10,270,20,30);
cb4.setBackground (new Color(62,191,179));
pane.add(cb4);

JLabel l10 = new JLabel ("4");
JLabel l11 = new JLabel ("Yellow Gel (Orange Falvour)");
JLabel l12 = new JLabel ("850 k");
l10.setBounds(50,270,20,30);
l11.setBounds(200,270,200,30);
l12.setBounds(450,270,100,30);
pane.add(l10);
pane.add(l11);
pane.add(l12);

cb5.setBounds(10,320,20,30);
cb5.setBackground (new Color(62,191,179));
pane.add(cb5);

JLabel l13 = new JLabel ("5");
JLabel l14 = new JLabel ("Red Gel (Strawberry Flavour)");
JLabel l15 = new JLabel ("850 k");
l13.setBounds(50,320,20,30);
l14.setBounds(200,320,200,30);
l15.setBounds(450,320,100,30);
pane.add(l13);
pane.add(l14);
pane.add(l15);

/*
Font af = new Font ("W61Art House",Font.PLAIN,25);
buy.setFont(af);
buy.setBackground(new Color(62,191,179));
buy.setBounds(230,380,100,40);
buy.addActionListener(this);
pane.add(buy);
*/

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) {

Object source = ae.getSource( ); 

String s;

if (source==menu) { 
                      setVisible(false);
                      Customer cus = new Customer( ); }

if (source==cb1) { price = 850; }

if (source==cb2) { price = 850; }

if (source==cb3) { price = 850; }

if (source==cb4) { price = 850; }

if (source==cb5) { price = 850; }


if (source==cb1) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Green Gel (Lemon Falvour)","Lemon Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q1 = Integer.parseInt(s);
                   dish[0] += q1;
                   d1 = q1 * price;
                   dish_total += d1;
try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q1>0) {  
r.moveToInsertRow( );
r.updateString(1,"Green-Gel(Lemon Flavour)");
r.updateString(2," "+q1);
r.updateString(3," "+d1);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }



 }

if (source==cb2) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Green Gel (Jasmine Falvour)","Jasmine Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q2 = Integer.parseInt(s);
                   dish[1] += q2;
                   d2 = q2 * price;
                   dish_total += d2;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q2>0) {  
r.moveToInsertRow( );
r.updateString(1,"Green Gel(Jasmine Flavour)");
r.updateString(2," "+q2);
r.updateString(3," "+d2);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }

 }

if (source==cb3) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Yellow Gel (Lemon Falvour)","Lemon Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q3 = Integer.parseInt(s);
                   dish[2] += q3;
                   d3 = q3 * price;
                   dish_total += d3;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q3>0) {  
r.moveToInsertRow( );
r.updateString(1,"Yellow Gel(Lemon Flavour)");
r.updateString(2," "+q3);
r.updateString(3," "+d3);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }


 }

if (source==cb4) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Yellow Gel (Orange Falvour)","Orange Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q4 = Integer.parseInt(s);
                   dish[3] += q4;
                   d4 = q4 * price;
                   dish_total += d4; 

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q4>0) {  
r.moveToInsertRow( );
r.updateString(1,"Yellow Gel (Orange Flavour)");
r.updateString(2," "+q4);
r.updateString(3," "+d4);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }



}

if (source==cb5) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Red Gel (Strawberry Falvour)","Orange Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q5 = Integer.parseInt(s);
                   dish[4] += q5;
                   d5 = q5 * price;
                   dish_total += d5;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q5>0) {  
r.moveToInsertRow( );
r.updateString(1,"Red Gel (Strawberry Flavour)");
r.updateString(2," "+q5);
r.updateString(3," "+d5);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }


 }


}

}

/*---------------------------------------------------------------------------------*/


/*---------------------------- Face-Washing Soap & Gel ----------------------------*/

class Face extends JFrame implements ActionListener {

JCheckBox cb1 = new JCheckBox( );
JCheckBox cb2 = new JCheckBox( );
JCheckBox cb3 = new JCheckBox( );
JCheckBox cb4 = new JCheckBox( );
JCheckBox cb5 = new JCheckBox( );


JMenuItem menu = new JMenuItem("aemufodkU");

public static int price = 0;
//public long sub_total = 0;

public static int q1 = 0;
public static int q2 = 0;
public static int q3 = 0;
public static int q4 = 0;
public static int q5 = 0;

public static long f1 = 0;
public static long f2 = 0;
public static long f3 = 0;
public static long f4 = 0;
public static long f5 = 0;


public static long face_total = 0;

int face[ ] = new int [5];

public Face( ) { 

super("Face-Washing Soap & Gel");
//setSize(600,500);
setBounds(350,100,600,500);
setResizable(false);

JPanel pane = new JPanel ( );
pane.setLayout(null);
pane.setBackground(new Color(62,191,179));


Font ef = new Font ("W42Art House",Font.PLAIN,18);

JMenu mm = new JMenu ("a½G;cs,frIrsm;");
mm.setBackground(new Color(62,191,179));
mm.setFont(ef);
menu.setBackground(new Color(62,191,179));
menu.addActionListener(this);
menu.setFont(ef);
mm.add(menu);

JMenuBar ba = new JMenuBar( );
ba.setBackground(new Color(62,191,179));
ba.add(mm);
setJMenuBar(ba);
//pane.add(ba);

Font f = new Font ("W63ArtHouse",Font.PLAIN,30);
JLabel tit = new JLabel ("rsufESmopfqyfjym trsdL;tpm;rsm;");
tit.setFont(f);
tit.setForeground(Color.RED);
tit.setBounds(150,20,350,50);
pane.add(tit);

JLabel lb = new JLabel ("No.");
JLabel lb1 = new JLabel ("Name ");
JLabel lb2 = new JLabel ("Price ");

lb.setBounds(50,80,50,30);
pane.add(lb);

lb1.setBounds(200,80,50,30);
pane.add(lb1);

lb2.setBounds(450,80,50,30);
pane.add(lb2);

/*
ButtonGroup bb = new ButtonGroup ( );
bb.add(cb1);
bb.add(cb2);
bb.add(cb3);
bb.add(cb4);
bb.add(cb5);
*/

cb1.addActionListener(this);
cb2.addActionListener(this);
cb3.addActionListener(this);
cb4.addActionListener(this);
cb5.addActionListener(this);

cb1.setBounds(10,120,20,30);
cb1.setBackground (new Color(62,191,179));
pane.add(cb1);

JLabel l1 = new JLabel ("1");
JLabel l2 = new JLabel ("Gold Soap");
JLabel l3 = new JLabel ("2000 k");

l1.setBounds(50,120,20,30);
l2.setBounds(200,120,200,30);
l3.setBounds(450,120,100,30);
pane.add(l1);
pane.add(l2);
pane.add(l3);

cb2.setBounds(10,170,20,30);
cb2.setBackground (new Color(62,191,179));
pane.add(cb2);

JLabel l4 = new JLabel ("2");
JLabel l5 = new JLabel ("Coffee Soap");
JLabel l6 = new JLabel ("1500 k");

l4.setBounds(50,170,20,30);
l5.setBounds(200,170,200,30);
l6.setBounds(450,170,100,30);
pane.add(l4);
pane.add(l5);
pane.add(l6);

cb3.setBounds(10,220,20,30);
cb3.setBackground (new Color(62,191,179));
pane.add(cb3);

JLabel l7 = new JLabel ("3");
JLabel l8 = new JLabel ("Turmeric Soap");
JLabel l9 = new JLabel ("1500 k");
l7.setBounds(50,220,20,30);
l8.setBounds(200,220,200,30);
l9.setBounds(450,220,100,30);
pane.add(l7);
pane.add(l8);
pane.add(l9);

cb4.setBounds(10,270,20,30);
cb4.setBackground (new Color(62,191,179));
pane.add(cb4);

JLabel l10 = new JLabel ("4");
JLabel l11 = new JLabel ("Charcoal Soap");
JLabel l12 = new JLabel ("1800 k");
l10.setBounds(50,270,20,30);
l11.setBounds(200,270,200,30);
l12.setBounds(450,270,100,30);
pane.add(l10);
pane.add(l11);
pane.add(l12);

cb5.setBounds(10,320,20,30);
cb5.setBackground (new Color(62,191,179));
pane.add(cb5);

JLabel l13 = new JLabel ("5");
JLabel l14 = new JLabel ("Bamboo-Charcoal Soap");
JLabel l15 = new JLabel ("2000 k");
l13.setBounds(50,320,20,30);
l14.setBounds(200,320,200,30);
l15.setBounds(450,320,100,30);
pane.add(l13);
pane.add(l14);
pane.add(l15);

/*
Font af = new Font ("W61Art House",Font.PLAIN,25);
buy.setFont(af);
buy.setBackground(new Color(62,191,179));
buy.setBounds(230,380,100,40);
buy.addActionListener(this);
pane.add(buy);
*/

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) {

Object source = ae.getSource( ); 

String s;

if (source==menu) { 
                      setVisible(false);
                      Customer cus = new Customer( ); }

if (source==cb1) { price = 2000; }

if (source==cb2) { price = 1500; }

if (source==cb3) { price = 1500; }

if (source==cb4) { price = 1800; }

if (source==cb5) { price = 2000; }


if (source==cb1) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Gold Soap","GOLD",JOptionPane.PLAIN_MESSAGE); 
                   q1 = Integer.parseInt(s);
                   face[0] += q1;
                   f1 = q1 * price;
                   face_total += f1;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q1>0) {  
r.moveToInsertRow( );
r.updateString(1,"Gold Soap");
r.updateString(2," "+q1);
r.updateString(3," "+f1);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }





 }

if (source==cb2) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Coffee Soap","COFFEE",JOptionPane.PLAIN_MESSAGE); 
                   q2 = Integer.parseInt(s);
                   face[1] += q2;
                   f2 = q2 * price;
                   face_total += f2;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q2>0) {  
r.moveToInsertRow( );
r.updateString(1,"Coffee Soap");
r.updateString(2," "+q2);
r.updateString(3," "+f2);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }


 }

if (source==cb3) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Tumeric Soap","TUMERIC",JOptionPane.PLAIN_MESSAGE); 
                   q3 = Integer.parseInt(s);
                   face[2] += q3;
                   f3 = q3 * price;
                   face_total += f3; 


try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q3>0) {  
r.moveToInsertRow( );
r.updateString(1,"Tumeric Soap");
r.updateString(2," "+q3);
r.updateString(3," "+f3);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }


}

if (source==cb4) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Charchoal Soap","CHARCHOAL",JOptionPane.PLAIN_MESSAGE); 
                   q4 = Integer.parseInt(s);
                   face[3] += q4;
                   f4 = q4 * price;
                   face_total += f4;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q4>0) {  
r.moveToInsertRow( );
r.updateString(1,"Charcoal Soap");
r.updateString(2," "+q4);
r.updateString(3," "+f4);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }


 }

if (source==cb5) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Bamboo-Charchoal","BAMBOO-CHARCHOAL",JOptionPane.PLAIN_MESSAGE); 
                   q5 = Integer.parseInt(s);
                   face[4] += q5;
                   f5 = q5 * price;
                   face_total += f5;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q5>0) {  
r.moveToInsertRow( );
r.updateString(1,"Bamboo-Charcoal Soap");
r.updateString(2," "+q5);
r.updateString(3," "+f5);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }

 }


}

}

/*---------------------------------------------------------------------------------*/


/*----------------------------- Hand-Washing Soap & Gel ---------------------------*/

class Hand extends JFrame implements ActionListener {

JCheckBox cb1 = new JCheckBox( );
JCheckBox cb2 = new JCheckBox( );
JCheckBox cb3 = new JCheckBox( );
JCheckBox cb4 = new JCheckBox( );
JCheckBox cb5 = new JCheckBox( );

JButton vou = new JButton ("0,frnf");

JMenuItem menu = new JMenuItem("aemufodkU");

public static int price = 0;
//public static int quantity = 0;
//public long sub_total = 0;

public static int q1 = 0;
public static int q2 = 0;
public static int q3 = 0;
public static int q4 = 0;
public static int q5 = 0;

public static long h1=0;
public static long h2=0;
public static long h3=0;
public static long h4=0;
public static long h5=0;


public static long hand_total = 0;

int hand[ ] = new int [5];



public Hand( ) { 

super("Hand-Washing Soap & Gel");
//setSize(600,500);
setBounds(350,100,600,500);
setResizable(false);

JPanel pane = new JPanel ( );
pane.setLayout(null);
pane.setBackground(new Color(62,191,179));


Font ef = new Font ("W42Art House",Font.PLAIN,18);

JMenu mm = new JMenu ("a½G;cs,frIrsm;");
mm.setBackground(new Color(62,191,179));
mm.setFont(ef);
menu.setBackground(new Color(62,191,179));
menu.addActionListener(this);
menu.setFont(ef);
mm.add(menu);

JMenuBar ba = new JMenuBar( );
ba.setBackground(new Color(62,191,179));
ba.add(mm);
setJMenuBar(ba);
//pane.add(ba);

Font f = new Font ("W63ArtHouse",Font.PLAIN,30);
JLabel tit = new JLabel ("vufaq;qyfjym trsdL;tpm;rsm;");
tit.setFont(f);
tit.setForeground(Color.RED);
tit.setBounds(150,20,350,50);
pane.add(tit);

JLabel lb = new JLabel ("No.");
JLabel lb1 = new JLabel ("Name ");
JLabel lb2 = new JLabel ("Price ");

lb.setBounds(50,80,50,30);
pane.add(lb);

lb1.setBounds(200,80,50,30);
pane.add(lb1);

lb2.setBounds(450,80,50,30);
pane.add(lb2);

/*
ButtonGroup bb = new ButtonGroup ( );
bb.add(cb1);
bb.add(cb2);
bb.add(cb3);
bb.add(cb4);
bb.add(cb5);
*/

cb1.addActionListener(this);
cb2.addActionListener(this);
cb3.addActionListener(this);
cb4.addActionListener(this);
cb5.addActionListener(this);

cb1.setBounds(10,120,20,30);
cb1.setBackground (new Color(62,191,179));
pane.add(cb1);

JLabel l1 = new JLabel ("1");
JLabel l2 = new JLabel ("Green Gel (Lemon Falvour)");
JLabel l3 = new JLabel ("800 k");

l1.setBounds(50,120,20,30);
l2.setBounds(200,120,200,30);
l3.setBounds(450,120,100,30);
pane.add(l1);
pane.add(l2);
pane.add(l3);

cb2.setBounds(10,170,20,30);
cb2.setBackground (new Color(62,191,179));
pane.add(cb2);

JLabel l4 = new JLabel ("2");
JLabel l5 = new JLabel ("Green Gel (Strawberry Falvour)");
JLabel l6 = new JLabel ("800 k");

l4.setBounds(50,170,20,30);
l5.setBounds(200,170,200,30);
l6.setBounds(450,170,100,30);
pane.add(l4);
pane.add(l5);
pane.add(l6);

cb3.setBounds(10,220,20,30);
cb3.setBackground (new Color(62,191,179));
pane.add(cb3);

JLabel l7 = new JLabel ("3");
JLabel l8 = new JLabel ("Green Gel (Jasmine Falvour)");
JLabel l9 = new JLabel ("800 k");
l7.setBounds(50,220,20,30);
l8.setBounds(200,220,200,30);
l9.setBounds(450,220,100,30);
pane.add(l7);
pane.add(l8);
pane.add(l9);

cb4.setBounds(10,270,20,30);
cb4.setBackground (new Color(62,191,179));
pane.add(cb4);

JLabel l10 = new JLabel ("4");
JLabel l11 = new JLabel ("Orange Gel (Orange Falvour)");
JLabel l12 = new JLabel ("800 k");
l10.setBounds(50,270,20,30);
l11.setBounds(200,270,200,30);
l12.setBounds(450,270,100,30);
pane.add(l10);
pane.add(l11);
pane.add(l12);

cb5.setBounds(10,320,20,30);
cb5.setBackground (new Color(62,191,179));
pane.add(cb5);

JLabel l13 = new JLabel ("5");
JLabel l14 = new JLabel ("Yellow Soap (Orange Falvour)");
JLabel l15 = new JLabel ("850 k");
l13.setBounds(50,320,20,30);
l14.setBounds(200,320,200,30);
l15.setBounds(450,320,100,30);
pane.add(l13);
pane.add(l14);
pane.add(l15);

/*
Font af = new Font ("W61Art House",Font.PLAIN,25);
buy.setFont(af);
buy.setBackground(new Color(62,191,179));
buy.setBounds(230,380,100,40);
buy.addActionListener(this);
pane.add(buy);
*/

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) {

Object source = ae.getSource( ); 

String s;

if (source==menu) { 
                      setVisible(false);
                      Customer cus = new Customer( ); }

if (source==cb1) { price = 800; }

if (source==cb2) { price = 800; }

if (source==cb3) { price = 800; }

if (source==cb4) { price = 800; }

if (source==cb5) { price = 850; }


if (source==cb1) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Green Gel (Lemon Falvour)","Lemon Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q1 = Integer.parseInt(s);
                   hand[0] += q1;
                   h1 = q1 * price;
                   hand_total += h1;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q1>0) {  
r.moveToInsertRow( );
r.updateString(1,"Green Gel (Lemon Flavour)");
r.updateString(2," "+q1);
r.updateString(3," "+h1);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }


                    }

if (source==cb2) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Green Gel (Strawberry Falvour)","Strawberry Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q2 = Integer.parseInt(s);
                   hand[1] += q2;
                   h2 = q2 * price;
                   hand_total += h2;



try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q2>0) {  
r.moveToInsertRow( );
r.updateString(1,"Green Gel (Strawberry Flavour)");
r.updateString(2," "+q2);
r.updateString(3," "+h2);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }





 }

if (source==cb3) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Green Gel (Jasmine Falvour)","Jasmine Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q3 = Integer.parseInt(s);
                   hand[2] += q3;
                   h3 = q3 * price;
                   hand_total += h3;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q3>0) {  
r.moveToInsertRow( );
r.updateString(1,"Green Gel(Jasmine Flavour)");
r.updateString(2," "+q3);
r.updateString(3," "+h3);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }


 }

if (source==cb4) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Orange Gel (Orange Falvour)","Orange Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q4 = Integer.parseInt(s);
                   hand[3] += q4;
                   h4 = q4 * price;
                   hand_total += h4;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q4>0) {  
r.moveToInsertRow( );
r.updateString(1,"Orange Gel(Orange Flavour)");
r.updateString(2," "+q4);
r.updateString(3," "+h4);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }



 }

if (source==cb5) { s = JOptionPane.showInputDialog(null,"How Many Do You Want For Yellow Soap (Orange Falvour)","Orange Falvour",JOptionPane.PLAIN_MESSAGE); 
                   q5 = Integer.parseInt(s);
                   hand[4] += q5;
                   h5 = q5 * price;
                   hand_total += h5;

try { 

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

}catch (java.lang.ClassNotFoundException e) { }

try { 

Connection obj = DriverManager.getConnection("jdbc:odbc:Database1");

Statement st = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

ResultSet r = st.executeQuery("SELECT * FROM Voucher");

if(q5>0) {  
r.moveToInsertRow( );
r.updateString(1,"Yellow Soap (OrangeFlavour)");
r.updateString(2," "+q5);
r.updateString(3," "+h5);
r.insertRow( );
} 

r.close( );
st.close( );
obj.close( );

}catch (SQLException se) { }

 }


}

}

/*---------------------------------------------------------------------------------*/

class Customer extends JFrame implements ActionListener {

JRadioButton r1 = new JRadioButton ("vufaq;qyfjymrsm;");
JRadioButton r2 = new JRadioButton ("rsufESmopfqyfjymrsm;");
JRadioButton r3 = new JRadioButton ("yef;uefaq;qyfjymrsm;");
JRadioButton r4 = new JRadioButton ("acgif;avQmf&nfrsm;");
JRadioButton r5 = new JRadioButton ("abmufcsmMunfh&ef");

public Customer ( ) {
 
super("Customer");
//setSize(600,300);
setBounds(350,100,600,300);
setResizable(false);

JPanel pane = new JPanel ( );
pane.setLayout(null);
pane.setBackground(new Color(120,220,109));

Font f = new Font ("W43Art House",Font.PLAIN,50);

JLabel tit1 = new JLabel ("xdyfxm;");
tit1.setBounds(250,30,200,50);
tit1.setForeground(Color.RED);
tit1.setBackground(new Color(60,204,157));
tit1.setFont(f);
pane.add(tit1);

Font af = new Font ("W61Art House",Font.PLAIN,20);

ButtonGroup bb = new ButtonGroup ( );

bb.add(r1);
bb.add(r2);
bb.add(r3);
bb.add(r4);

r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
r4.addActionListener(this);
r5.addActionListener(this);

r1.setFont(af);
r1.setBounds(130,100,150,40);
r1.setForeground(new Color(49,40,213));
r1.setBackground(new Color(120,220,109));
pane.add(r1);

r2.setFont(af);
r2.setBounds(330,100,250,40);
r2.setForeground(new Color(49,40,213));
r2.setBackground(new Color(120,220,109));
pane.add(r2);

r3.setFont(af);
r3.setBounds(130,160,200,40);
r3.setForeground(new Color(49,40,213));
r3.setBackground(new Color(120,220,109));
pane.add(r3);

r4.setFont(af);
r4.setBounds(330,160,250,40);
r4.setForeground(new Color(49,40,213));
r4.setBackground(new Color(120,220,109));
pane.add(r4);

r5.setFont(af);
r5.setBounds(130,210,250,40);
r5.setForeground(new Color(49,40,213));
r5.setBackground(new Color(120,220,109));
pane.add(r5);

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

if (source==r1) {  setVisible(false);
                   Hand h = new Hand( ); }

if (source==r2) { setVisible(false);
                  Face f = new Face( ); }

if (source==r3) { setVisible(false);
                  Dish d = new Dish( ); }

if (source==r4) { setVisible(false);
                  Shampoo sh = new Shampoo( ); }

if (source==r5) { setVisible(false);
                  Voucher v = new Voucher( ); }

}

}

class Exit extends JFrame implements ActionListener { 

JButton ext = new JButton("OK");

public Exit( ) { 

super("Thank You");

setBounds(350,100,600,200);
setResizable(false);

JPanel pane = new JPanel( );
pane.setBackground(new Color(225,225,128));
//GridLayout gl = new GridLayout(2,1,10,10);

pane.setLayout(null);

Font f = new Font("W42Art House",Font.PLAIN,30);

JLabel lb = new JLabel("þaqmhzf0Jvftm;toHk;jyKrItwGuftxl;aus;Zl;wif&Sdygonf/",SwingConstants.CENTER);
lb.setBounds(20,20,550,40);
lb.setFont(f);
pane.add(lb);

Font ff = new Font("Berlin Sans FB",Font.PLAIN,20);

ext.setFont(ff);
ext.setBackground(new Color(225,225,128));
ext.addActionListener(this);
ext.setBounds(220,90,150,30);
pane.add(ext);

setContentPane(pane);
setVisible(true);
}

public void actionPerformed (ActionEvent ae) { 

Object source = ae.getSource( );

if (source==ext) { System.exit(0); }

}

}

class TT { 

public void setLookAndFeel( ) { 

try { 

UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName( ));

}catch (Exception e) { }

}

}

public class Home_Project extends JFrame implements ActionListener {

JTextField us = new JTextField ( );
JPasswordField pa = new JPasswordField ( );

JButton log = new JButton ("Log in");

JMenuItem menu = new JMenuItem ("xGufrnf/");

public Home_Project ( ) { 

super("Home Project");
//setSize(700,500);
setBounds(350,100,700,500);
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel pane = new JPanel ( );
pane.setBackground(new Color(60,204,157));
pane.setLayout(null);

Font ef = new Font ("W42Art House",Font.PLAIN,18);

JMenu mm = new JMenu ("a½G;cs,frIrsm;");
mm.setBackground(new Color(60,204,157));
mm.setFont(ef);
menu.setBackground(new Color(60,204,157));
menu.addActionListener(this);
menu.setFont(ef);
mm.add(menu);

JMenuBar ba = new JMenuBar( );
ba.setBackground(new Color(60,204,157));
ba.add(mm);
setJMenuBar(ba);


Font f = new Font ("W43Art House",Font.PLAIN,50);
JLabel tit1 = new JLabel ("xdyfxm;",SwingConstants.CENTER);
tit1.setBounds(250,30,200,50);
tit1.setForeground(Color.RED);
tit1.setBackground(new Color(60,204,157));
tit1.setFont(f);
pane.add(tit1);

Font af = new Font("W31Art House",Font.PLAIN,30);

JLabel tit2 = new JLabel("rsufESmopfqyfjym ESifh acgif;avQmf&nfa&mif;0,fa&;");
tit2.setBounds(160,80,450,50);
tit2.setForeground(Color.RED);
tit2.setBackground(new Color(60,204,157));
tit2.setFont(af);
pane.add(tit2);

Font bf = new Font ("Berlin Sans FB",Font.PLAIN,20);
JLabel u = new JLabel ("Username : ");
u.setFont(bf);
u.setBounds(160,160,120,30);
u.setForeground (Color.RED);
u.setBackground(new Color(60,204,157));
pane.add(u);

us.setBounds(300,160,150,30);
pane.add(us);

pa.setBounds(300,230,150,30);
pane.add(pa);

JLabel p = new JLabel ("Password : ");
p.setFont(bf);
p.setBounds(160,230,120,30);
p.setForeground (Color.RED);
p.setBackground(new Color(60,204,157));
pane.add(p);

JLabel use = new JLabel ("Customer Default Username : Customer");
use.setBounds(460,160,300,30);
pane.add(use);

JLabel pa = new JLabel ("Customer Default Password : 12345");
pa.setBounds(460,230,300,30);
pane.add(pa);

Font cf = new Font ("Bodoni MT",Font.PLAIN,20);

log.setBounds(300,300,150,40);
log.setFont(cf);
log.setForeground (Color.RED);
log.setBackground(new Color(60,204,157));
log.addActionListener(this);
pane.add(log);

Font def = new Font("Century Gothic",Font.PLAIN,14); //Bookman Old Style,Century Gothic,Fade to grey

JLabel dev = new JLabel ("Developer : AungKyawPhyo");
dev.setFont(def);
dev.setBounds(20,400,200,30);
pane.add(dev);

setContentPane(pane);
setVisible(true);

}

public void actionPerformed(ActionEvent ae) { 

Object source = ae.getSource( );

//String user,pp;

String user = us.getText( );
String pp = new String (pa.getPassword( ));

if (source==menu) { 
setVisible(false);
Exit e = new Exit( );

 }

if (source==log) {   setVisible(false);

                     if (user.equals("Customer") && pp.equals("12345") ) { Customer cs = new Customer( ); }
                     
                    else if (user.equals("Manager") && pp.equals("1142001")) { Manager mm = new Manager( ); }


                     else { setVisible(true);
                            JOptionPane.showMessageDialog(null,"You've Entered Wrong Username or Password","Please Try Again!",JOptionPane.ERROR_MESSAGE);
                            us.setText(null);
                            pa.setText(null); } 

                 }


}

public static void main (String args[ ]) { 

//TT obj = new TT( );
//obj.setLookAndFeel( );

Home_Project hp = new Home_Project( );

}

}