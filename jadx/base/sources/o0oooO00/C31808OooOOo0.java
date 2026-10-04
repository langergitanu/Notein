package o0oooO00;

import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0oooO00.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31808OooOOo0 implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113427OooOo0o;

    public C31808OooOOo0(C31436OooO0Oo c31436OooO0Oo) {
        this.f113427OooOo0o = c31436OooO0Oo;
    }

    public final float OooO00o() {
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112452oOooo0o;
        C31436OooO0Oo c31436OooO0Oo = this.f113427OooOo0o;
        if (c31436OooO0Oo.o0000O0O(c31441OooOO0) instanceof C31441OooOO0) {
            return 0.0f;
        }
        return c31436OooO0Oo.o0000ooO(c31441OooOO0, 1.0f);
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113427OooOo0o;
    }
}
