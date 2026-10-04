package oO0Ooo;

import Oooo0oO.C21091o0000o;
import oO00ooO.C32442OooOO0o;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0OOOO.C32944OooO0Oo;
import oO0OooO.AbstractC33457OooO0oO;
import oO0o000.C33538OooO0OO;

/* JADX INFO: renamed from: oO0Ooo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33312OooOo extends AbstractC33316OooOo0o implements InterfaceC33307OooOOOO {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33312OooOo(AbstractC33328Oooo0O0 lowerBound, AbstractC33328Oooo0O0 upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.OooOOO0.OooO0oO(lowerBound, "lowerBound");
        kotlin.jvm.internal.OooOOO0.OooO0oO(upperBound, "upperBound");
    }

    @Override // oO0Ooo.InterfaceC33307OooOOOO
    public final AbstractC33354o00o0O OoooO(AbstractC33320OooOoo replacement) {
        AbstractC33354o00o0O abstractC33354o00o0OOooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(replacement, "replacement");
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = replacement.o00000OO();
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o) {
            abstractC33354o00o0OOooO0OO = abstractC33354o00o0OO00000OO;
        } else {
            if (!(abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0)) {
                throw new C32442OooOO0o();
            }
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = (AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO;
            abstractC33354o00o0OOooO0OO = C33322OooOooO.OooO0OO(abstractC33328Oooo0O0, abstractC33328Oooo0O0.o00000Oo(true));
        }
        return C21091o0000o.OooOOOO(abstractC33354o00o0OOooO0OO, abstractC33354o00o0OO00000OO);
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o0000, reason: merged with bridge method [inline-methods] */
    public final AbstractC33316OooOo0o o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C33312OooOo((AbstractC33328Oooo0O0) kotlinTypeRefiner.Oooo0o0(this.f120554OooOo), (AbstractC33328Oooo0O0) kotlinTypeRefiner.Oooo0o0(this.f120555OooOoO0));
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o00000Oo(boolean z) {
        return C33322OooOooO.OooO0OO(this.f120554OooOo.o00000Oo(z), this.f120555OooOoO0.o00000Oo(z));
    }

    @Override // oO0Ooo.AbstractC33316OooOo0o
    public final AbstractC33328Oooo0O0 o00000oO() {
        return this.f120554OooOo;
    }

    @Override // oO0Ooo.AbstractC33316OooOo0o
    public final String o00000oo(C32944OooO0Oo c32944OooO0Oo, C32944OooO0Oo c32944OooO0Oo2) {
        boolean zOooOOO = c32944OooO0Oo2.f118975OooO0Oo.OooOOO();
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = this.f120555OooOoO0;
        AbstractC33328Oooo0O0 abstractC33328Oooo0O02 = this.f120554OooOo;
        if (!zOooOOO) {
            return c32944OooO0Oo.OooOooo(c32944OooO0Oo.OoooOOo(abstractC33328Oooo0O02), c32944OooO0Oo.OoooOOo(abstractC33328Oooo0O0), C33538OooO0OO.OooO0o0(this));
        }
        return "(" + c32944OooO0Oo.OoooOOo(abstractC33328Oooo0O02) + ".." + c32944OooO0Oo.OoooOOo(abstractC33328Oooo0O0) + ')';
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return C33322OooOooO.OooO0OO(this.f120554OooOo.o0000Ooo(newAttributes), this.f120555OooOoO0.o0000Ooo(newAttributes));
    }

    @Override // oO0Ooo.InterfaceC33307OooOOOO
    public final boolean o000OOo() {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = this.f120554OooOo;
        return (abstractC33328Oooo0O0.o00000().OooO0OO() instanceof InterfaceC32637OoooOoo) && kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC33328Oooo0O0.o00000(), this.f120555OooOoO0.o00000());
    }

    @Override // oO0Ooo.AbstractC33316OooOo0o
    public final String toString() {
        return "(" + this.f120554OooOo + ".." + this.f120555OooOoO0 + ')';
    }
}
