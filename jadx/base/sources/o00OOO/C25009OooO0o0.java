package o00OOO;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.agconnect.credential.obs.C17625c;
import java.util.ArrayList;

/* JADX INFO: renamed from: o00OOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25009OooO0o0 extends BroadcastReceiver {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        boolean zContains = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        "shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra));
        if (intExtra == 1) {
            if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                zContains = true;
            }
        } else if (intExtra == 2) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
            if (stringArrayListExtra != null) {
                zContains = stringArrayListExtra.contains(context.getPackageName());
            }
        } else if (intExtra == 0) {
        }
        if (zContains) {
            String stringExtra = intent.getStringExtra("openIdType");
            OooO0o oooO0oOooO0O0 = OooO0o.OooO0O0();
            OooO00o oooO00o = "oaid".equals(stringExtra) ? oooO0oOooO0O0.f84849OooO0O0 : "vaid".equals(stringExtra) ? oooO0oOooO0O0.f84851OooO0Oo : C17625c.f52154a.equals(stringExtra) ? oooO0oOooO0O0.f84850OooO0OO : "udid".equals(stringExtra) ? oooO0oOooO0O0.f84848OooO00o : null;
            if (oooO00o == null) {
                return;
            }
            oooO00o.f84836OooO00o = 0L;
        }
    }
}
