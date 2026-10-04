package Oooo0;

import Oooo0O0.C20932OooOooo;
import o00000.C24045OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0.o0000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20867o0000OOo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C20932OooOooo, o00000.OooO0o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C20867o0000OOo f60034OooOo0o = new C20867o0000OOo(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final o00000.OooO0o invoke(C20932OooOooo c20932OooOooo) {
        C20932OooOooo deleteIfSelectedOr = c20932OooOooo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        String str = deleteIfSelectedOr.f60306OooO0oO.f124887OooOo0o;
        long j = deleteIfSelectedOr.f60304OooO0o;
        int i = C34696OooOOoo.f124979OooO0OO;
        int iOooO00o = o000000O.OooO00o((int) (j & 4294967295L), str);
        if (iOooO00o != -1) {
            return new C24045OooO0Oo(0, iOooO00o - ((int) (deleteIfSelectedOr.f60304OooO0o & 4294967295L)));
        }
        return null;
    }
}
