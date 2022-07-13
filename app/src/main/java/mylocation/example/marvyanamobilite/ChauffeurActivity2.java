package mylocation.example.marvyanamobilite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ChauffeurActivity2 extends AppCompatActivity {

    private WebView Chauffeur_WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chauffeur2);

        Chauffeur_WebView = (WebView)findViewById(R.id.Chauffeur_WebView);
        WebSettings webSettings = Chauffeur_WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Chauffeur_WebView.loadUrl("https://tamas-szabo.com/mastermind/#/play");
        /* Chauffeur_WebView.loadUrl("https://marvyna.zkompiler.com/driver/login");*/
        Chauffeur_WebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(Chauffeur_WebView.canGoBack()){
            Chauffeur_WebView.goBack();
        } else {
            super.onBackPressed();
        }

    }

}