package com.android.billingclient.api;

import OooO0oO.C20430OooO;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends OooO0Oo.OooOO0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0o.OooO0O0 f67090OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0o.OooO0O0 f67091OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ResultReceiver f67092OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO0o.OooO0O0 f67093OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ResultReceiver f67094OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ResultReceiver f67095OooOoo0;

    @Override // OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f67091OooOo0o = registerForActivityResult(new C20430OooO(), new C22192OoooOO0(this));
        this.f67090OooOo = registerForActivityResult(new C20430OooO(), new OooO0o.OooO00o() { // from class: com.android.billingclient.api.o000oOoO
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.f67099OooOo0o;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.f62239OooOo;
                int i = zzc.zzh(intent, "ProxyBillingActivityV2").f66936OooO00o;
                ResultReceiver resultReceiver = proxyBillingActivityV2.f67094OooOoOO;
                if (resultReceiver != null) {
                    resultReceiver.send(i, intent == null ? null : intent.getExtras());
                }
                int i2 = activityResult.f62240OooOo0o;
                if (i2 != -1 || i != 0) {
                    zzc.zzn("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
                }
                proxyBillingActivityV2.finish();
            }
        });
        C20430OooO c20430OooO = new C20430OooO();
        C22193OoooOOO c22193OoooOOO = new C22193OoooOOO();
        c22193OoooOOO.f67064OooOo0o = this;
        this.f67093OooOoO0 = registerForActivityResult(c20430OooO, c22193OoooOOO);
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f67092OooOoO = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f67094OooOoOO = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f67095OooOoo0 = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f67092OooOoO = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            OooO0o.OooO0O0 oooO0O0 = this.f67091OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            kotlin.jvm.internal.OooOOO0.OooO0o(intentSender, "pendingIntent.intentSender");
            oooO0O0.OooO00o(new IntentSenderRequest(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f67094OooOoOO = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            OooO0o.OooO0O0 oooO0O02 = this.f67090OooOo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            kotlin.jvm.internal.OooOOO0.OooO0o(intentSender2, "pendingIntent.intentSender");
            oooO0O02.OooO00o(new IntentSenderRequest(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f67095OooOoo0 = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            OooO0o.OooO0O0 oooO0O03 = this.f67093OooOoO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(pendingIntent3, "pendingIntent");
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            kotlin.jvm.internal.OooOOO0.OooO0o(intentSender3, "pendingIntent.intentSender");
            oooO0O03.OooO00o(new IntentSenderRequest(intentSender3, null, 0, 0));
        }
    }

    @Override // OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f67092OooOoO;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f67094OooOoOO;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f67095OooOoo0;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
