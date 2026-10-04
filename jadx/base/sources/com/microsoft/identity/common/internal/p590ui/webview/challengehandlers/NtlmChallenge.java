package com.microsoft.identity.common.internal.p590ui.webview.challengehandlers;

import android.webkit.HttpAuthHandler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes9.dex */
public class NtlmChallenge {
    private HttpAuthHandler mHandler;
    private String mHost;
    private String mRealm;
    private WebView mView;

    public NtlmChallenge(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.mHandler = httpAuthHandler;
        this.mView = webView;
        this.mHost = str;
        this.mRealm = str2;
    }

    public HttpAuthHandler getHandler() {
        return this.mHandler;
    }

    public String getHost() {
        return this.mHost;
    }

    public String getRealm() {
        return this.mRealm;
    }

    public WebView getView() {
        return this.mView;
    }
}
