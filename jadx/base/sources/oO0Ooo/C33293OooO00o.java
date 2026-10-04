package oO0Ooo;

import oO0OooO.AbstractC33457OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33293OooO00o extends AbstractC33309OooOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f120520OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f120521OooOoO0;

    public C33293OooO00o(AbstractC33328Oooo0O0 delegate, AbstractC33328Oooo0O0 abbreviation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
        kotlin.jvm.internal.OooOOO0.OooO0oO(abbreviation, "abbreviation");
        this.f120520OooOo = delegate;
        this.f120521OooOoO0 = abbreviation;
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33328Oooo0O0 o0000() {
        return this.f120520OooOo;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return new C33293OooO00o(this.f120520OooOo.o0000Ooo(newAttributes), this.f120521OooOoO0);
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    /* JADX INFO: renamed from: o0000O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C33293OooO00o o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C33293OooO00o((AbstractC33328Oooo0O0) kotlinTypeRefiner.Oooo0o0(this.f120520OooOo), (AbstractC33328Oooo0O0) kotlinTypeRefiner.Oooo0o0(this.f120521OooOoO0));
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o0000oO, reason: merged with bridge method [inline-methods] */
    public final C33293OooO00o o00000Oo(boolean z) {
        return new C33293OooO00o(this.f120520OooOo.o00000Oo(z), this.f120521OooOoO0.o00000Oo(z));
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33309OooOOo o0000oo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
        return new C33293OooO00o(abstractC33328Oooo0O0, this.f120521OooOoO0);
    }
}
