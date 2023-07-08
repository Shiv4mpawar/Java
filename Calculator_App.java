
////////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
///////////////////////////////////////////////////////////////////////////////////
//
//  Funtion name : 
//  Class   name :  Calculator_App,Appcalculator
//  Input        :  Integer
//  Output       :  
//  Description  :  Calculator Application 
//  Author       :  Shivam yogeshsing pawar 
//  Date         :  20/04/2023 + 23/04/2023 + 28/04/2023
///////////////////////////////////////////////////////////////////////////////////
class Calculator_App
{
    public static void main(String Agr[])
    {                                          // W   H  String
        AppCalculator apobj = new AppCalculator(350,500,"Calculator");
    }
}  

class AppCalculator extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    public TextField t1,t2;
    public Label lobj;
    public Integer No1,No2;

    public AppCalculator(int width, int height, String title)
    {
        fobj = new Frame(title);
        fobj.setBackground(Color.BLACK);
        fobj.setSize(width,height);

        fobj.addWindowListener(this);

        b1 = new Button("AC");

        b2 = new Button("+/-");

        b3 = new Button("%");
        b4 = new Button("/");
        b4.setBackground(Color.YELLOW.ORANGE);
        
        b5 = new Button("7");
        b6 = new Button("8");
        b7 = new Button("9");

        b8 = new Button("X");
        b8.setBackground(Color.YELLOW.ORANGE);

        b9 = new Button("4");
        b10 = new Button("5");
        b11 = new Button("6");

        b12 = new Button("-");
        b12.setBackground(Color.YELLOW.ORANGE);

        b13 = new Button("1");
        b14 = new Button("2");
        b15 = new Button("3");

        b16 = new Button("+");
        b16.setBackground(Color.YELLOW.ORANGE);

        b17 = new Button("0");

        b18 = new Button(".");

        b19 = new Button("=");
        b19.setBackground(Color.YELLOW.ORANGE);

        t1 = new TextField();
        t2 = new TextField();


        b1.setBounds(10,200,50,40);  //X,Y,W,H
        b2.setBounds(80,200,50,40);  //X,Y,W,H
        b3.setBounds(150,200,50,40);  //X,Y,W,H
        b4.setBounds(220,200,50,40);  //X,Y,W,H
        b5.setBounds(10,250,50,40);  //X,Y,W,H
        b6.setBounds(80,250,50,40);  //X,Y,W,H
        b7.setBounds(150,250,50,40);  //X,Y,W,H
        b8.setBounds(220,250,50,40);  //X,Y,W,H
        b9.setBounds(10,300,50,40);  //X,Y,W,H
        b10.setBounds(80,300,50,40);  //X,Y,W,H
        b11.setBounds(150,300,50,40);  //X,Y,W,H
        b12.setBounds(220,300,50,40);  //X,Y,W,H
        b13.setBounds(10,350,50,40);  //X,Y,W,H
        b14.setBounds(80,350,50,40);  //X,Y,W,H
        b15.setBounds(150,350,50,40);  //X,Y,W,H
        b16.setBounds(220,350,50,40);  //X,Y,W,H
        b17.setBounds(10,400,100,40);  //X,Y,W,H
        b18.setBounds(150,400,50,40);  //X,Y,W,H
        b19.setBounds(220,400,50,40);  //X,Y,W,H 

        t1.setBounds(100,50,60,40); //X,Y,W,H
        t2.setBounds(170,50,60,40); //X,Y,W,H 

        fobj.add(b1);
        fobj.add(b2);
        fobj.add(b3);
        fobj.add(b4);
        fobj.add(b5);
        fobj.add(b6);
        fobj.add(b7);
        fobj.add(b8);
        fobj.add(b9);
        fobj.add(b10);
        fobj.add(b11);
        fobj.add(b12);
        fobj.add(b13);
        fobj.add(b14);
        fobj.add(b15);
        fobj.add(b16);
        fobj.add(b17);
        fobj.add(b18);
        fobj.add(b19);

        fobj.add(t1);
        fobj.add(t2);

        lobj = new Label();
        lobj.setBounds(80,100,170,90);//X,Y,W,H
        lobj.setBackground(Color.WHITE);
        fobj.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);

        fobj.setLayout(null);
        fobj.setVisible(true);
    }

    public void windowClosing(WindowEvent obj)   //Event handler for frame
    {
        System.exit(0);
    }   
    public void actionPerformed(ActionEvent aobj)   // Event handler for Buttons
    {
        try
        {
            No1 = Integer.parseInt(t1.getText());
            No2 = Integer.parseInt(t2.getText());


            if(aobj.getSource() == b4)  //Division
            {
                lobj.setText("Division is : "+(No1/No2));
            }
            else if(aobj.getSource() == b8)  // Multiplication
            {
                lobj.setText("Multiplecation is :"+(No1*No2));
            }
            if(aobj.getSource() == b12)  // Subtraction
            {
                lobj.setText("Subtraction is :"+(No1-No2));
            }
            if(aobj.getSource() == b16)  // Addition
            {
                lobj.setText("Addition is :"+(No1+No2));
            }
        }

        catch(Exception eobj)
        {
            
        }
    }
    
}
