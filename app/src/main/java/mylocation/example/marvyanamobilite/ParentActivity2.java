package mylocation.example.marvyanamobilite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ParentActivity2 extends AppCompatActivity {

    private WebView Parent_WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent2);

        Parent_WebView = (WebView)findViewById(R.id.Parent_WebView);
        WebSettings webSettings = Parent_WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Parent_WebView.loadUrl("https://marvyna.zkompiler.com/user/login");
        Parent_WebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(Parent_WebView.canGoBack()){
            Parent_WebView.goBack();
        } else {
            super.onBackPressed();
        }

    }


}