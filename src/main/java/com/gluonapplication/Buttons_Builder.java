package com.gluonapplication;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class Buttons_Builder  {
	
	public TextField txtfield()
	{
		TextField tf=new TextField();
		
		//tf.setStyle("-fx-background-color:rgb(242,242,242); -fx-text-fill: black");
		tf.setFont(Font.font(50));
		tf.setEditable(false);
		return tf;
	}
	public void adjustButton(Button bt){
        bt.prefWidthProperty().bind(GluonApplication.pane.widthProperty().divide(4));
        bt.prefHeightProperty().bind(GluonApplication.pane.heightProperty().divide(4));
        bt.setFont(Font.font(15));
	}
	public Button zero ()
	{
		Button bt0=new Button("0");
		adjustButton(bt0);
		return bt0;
	}
	
	public Button one()
	{
		Button bt1=new Button("1");
        adjustButton(bt1);
		return bt1;
	}
	
	public Button two()
	{
		Button bt2=new Button("2");
        adjustButton(bt2);
		return bt2;
	}
	
	public Button three()
	{
		Button bt3=new Button("3");
        adjustButton(bt3);
		return bt3;
	}
	
	public Button four()
	{
		Button bt4=new Button("4");
        adjustButton(bt4);
		return bt4;
	}
	
	public Button five()
	{
		Button bt5=new Button("5");
        adjustButton(bt5);
		return bt5;
	}
	
	public Button six()
	{
		Button bt6=new Button("6");
        adjustButton(bt6);
		return bt6;
	}
	
	public Button seven()
	{
		Button bt7=new Button("7");
        adjustButton(bt7);
		return bt7;
	}
	
	public Button eight()
	{
		Button bt8=new Button("8");
        adjustButton(bt8);
		return bt8;
	}
	
	public Button nine()
	{
		Button bt9=new Button("9");
        adjustButton(bt9);
		return bt9;
	}
	
   public Button add()
   {
	   Button add=new Button("+");
       adjustButton(add);
		return add;
   }
   
   public Button sub()
   {
	   Button sub=new Button("-");
       adjustButton(sub);
		return sub;
   }
   
   public Button mul()
   {
	   Button mult=new Button("*");
       adjustButton(mult);
		return mult;
   }
   
   public Button div()
   {
	   Button div=new Button("/");
       adjustButton(div);
		return div;
   }
   
   public Button equal()
   {
	   Button equ=new Button("=");
       adjustButton(equ);
		return equ;
   }
   
   public Button leftPar()
   {
	   Button par=new Button("(");
       adjustButton(par);
		return par;
   }
   
   public Button rightPar()
   {
	    Button par2=new Button(")");
        adjustButton(par2);
		return par2;
   }
   
   public Button dot()
   {
	   Button dot=new Button(".");
       adjustButton(dot);
		return dot;
   }
   
   public Button mod()
   {
	   Button mod=new Button("%");
       adjustButton(mod);
		return mod;
   }

   public Button square()
   {
	   Button sq=new Button("^2");
       adjustButton(sq);
		return sq;
   }
   
   public Button sqRoot()
   {
	   Button sqrt=new Button("√");
       adjustButton(sqrt);
		return sqrt;
   }
   
   
   
   
   public Button delete()
   {
	   Button del=new Button("X");
       adjustButton(del);
		return del;
   }
   
   public Button clear()
   {
	   Button cl=new Button("c");
       adjustButton(cl);
        return cl;
   }

    public Button sin() {
       Button sin=new Button("sin");        
       adjustButton(sin);
        return sin;
    }
    
    public Button cos() {
        Button cos=new Button("cos");        
        adjustButton(cos);
        return cos;
    }
    
    public Button tan() {
        Button tan=new Button("tan");        
        adjustButton(tan);
        return tan;
    }
   
}
