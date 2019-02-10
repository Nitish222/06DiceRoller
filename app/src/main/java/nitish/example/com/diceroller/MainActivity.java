package nitish.example.com.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewdicy;
    public Button button;
    // private ImageView imageViewdicya;
    private Random randomnum = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imageViewdicy = findViewById(R.id.imageView);
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewdicy = findViewById(R.id.imageView);
                Rolldice();
                imageViewdicy = findViewById(R.id.imageView2);
                Rolldice2();
            }
        });
//        imageViewdicy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Rolldice();
//            }
//        });
//        imageViewdicy = findViewById(R.id.imageView2);
//        imageViewdicy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Rolldice();
//            }
//        });

//        imageViewdicya.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Rolldice();
//            }
//        });
    }

    private void Rolldice() {
        int randomnumber = randomnum.nextInt(6) + 1;
        switch (randomnumber) {
            case 1:
                imageViewdicy.setImageResource(R.drawable.d1);
//                getImageViewdicya.setImageResource(R.drawable.d1);
                break;
            case 2:
                imageViewdicy.setImageResource(R.drawable.d2);
//                getImageViewdicya.setImageResource(R.drawable.d2);
                break;
            case 3:
                imageViewdicy.setImageResource(R.drawable.d3);
//                getImageViewdicya.setImageResource(R.drawable.d3);
                break;
            case 4:
                imageViewdicy.setImageResource(R.drawable.d4);
//                getImageViewdicya.setImageResource(R.drawable.d4);
                break;
            case 5:
                imageViewdicy.setImageResource(R.drawable.d5);
//                imageViewdicy.setImageResource(R.drawable.d5);
            case 6:
                imageViewdicy.setImageResource(R.drawable.d6);
//                getImageViewdicya.setImageResource(R.drawable.d6);
                break;
        }
    }

    private void Rolldice2() {
        int randomnumber1 = randomnum.nextInt(6) + 1;
        switch (randomnumber1) {
            case 1:
                imageViewdicy.setImageResource(R.drawable.d1);
//                getImageViewdicya.setImageResource(R.drawable.d1);
                break;
            case 2:
                imageViewdicy.setImageResource(R.drawable.d2);
//                getImageViewdicya.setImageResource(R.drawable.d2);
                break;
            case 3:
                imageViewdicy.setImageResource(R.drawable.d3);
//                getImageViewdicya.setImageResource(R.drawable.d3);
                break;
            case 4:
                imageViewdicy.setImageResource(R.drawable.d4);
//                getImageViewdicya.setImageResource(R.drawable.d4);
                break;
            case 5:
                imageViewdicy.setImageResource(R.drawable.d5);
//                imageViewdicy.setImageResource(R.drawable.d5);
                break;
            case 6:
                imageViewdicy.setImageResource(R.drawable.d6);
//              getImageViewdicya.setImageResource(R.drawable.d6);
                break;
        }
    }
}
