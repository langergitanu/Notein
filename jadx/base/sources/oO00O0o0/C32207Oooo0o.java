package oO00O0o0;

import oO0O0oo0.AbstractC32796OooOOOO;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO00O0o0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32207Oooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f115588OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f115589OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32207Oooo0o(Object obj, int i) {
        super(0);
        this.f115589OooOo0o = i;
        this.f115588OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f115589OooOo0o) {
            case 0:
                C32211OoooO0 c32211OoooO0 = (C32211OoooO0) this.f115588OooOo;
                String str = c32211OoooO0.f115600OooO0oO;
                if (str == null) {
                    return null;
                }
                if (str.length() == 0) {
                    return "";
                }
                int length = c32211OoooO0.f115594OooO00o.f115583OooO00o.length() + 3;
                String str2 = c32211OoooO0.f115593OooO;
                String strSubstring = str2.substring(C33599OooOo0O.Oooo0(str2, ':', length, 4) + 1, C33599OooOo0O.Oooo0(str2, '@', 0, 6));
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            default:
                return ((AbstractC32796OooOOOO) this.f115588OooOo).OooOO0O();
        }
    }
}
