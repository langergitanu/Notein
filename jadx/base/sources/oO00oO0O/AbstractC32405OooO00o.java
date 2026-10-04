package oO00oO0O;

import oO00o.InterfaceC32319OooO0o0;
import oO00oO0.EnumC32397OooO0O0;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oOo00ooO.InterfaceC34570OooO0O0;

/* JADX INFO: renamed from: oO00oO0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32405OooO00o<T, R> implements InterfaceC32319OooO0o0<T>, InterfaceC34570OooO0O0<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC32925OooO0O0 f116506OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32319OooO0o0<? super R> f116507OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f116508OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC34570OooO0O0<T> f116509OooOoO0;

    public AbstractC32405OooO00o(InterfaceC32319OooO0o0<? super R> interfaceC32319OooO0o0) {
        this.f116507OooOo0o = interfaceC32319OooO0o0;
    }

    @Override // oO00o.InterfaceC32319OooO0o0
    public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        if (EnumC32397OooO0O0.OooO0Oo(this.f116506OooOo, interfaceC32925OooO0O0)) {
            this.f116506OooOo = interfaceC32925OooO0O0;
            if (interfaceC32925OooO0O0 instanceof InterfaceC34570OooO0O0) {
                this.f116509OooOoO0 = (InterfaceC34570OooO0O0) interfaceC32925OooO0O0;
            }
            this.f116507OooOo0o.OooO00o(this);
        }
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final void clear() {
        this.f116509OooOoO0.clear();
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        this.f116506OooOo.dispose();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean isEmpty() {
        return this.f116509OooOoO0.isEmpty();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oO00o.InterfaceC32319OooO0o0
    public final void onComplete() {
        if (this.f116508OooOoO) {
            return;
        }
        this.f116508OooOoO = true;
        this.f116507OooOo0o.onComplete();
    }

    @Override // oO00o.InterfaceC32319OooO0o0
    public final void onError(Throwable th) {
        if (this.f116508OooOoO) {
            C32430OooO00o.OooO00o(th);
        } else {
            this.f116508OooOoO = true;
            this.f116507OooOo0o.onError(th);
        }
    }
}
