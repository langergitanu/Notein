package Oooo0;

import o00oO0O.C25503OooOoOO;
import oO00O0o0.C32211OoooO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59810OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59811OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooOOO(Object obj, int i) {
        super(0);
        this.f59811OooOo0o = i;
        this.f59810OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f59811OooOo0o) {
            case 0:
                return ((C25503OooOoOO.OooO00o) this.f59810OooOo).invoke();
            default:
                C32211OoooO0 c32211OoooO0 = (C32211OoooO0) this.f59810OooOo;
                int iOooo0 = C33599OooOo0O.Oooo0(c32211OoooO0.f115593OooO, '#', 0, 6) + 1;
                if (iOooo0 == 0) {
                    return "";
                }
                String strSubstring = c32211OoooO0.f115593OooO.substring(iOooo0);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
        }
    }
}
