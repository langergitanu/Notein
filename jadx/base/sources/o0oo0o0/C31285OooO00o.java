package o0oo0o0;

import java.io.IOException;
import o0oo0o00.AbstractC31298OooOO0o;
import o0oo0o00.AbstractC31304OooOOo0;
import o0oo0o00.C31303OooOOo;
import o0oo0o00.C31305OooOOoo;

/* JADX INFO: renamed from: o0oo0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31285OooO00o<T> extends AbstractC31298OooOO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC31298OooOO0o<T> f111705OooO00o;

    public C31285OooO00o(AbstractC31298OooOO0o<T> abstractC31298OooOO0o) {
        this.f111705OooO00o = abstractC31298OooOO0o;
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
        if (c31303OooOOo.o000O00O() != AbstractC31304OooOOo0.OooO0O0.f111761OooOooo) {
            return this.f111705OooO00o.OooO00o(c31303OooOOo);
        }
        c31303OooOOo.o0000O();
        return null;
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
        if (obj == null) {
            c31305OooOOoo.ooOO();
        } else {
            this.f111705OooO00o.OooO0OO(c31305OooOOoo, obj);
        }
    }

    public final String toString() {
        return this.f111705OooO00o + ".nullSafe()";
    }
}
