package o00OO0o0;

import android.content.Context;
import java.util.HashMap;
import o0000OoO.C24224OooO00o;
import o00Oo.C25025OooO00o;

/* JADX INFO: renamed from: o00OO0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24997OooO00o {
    public static String OooO00o(Context context, String str) {
        String string;
        synchronized (C24997OooO00o.class) {
            String strOooO0Oo = null;
            if (context != null) {
                if (!C24224OooO00o.OooO0O0("vkeyid_settings") && !C24224OooO00o.OooO0O0(str)) {
                    try {
                        string = context.getSharedPreferences("vkeyid_settings", 0).getString(str, "");
                    } catch (Throwable unused) {
                    }
                    if (!C24224OooO00o.OooO0O0(string)) {
                        strOooO0Oo = C25025OooO00o.OooO0Oo(C25025OooO00o.OooO00o(), string);
                        return strOooO0Oo;
                    }
                }
            }
            return null;
        }
    }

    public static void OooO0O0(Context context, String str, String str2) {
        synchronized (C24997OooO00o.class) {
            try {
                if (C24224OooO00o.OooO0O0("vkeyid_settings") || C24224OooO00o.OooO0O0(str) || context == null) {
                    return;
                }
                try {
                    String strOooO0O0 = C25025OooO00o.OooO0O0(C25025OooO00o.OooO00o(), str2);
                    HashMap map = new HashMap();
                    map.put(str, strOooO0O0);
                    C25001OooO0o0.OooO00o(context, "vkeyid_settings", map);
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
