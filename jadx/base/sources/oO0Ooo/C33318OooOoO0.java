package oO0Ooo;

import Oooo0oO.C21091o0000o;
import oO0OOOO.C32944OooO0Oo;
import oO0OooO.AbstractC33457OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33318OooOoO0 extends AbstractC33316OooOo0o implements o00Ooo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC33316OooOo0o f120559OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC33320OooOoo f120560OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33318OooOoO0(AbstractC33316OooOo0o origin, AbstractC33320OooOoo enhancement) {
        super(origin.f120554OooOo, origin.f120555OooOoO0);
        kotlin.jvm.internal.OooOOO0.OooO0oO(origin, "origin");
        kotlin.jvm.internal.OooOOO0.OooO0oO(enhancement, "enhancement");
        this.f120559OooOoO = origin;
        this.f120560OooOoOO = enhancement;
    }

    @Override // oO0Ooo.o00Ooo
    public final AbstractC33354o00o0O getOrigin() {
        return this.f120559OooOoO;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final AbstractC33320OooOoo o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C33318OooOoO0((AbstractC33316OooOo0o) kotlinTypeRefiner.Oooo0o0(this.f120559OooOoO), kotlinTypeRefiner.Oooo0o0(this.f120560OooOoOO));
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o00000Oo(boolean z) {
        return C21091o0000o.OooOOo(this.f120559OooOoO.o00000Oo(z), this.f120560OooOoOO.o00000OO().o00000Oo(z));
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o00000o0 */
    public final AbstractC33354o00o0O o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C33318OooOoO0((AbstractC33316OooOo0o) kotlinTypeRefiner.Oooo0o0(this.f120559OooOoO), kotlinTypeRefiner.Oooo0o0(this.f120560OooOoOO));
    }

    @Override // oO0Ooo.AbstractC33316OooOo0o
    public final AbstractC33328Oooo0O0 o00000oO() {
        return this.f120559OooOoO.o00000oO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0Ooo.AbstractC33316OooOo0o
    public final String o00000oo(C32944OooO0Oo c32944OooO0Oo, C32944OooO0Oo c32944OooO0Oo2) {
        oO0OOOO.OooOO0O oooOO0O = c32944OooO0Oo2.f118975OooO0Oo;
        oooOO0O.getClass();
        return ((Boolean) oooOO0O.f118999OooOOO0.getValue(oooOO0O, oO0OOOO.OooOO0O.f118985OoooOOO[11])).booleanValue() ? c32944OooO0Oo.OoooOOo(this.f120560OooOoOO) : this.f120559OooOoO.o00000oo(c32944OooO0Oo, c32944OooO0Oo2);
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return C21091o0000o.OooOOo(this.f120559OooOoO.o0000Ooo(newAttributes), this.f120560OooOoOO);
    }

    @Override // oO0Ooo.o00Ooo
    public final AbstractC33320OooOoo o0OoOo0() {
        return this.f120560OooOoOO;
    }

    @Override // oO0Ooo.AbstractC33316OooOo0o
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f120560OooOoOO + ")] " + this.f120559OooOoO;
    }
}
