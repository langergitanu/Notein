package oO0Ooo;

/* JADX INFO: renamed from: oO0Ooo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33331Oooo0o0 extends AbstractC33311OooOOoo {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33339OoooOOO f120591OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33331Oooo0o0(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, C33339OoooOOO attributes) {
        super(abstractC33328Oooo0O0);
        kotlin.jvm.internal.OooOOO0.OooO0oO(attributes, "attributes");
        this.f120591OooOoO0 = attributes;
    }

    @Override // oO0Ooo.AbstractC33309OooOOo, oO0Ooo.AbstractC33320OooOoo
    public final C33339OoooOOO o000000o() {
        return this.f120591OooOoO0;
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33309OooOOo o0000oo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
        return new C33331Oooo0o0(abstractC33328Oooo0O0, this.f120591OooOoO0);
    }
}
