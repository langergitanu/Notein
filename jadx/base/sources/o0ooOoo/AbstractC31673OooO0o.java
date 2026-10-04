package o0ooOoo;

import java.io.IOException;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooOO0o.C31619OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0ooOoo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31673OooO0o<T extends InterfaceC31671OooO0OO> implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113210OooOo0o;

    public AbstractC31673OooO0o() {
        this.f113210OooOo0o = new C31436OooO0Oo();
    }

    public abstract T OooO00o(AbstractC31434OooO0O0 abstractC31434OooO0O0) throws IOException;

    public abstract C31619OooOO0 OooO0O0(C31436OooO0Oo c31436OooO0Oo);

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113210OooOo0o;
    }

    public AbstractC31673OooO0o(C31436OooO0Oo c31436OooO0Oo) {
        this.f113210OooOo0o = c31436OooO0Oo;
    }
}
