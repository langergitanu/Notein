package o0O0o0oO;

import Oooo0.C20860Ooooooo;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C21989OooOooO;
import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import o0Oo0o00.C28187Oooo0oO;
import oO00oO00.InterfaceC32403OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26014OooO0O0 implements InterfaceC32403OooO0OO, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f88839OooOo0o;

    public /* synthetic */ C26014OooO0O0(Object obj) {
        this.f88839OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(activityResult, "activityResult");
        CloudSyncFragment cloudSyncFragment = (CloudSyncFragment) this.f88839OooOo0o;
        int i = activityResult.f62240OooOo0o;
        Intent intent = activityResult.f62239OooOo;
        if (i != -1) {
            if (intent != null) {
                try {
                    o0O00OOO.OooO0o<AuthHuaweiId> authResultFromIntent = HuaweiIdAuthManager.parseAuthResultFromIntent(intent);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CloudSyncFragment");
                    c20358OooO00o.OooO0Oo(authResultFromIntent.OooO0o(), "HMS auth exception from cancelled result", new Object[0]);
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("CloudSyncFragment");
                    c20358OooO00o2.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("No HMS error info in cancelled result: ", e.getMessage()), new Object[0]);
                }
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o3, "CloudSyncFragment", "Huawei sign-in cancelled or failed with code ", i), new Object[0]);
            return;
        }
        o0O00OOO.OooO0o<AuthHuaweiId> authResultFromIntent2 = HuaweiIdAuthManager.parseAuthResultFromIntent(intent);
        kotlin.jvm.internal.OooOOO0.OooO0o(authResultFromIntent2, "parseAuthResultFromIntent(...)");
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("CloudSyncFragment");
        c20358OooO00o4.OooO00o("hw sign isSuccessful: " + authResultFromIntent2.OooO() + ", exception: " + authResultFromIntent2.OooO0o() + ", hwAccount: " + authResultFromIntent2.OooO0oO(), new Object[0]);
        if (authResultFromIntent2.OooO()) {
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(cloudSyncFragment), null, null, new C28187Oooo0oO(cloudSyncFragment, authResultFromIntent2.OooO0oO(), null), 3);
        } else {
            c20358OooO00o4.OooOOO0("CloudSyncFragment");
            c20358OooO00o4.OooO0Oo(authResultFromIntent2.OooO0o(), "Huawei sign-in task failed", new Object[0]);
        }
    }

    @Override // oO00oO00.InterfaceC32403OooO0OO
    public Object apply(Object obj) {
        C26017OooO0o c26017OooO0o = (C26017OooO0o) this.f88839OooOo0o;
        c26017OooO0o.getClass();
        if (!((Boolean) obj).booleanValue()) {
            return 0L;
        }
        ClipData primaryClip = ((ClipboardManager) c26017OooO0o.f88845OooO00o.getContext().getSystemService("clipboard")).getPrimaryClip();
        return Long.valueOf(primaryClip != null ? primaryClip.getDescription().getTimestamp() : -1L);
    }
}
