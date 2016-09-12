package com.example.spritev1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
@SuppressLint("WrongCall")
public class GameLoopThread extends Thread {
    private GameView view;
    private boolean running = false;
   
    public GameLoopThread(View view) {
          this.view = (GameView) view;
    }

   



	public void setRunning(boolean run) {
          running = run;
    }

    @Override
    public void run() {
          while (running) {
                 Canvas c = null;
                 try {
                        c = view.getHolder().lockCanvas();
                        synchronized (view.getHolder()) {
                               view.onDraw(c);
                        }
                 } finally {
                        if (c != null) {
                               view.getHolder().unlockCanvasAndPost(c);
                        }
                 }
          }
    }
}





	