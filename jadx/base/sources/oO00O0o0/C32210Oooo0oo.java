package oO00O0o0;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO00O0o0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32210Oooo0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<String> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32211OoooO0 f115592OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32210Oooo0oo(C32211OoooO0 c32211OoooO0) {
        super(0);
        this.f115592OooOo0o = c32211OoooO0;
    }

    @Override // oO0O000o.OooO00o
    public final String invoke() {
        C32211OoooO0 c32211OoooO0 = this.f115592OooOo0o;
        int iOooo0 = C33599OooOo0O.Oooo0(c32211OoooO0.f115593OooO, IOUtils.DIR_SEPARATOR_UNIX, c32211OoooO0.f115594OooO00o.f115583OooO00o.length() + 3, 4);
        if (iOooo0 == -1) {
            return "";
        }
        String str = c32211OoooO0.f115593OooO;
        int iOooo02 = C33599OooOo0O.Oooo0(str, '#', iOooo0, 4);
        if (iOooo02 == -1) {
            String strSubstring = str.substring(iOooo0);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        String strSubstring2 = str.substring(iOooo0, iOooo02);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring2;
    }
}
