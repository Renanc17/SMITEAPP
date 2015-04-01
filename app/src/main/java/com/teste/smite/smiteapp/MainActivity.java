package com.teste.smite.smiteapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NewGod(View view){
        Random gen = new Random();
        int newgod = gen.nextInt(63);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(RandonGodURL(newgod, 1));   //   Carrega o nome do God

        String imagename = RandonGodURL(newgod, 0);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
        int image = getResources().getIdentifier("@drawable/" + imagename,"drawable", getPackageName());
        imageView2.setImageResource(image);  //     Carrega a imagem do God

    }

    public String RandonGodURL(int n, int c){
        String imagename = null;
        String name = null;


        // Cadastro de Gods improvisado
        if(n == 0) {
            imagename = "agni";
            name = "Agni"; // Agni
        }
        if(n == 1) {
            imagename = "ahmuzencab";
            name = "Ah Muzen Cab"; // Ah Muzen Cab
        }
        if(n == 2) {
            imagename = "anhur";
            name = "Anhur"; // Anhur
        }
        if(n == 3) {
            imagename = "anubis";
            name = "Anubis"; // Anubis
        }
        if(n == 4) {
            imagename = "aokuang";
            name = "Ao Kuang"; // Ao Kuang
        }
        if(n == 5) {
            imagename = "aphrodite";
            name = "Aphrodite"; // Aphrodite
        }
        if(n == 6) {
            imagename = "apollo";
            name = "Apollo"; // Apollo
        }
        if(n == 7) {
            imagename = "arachne";
            name = "Arachne"; // Arachne
        }
        if(n == 8) {
            imagename = "ares";
            name = "Ares"; // Ares
        }
        if(n == 9) {
            imagename = "artemis";
            name = "Artemis"; // Artemis
        }
        if(n == 10) {
            imagename = "athena";
            name = "Athena"; // Athena
        }
        if(n == 11) {
            imagename = "awilix";
            name = "Awilix"; // Awilix
        }
        if(n == 12) {
            imagename = "bacchus";
            name = "Bacchus"; // Bacchus
        }
        if(n == 13) {
            imagename = "bakasura";
            name = "Bakasura"; // Bakasura
        }
        if(n == 14) {
            imagename = "bastet";
            name = "Bastet"; // Bastet
        }
        if(n == 15) {
            imagename = "bellona";
            name = "Bellona"; // Bellona
        }
        if(n == 16) {
            imagename = "cabrakan";
            name = "Cabrakan"; // Cabrakan
        }
        if(n == 17) {
            imagename = "chaac";
            name = "Chaac"; // Chaac
        }
        if(n == 18) {
            imagename = "change";
            name = "Chang'e"; // Chang'e
        }
        if(n == 19) {
            imagename = "chronos";
            name = "Chronos"; // Chronos
        }
        if(n == 20) {
            imagename = "cupid";
            name = "Cupid"; // Cupid
        }
        if(n == 21) {
            imagename = "fenrir";
            name = "Fenrir"; // Fenrir
        }
        if(n == 22) {
            imagename = "freya";
            name = "Freya"; // Freya
        }
        if(n == 23) {
            imagename = "geb";
            name = "Geb"; // Geb
        }
        if(n == 24) {
            imagename = "guanyu";
            name = "Guan Yu"; // Guan Yu
        }
        if(n == 25) {
            imagename = "hades";
            name = "Hades"; // Hades
        }
        if(n == 26) {
            imagename = "hebo";
            name = "He Bo"; // He Bo
        }
        if(n == 27) {
            imagename = "hel";
            name = "Hel"; // Hel
        }
        if(n == 28) {
            imagename = "hercules";
            name = "Hercules"; // Hercules
        }
        if(n == 29) {
            imagename = "houyi";
            name = "Hou Yi"; // Hou Yi
        }
        if(n == 30) {
            imagename = "hunbatz";
            name = "Hun Batz"; // Hun Batz
        }
        if(n == 31) {
            imagename = "isis";
            name = "Isis"; // Isis
        }
        if(n == 32) {
            imagename = "janus";
            name = "Janus"; // Janus
        }
        if(n == 33) {
            imagename = "kali";
            name = "Kali"; // Kali
        }
        if(n == 34) {
            imagename = "kukulkan";
            name = "Kukulkan"; // Kukulkan
        }
        if(n == 35) {
            imagename = "kumbhakarna";
            name = "Kumbhakarna"; // Kumbhakarna
        }
        if(n == 36) {
            imagename = "loki";
            name = "Loki"; // Loki
        }
        if(n == 37) {
            imagename = "mercury";
            name = "Mercury"; // Mercury
        }
        if(n == 38) {
            imagename = "nezha";
            name = "Ne Zha"; // Ne Zha
        }
        if(n == 39) {
            imagename = "neith";
            name = "Neith"; // Neith
        }
        if(n == 40) {
            imagename = "nemesis";
            name = "Nemesis"; // Nemesis
        }
        if(n == 41) {
            imagename = "nox";
            name = "Nox"; // Nox
        }
        if(n == 42) {
            imagename = "nuwa";
            name = "Nu Wa"; // Nu Wa
        }
        if(n == 43) {
            imagename = "odin";
            name = "Odin"; // Odin
        }
        if(n == 44) {
            imagename = "osiris";
            name = "Osiris"; // Osiris
        }
        if(n == 45) {
            imagename = "poseidon";
            name = "Poseidon"; // Poseidon
        }
        if(n == 46) {
            imagename = "ra";
            name = "Ra"; // Ra
        }
        if(n == 47) {
            imagename = "rama";
            name = "Rama"; // Rama
        }
        if(n == 48) {
            imagename = "scylla";
            name = "Scylla"; // Scylla
        }
        if(n == 49) {
            imagename = "serqet";
            name = "Serqet"; // Serqet
        }
        if(n == 50) {
            imagename = "sobek";
            name = "Sobek"; // Sobek
        }
        if(n == 51) {
            imagename = "sunwukong";
            name = "Sun Wukong"; // Sun Wukong
        }
        if(n == 52) {
            imagename = "sylvanus";
            name = "Sylvanus"; // Sylvanus
        }
        if(n == 53) {
            imagename = "thanatos";
            name = "Thanatos"; // Thanatos
        }
        if(n == 54) {
            imagename = "thor";
            name = "Thor"; // Thor
        }
        if(n == 55) {
            imagename = "tyr";
            name = "Tyr"; // Tyr
        }
        if(n == 56) {
            imagename = "ullr";
            name = "Ullr"; // Ullr
        }
        if(n == 57) {
            imagename = "vamana";
            name = "Vamana"; // Vamana
        }
        if(n == 58) {
            imagename = "vulcan";
            name = "Vulcan"; // Vulcan
        }
        if(n == 59) {
            imagename = "xbalanque";
            name = "Xbalanque"; // Xbalanque
        }
        if(n == 60) {
            imagename = "ymir";
            name = "Ymir"; // Ymir
        }
        if(n == 61) {
            imagename = "zeus";
            name = "Zeus"; // Zeus
        }
        if(n == 62) {
            imagename = "zhongkui";
            name = "Zhong Kui"; // Zhong Kui
        }


        // Variavel choose
        if(c == 0)
        return imagename;
        else
        return name;
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
