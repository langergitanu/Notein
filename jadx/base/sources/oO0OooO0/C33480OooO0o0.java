package oO0OooO0;

import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: oO0OooO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33480OooO0o0 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C33477OooO0OO OooO00o(C33477OooO0OO c33477OooO0OO, C33477OooO0OO prefix) {
        OooOOO0.OooO0oO(c33477OooO0OO, "<this>");
        OooOOO0.OooO0oO(prefix, "prefix");
        if (!c33477OooO0OO.equals(prefix) && !prefix.OooO0Oo()) {
            String strOooO0O0 = c33477OooO0OO.OooO0O0();
            String strOooO0O02 = prefix.OooO0O0();
            if (C33595OooOOo.OooOoO0(strOooO0O0, strOooO0O02, false) && strOooO0O0.charAt(strOooO0O02.length()) == '.') {
                if (!prefix.OooO0Oo()) {
                    if (c33477OooO0OO.equals(prefix)) {
                        C33477OooO0OO ROOT = C33477OooO0OO.f120970OooO0OO;
                        OooOOO0.OooO0o(ROOT, "ROOT");
                        return ROOT;
                    }
                    String strSubstring = c33477OooO0OO.OooO0O0().substring(prefix.OooO0O0().length() + 1);
                    OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return new C33477OooO0OO(strSubstring);
                }
            }
        }
        return c33477OooO0OO;
    }
}
