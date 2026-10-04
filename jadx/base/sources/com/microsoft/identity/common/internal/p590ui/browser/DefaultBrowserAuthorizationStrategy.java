package com.microsoft.identity.common.internal.p590ui.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.aspose.words.WarningType;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationRequest;
import com.microsoft.identity.common.java.providers.oauth2.OAuth2Strategy;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultBrowserAuthorizationStrategy<GenericOAuth2Strategy extends OAuth2Strategy, GenericAuthorizationRequest extends AuthorizationRequest> extends BrowserAuthorizationStrategy<GenericOAuth2Strategy, GenericAuthorizationRequest> {
    private final boolean mIsRequestFromBroker;

    public DefaultBrowserAuthorizationStrategy(Context context, Activity activity, Fragment fragment, boolean z) {
        super(context, activity, fragment);
        this.mIsRequestFromBroker = z;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.browser.BrowserAuthorizationStrategy
    public void setIntentFlag(Intent intent) {
        if (this.mIsRequestFromBroker) {
            intent.setFlags(268468224);
        } else {
            intent.setFlags(WarningType.HINT);
        }
    }
}
