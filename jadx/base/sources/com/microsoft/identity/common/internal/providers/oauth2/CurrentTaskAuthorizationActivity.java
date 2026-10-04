package com.microsoft.identity.common.internal.providers.oauth2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.aspose.slides.C22205OooOOo;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.internal.p590ui.DualScreenActivity;
import com.microsoft.identity.common.logging.Logger;
import oooo00o.C35203OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class CurrentTaskAuthorizationActivity extends DualScreenActivity {
    private static final String TAG = "CurrentTaskAuthorizationActivity";
    private boolean mCloseCustomTabs = true;
    private CurrentTaskBrowserAuthorizationFragment mFragment;
    private BroadcastReceiver redirectReceiver;

    private void unregisterAndFinish() {
        C35203OooO00o.OooO00o(this).OooO0Oo(this.redirectReceiver);
        finish();
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onCreate");
        Fragment authorizationFragmentFromStartIntent = AuthorizationActivityFactory.getAuthorizationFragmentFromStartIntent(getIntent());
        if (!(authorizationFragmentFromStartIntent instanceof CurrentTaskBrowserAuthorizationFragment)) {
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected fragment type");
            Logger.error(strOooO0OO, "Fragment provided was not of type CurrentTaskBrowserAuthorizationFragment", illegalStateException);
            throw illegalStateException;
        }
        CurrentTaskBrowserAuthorizationFragment currentTaskBrowserAuthorizationFragment = (CurrentTaskBrowserAuthorizationFragment) authorizationFragmentFromStartIntent;
        this.mFragment = currentTaskBrowserAuthorizationFragment;
        currentTaskBrowserAuthorizationFragment.setInstanceState(getIntent().getExtras());
        if (AuthenticationConstants.AuthorizationIntentAction.REDIRECT_RETURNED_ACTION.equals(getIntent().getAction())) {
            if (CurrentTaskBrowserAuthorizationFragment.class.isInstance(this.mFragment)) {
                this.mFragment.setArguments(C22205OooOOo.OooO0O0("RESPONSE", true));
                this.mFragment.completeAuthorizationInBrowserFlow(getIntent().getStringExtra("RESPONSE_URI"));
                finish();
                return;
            }
            return;
        }
        setFragment(this.mFragment);
        if (bundle == null) {
            this.mCloseCustomTabs = false;
            this.redirectReceiver = new BroadcastReceiver() { // from class: com.microsoft.identity.common.internal.providers.oauth2.CurrentTaskAuthorizationActivity.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CurrentTaskAuthorizationActivity.this, (Class<?>) CurrentTaskAuthorizationActivity.class);
                    intent2.setAction(AuthenticationConstants.AuthorizationIntentAction.REFRESH_TO_CLOSE);
                    intent2.addFlags(603979776);
                    CurrentTaskAuthorizationActivity.this.startActivity(intent2);
                }
            };
            C35203OooO00o.OooO00o(this).OooO0O0(this.redirectReceiver, new IntentFilter(AuthenticationConstants.AuthorizationIntentAction.REDIRECT_RETURNED_ACTION));
        }
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (AuthenticationConstants.AuthorizationIntentAction.REFRESH_TO_CLOSE.equals(intent.getAction())) {
            C35203OooO00o.OooO00o(this).OooO0OO(new Intent(AuthenticationConstants.AuthorizationIntentAction.DESTROY_REDIRECT_RECEIVING_ACTIVITY_ACTION));
            unregisterAndFinish();
        }
        setIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onResume() {
        super.onResume();
        if (AuthenticationConstants.AuthorizationIntentAction.REDIRECT_RETURNED_ACTION.equals(getIntent().getAction())) {
            this.mFragment.setArguments(C22205OooOOo.OooO0O0("RESPONSE", true));
            this.mFragment.completeAuthorizationInBrowserFlow(getIntent().getStringExtra("RESPONSE_URI"));
            setResult(-1);
            unregisterAndFinish();
        }
        if (this.mCloseCustomTabs) {
            unregisterAndFinish();
        }
        this.mCloseCustomTabs = true;
    }
}
