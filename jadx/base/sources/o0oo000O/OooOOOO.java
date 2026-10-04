package o0oo000O;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f111245OooO00o = 0;

    static {
        Pattern.compile("[^0-9]");
    }

    public static String OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (z && Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
                z = false;
            } else {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean OooO0O0(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
