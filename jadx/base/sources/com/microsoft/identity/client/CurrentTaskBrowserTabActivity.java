package com.microsoft.identity.client;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.internal.providers.oauth2.CurrentTaskBrowserAuthorizationFragment;
import com.microsoft.identity.common.internal.util.StringUtil;
import oooo00o.C35203OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class CurrentTaskBrowserTabActivity extends Activity {
    private static final int REDIRECT_RECEIVED_CODE = 2;
    private static final String TAG = "CurrentTaskBrowserTabActivity";
    private BroadcastReceiver mCloseBroadcastReceiver;

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":onActivityResult");
        if (i2 == 0) {
            C35203OooO00o.OooO00o(this).OooO0OO(new Intent(AuthenticationConstants.AuthorizationIntentAction.REDIRECT_RETURNED_ACTION));
            this.mCloseBroadcastReceiver = new BroadcastReceiver() { // from class: com.microsoft.identity.client.CurrentTaskBrowserTabActivity.1
                /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
                @Override // android.content.BroadcastReceiver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onReceive(Context context, Intent intent2) {
                    PackageManager packageManager = CurrentTaskBrowserTabActivity.this.getApplicationContext().getPackageManager();
                    boolean z = false;
                    try {
                        ComponentName componentName = CurrentTaskBrowserTabActivity.this.getComponentName();
                        ActivityInfo activityInfo = componentName != null ? packageManager.getActivityInfo(componentName, 0) : null;
                        if (activityInfo != null) {
                            if (activityInfo.taskAffinity == null) {
                                z = true;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, null, "Package name not found for: " + CurrentTaskBrowserTabActivity.this.getComponentName());
                    }
                    CurrentTaskBrowserTabActivity.this.finishActivity(2);
                    if (z) {
                        CurrentTaskBrowserTabActivity.this.finishAndRemoveTask();
                    } else {
                        CurrentTaskBrowserTabActivity.this.finish();
                    }
                }
            };
            C35203OooO00o.OooO00o(this).OooO0O0(this.mCloseBroadcastReceiver, new IntentFilter(AuthenticationConstants.AuthorizationIntentAction.DESTROY_REDIRECT_RECEIVING_ACTIVITY_ACTION));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":onCreate");
        String dataString = getIntent().getDataString();
        if (bundle != null || getIntent() == null || StringUtil.isEmpty(getIntent().getDataString())) {
            return;
        }
        Intent intentCreateCustomTabResponseIntent = CurrentTaskBrowserAuthorizationFragment.createCustomTabResponseIntent(this, dataString);
        if (intentCreateCustomTabResponseIntent != null) {
            startActivityForResult(intentCreateCustomTabResponseIntent, 2);
        } else {
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Received NULL response intent. Unable to complete authorization.");
            Toast.makeText(getApplicationContext(), "Unable to complete authorization as there is no interactive call in progress. This can be due to closing the app while the authorization was in process.", 1).show();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C35203OooO00o.OooO00o(this).OooO0Oo(this.mCloseBroadcastReceiver);
        super.onDestroy();
    }
}
