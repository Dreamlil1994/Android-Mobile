package evanildo.projeto.musica.com.br;

import android.media.MediaPlayer ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    private void tocarSom() {
        if (player != null)
            player.start();
        }

    public  void somHiphop(View view) {
    player = MediaPlayer.create(this,R.raw.213)
        tocarSom();
    }
}



