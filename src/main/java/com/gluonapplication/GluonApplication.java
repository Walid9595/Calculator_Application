package com.gluonapplication;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class GluonApplication extends Application {
    double val1,val2;
    boolean addState,subState,divState,mulState,sqrState,precState,exState;
    boolean finish = false;
    BorderPane pane1=new BorderPane();
    GridPane pane=new GridPane();
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
            bt0.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt0.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt1=buttons.one();
            bt1.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt1.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt2=buttons.two();
            bt2.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt2.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt3=buttons.three();
            bt3.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt3.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt4=buttons.four();
            bt4.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt4.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt5=buttons.five();
            bt5.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt5.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt6=buttons.six();
            bt6.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt6.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt7=buttons.seven();
            bt7.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt7.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt8=buttons.eight();
            bt8.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt8.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button bt9=buttons.nine();
            bt9.prefWidthProperty().bind(pane.widthProperty().divide(4));
            bt9.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button add=buttons.add();
            add.prefWidthProperty().bind(pane.widthProperty().divide(4));
            add.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button sub=buttons.sub();
            sub.prefWidthProperty().bind(pane.widthProperty().divide(4));
            sub.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button mult=buttons.mul();
            mult.prefWidthProperty().bind(pane.widthProperty().divide(4));
            mult.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button div=buttons.div();
            div.prefWidthProperty().bind(pane.widthProperty().divide(4));
            div.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button equ=buttons.equal();
            equ.prefWidthProperty().bind(pane.widthProperty().divide(4));
            equ.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button par1=buttons.leftPar();
            par1.prefWidthProperty().bind(pane.widthProperty().divide(4));
            par1.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button par2=buttons.rightPar();
            par2.prefWidthProperty().bind(pane.widthProperty().divide(4));
            par2.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button dot=buttons.dot();
            dot.prefWidthProperty().bind(pane.widthProperty().divide(4));
            dot.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button mod=buttons.mod();
            mod.prefWidthProperty().bind(pane.widthProperty().divide(4));
            mod.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button sq=buttons.square();
            sq.prefWidthProperty().bind(pane.widthProperty().divide(4));
            sq.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button sqrt=buttons.sqRoot();
            sqrt.prefWidthProperty().bind(pane.widthProperty().divide(4));
            sqrt.prefHeightProperty().bind(pane.heightProperty().divide(4));
            
            
            Button del=buttons.delete();
            del.prefWidthProperty().bind(pane.widthProperty().divide(4));
            del.prefHeightProperty().bind(pane.heightProperty().divide(4));
            Button cl=buttons.clear();
            cl.prefWidthProperty().bind(pane.widthProperty().divide(4));
            cl.prefHeightProperty().bind(pane.heightProperty().divide(4));
            

            

            pane.add(cl, 0, 0);
            pane.add(del, 1, 0);
            pane.add(par1, 2, 0);
            pane.add(par2, 3, 0);
            
                    
            pane.add(mod, 0, 1);
            pane.add(sqrt, 1, 1);
            pane.add(sq, 2, 1);
            pane.add(div, 3, 1);
            
            
            pane.add(bt7, 0, 2);
            pane.add(bt8,1, 2);
            pane.add(bt9,2, 2);
            pane.add(mult,3, 2);
            
            
            pane.add(bt4, 0, 3);
            pane.add(bt5, 1, 3);
            pane.add(bt6, 2, 3);
            pane.add(sub, 3, 3);
            
            
            pane.add(bt1,0,4);
            pane.add(bt2,1,4);
            pane.add(bt3, 2,4);
            pane.add(add, 3,4);
            
            
            
            pane.add(bt0,0,5);
            pane.add(dot,1, 5);
            pane.add(equ,2,5);
     
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
            pane1.setTop(tf);
            pane1.setCenter(pane);

            Scene scene = new Scene(pane1);
            scene.getStylesheets().add("application.css");
            primaryStage.setTitle("Calculator");
            primaryStage.setFullScreen(true);
            
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public static void main(String[] args)
        {
            launch(args);
        }
    }
