package o0oO0O0o;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: o0oO0O0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C30785OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static SharedPreferences f110067OooO00o;

    public static synchronized SharedPreferences OooO00o(Context context) {
        try {
            if (f110067OooO00o == null) {
                f110067OooO00o = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f110067OooO00o;
    }
}
