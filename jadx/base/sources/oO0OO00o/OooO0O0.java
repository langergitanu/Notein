package oO0OO00o;

import oO00o.InterfaceC32315OooO0O0;
import oO00oOOo.EnumC32427OooO0O0;
import oO00oOo0.C32430OooO00o;
import oOo00ooO.InterfaceC34572OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0O0<T, R> implements InterfaceC32315OooO0O0<T>, InterfaceC34572OooO0Oo<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oOO00OOO.OooO0OO f118546OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32315OooO0O0 f118547OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f118548OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC34572OooO0Oo<T> f118549OooOoO0;

    public OooO0O0(InterfaceC32315OooO0O0 interfaceC32315OooO0O0) {
        this.f118547OooOo0o = interfaceC32315OooO0O0;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        if (EnumC32427OooO0O0.OooO0Oo(this.f118546OooOo, oooO0OO)) {
            this.f118546OooOo = oooO0OO;
            if (oooO0OO instanceof InterfaceC34572OooO0Oo) {
                this.f118549OooOoO0 = (InterfaceC34572OooO0Oo) oooO0OO;
            }
            this.f118547OooOo0o.OooO0Oo(this);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        this.f118546OooOo.cancel();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final void clear() {
        this.f118549OooOoO0.clear();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean isEmpty() {
        return this.f118549OooOoO0.isEmpty();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oOO00OOO.OooO0O0
    public final void onComplete() {
        if (this.f118548OooOoO) {
            return;
        }
        this.f118548OooOoO = true;
        this.f118547OooOo0o.onComplete();
    }

    @Override // oOO00OOO.OooO0O0
    public final void onError(Throwable th) {
        if (this.f118548OooOoO) {
            C32430OooO00o.OooO00o(th);
        } else {
            this.f118548OooOoO = true;
            this.f118547OooOo0o.onError(th);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        this.f118546OooOo.request(j);
    }
}
