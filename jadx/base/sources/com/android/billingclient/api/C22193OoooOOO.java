package com.android.billingclient.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;

/* JADX INFO: renamed from: com.android.billingclient.api.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22193OoooOOO implements OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f67064OooOo0o;

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f67064OooOo0o;
        proxyBillingActivityV2.getClass();
        Intent intent = activityResult.f62239OooOo;
        Bundle extras = intent == null ? null : intent.getExtras();
        int i = activityResult.f62240OooOo0o;
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzn("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzie.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = zzc.zzh(intent, "ProxyBillingActivityV2").f66936OooO00o;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f67095OooOoo0;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            zzc.zzn("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }
}
