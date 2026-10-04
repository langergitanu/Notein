package oO00O0o0;

import oO00O0o0.InterfaceC32195OooOoO;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO00O0o0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32198OooOoo {
    public static final void OooO00o(C32197OooOoOO c32197OooOoOO, String str, int i, int i2, int i3) {
        if (i2 == -1) {
            int iOooO0Oo = OooO0Oo(i, i3, str);
            int iOooO0OO = OooO0OO(iOooO0Oo, i3, str);
            if (iOooO0OO > iOooO0Oo) {
                String strSubstring = str.substring(iOooO0Oo, iOooO0OO);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                c32197OooOoOO.OooO00o(strSubstring, C34434OooOoO.f123453OooOo0o);
                return;
            }
            return;
        }
        int iOooO0Oo2 = OooO0Oo(i, i2, str);
        int iOooO0OO2 = OooO0OO(iOooO0Oo2, i2, str);
        if (iOooO0OO2 > iOooO0Oo2) {
            String strSubstring2 = str.substring(iOooO0Oo2, iOooO0OO2);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int iOooO0Oo3 = OooO0Oo(i2 + 1, i3, str);
            String strSubstring3 = str.substring(iOooO0Oo3, OooO0OO(iOooO0Oo3, i3, str));
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            c32197OooOoOO.OooO0O0(strSubstring2, strSubstring3);
        }
    }

    public static InterfaceC32195OooOoO OooO0O0(String query) {
        int i;
        kotlin.jvm.internal.OooOOO0.OooO0oO(query, "query");
        if (C33599OooOo0O.Oooo000(query) < 0) {
            InterfaceC32195OooOoO.f115567OooO0O0.getClass();
            return C32185OooO0oO.f115528OooO0OO;
        }
        InterfaceC32195OooOoO.OooO00o oooO00o = InterfaceC32195OooOoO.f115567OooO0O0;
        C32197OooOoOO c32197OooOoOO = new C32197OooOoOO();
        int iOooo000 = C33599OooOo0O.Oooo000(query);
        int i2 = 0;
        int i3 = -1;
        if (iOooo000 >= 0) {
            int i4 = 0;
            i = 0;
            int i5 = -1;
            while (i2 != 1000) {
                char cCharAt = query.charAt(i4);
                if (cCharAt == '&') {
                    OooO00o(c32197OooOoOO, query, i, i5, i4);
                    i = i4 + 1;
                    i2++;
                    i5 = -1;
                } else if (cCharAt == '=' && i5 == -1) {
                    i5 = i4;
                }
                if (i4 != iOooo000) {
                    i4++;
                } else {
                    i3 = i5;
                }
            }
            return c32197OooOoOO.OooO();
        }
        i = 0;
        if (i2 != 1000) {
            OooO00o(c32197OooOoOO, query, i, i3, query.length());
        }
        return c32197OooOoOO.OooO();
    }

    public static final int OooO0OO(int i, int i2, String str) {
        while (i2 > i && io.ktor.utils.p616io.Oooo000.OooO0o0(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static final int OooO0Oo(int i, int i2, String str) {
        while (i < i2 && io.ktor.utils.p616io.Oooo000.OooO0o0(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
