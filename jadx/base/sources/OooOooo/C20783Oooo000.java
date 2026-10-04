package OooOooo;

import Oooo0oO.o0Oo0oo;
import o0000Ooo.C24227OooO00o;
import o00oO0O.AbstractC25516Oooo0OO;
import oo000o.InterfaceC34630OooOO0;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooOooo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20783Oooo000 implements InterfaceC20777OooOoo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C20783Oooo000 f59679OooOo0o = new C20783Oooo000();

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooOOoo(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        return measurable.OooooOO(i);
    }

    @Override // OooOooo.InterfaceC20777OooOoo
    public final long Oooo00O(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O measurable, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        int iOooooOO = measurable.OooooOO(C24227OooO00o.OooO0oO(j));
        if (iOooooOO >= 0) {
            return C24227OooO00o.C19607OooO00o.OooO0O0(iOooooOO, iOooooOO, 0, Integer.MAX_VALUE);
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(iOooooOO, "width(", ") must be >= 0").toString());
    }
}
