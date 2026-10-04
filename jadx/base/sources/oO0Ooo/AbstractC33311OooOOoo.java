package oO0Ooo;

/* JADX INFO: renamed from: oO0Ooo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33311OooOOoo extends AbstractC33309OooOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f120549OooOo;

    public AbstractC33311OooOOoo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
        this.f120549OooOo = abstractC33328Oooo0O0;
    }

    @Override // oO0Ooo.AbstractC33309OooOOo
    public final AbstractC33328Oooo0O0 o0000() {
        return this.f120549OooOo;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oO */
    public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
        return z == o00000O0() ? this : this.f120549OooOo.o00000Oo(z).o0000Ooo(o000000o());
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return newAttributes != o000000o() ? new C33331Oooo0o0(this, newAttributes) : this;
    }
}
