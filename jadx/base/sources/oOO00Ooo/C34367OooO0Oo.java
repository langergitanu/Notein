package oOO00Ooo;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;
import oOO00o0O.C34375OooO00o;

/* JADX INFO: renamed from: oOO00Ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34367OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static String f123348OooO00o = "";

    public static String OooO00o(Context context, int i) {
        if (i < 2) {
            int i2 = i + 1;
            if (TextUtils.isEmpty(f123348OooO00o)) {
                String strOooO00o = C34375OooO00o.OooO0O0(context).OooO00o("UUID");
                synchronized (C34367OooO0Oo.class) {
                    f123348OooO00o = strOooO00o;
                }
                if (TextUtils.isEmpty(strOooO00o)) {
                    String string = UUID.randomUUID().toString();
                    synchronized (C34367OooO0Oo.class) {
                        f123348OooO00o = string;
                    }
                    if (!TextUtils.isEmpty(string)) {
                        C34375OooO00o.OooO0O0(context).OooO0Oo("UUID", f123348OooO00o);
                    }
                }
            }
            if (!TextUtils.isEmpty(f123348OooO00o) && (f123348OooO00o.length() > 40 || !o0O00O0.OooO00o.OooO0o0(f123348OooO00o))) {
                f123348OooO00o = "";
                C34375OooO00o.OooO0O0(context).OooO0OO("UUID");
                f123348OooO00o = OooO00o(context, i2);
            }
            return f123348OooO00o;
        }
        return "NULL";
    }
}
