package com.rodrigojscript.utshapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar

class Administrativos : AppCompatActivity() {
    lateinit var myWebView: WebView
    private var pbCarga: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrativos)
        myWebView = findViewById(R.id.webview2)
        pbCarga = findViewById(R.id.pbCarga2)

        myWebView.settings.javaScriptEnabled = true
        WebChromeClient()
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("http://sige.utsh.edu.mx/sige/administrador/")


        myWebView?.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                pbCarga?.progress = 0
                pbCarga?.visibility = View.VISIBLE
                pbCarga?.incrementProgressBy(newProgress)
                if (newProgress == 100) {
                    pbCarga?.visibility = View.GONE
                }
            }
        }
    }

    override fun onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack()
        } else {
            super.onBackPressed()
        }

    }

}