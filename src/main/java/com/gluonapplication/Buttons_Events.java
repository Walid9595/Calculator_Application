package com.gluonapplication;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Buttons_Events extends Buttons_Builder{
	public void zeroEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"0");
	}
	public void oneEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"1");
	}
	public void twoEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"2");
	}
	public void threeEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"3");
	}
	public void fourEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"4");
	}
	public void fiveEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"5");
	}
	public void sixEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"6");
	}
	public void sevenEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"7");
	}
	public void eightEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"8");
	}
	public void nineEvent(ActionEvent e , TextField tf)
	{
		if(tf.getText().length()<16)			
		tf.setText(tf.getText()+"9");
	}
	public void addEvent(ActionEvent e , TextField tf)
	{
		
		if(!tf.getText().isEmpty())
		{	
			String temp = tf.getText();
		if(temp.endsWith("-")||temp.endsWith("*")||temp.endsWith("/"))
			temp = temp.substring(0,temp.length()-1);
		tf.setText(temp+"+");
		}
	}
	public void subEvent(ActionEvent e , TextField tf)
	{
		if(!tf.getText().isEmpty())
		{	
			String temp = tf.getText();
		if(temp.endsWith("+")||temp.endsWith("*")||temp.endsWith("/"))
			temp = temp.substring(0,temp.length()-1);
		tf.setText(temp+"-");
		}
	}
	public void mulEvent(ActionEvent e , TextField tf)
	{
		if(!tf.getText().isEmpty())
		{	
			String temp = tf.getText();
		if(temp.endsWith("-")||temp.endsWith("+")||temp.endsWith("/"))
			temp = temp.substring(0,temp.length()-1);
		tf.setText(temp+"*");
		}
	}
	public void divEvent(ActionEvent e , TextField tf)
	{
		if(!tf.getText().isEmpty())
		{	
			String temp = tf.getText();			
			
		if((temp.endsWith("-")||temp.endsWith("*")||temp.endsWith("+")))
			temp = temp.substring(0,temp.length()-1);
		tf.setText(temp+"/");
		}
	}
	public void left(ActionEvent e , TextField tf)
	{
		tf.setText(tf.getText()+"(");
	}
	public void right(ActionEvent e , TextField tf)
	{
		tf.setText(tf.getText()+")");
	}
	public void dotEvent(ActionEvent e , TextField tf)
	{
		 tf.setText(tf.getText()+".");
	}
	

}
