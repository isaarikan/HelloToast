package arksoft.com.hellotoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HelloToast extends Activity {
    Button btn1,btn2;
    TextView txt;
    int counter=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        //Uygulama ilk açıldıgında onCreate metodu açılır
        super.onCreate(savedInstanceState);

        //Tasarım dosyasını java sınıfına bağlıyoruz
        setContentView(R.layout.activity_hello_toast);


        //Butonlar ve TextView'ın referansını xml dosyasından id'si ile alıyoruz
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        txt=(TextView)findViewById(R.id.textView);


        //Butona dinleyici tanımlıyoruz ve tıklandığında ne yapılacağını söylüyoruz
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloToast.this,"Butona tıklandı",Toast.LENGTH_LONG).show();
            }
        });



        //Butona tıklandığında TextView'ın sayısını bir artır.
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;

                txt.setText(Integer.toString(counter));
            }
        });

    }







}
