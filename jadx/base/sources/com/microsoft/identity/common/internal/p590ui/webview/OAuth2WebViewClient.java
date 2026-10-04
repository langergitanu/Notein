package com.microsoft.identity.common.internal.p590ui.webview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.internal.p590ui.webview.challengehandlers.ChallengeFactory;
import com.microsoft.identity.common.internal.p590ui.webview.challengehandlers.NtlmChallengeHandler;
import com.microsoft.identity.common.internal.util.StringUtil;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.p591ui.webview.authorization.IAuthorizationCompletionCallback;
import com.microsoft.identity.common.java.providers.RawAuthorizationResult;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class OAuth2WebViewClient extends WebViewClient {
    private static final String TAG = "OAuth2WebViewClient";
    public static ExpectedPage mExpectedPage;
    private final Activity mActivity;
    private final IAuthorizationCompletionCallback mCompletionCallback;
    private final OnPageLoadedCallback mPageLoadedCallback;

    public OAuth2WebViewClient(Activity activity, IAuthorizationCompletionCallback iAuthorizationCompletionCallback, OnPageLoadedCallback onPageLoadedCallback) {
        this.mActivity = activity;
        this.mCompletionCallback = iAuthorizationCompletionCallback;
        this.mPageLoadedCallback = onPageLoadedCallback;
    }

    private void checkStartUrl(String str) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":checkStartUrl");
        if (StringUtil.isEmpty(str)) {
            Logger.info(strOooO0OO, "onPageStarted: Null url for page to load.");
            return;
        }
        Uri uri = Uri.parse(str);
        if (uri.isOpaque()) {
            Logger.info(strOooO0OO, "onPageStarted: Non-hierarchical loading uri.");
            Logger.infoPII(strOooO0OO, "start url: " + str);
            return;
        }
        if (StringUtil.isEmpty(uri.getQueryParameter("code"))) {
            Logger.info(strOooO0OO, "onPageStarted: URI has no auth code ('code') query parameter.");
            Logger.infoPII(strOooO0OO, "Scheme:" + uri.getScheme() + " Host: " + uri.getHost() + " Path: " + uri.getPath());
            return;
        }
        Logger.info(strOooO0OO, "Auth code is returned for the loading url.");
        Logger.infoPII(strOooO0OO, "Scheme:" + uri.getScheme() + " Host: " + uri.getHost() + " Path: " + uri.getPath());
    }

    private void sendErrorToCallback(WebView webView, int i, String str) {
        webView.stopLoading();
        this.mCompletionCallback.onChallengeResponseReceived(RawAuthorizationResult.fromException(new ClientException(C21532OooOOo.OooO0OO(i, "Code:"), str)));
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public IAuthorizationCompletionCallback getCompletionCallback() {
        return this.mCompletionCallback;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.mPageLoadedCallback.onPageLoaded(str);
        ExpectedPage expectedPage = mExpectedPage;
        if (expectedPage != null && str.startsWith(expectedPage.mExpectedPageUrlStartsWith)) {
            mExpectedPage.mCallback.onPageLoaded(str);
        }
        webView.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":onPageStarted");
        checkStartUrl(str);
        Logger.info(strOooO0OO, "WebView starts loading.");
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        sendErrorToCallback(webView, i, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        String str3 = TAG + ":onReceivedHttpAuthRequest";
        Logger.info(str3, "Receive the http auth request. Start the dialog to ask for creds. ");
        Logger.infoPII(str3, "Host:" + str);
        new NtlmChallengeHandler(this.mActivity, this.mCompletionCallback).processChallenge(ChallengeFactory.getNtlmChallenge(webView, httpAuthHandler, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        sslErrorHandler.cancel();
        Logger.error(TAG + ":onReceivedSslError", "Received SSL Error during request. For more info see: https://go.microsoft.com/fwlink/?linkid=2138180", null);
        this.mCompletionCallback.onChallengeResponseReceived(RawAuthorizationResult.fromException(new ClientException("Code:-11", sslError.toString())));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":onReceivedError");
        Logger.warn(strOooO0OO, "WebResourceError - isForMainFrame? " + webResourceRequest.isForMainFrame());
        Logger.warnPII(strOooO0OO, "Failing url: " + webResourceRequest.getUrl());
        if (webResourceRequest.isForMainFrame()) {
            sendErrorToCallback(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString());
        }
    }
}
