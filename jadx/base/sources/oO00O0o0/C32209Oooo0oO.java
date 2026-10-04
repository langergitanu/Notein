package oO00O0o0;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import oO0O0oo0.AbstractC32796OooOOOO;
import oO0Oo0o0.C33216OooO0Oo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO00O0o0.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32209Oooo0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f115590OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f115591OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32209Oooo0oO(Object obj, int i) {
        super(0);
        this.f115591OooOo0o = i;
        this.f115590OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f115590OooOo;
        switch (this.f115591OooOo0o) {
            case 0:
                C32211OoooO0 c32211OoooO0 = (C32211OoooO0) obj;
                if (!c32211OoooO0.f115597OooO0Oo.isEmpty()) {
                    int length = c32211OoooO0.f115594OooO00o.f115583OooO00o.length() + 3;
                    String str = c32211OoooO0.f115593OooO;
                    int iOooo0 = C33599OooOo0O.Oooo0(str, IOUtils.DIR_SEPARATOR_UNIX, length, 4);
                    if (iOooo0 != -1) {
                        int iOooo0OO = C33599OooOo0O.Oooo0OO(str, new char[]{'?', '#'}, iOooo0, false);
                        if (iOooo0OO == -1) {
                            String strSubstring = str.substring(iOooo0);
                            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                            return strSubstring;
                        }
                        String strSubstring2 = str.substring(iOooo0, iOooo0OO);
                        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        return strSubstring2;
                    }
                }
                return "";
            default:
                return ((AbstractC32796OooOOOO) obj).OooO(C33216OooO0Oo.f120203OooOOOo, null);
        }
    }
}
