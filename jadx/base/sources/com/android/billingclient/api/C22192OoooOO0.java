package com.android.billingclient.api;

import android.content.Intent;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.internal.play_billing.zzc;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import oO00o.InterfaceC32321OooO0oo;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.android.billingclient.api.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22192OoooOO0 implements OooO0o.OooO00o, InterfaceC32321OooO0oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f67063OooOo0o;

    public /* synthetic */ C22192OoooOO0(Object obj) {
        this.f67063OooOo0o = obj;
    }

    @Override // oO00o.InterfaceC32321OooO0oo
    public void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f67063OooOo0o;
        proxyBillingActivityV2.getClass();
        Intent intent = activityResult.f62239OooOo;
        int i = zzc.zzh(intent, "ProxyBillingActivityV2").f66936OooO00o;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f67092OooOoO;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = activityResult.f62240OooOo0o;
        if (i2 != -1 || i != 0) {
            zzc.zzn("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // oO00o.InterfaceC32321OooO0oo
    public void onError(Throwable th) {
    }

    @Override // oO00o.InterfaceC32321OooO0oo
    public void onSuccess(Object obj) {
        C34406OooO00o.f123390OooO00o.OooO00o("setDefaultBasicStyleVo: %s", (TextBasicStyleVO) this.f67063OooOo0o);
    }
}
