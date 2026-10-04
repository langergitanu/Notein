package o00OooO;

import o00o0O0O.AbstractC25326OooO0Oo;
import o00o0O0O.C25321OooO00o;

/* JADX INFO: renamed from: o00OooO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25144OooOo0O<Z> implements InterfaceC25145OooOo0o<Z>, C25321OooO00o.InterfaceC25322OooO0Oo {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C25321OooO00o.OooO0OO f85584OooOoOO = C25321OooO00o.OooO00o(20, new OooO00o());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC25145OooOo0o<Z> f85585OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC25326OooO0Oo.OooO00o f85586OooOo0o = new AbstractC25326OooO0Oo.OooO00o();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f85587OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f85588OooOoO0;

    /* JADX INFO: renamed from: o00OooO.OooOo0O$OooO00o */
    public class OooO00o implements C25321OooO00o.OooO0O0<C25144OooOo0O<?>> {
        @Override // o00o0O0O.C25321OooO00o.OooO0O0
        public final C25144OooOo0O<?> create() {
            return new C25144OooOo0O<>();
        }
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<Z> OooO00o() {
        return this.f85585OooOo.OooO00o();
    }

    @Override // o00o0O0O.C25321OooO00o.InterfaceC25322OooO0Oo
    public final AbstractC25326OooO0Oo.OooO00o OooO0O0() {
        return this.f85586OooOo0o;
    }

    public final synchronized void OooO0OO() {
        this.f85586OooOo0o.OooO00o();
        if (!this.f85588OooOoO0) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f85588OooOoO0 = false;
        if (this.f85587OooOoO) {
            recycle();
        }
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Z get() {
        return this.f85585OooOo.get();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        return this.f85585OooOo.getSize();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final synchronized void recycle() {
        this.f85586OooOo0o.OooO00o();
        this.f85587OooOoO = true;
        if (!this.f85588OooOoO0) {
            this.f85585OooOo.recycle();
            this.f85585OooOo = null;
            f85584OooOoOO.release(this);
        }
    }
}
