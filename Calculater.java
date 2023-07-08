import java.awt.*;
import java.awt.event.*;

class Calculater
{
    public static void main(String Agr[])
    {
        MarvellousCalculater mobj = new MarvellousCalculater(400,400,"Marvellous");
    }
}

class MarvellousCalculater extends WindowAdapter //implements ActionListener
{
    public Frame fobj;
    public Button b1,b2,b3,b4;
    public TextField t1,t2;
    public Label lobj;

    public MarvellousCalculater(int width, int height, String title)
    {
        fobj = new Frame(title);
        fobj.setSize(width,height);
        fobj.setVisible(true);

        fobj.addWindowListener(this);

        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MULT");
        b4 = new Button("DIV");

        t1 = new TextField();
        t2 = new TextField();
        
        b1.setBounds(10,280,80,40); //X,Y,W,H   //  vati la kuthe set karaychi tysathi (set bound )
        b2.setBounds(100,280,80,40); //X,Y,W,H  //  vati la kuthe set karaychi tysathi (set bound )
        b3.setBounds(190,280,80,40); //X,Y,W,H  //  vati la kuthe set karaychi tysathi (set bound )
        b4.setBounds(290,280,80,40); //X,Y,W,H  //  vati la kuthe set karaychi tysathi (set bound )

        t1.setBounds(70,100,100,40); //X,Y,W,H    //  vati la kuthe set karaychi tysathi (set bound )
        t2.setBounds(220,100,100,40); //X,Y,W,H  //  vati la kuthe set karaychi tysathi (set bound )
        
        fobj.add(b1);    // vati add 
        fobj.add(b2);   // vati add 
        fobj.add(b3);   // vati add 
        fobj.add(b4);   // vati add 

        fobj.add(t1);
        fobj.add(t2);

        lobj = new Label();
        lobj.setBounds(150,25,200,100); //X,Y,W,H
        fobj.add(lobj);

        fobj.setLayout(null);
        fobj.setVisible(true);
    }
    
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}

