package com.microsoft.identity.common.internal.p590ui.webview.challengehandlers;

import android.webkit.WebView;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.challengehandlers.PKeyAuthChallenge;
import com.microsoft.identity.common.java.p591ui.webview.authorization.IAuthorizationCompletionCallback;
import com.microsoft.identity.common.logging.Logger;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class PKeyAuthChallengeHandler implements IChallengeHandler<PKeyAuthChallenge, Void> {
    private static final String TAG = "PKeyAuthChallengeHandler";
    private final IAuthorizationCompletionCallback mChallengeCallback;
    private final WebView mWebView;

    public PKeyAuthChallengeHandler(WebView webView, IAuthorizationCompletionCallback iAuthorizationCompletionCallback) {
        this.mWebView = webView;
        this.mChallengeCallback = iAuthorizationCompletionCallback;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.challengehandlers.IChallengeHandler
    public Void processChallenge(final PKeyAuthChallenge pKeyAuthChallenge) {
        boolean z;
        Error error;
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":processChallenge");
        this.mWebView.stopLoading();
        this.mChallengeCallback.setPKeyAuthStatus(true);
        try {
            final Map<String, String> challengeHeader = pKeyAuthChallenge.getChallengeHeader();
            this.mWebView.post(new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.challengehandlers.PKeyAuthChallengeHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    String submitUrl = pKeyAuthChallenge.getSubmitUrl();
                    Logger.info(strOooO0OO, "Respond to pkeyAuth challenge");
                    Logger.infoPII(strOooO0OO, "Challenge submit url:" + pKeyAuthChallenge.getSubmitUrl());
                    PKeyAuthChallengeHandler.this.mWebView.loadUrl(submitUrl, challengeHeader);
                }
            });
            return null;
        } finally {
            if (!z) {
            }
        }
    }
}
