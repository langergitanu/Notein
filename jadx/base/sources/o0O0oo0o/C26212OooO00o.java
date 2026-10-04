package o0O0oo0o;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o0O0oo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26212OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f89545OooO00o = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static String OooO00o(String str) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void OooO0O0(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, OooO00o(str2));
    }
}
