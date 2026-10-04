package com.microsoft.identity.common.internal.p590ui.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.concurrent.futures.OooO00o;
import androidx.fragment.app.Fragment;
import com.microsoft.identity.common.internal.providers.oauth2.AndroidAuthorizationStrategy;
import com.microsoft.identity.common.internal.providers.oauth2.AuthorizationActivityFactory;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.p591ui.AuthorizationAgent;
import com.microsoft.identity.common.java.providers.RawAuthorizationResult;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationRequest;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationResult;
import com.microsoft.identity.common.java.providers.oauth2.OAuth2Strategy;
import com.microsoft.identity.common.java.util.ResultFuture;
import com.microsoft.identity.common.logging.Logger;
import java.net.URI;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes9.dex */
public class EmbeddedWebViewAuthorizationStrategy<GenericOAuth2Strategy extends OAuth2Strategy, GenericAuthorizationRequest extends AuthorizationRequest> extends AndroidAuthorizationStrategy<GenericOAuth2Strategy, GenericAuthorizationRequest> {
    private static final String TAG = "EmbeddedWebViewAuthorizationStrategy";
    private GenericAuthorizationRequest mAuthorizationRequest;
    private ResultFuture<AuthorizationResult> mAuthorizationResultFuture;
    private GenericOAuth2Strategy mOAuth2Strategy;

    public EmbeddedWebViewAuthorizationStrategy(Context context, Activity activity, Fragment fragment) {
        super(context, activity, fragment);
    }

    private Intent buildAuthorizationActivityStartIntent(URI uri) {
        return AuthorizationActivityFactory.getAuthorizationActivityIntent(getApplicationContext(), null, uri.toString(), this.mAuthorizationRequest.getBrkRedirectUri() != null ? this.mAuthorizationRequest.getBrkRedirectUri() : this.mAuthorizationRequest.getRedirectUri(), this.mAuthorizationRequest.getRequestHeaders(), AuthorizationAgent.WEBVIEW, this.mAuthorizationRequest.isWebViewZoomEnabled(), this.mAuthorizationRequest.isWebViewZoomControlsEnabled());
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IAuthorizationStrategy
    public void completeAuthorization(int i, RawAuthorizationResult rawAuthorizationResult) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":completeAuthorization");
        if (i != 1001) {
            Logger.warnPII(strOooO0OO, "Unknown request code " + i);
            return;
        }
        GenericOAuth2Strategy genericoauth2strategy = this.mOAuth2Strategy;
        if (genericoauth2strategy != null && this.mAuthorizationResultFuture != null) {
            this.mAuthorizationResultFuture.setResult(genericoauth2strategy.getAuthorizationResultFactory().createAuthorizationResult(rawAuthorizationResult, this.mAuthorizationRequest));
            return;
        }
        StringBuilder sb = new StringBuilder("SDK Cancel triggering before request is sent out. Potentially due to an stale activity state, oAuth2Strategy null ? [");
        sb.append(this.mOAuth2Strategy == null);
        sb.append("]mAuthorizationResultFuture ? [");
        sb.append(this.mAuthorizationResultFuture == null);
        sb.append("]");
        Logger.warn(strOooO0OO, sb.toString());
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IAuthorizationStrategy
    public Future<AuthorizationResult> requestAuthorization(GenericAuthorizationRequest genericauthorizationrequest, GenericOAuth2Strategy genericoauth2strategy) throws ClientException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":requestAuthorization");
        this.mAuthorizationResultFuture = new ResultFuture<>();
        this.mOAuth2Strategy = genericoauth2strategy;
        this.mAuthorizationRequest = genericauthorizationrequest;
        Logger.info(strOooO0OO, "Perform the authorization request with embedded webView.");
        launchIntent(buildAuthorizationActivityStartIntent(genericauthorizationrequest.getAuthorizationRequestAsHttpRequest()));
        return this.mAuthorizationResultFuture;
    }
}
