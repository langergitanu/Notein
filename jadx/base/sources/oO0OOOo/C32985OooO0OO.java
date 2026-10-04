package oO0OOOo;

import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0OooO.InterfaceC33454OooO0Oo;

/* JADX INFO: renamed from: oO0OOOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32985OooO0OO implements InterfaceC33454OooO0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f119353OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0O0OO.OooO00o f119354OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0O0OO.OooO00o f119355OooO0OO;

    public C32985OooO0OO(oO0O0OO.OooO00o oooO00o, oO0O0OO.OooO00o oooO00o2, boolean z) {
        this.f119353OooO00o = z;
        this.f119354OooO0O0 = oooO00o;
        this.f119355OooO0OO = oooO00o2;
    }

    @Override // oO0OooO.InterfaceC33454OooO0Oo.OooO00o
    public final boolean OooO00o(InterfaceC33342OoooOo0 c1, InterfaceC33342OoooOo0 c2) {
        oO0O0OO.OooO00o a = this.f119354OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "$a");
        oO0O0OO.OooO00o b = this.f119355OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "$b");
        kotlin.jvm.internal.OooOOO0.OooO0oO(c1, "c1");
        kotlin.jvm.internal.OooOOO0.OooO0oO(c2, "c2");
        if (c1.equals(c2)) {
            return true;
        }
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = c1.OooO0OO();
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO2 = c2.OooO0OO();
        if (!(interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo) || !(interfaceC32598OooO0ooOooO0OO2 instanceof InterfaceC32637OoooOoo)) {
            return false;
        }
        return C32989OooO0oO.f119360OooO00o.OooO0O0((InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO, (InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO2, this.f119353OooO00o, new C32988OooO0o0(a, b));
    }
}
