package oO0Ooo;

import Oooo0oO.C21091o0000o;
import oO0OooO.AbstractC33457OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33330Oooo0o extends AbstractC33309OooOOo implements o00Ooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f120589OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AbstractC33320OooOoo f120590OooOoO0;

    public C33330Oooo0o(AbstractC33328Oooo0O0 delegate, AbstractC33320OooOoo enhancement) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
        kotlin.jvm.internal.OooOOO0.OooO0oO(enhancement, "enhancement");
        this.f120589OooOo = delegate;
        this.f120590OooOoO0 = enhancement;
    }

    @Override // oO0Ooo.o00Ooo
    public final AbstractC33354o00o0O getOrigin() {
        return this.f120589OooOo;
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33328Oooo0O0 o0000() {
        return this.f120589OooOo;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oO */
    public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
        AbstractC33354o00o0O abstractC33354o00o0OOooOOo = C21091o0000o.OooOOo(this.f120589OooOo.o00000Oo(z), this.f120590OooOoO0.o00000OO().o00000Oo(z));
        kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC33354o00o0OOooOOo, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC33328Oooo0O0) abstractC33354o00o0OOooOOo;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        AbstractC33354o00o0O abstractC33354o00o0OOooOOo = C21091o0000o.OooOOo(this.f120589OooOo.o0000Ooo(newAttributes), this.f120590OooOoO0);
        kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC33354o00o0OOooOOo, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC33328Oooo0O0) abstractC33354o00o0OOooOOo;
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    /* JADX INFO: renamed from: o0000oO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C33330Oooo0o o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C33330Oooo0o((AbstractC33328Oooo0O0) kotlinTypeRefiner.Oooo0o0(this.f120589OooOo), kotlinTypeRefiner.Oooo0o0(this.f120590OooOoO0));
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33309OooOOo o0000oo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
        return new C33330Oooo0o(abstractC33328Oooo0O0, this.f120590OooOoO0);
    }

    @Override // oO0Ooo.o00Ooo
    public final AbstractC33320OooOoo o0OoOo0() {
        return this.f120590OooOoO0;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f120590OooOoO0 + ")] " + this.f120589OooOo;
    }
}
