package o0OOo0o;

import android.os.Build;
import androidx.fragment.app.ActivityC21897OooOo0;
import o0Oo00oo.C28039OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27330OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static long f95100OooO00o;

    public static void OooO00o(ActivityC21897OooOo0 context, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.OooOOO0.OooO0o(BRAND, "BRAND");
        boolean z2 = true;
        boolean zOooOoOO = C33599OooOo0O.OooOoOO(BRAND, "HUAWEI", true);
        boolean zOooO0OO = C28039OooO00o.OooO0OO();
        if (!zOooOoOO && !zOooO0OO) {
            z2 = false;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AppStartupUseCase");
        c20358OooO00o.OooO0o0("checkAppUpdate, shouldCheckAppUpdate: " + z2 + ", isHuaweiDevice: " + zOooOoOO + ", isHonorOldDevice: " + zOooO0OO, new Object[0]);
        if (!z2) {
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "AppStartupUseCase", "Do not check app update. ", BRAND), new Object[0]);
            return;
        }
        if (((Boolean) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C27329OooO0Oo(context, null))).booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - f95100OooO00o;
            if (z || j >= 60000) {
                f95100OooO00o = jCurrentTimeMillis;
            }
        }
    }
}
