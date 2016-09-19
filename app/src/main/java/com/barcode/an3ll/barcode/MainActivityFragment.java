package com.barcode.an3ll.barcode;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.barcode.an3ll.barcode.zxing.IntentIntegrator;
import com.barcode.an3ll.barcode.zxing.IntentResult;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    View view;
    TextView textView;
    WebView webView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_main, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        textView = (TextView) view.findViewById(R.id.barscan);
        webView = (WebView) view.findViewById(R.id.webview);
    }

    public void showWebView(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }



    public void setText(String text) {
        textView.setText(text);
    }
}
