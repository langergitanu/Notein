package OooOOOo;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: renamed from: OooOOOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20457OooOOo {
    public static KeyguardManager OooO00o(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean OooO0O0(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
