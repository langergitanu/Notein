package o00OOOo;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: o00OOOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25014OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84902OooO00o = 0;

    static {
        Pattern.compile("([\t\r\n])+");
    }

    public static int OooO00o(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            i = (i * 31) + c;
        }
        return i;
    }

    public static boolean OooO0O0(String str) {
        return str == null || str.length() <= 0;
    }
}
