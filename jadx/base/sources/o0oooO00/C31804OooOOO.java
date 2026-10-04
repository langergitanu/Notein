package o0oooO00;

import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0oooO00.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31804OooOOO implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113423OooOo0o;

    public C31804OooOOO() {
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        this.f113423OooOo0o = c31436OooO0Oo;
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112357o000oo0, new C31436OooO0Oo());
    }

    public final C31806OooOOOO OooO00o() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113423OooOo0o.o0000O0O(C31441OooOO0.f112357o000oo0);
        if (!(abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo)) {
            return null;
        }
        C31806OooOOOO c31806OooOOOO = new C31806OooOOOO();
        c31806OooOOOO.f113425OooOo0o = (C31436OooO0Oo) abstractC31434OooO0O0O0000O0O;
        return c31806OooOOOO;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113423OooOo0o;
    }

    public C31804OooOOO(C31436OooO0Oo c31436OooO0Oo) {
        this.f113423OooOo0o = c31436OooO0Oo;
    }
}
