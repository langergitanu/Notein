package oO00O0o0;

import oO0O0oo0.AbstractC32796OooOOOO;
import oO0Oo0o0.C33216OooO0Oo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO00O0o0.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32212OoooO00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f115607OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f115608OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32212OoooO00(Object obj, int i) {
        super(0);
        this.f115608OooOo0o = i;
        this.f115607OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f115607OooOo;
        switch (this.f115608OooOo0o) {
            case 0:
                C32211OoooO0 c32211OoooO0 = (C32211OoooO0) obj;
                String str = c32211OoooO0.f115598OooO0o;
                if (str == null) {
                    return null;
                }
                if (str.length() == 0) {
                    return "";
                }
                int length = c32211OoooO0.f115594OooO00o.f115583OooO00o.length() + 3;
                String str2 = c32211OoooO0.f115593OooO;
                String strSubstring = str2.substring(length, C33599OooOo0O.Oooo0OO(str2, new char[]{':', '@'}, length, false));
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            default:
                return ((AbstractC32796OooOOOO) obj).OooOOOO(C33216OooO0Oo.f120205OooOOo0);
        }
    }
}
