package oO00o0o;

import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO00o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32372OooO0O0<T, R> implements InterfaceC33493OooO0oo<T>, InterfaceC33029OooO0oO<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oOO00OOO.OooO0OO f116390OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33493OooO0oo f116391OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f116392OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC33029OooO0oO<T> f116393OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f116394OooOoOO;

    public AbstractC32372OooO0O0(InterfaceC33493OooO0oo interfaceC33493OooO0oo) {
        this.f116391OooOo0o = interfaceC33493OooO0oo;
    }

    @Override // oO0OOOoo.InterfaceC33027OooO0o
    public int OooO0O0(int i) {
        InterfaceC33029OooO0oO<T> interfaceC33029OooO0oO = this.f116393OooOoO0;
        if (interfaceC33029OooO0oO == null || (i & 4) != 0) {
            return 0;
        }
        int iOooO0O0 = interfaceC33029OooO0oO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return iOooO0O0;
        }
        this.f116394OooOoOO = iOooO0O0;
        return iOooO0O0;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        if (EnumC33007OooO0oO.OooO0Oo(this.f116390OooOo, oooO0OO)) {
            this.f116390OooOo = oooO0OO;
            if (oooO0OO instanceof InterfaceC33029OooO0oO) {
                this.f116393OooOoO0 = (InterfaceC33029OooO0oO) oooO0OO;
            }
            this.f116391OooOo0o.OooO0Oo(this);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        this.f116390OooOo.cancel();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
        this.f116393OooOoO0.clear();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return this.f116393OooOoO0.isEmpty();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oOO00OOO.OooO0O0
    public void onComplete() {
        if (this.f116392OooOoO) {
            return;
        }
        this.f116392OooOoO = true;
        this.f116391OooOo0o.onComplete();
    }

    @Override // oOO00OOO.OooO0O0
    public void onError(Throwable th) {
        if (this.f116392OooOoO) {
            oO0OOO0O.OooO00o.OooO0O0(th);
        } else {
            this.f116392OooOoO = true;
            this.f116391OooOo0o.onError(th);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        this.f116390OooOo.request(j);
    }
}
