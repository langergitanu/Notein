package OoooOOo;

import OoooOOo.C21200OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OoooOOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21191OooO0Oo extends AbstractC21194OooO0oO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC21194OooO0oO f61468OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<Object, C32460OooOooO> f61469OooO0o0;

    public C21191OooO0Oo(int i, C21196OooOO0 c21196OooOO0, InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o, AbstractC21194OooO0oO abstractC21194OooO0oO) {
        super(i, c21196OooOO0);
        this.f61469OooO0o0 = interfaceC32507OooOO0o;
        this.f61468OooO0o = abstractC21194OooO0oO;
        abstractC21194OooO0oO.OooOO0O();
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final InterfaceC32507OooOO0o<Object, C32460OooOooO> OooO() {
        return null;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final void OooO0OO() {
        if (this.f61475OooO0OO) {
            return;
        }
        int i = this.f61474OooO0O0;
        AbstractC21194OooO0oO abstractC21194OooO0oO = this.f61468OooO0o;
        if (i != abstractC21194OooO0oO.OooO0Oo()) {
            OooO00o();
        }
        abstractC21194OooO0oO.OooOO0o();
        super.OooO0OO();
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final InterfaceC32507OooOO0o OooO0o() {
        return this.f61469OooO0o0;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final boolean OooO0oO() {
        return true;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final void OooOO0O() {
        C21206OooOo.OooO00o();
        throw null;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final void OooOO0o() {
        C21206OooOo.OooO00o();
        throw null;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final void OooOOO(InterfaceC21222Oooo0O0 interfaceC21222Oooo0O0) {
        C21200OooOOO0.OooO00o oooO00o = C21200OooOOO0.f61494OooO00o;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final void OooOOO0() {
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final AbstractC21194OooO0oO OooOo00(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        return new C21191OooO0Oo(this.f61474OooO0O0, this.f61473OooO00o, C21200OooOOO0.OooOO0o(interfaceC32507OooOO0o, this.f61469OooO0o0, true), this.f61468OooO0o);
    }
}
