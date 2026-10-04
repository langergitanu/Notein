package oO0O0ooo;

import Oooo0oO.C21091o0000o;
import oO0Ooo.AbstractC33309OooOOo;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.InterfaceC33307OooOOOO;
import oO0Ooo.o00Oo0;

/* JADX INFO: renamed from: oO0O0ooo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32848OooOO0 extends AbstractC33309OooOOo implements InterfaceC33307OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f117909OooOo;

    public C32848OooOO0(AbstractC33328Oooo0O0 delegate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
        this.f117909OooOo = delegate;
    }

    @Override // oO0Ooo.InterfaceC33307OooOOOO
    public final AbstractC33354o00o0O OoooO(AbstractC33320OooOoo replacement) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(replacement, "replacement");
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = replacement.o00000OO();
        if (!o00Oo0.OooO0oO(abstractC33354o00o0OO00000OO) && !o00Oo0.OooO0o(abstractC33354o00o0OO00000OO)) {
            return abstractC33354o00o0OO00000OO;
        }
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0) {
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = (AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO;
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0O00000Oo = abstractC33328Oooo0O0.o00000Oo(false);
            return !o00Oo0.OooO0oO(abstractC33328Oooo0O0) ? abstractC33328Oooo0O0O00000Oo : new C32848OooOO0(abstractC33328Oooo0O0O00000Oo);
        }
        if (!(abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o)) {
            throw new IllegalStateException(("Incorrect type: " + abstractC33354o00o0OO00000OO).toString());
        }
        AbstractC33316OooOo0o abstractC33316OooOo0o = (AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO;
        AbstractC33328Oooo0O0 abstractC33328Oooo0O02 = abstractC33316OooOo0o.f120554OooOo;
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0O00000Oo2 = abstractC33328Oooo0O02.o00000Oo(false);
        if (o00Oo0.OooO0oO(abstractC33328Oooo0O02)) {
            abstractC33328Oooo0O0O00000Oo2 = new C32848OooOO0(abstractC33328Oooo0O0O00000Oo2);
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O03 = abstractC33316OooOo0o.f120555OooOoO0;
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0O00000Oo3 = abstractC33328Oooo0O03.o00000Oo(false);
        if (o00Oo0.OooO0oO(abstractC33328Oooo0O03)) {
            abstractC33328Oooo0O0O00000Oo3 = new C32848OooOO0(abstractC33328Oooo0O0O00000Oo3);
        }
        return C21091o0000o.OooOOo(C33322OooOooO.OooO0OO(abstractC33328Oooo0O0O00000Oo2, abstractC33328Oooo0O0O00000Oo3), C21091o0000o.OooOOO(abstractC33354o00o0OO00000OO));
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33328Oooo0O0 o0000() {
        return this.f117909OooOo;
    }

    @Override // oO0Ooo.AbstractC33309OooOOo, oO0Ooo.AbstractC33320OooOoo
    public final boolean o00000O0() {
        return false;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oO */
    public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
        return z ? this.f117909OooOo.o00000Oo(true) : this;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return new C32848OooOO0(this.f117909OooOo.o0000Ooo(newAttributes));
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0, oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return new C32848OooOO0(this.f117909OooOo.o0000Ooo(newAttributes));
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33309OooOOo o0000oo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
        return new C32848OooOO0(abstractC33328Oooo0O0);
    }

    @Override // oO0Ooo.InterfaceC33307OooOOOO
    public final boolean o000OOo() {
        return true;
    }
}
