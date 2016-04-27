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
	
	public Button zero ()
	{
		Button bt0=new Button("0");
		
		bt0.setFont(Font.font(15));
		//bt0.setStyle("-fx-background-color: rgb(184,184,184)");	
		return bt0;
	}
	
	public Button one()
	{
		Button bt1=new Button("1");
		
		bt1.setFont(Font.font(15));
		//bt1.setStyle("-fx-background-color: rgb(184,184,184)");
		return bt1;
	}
	
	public Button two()
	{
		Button bt2=new Button("2");
		
		bt2.setFont(Font.font(15));
		//bt2.setStyle("-fx-background-color:rgb(184,184,184)");
		return bt2;
	}
	
	public Button three()
	{
		Button bt3=new Button("3");
		
		bt3.setFont(Font.font(15));
		//bt3.setStyle("-fx-background-color: rgb(184,184,184)");
		return bt3;
	}
	
	public Button four()
	{
		Button bt4=new Button("4");
		
		bt4.setFont(Font.font(15));
		//bt4.setStyle("-fx-background-color: rgb(184,184,184)");
		return bt4;
	}
	
	public Button five()
	{
		Button bt5=new Button("5");
		
		bt5.setFont(Font.font(15));
		//bt5.setStyle("-fx-background-color: rgb(184,184,184)");
		return bt5;
	}
	
	public Button six()
	{
		Button bt6=new Button("6");
		
		bt6.setFont(Font.font(15));
		//bt6.setStyle("-fx-background-color: rgb(184,184,184)");
		return bt6;
	}
	
	public Button seven()
	{
		Button bt7=new Button("7");
		
		bt7.setFont(Font.font(15));
		//bt7.setStyle("-fx-background-color: rgb(184,184,184)");
		return bt7;
	}
	
	public Button eight()
	{
		Button bt8=new Button("8");
		
		bt8.setFont(Font.font(15));
		//bt8.setStyle("-fx-background-color: rgb(184,184,184)");
		return bt8;
	}
	
	public Button nine()
	{
		Button bt9=new Button("9");
		
		bt9.setFont(Font.font(15));
		//bt9.setStyle("-fx-background-color: rgb(184,184,184)");
		return bt9;
	}
	
   public Button add()
   {
	   Button add=new Button("+");
		
		add.setFont(Font.font(15));
		//add.setStyle("-fx-background-color: rgb(184,184,184)");
		return add;
   }
   
   public Button sub()
   {
	   Button sub=new Button("-");
		
		sub.setFont(Font.font(15));
		//sub.setStyle("-fx-background-color: rgb(184,184,184)");
		return sub;
   }
   
   public Button mul()
   {
	   Button mult=new Button("*");
		
		mult.setFont(Font.font(15));
		//mult.setStyle("-fx-background-color: rgb(184,184,184)");
		return mult;
   }
   
   public Button div()
   {
	   Button div=new Button("/");
		
		div.setFont(Font.font(15));
		//div.setStyle("-fx-background-color: rgb(184,184,184)");
		return div;
   }
   
   public Button equal()
   {
	   Button equ=new Button("=");
		
		equ.setFont(Font.font(15));
		//equ.setStyle("-fx-background-color: rgb(184,184,184)");
		return equ;
   }
   
   public Button leftPar()
   {
	   Button par=new Button("(");
		
		par.setFont(Font.font(15));
		//par.setStyle("-fx-background-color:rgb(184,184,184)");
		return par;
   }
   
   public Button rightPar()
   {
	    Button par2=new Button(")");
		
		par2.setFont(Font.font(15));
		//par2.setStyle("-fx-background-color: rgb(184,184,184)");
		return par2;
   }
   
   public Button dot()
   {
	   Button dot=new Button(".");
		
		dot.setFont(Font.font(15));
		//dot.setStyle("-fx-background-color: rgb(184,184,184)");
		return dot;
   }
   
   public Button mod()
   {
	   Button mod=new Button("%");
		
		mod.setFont(Font.font(15));
		//mod.setStyle("-fx-background-color: rgb(184,184,184)");
		return mod;
   }

   public Button square()
   {
	   Button sq=new Button("^2");
		
		sq.setFont(Font.font(15));
		//sq.setStyle("-fx-background-color: rgb(184,184,184)");
		return sq;
   }
   
   public Button sqRoot()
   {
	   Button sqrt=new Button("√");
		
		sqrt.setFont(Font.font(15));
		//sqrt.setStyle("-fx-background-color: rgb(184,184,184)");
		return sqrt;
   }
   
   
   
   
   public Button delete()
   {
	   Button del=new Button("X");
		
		del.setFont(Font.font(15));
		//del.setStyle("-fx-background-color: rgb(184,184,184)");
		return del;
   }
   
   public Button clear()
   {
	   Button cl=new Button("c");
		
		cl.setFont(Font.font(15));
		//cl.setStyle("-fx-background-color: rgb(184,184,184)");
        return cl;
   }
   
}
