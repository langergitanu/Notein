package Oooo0oO;

import OoooOOo.AbstractC21223Oooo0OO;
import OoooOOo.AbstractC21225Oooo0o0;
import OoooOOo.C21200OooOOO0;
import OoooOOo.InterfaceC21208OooOo00;

/* JADX INFO: renamed from: Oooo0oO.o0000oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21097o0000oOO extends AbstractC21223Oooo0OO implements o00Ooo, InterfaceC21208OooOo00<Double> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO00o f61201OooOo;

    /* JADX INFO: renamed from: Oooo0oO.o0000oOO$OooO00o */
    public static final class OooO00o extends AbstractC21225Oooo0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public double f61202OooO0OO;

        public OooO00o(double d) {
            this.f61202OooO0OO = d;
        }

        @Override // OoooOOo.AbstractC21225Oooo0o0
        public final void OooO00o(AbstractC21225Oooo0o0 abstractC21225Oooo0o0) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC21225Oooo0o0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.f61202OooO0OO = ((OooO00o) abstractC21225Oooo0o0).f61202OooO0OO;
        }

        @Override // OoooOOo.AbstractC21225Oooo0o0
        public final AbstractC21225Oooo0o0 OooO0O0() {
            return new OooO00o(this.f61202OooO0OO);
        }
    }

    @Override // OoooOOo.InterfaceC21208OooOo00
    public final o000O000<Double> OooO00o() {
        return o000O0O0.f61218OooO00o;
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final void OooO0Oo(AbstractC21225Oooo0o0 abstractC21225Oooo0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC21225Oooo0o0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f61201OooOo = (OooO00o) abstractC21225Oooo0o0;
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final AbstractC21225Oooo0o0 OooO0o(AbstractC21225Oooo0o0 abstractC21225Oooo0o0, AbstractC21225Oooo0o0 abstractC21225Oooo0o02, AbstractC21225Oooo0o0 abstractC21225Oooo0o03) {
        if (((OooO00o) abstractC21225Oooo0o02).f61202OooO0OO == ((OooO00o) abstractC21225Oooo0o03).f61202OooO0OO) {
            return abstractC21225Oooo0o02;
        }
        return null;
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final AbstractC21225Oooo0o0 OooO0o0() {
        return this.f61201OooOo;
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((OooO00o) C21200OooOOO0.OooO(this.f61201OooOo)).f61202OooO0OO + ")@" + hashCode();
    }
}
