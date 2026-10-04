package o00Oo0oO;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import o000ooOO.C24741OooOO0o;
import o00OOooO.C25019OooO00o;
import o00Oo0o0.C25047OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static String f85072OooO00o;

    public static String OooO00o(Context context) {
        String packageName;
        if (TextUtils.isEmpty(f85072OooO00o)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                C25052OooO0Oo.OooO00o(th);
                packageName = "";
            }
            f85072OooO00o = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return f85072OooO00o;
    }

    public static synchronized String OooO0O0(Context context, String str, String str2, C25047OooO00o c25047OooO00o) {
        String str3;
        str3 = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
            if (!TextUtils.isEmpty(string)) {
                try {
                    str3 = new String(C24741OooOO0o.OooO00o(OooO00o(context), str, C25019OooO00o.OooO0OO(string)));
                } catch (Exception unused) {
                }
            }
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "cp", "TriDesEncryptError", str + "," + string);
            }
        } catch (Exception e) {
            C25052OooO0Oo.OooO00o(e);
        }
        return str3;
    }

    public static synchronized void OooO0OO(Context context, String str, String str2, C25047OooO00o c25047OooO00o) {
        String strOooO00o;
        try {
            try {
                strOooO00o = C25019OooO00o.OooO00o(C24741OooOO0o.OooO0O0(OooO00o(context), str, str2.getBytes()));
            } catch (Exception unused) {
                strOooO00o = null;
            }
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strOooO00o)) {
                o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "cp", "TriDesDecryptError", str + "," + str2);
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strOooO00o).apply();
        } finally {
        }
    }
}
