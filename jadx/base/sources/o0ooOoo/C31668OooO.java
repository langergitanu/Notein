package o0ooOoo;

import java.io.IOException;
import java.io.InputStream;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31440OooO0oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31447OooOOOo;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0o.C31455OooO00o;
import o0ooOO0o.C31611OooO00o;

/* JADX INFO: renamed from: o0ooOoo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31668OooO implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31448OooOOo f113202OooOo0o;

    public C31668OooO(C31611OooO00o c31611OooO00o) {
        this.f113202OooOo0o = c31611OooO00o.f113008OooOo0o.OooOooo();
    }

    public final byte[] OooO00o() throws Throwable {
        Throwable th;
        C31440OooO0oo c31440OooO0ooO000o00O;
        try {
            c31440OooO0ooO000o00O = this.f113202OooOo0o.o000o00O();
        } catch (Throwable th2) {
            th = th2;
            c31440OooO0ooO000o00O = null;
        }
        try {
            byte[] bArrOooO0Oo = C31455OooO00o.OooO0Oo(c31440OooO0ooO000o00O);
            c31440OooO0ooO000o00O.close();
            return bArrOooO0Oo;
        } catch (Throwable th3) {
            th = th3;
            if (c31440OooO0ooO000o00O != null) {
                c31440OooO0ooO000o00O.close();
            }
            throw th;
        }
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113202OooOo0o;
    }

    public C31668OooO(C31448OooOOo c31448OooOOo) {
        this.f113202OooOo0o = c31448OooOOo;
    }

    public C31668OooO(C31611OooO00o c31611OooO00o, InputStream inputStream, C31441OooOO0 c31441OooOO0) throws IOException {
        C31447OooOOOo c31447OooOOOoO000o00o = null;
        try {
            C31448OooOOo c31448OooOOoOooOooo = c31611OooO00o.f113008OooOo0o.OooOooo();
            this.f113202OooOo0o = c31448OooOOoOooOooo;
            c31447OooOOOoO000o00o = c31448OooOOoOooOooo.o000o00o(c31441OooOO0);
            C31455OooO00o.OooO0OO(inputStream, c31447OooOOOoO000o00o);
            c31447OooOOOoO000o00o.close();
            inputStream.close();
        } catch (Throwable th) {
            if (c31447OooOOOoO000o00o != null) {
                c31447OooOOOoO000o00o.close();
            }
            inputStream.close();
            throw th;
        }
    }
}
