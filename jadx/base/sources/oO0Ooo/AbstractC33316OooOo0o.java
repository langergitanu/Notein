package oO0Ooo;

import java.util.List;
import oO0OOOO.C32944OooO0Oo;
import oO0o0000.InterfaceC33540OooO0o0;

/* JADX INFO: renamed from: oO0Ooo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33316OooOo0o extends AbstractC33354o00o0O implements InterfaceC33540OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f120554OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f120555OooOoO0;

    public AbstractC33316OooOo0o(AbstractC33328Oooo0O0 lowerBound, AbstractC33328Oooo0O0 upperBound) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lowerBound, "lowerBound");
        kotlin.jvm.internal.OooOOO0.OooO0oO(upperBound, "upperBound");
        this.f120554OooOo = lowerBound;
        this.f120555OooOoO0 = upperBound;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public oO0Oo0o0.OooOO0 OooOOO0() {
        return o00000oO().OooOOO0();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final InterfaceC33342OoooOo0 o00000() {
        return o00000oO().o00000();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final List<InterfaceC33348OooooOO> o000000O() {
        return o00000oO().o000000O();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public C33339OoooOOO o000000o() {
        return o00000oO().o000000o();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public boolean o00000O0() {
        return o00000oO().o00000O0();
    }

    public abstract AbstractC33328Oooo0O0 o00000oO();

    public abstract String o00000oo(C32944OooO0Oo c32944OooO0Oo, C32944OooO0Oo c32944OooO0Oo2);

    public String toString() {
        return oO0OOOO.OooO0OO.f118963OooO0OO.OoooOOo(this);
    }
}
