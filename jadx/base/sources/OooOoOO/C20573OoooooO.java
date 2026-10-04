package OooOoOO;

import OooOoOO.C20538OooOoO;

/* JADX INFO: renamed from: OooOoOO.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20573OoooooO<T> implements InterfaceC20540OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f58793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f58794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC20539OooOoO0 f58795OooO0OO;

    public C20573OoooooO() {
        this(0, (C20538OooOoO.OooO00o) null, 7);
    }

    @Override // OooOoOO.InterfaceC20526OooOO0o
    public final o00O0O OooO00o(InterfaceC20574Ooooooo converter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(converter, "converter");
        return new C20579o0ooOoO(this.f58793OooO00o, this.f58794OooO0O0, this.f58795OooO0OO);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20573OoooooO) {
            C20573OoooooO c20573OoooooO = (C20573OoooooO) obj;
            if (c20573OoooooO.f58793OooO00o == this.f58793OooO00o && c20573OoooooO.f58794OooO0O0 == this.f58794OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(c20573OoooooO.f58795OooO0OO, this.f58795OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f58795OooO0OO.hashCode() + (this.f58793OooO00o * 31)) * 31) + this.f58794OooO0O0;
    }

    public C20573OoooooO(int i, C20538OooOoO.OooO00o oooO00o, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? C20538OooOoO.f58665OooO00o : oooO00o);
    }

    public C20573OoooooO(int i, int i2, InterfaceC20539OooOoO0 easing) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(easing, "easing");
        this.f58793OooO00o = i;
        this.f58794OooO0O0 = i2;
        this.f58795OooO0OO = easing;
    }
}
