package com.microsoft.identity.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.internal.providers.oauth2.BrowserAuthorizationFragment;
import com.microsoft.identity.common.internal.util.StringUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class BrowserTabActivity extends Activity {
    private static final String TAG = "BrowserTabActivity";

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":onCreate");
        if (bundle != null || getIntent() == null || StringUtil.isEmpty(getIntent().getDataString())) {
            return;
        }
        Intent intentCreateCustomTabResponseIntent = BrowserAuthorizationFragment.createCustomTabResponseIntent(this, getIntent().getDataString());
        if (intentCreateCustomTabResponseIntent != null) {
            startActivity(intentCreateCustomTabResponseIntent);
        } else {
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Received NULL response intent. Unable to complete authorization.");
            Toast.makeText(getApplicationContext(), "Unable to complete authorization as there is no interactive call in progress. This can be due to closing the app while the authorization was in process.", 1).show();
        }
        finish();
    }
}
