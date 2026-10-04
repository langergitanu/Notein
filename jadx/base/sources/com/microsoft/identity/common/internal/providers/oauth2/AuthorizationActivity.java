package com.microsoft.identity.common.internal.providers.oauth2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.microsoft.identity.common.internal.p590ui.DualScreenActivity;
import com.microsoft.identity.common.internal.util.CommonMoshiJsonAdapter;
import com.microsoft.identity.common.java.exception.TerminalException;
import com.microsoft.identity.common.java.opentelemetry.SerializableSpanContext;
import com.microsoft.identity.common.logging.Logger;
import io.opentelemetry.api.trace.SpanContext;

/* JADX INFO: loaded from: classes9.dex */
public class AuthorizationActivity extends DualScreenActivity {
    public static final String TAG = "AuthorizationActivity";
    private AuthorizationFragment mFragment;
    private SpanContext mSpanContext;

    public SpanContext getSpanContext() {
        return this.mSpanContext;
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onCreate");
        if (getIntent().getExtras() != null) {
            try {
                this.mSpanContext = (SpanContext) new CommonMoshiJsonAdapter().fromJson(getIntent().getExtras().getString(SerializableSpanContext.SERIALIZABLE_SPAN_CONTEXT), SerializableSpanContext.class);
            } catch (TerminalException unused) {
                this.mSpanContext = null;
            }
        }
        Fragment authorizationFragmentFromStartIntent = AuthorizationActivityFactory.getAuthorizationFragmentFromStartIntent(getIntent());
        if (authorizationFragmentFromStartIntent instanceof AuthorizationFragment) {
            AuthorizationFragment authorizationFragment = (AuthorizationFragment) authorizationFragmentFromStartIntent;
            this.mFragment = authorizationFragment;
            authorizationFragment.setInstanceState(getIntent().getExtras());
        } else {
            Logger.error(strOooO0OO, "Did not receive AuthorizationFragment from factory", new IllegalStateException("Unexpected fragment type."));
        }
        setFragment(this.mFragment);
    }
}
