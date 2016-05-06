package com.gluonapplication;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class GluonApplication extends Application {
    double val1,val2;
    boolean addState,subState,divState,mulState,sqrState,precState,exState;
    boolean finish = false;
    BorderPane pane1=new BorderPane();
    public static GridPane pane=new GridPane();
    int pnum;
        @Override
        public void start(Stage primaryStage)
           {    
            pnum=0;
            Buttons_Builder buttons = new Buttons_Builder();
            pane.setPadding(new Insets(10,10, 10, 10));
            pane.setHgap(10);
            pane.setVgap(10);
            pane.setStyle("-fx-background-color:rgb(230,230,230)");
            
            TextField tf=buttons.txtfield();
            tf.prefWidthProperty().bind(pane1.widthProperty().divide(4));
            Button bt0=buttons.zero();
            Button bt1=buttons.one();
            Button bt2=buttons.two();
            Button bt3=buttons.three();
            Button bt4=buttons.four();
            Button bt5=buttons.five();
            Button bt6=buttons.six();
            Button bt7=buttons.seven();
            Button bt8=buttons.eight();
            Button bt9=buttons.nine();
            Button add=buttons.add();
            Button sub=buttons.sub();
            Button mult=buttons.mul();
            Button div=buttons.div();
            Button equ=buttons.equal();
            Button par1=buttons.leftPar();
            Button par2=buttons.rightPar();
            Button dot=buttons.dot();
            Button mod=buttons.mod();
            Button sq=buttons.square();
            Button sqrt=buttons.sqRoot();
            Button del=buttons.delete();
            Button cl=buttons.clear();
            Button sin=buttons.sin();
            Button cos=buttons.cos();
            Button tan=buttons.tan();

            pane.add(cl, 0, 0);
            pane.add(del, 1, 0);
            pane.add(par1, 2, 0);
            pane.add(par2, 3, 0);

            pane.add(mod, 0, 1);
            pane.add(sqrt, 1, 1);
            pane.add(sq, 2, 1);
            pane.add(div, 3, 1);

            pane.add(sin,0,2);
            pane.add(cos,1, 2);
            pane.add(tan,2,2);
            pane.add(mult,3, 2);

            pane.add(bt7, 0, 3);
            pane.add(bt8,1, 3);
            pane.add(bt9,2, 3);
            pane.add(sub, 3, 3);

            pane.add(bt4, 0, 4);
            pane.add(bt5, 1, 4);
            pane.add(bt6, 2, 4);
            pane.add(add, 3,4);

            pane.add(bt1,0,5);
            pane.add(bt2,1,5);
            pane.add(bt3, 2,5);

            pane.add(bt0,0,6);
            pane.add(dot,1, 6);
            pane.add(equ,2,6);
     
            Buttons_Events event = new Buttons_Events();
            bt0.setOnAction(e->{
                try{
                    if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                event.zeroEvent(e,tf);
                }
                catch(Exception ex)
                {               
                }
        });
            bt1.setOnAction(e->{
                try{
                    if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                    event.oneEvent(e, tf);
                }
                catch(Exception ex)
                {}
        });

        bt2.setOnAction(e->{
               try{
                   if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                   event.twoEvent(e, tf);
               }
               catch(Exception ex)
               {}
        });

        bt3.setOnAction(e->{
              try{
                  if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                  event.threeEvent(e, tf);
              }
              catch(Exception ex)
              {}
        });

        bt4.setOnAction(e->{
               try{
                   if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                   event.fourEvent(e, tf);
               }
               catch(Exception ex)
               {}
        });

        bt5.setOnAction(e->{
                try{
                    if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                    event.fiveEvent(e, tf);
                }
                catch(Exception ex)
                {}
        });

        bt6.setOnAction(e->{
                try{
                    if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                    event.sixEvent(e, tf);
                }
                catch(Exception ex)
                {}
        });

        bt7.setOnAction(e->{
                try{
                    if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                    event.sevenEvent(e, tf);
                }
                catch(Exception ex)
                {}
        });

        bt8.setOnAction(e->{
                try{
                    if(finish)
                         {
                        tf.clear();
                        finish=false;
                         }
                    event.eightEvent(e, tf);
                }
                catch(Exception ex)
                {}
        });

        bt9.setOnAction(e->{
                try{
                    if(finish)
                     {
                    tf.clear();
                    finish=false;
                     }
                    event.nineEvent(e, tf);
                }
                catch(Exception ex)
                {}
        });
        
        add.setOnAction(e->{
            try{
                
                finish=false;
                event.addEvent(e, tf);
                addState=true;
            }
            catch(Exception ex)
            {}
        });
        sub.setOnAction(e->{
            
            finish=false;
            event.subEvent(e, tf);
            subState=true;
            
    });

    mult.setOnAction(e->{
        
        finish=false;
            event.mulEvent(e, tf);
            mulState=true;
            
    });

    div.setOnAction(e->{
        
        finish=false;
           event.divEvent(e, tf);
            divState=true;
           
    });

    par1.setOnAction(e->{
        pnum++;
        try{
            
            finish=false;
            event.left(e, tf);
        }
        catch(Exception ex)
        {}
    });

    par2.setOnAction(e->{
        pnum--;
        try{
            
            finish=false;
            if(pnum>=0)
            event.right(e, tf);
            else
                pnum=0;
        }
        catch(Exception ex)
        {}    
    });

    dot.setOnAction(e->{
        try{
            if(finish)
             {
            tf.clear();
            finish=false;
             }
            event.dotEvent(e, tf);
            finish=false;
        }
        catch(Exception ex)
        {}      
    });

    mod.setOnAction(e->{  //i do not know how this sign operate 
        if(finish)
         {
        tf.clear();
        finish=false;
         }
            /* tf.setText(tf.getText()+"%");         
             precState=true;
             if(precState==true)
                {
                    tf.setText((val1/100.0)+"");
                    finish=true;
                }*/
    });
    cl.setOnAction(e->{
        tf.clear();
    });
    del.setOnAction(e->{
        try{
            if(tf.getText().endsWith("("))pnum--;
            else if (tf.getText().endsWith(")"))pnum++;
            if(tf.getText().length()==1)
            {
                tf.clear();
            }
            else
            {
                String temp = tf.getText().substring(0,tf.getText().length()-1);
                tf.clear();
                tf.setText(temp);
            }
        }
        catch(Exception ex)
        {}
    });
    sq.setOnAction(e->{
       try{
        val1=Double.parseDouble(tf.getText()+"");   
            tf.setText(Math.pow(val1, 2)+"");
            finish=true;
       }
       catch(Exception ex)
       {}
    });
    sqrt.setOnAction(e->{
        try{
        Double val=Double.parseDouble(tf.getText()+"");       
            tf.setText(Math.sqrt(val)+"");
            finish=true;
        }
        catch(Exception ex)
        {}
        
    });
    equ.setId("equ");
    equ.setOnAction(e->{
        try{
        double res = EvaluateExpression.evaluateExpression(tf.getText());
        tf.clear();
        tf.setText(res+"");
        finish=true;
        }
        catch(Exception ex)
        {
            System.out.println("wrong exp");
        }
    });
    sin.setOnAction(e->{
        try{
        Double val=Double.parseDouble(tf.getText());       
            tf.setText(Math.sin(val)+"");
            finish=true;
        }
        catch(Exception ex)
        {}
    });
    cos.setOnAction(e->{
        try{
        Double val=Double.parseDouble(tf.getText());       
            tf.setText(Math.cos(val)+"");
            finish=true;
        }
        catch(Exception ex)
        {}
    });
    tan.setOnAction(e->{
        try{
        Double val=Double.parseDouble(tf.getText());       
            tf.setText(Math.tan(val)+"");
            finish=true;
        }
        catch(Exception ex)
        {}
    });
            pane1.setTop(tf);
            pane1.setCenter(pane);
            Scene scene = new Scene(pane1);

            scene.addEventHandler(KeyEvent.KEY_RELEASED, e -> {
                if (KeyCode.ESCAPE.equals(e.getCode())) 
                    Platform.exit();
                else if (KeyCode.ADD.equals(e.getCode())) 
                    add.fire();
                else if (KeyCode.SUBTRACT.equals(e.getCode())) 
                    sub.fire();
                else if (KeyCode.MULTIPLY.equals(e.getCode())) 
                    mult.fire();
                else if (KeyCode.DIVIDE.equals(e.getCode())) 
                    div.fire();
                else if (KeyCode.EQUALS.equals(e.getCode())) 
                    equ.fire();
                else if (KeyCode.ENTER.equals(e.getCode()))
                    equ.fire();
                else if (e.getText().contains("0")) 
                    bt0.fire();
                else if (e.getText().contains("1")) 
                    bt1.fire();
                else if (e.getText().contains("2")) 
                    bt2.fire();
                else if (e.getText().contains("3")) 
                    bt3.fire();
                else if (e.getText().contains("4")) 
                    bt4.fire();
                else if (e.getText().contains("5")) 
                    bt5.fire();
                else if (e.getText().contains("6")) 
                    bt6.fire();
                else if (e.getText().contains("7")) 
                    bt7.fire();
                else if (e.getText().contains("8")) 
                    bt8.fire();
                else if (e.getText().contains("9")) 
                    bt9.fire();
                });

            scene.getStylesheets().add("application.css");
            primaryStage.setTitle("Calculator");
            
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public static void main(String[] args)
        {
            launch(args);
        }
    }
