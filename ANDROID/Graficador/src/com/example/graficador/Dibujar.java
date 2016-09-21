package com.example.graficador;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.graphics.Region;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Fabian on 29/08/2016.
 */
public class Dibujar extends View{
    Paint paint,paintCircle,paintRect,paintTriangle;
    EditText inicio, fin;
	Button graficar;
	double angini,angfin,x,y,xa,ya;
	int aig,afg;
	String inicial, ultimo;
	
	
    public Dibujar(Context context, int ai, int af) {
        super(context);
        aig=ai;
        afg=af;
        paint = new Paint();

    
        
    }



	@Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*paint.setColor(Color.GREEN);
        canvas.drawLine(10,20,530,550,paint);
        paintCircle.setStyle(Paint.Style.STROKE);
        paintCircle.setColor(Color.BLUE);
        canvas.drawCircle(100,200,50,paintCircle);
        paintRect.setStyle(Paint.Style.FILL);
        paintRect.setColor(Color.RED);
        canvas.drawRect(200,80,300,180,paintRect);
        paintRect.setColor(Color.MAGENTA);*/
        canvas.drawRGB(255, 255, 255);	
        angini =aig*Math.PI/180;
        angfin=afg*Math.PI/180;
        for(x=angini;x<=angfin;x=x+0.01){
        	y=Math.sin(x);
        	xa=x*50;
        	ya=y*-50+100;
        	canvas.drawPoint((int)xa, (int)ya, paint);
        }
        invalidate();
    }

	
}
