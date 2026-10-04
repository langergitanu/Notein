package com.microsoft.identity.common.internal.p590ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.microsoft.identity.common.internal.p590ui.browser.BrowserAuthorizationStrategy;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationRequest;
import com.microsoft.identity.common.java.providers.oauth2.OAuth2Strategy;

/* JADX INFO: loaded from: classes9.dex */
public class CurrentTaskBrowserAuthorizationStrategy<GenericOAuth2Strategy extends OAuth2Strategy, GenericAuthorizationRequest extends AuthorizationRequest> extends BrowserAuthorizationStrategy<GenericOAuth2Strategy, GenericAuthorizationRequest> {
    public CurrentTaskBrowserAuthorizationStrategy(Context context, Activity activity, Fragment fragment) {
        super(context, activity, fragment);
    }

    @Override // com.microsoft.identity.common.internal.p590ui.browser.BrowserAuthorizationStrategy
    public void setIntentFlag(Intent intent) {
    }
}
