package com.example.junekelectric.janken;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    TextView player;
    ImageView cpu;
    TextView result;
    TextView winlose;
    int num;
    int kachi;
    int make;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = (TextView)findViewById(R.id.player);
        cpu = (ImageView)findViewById(R.id.cpu);
        result = (TextView)findViewById(R.id.result);
        winlose = (TextView)findViewById(R.id.winlose);
    }

    public void goo(View v){
        player.setText("あなたの手はグーです。グーパンチー、えい！（笑）");
        Random random = new Random();
        num = random.nextInt(3);

        if(num == 0){

            kachi = kachi + 0;
            make = make + 0;

            //cpu.setText("相手の手はグーです…　顔面とか気をつけてね。");
            cpu.setImageResource(R.drawable.goo);
            result.setText("引き分けです。心の炎を燃やしたらどう？");
            result.setTextColor(Color.rgb(51,255,0));

        }else if (num == 1){

            kachi = kachi + 1;
            make = make;

            //cpu.setText("相手の手はチョキです。じゃあ一緒にセルフィかなんか取りましょう！はい、チーズ！");
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの勝ちです。よかったねー！");
            result.setTextColor(Color.rgb(255,102,0));

        }else if(num == 2){

            kachi = kachi;
            make = make + 1;

            //cpu.setText("相手の手はパーです。HI-FIVE!");
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの負けです。泣泣泣（；＿；）");
            result.setTextColor(Color.rgb(153,153,255));

        }

        winlose.setText (kachi + "勝" + make + "負");
    }

    public void choki(View v){
        player.setText("あなたの手はチョキです。ピースっ！");
        Random random = new Random();
        num = random.nextInt(3);

        if(num == 0){

            kachi = kachi;
            make = make + 1;

            //cpu.setText("相手の手はグーです…　顔面とか気をつけてね。");
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの負けです。泣泣泣（；＿；）");
            result.setTextColor(Color.rgb(153, 153, 255));

        }else if (num == 1){

            kachi = kachi;
            make = make;

            //cpu.setText("相手の手はチョキです。じゃあ一緒にセルフィかなんか取りましょうか");
            cpu.setImageResource(R.drawable.choki);
            result.setText("引き分けです。心の炎を燃やしたらどう？");
            result.setTextColor(Color.rgb(51, 255, 0));

        }else if(num == 2){

            kachi = kachi + 1;
            make = make;

            //cpu.setText("相手の手はパーです。HI-FIVE!");
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの勝ちです。よかったねー！");
            result.setTextColor(Color.rgb(255, 102, 0));

        }

        winlose.setText (kachi + "勝" + make + "負");
    }

    public void paa(View v){
        player.setText("あなたの手はパーです！ただ、君の手が無駄とかそう意味ではなくてね。");
        Random random = new Random();
        num = random.nextInt(3);

        if(num == 0){

            kachi = kachi + 1;
            make = make;

            //cpu.setText("相手の手はグーです…　顔面とか気をつけてね。");
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの勝ちです。よかったねー！");
            result.setTextColor(Color.rgb(255, 102, 0));

        }else if (num == 1){

            kachi = kachi;
            make = make + 1;

            //cpu.setText("相手の手はチョキです。じゃあ一緒にセルフィかなんか取りましょう！はい、チーズ！");
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの負けです。泣泣泣（；＿；）");
            result.setTextColor(Color.rgb(153, 153, 255));

        }else if(num == 2){

            kachi = kachi;
            make = make;

            //cpu.setText("相手の手はパーです。HI-FIVE!");
            cpu.setImageResource(R.drawable.paa);
            result.setText("引き分けです。心の炎を燃やしたらどう？");
            result.setTextColor(Color.rgb(51, 255, 0));

        }

        winlose.setText (kachi + "勝" + make + "負");
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
