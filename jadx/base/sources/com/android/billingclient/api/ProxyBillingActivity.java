package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.C22162OooO0oo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f67084OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ResultReceiver f67085OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f67086OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f67087OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f67088OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f67089OooOoo0;

    public final Intent OooO00o(zzie zzieVar, long j) {
        Intent intentOooO0O0 = OooO0O0();
        intentOooO0O0.putExtra("RESPONSE_CODE", 6);
        intentOooO0O0.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        C22162OooO0oo.OooO00o OooO00o2 = C22162OooO0oo.OooO00o();
        OooO00o2.f66939OooO00o = 6;
        OooO00o2.f66941OooO0OO = "An internal error occurred.";
        C22162OooO0oo c22162OooO0ooOooO00o = OooO00o2.OooO00o();
        int i = C22186Oooo0oO.f67057OooO00o;
        intentOooO0O0.putExtra("FAILURE_LOGGING_PAYLOAD", C22186Oooo0oO.OooO0O0(zzieVar, 2, c22162OooO0ooOooO00o, null, zzil.BROADCAST_ACTION_UNSPECIFIED).zzM());
        intentOooO0O0.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentOooO0O0.putExtra("billingClientTransactionId", j);
        intentOooO0O0.putExtra("wasServiceAutoReconnected", this.f67089OooOoo0);
        return intentOooO0O0;
    }

    public final Intent OooO0O0() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent intentOooO00o;
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == 110) {
            int i3 = zzc.zzh(intent, "ProxyBillingActivity").f66936OooO00o;
            if (i2 != -1) {
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                if (intent == null) {
                    zzc.zzn("ProxyBillingActivity", "Got null data with resultCode " + i2 + "!");
                    intentOooO00o = OooO00o(i2 != -1 ? i2 != 0 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? zzie.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzie.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE : zzie.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE : zzie.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE : zzie.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzie.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT, this.f67088OooOoOO);
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentOooO00o = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                        intentOooO00o.setPackage(getApplicationContext().getPackageName());
                        intentOooO00o.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                        intentOooO00o.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        Intent intentOooO0O0 = OooO0O0();
                        intentOooO0O0.putExtras(intent.getExtras());
                        intentOooO0O0.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        intentOooO00o = intentOooO0O0;
                    }
                    intentOooO00o.putExtra("billingClientTransactionId", this.f67088OooOoOO);
                    intentOooO00o.putExtra("wasServiceAutoReconnected", this.f67089OooOoo0);
                } else {
                    zzc.zzn("ProxyBillingActivity", "Got null bundle!");
                    intentOooO00o = OooO00o(zzie.NULL_BUNDLE_IN_ACTIVITY_RESULT, this.f67088OooOoOO);
                }
                if (i == 110) {
                    intentOooO00o.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentOooO00o);
            } else if (i3 != 0) {
                i2 = -1;
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                if (intent == null) {
                }
                if (i == 110) {
                }
                sendBroadcast(intentOooO00o);
            } else {
                i2 = -1;
                if (intent == null) {
                }
                if (i == 110) {
                }
                sendBroadcast(intentOooO00o);
            }
        } else if (i == 101) {
            int iZza = zzc.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f67085OooOo0o;
            if (resultReceiver != null) {
                resultReceiver.send(iZza, intent == null ? null : intent.getExtras());
            }
        } else {
            zzc.zzn("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.f67084OooOo = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f67084OooOo = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f67085OooOo0o = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f67087OooOoO0 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f67086OooOoO = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f67088OooOoOO = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f67089OooOoo0 = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f67086OooOoO = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f67087OooOoO0 = true;
                this.f67086OooOoO = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f67085OooOo0o = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f67086OooOoO = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f67088OooOoOO = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f67089OooOoo0 = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f67084OooOo = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f67086OooOoO, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            zzc.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f67085OooOo0o;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentOooO00o = OooO00o(zzie.INTENT_SENDER_EXCEPTION, this.f67088OooOoOO);
                if (this.f67087OooOoO0) {
                    intentOooO00o.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentOooO00o);
            }
            this.f67084OooOo = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f67084OooOo) {
            Intent intentOooO0O0 = OooO0O0();
            intentOooO0O0.putExtra("RESPONSE_CODE", 1);
            intentOooO0O0.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f67087OooOoO0) {
                intentOooO0O0.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f67086OooOoO;
            if (i == 110 || i == 100) {
                intentOooO0O0.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentOooO0O0.putExtra("billingClientTransactionId", this.f67088OooOoOO);
            }
            sendBroadcast(intentOooO0O0);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f67085OooOo0o;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f67084OooOo);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f67087OooOoO0);
        bundle.putInt("activity_code", this.f67086OooOoO);
        bundle.putLong("billingClientTransactionId", this.f67088OooOoOO);
        bundle.putBoolean("wasServiceAutoReconnected", this.f67089OooOoo0);
    }
}
