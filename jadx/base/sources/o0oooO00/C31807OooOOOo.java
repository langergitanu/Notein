package o0oooO00;

import java.io.IOException;
import java.io.InputStream;
import o0ooO0O.InterfaceC31429OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooOO0o.C31610OooO;
import o0ooOO0o.C31611OooO00o;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31676OooO0oo;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0oooO00.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31807OooOOOo implements InterfaceC31429OooO00o, InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31668OooO f113426OooOo0o;

    public C31807OooOOOo(C31448OooOOo c31448OooOOo) {
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112338o000Ooo;
        this.f113426OooOo0o = new C31668OooO(c31448OooOOo);
        c31448OooOOo.o000OooO(C31441OooOO0.f112403o00OO, C31441OooOO0.f112432o00OoOoO.f112461OooOo);
        c31448OooOOo.o000OooO(C31441OooOO0.f112404o00OO0, c31441OooOO0.f112461OooOo);
    }

    @Override // o0ooO0O.InterfaceC31429OooO00o
    public final InputStream OooO00o() throws IOException {
        return this.f113426OooOo0o.f113202OooOo0o.o000o00O();
    }

    public final C31676OooO0oo OooO0O0() {
        C31433OooO00o c31433OooO00o = (C31433OooO00o) this.f113426OooOo0o.f113202OooOo0o.o0000O0O(C31441OooOO0.f112256OoooO);
        if (c31433OooO00o != null) {
            return new C31676OooO0oo(c31433OooO00o);
        }
        return null;
    }

    public final C31610OooO OooO0OO() {
        C31668OooO c31668OooO = this.f113426OooOo0o;
        C31448OooOOo c31448OooOOo = c31668OooO.f113202OooOo0o;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112389o00O0Oo0;
        C31436OooO0Oo c31436OooO0OoOooo0OO = c31448OooOOo.Oooo0OO(c31441OooOO0);
        if (c31436OooO0OoOooo0OO != null) {
            return new C31610OooO(c31436OooO0OoOooo0OO, null);
        }
        if (c31668OooO.f113202OooOo0o.f112222OooOoO0.containsKey(c31441OooOO0)) {
            return new C31610OooO();
        }
        return null;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113426OooOo0o.f113202OooOo0o;
    }

    public C31807OooOOOo(C31611OooO00o c31611OooO00o, C31441OooOO0 c31441OooOO0) {
        C31668OooO c31668OooO = new C31668OooO(c31611OooO00o);
        this.f113426OooOo0o = c31668OooO;
        C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112403o00OO;
        String str = C31441OooOO0.f112432o00OoOoO.f112461OooOo;
        C31448OooOOo c31448OooOOo = c31668OooO.f113202OooOo0o;
        c31448OooOOo.o000OooO(c31441OooOO02, str);
        c31448OooOOo.o000OooO(C31441OooOO0.f112404o00OO0, c31441OooOO0.f112461OooOo);
    }
}
