package oO0OO00o;

import oO00oOOo.EnumC32427OooO0O0;
import oO00oOo0.C32430OooO00o;
import oOo00ooO.InterfaceC34569OooO00o;
import oOo00ooO.InterfaceC34572OooO0Oo;

/* JADX INFO: renamed from: oO0OO00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32901OooO00o<T, R> implements InterfaceC34569OooO00o<T>, InterfaceC34572OooO0Oo<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oOO00OOO.OooO0OO f118542OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34569OooO00o<? super R> f118543OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f118544OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC34572OooO0Oo<T> f118545OooOoO0;

    public AbstractC32901OooO00o(InterfaceC34569OooO00o<? super R> interfaceC34569OooO00o) {
        this.f118543OooOo0o = interfaceC34569OooO00o;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        if (EnumC32427OooO0O0.OooO0Oo(this.f118542OooOo, oooO0OO)) {
            this.f118542OooOo = oooO0OO;
            if (oooO0OO instanceof InterfaceC34572OooO0Oo) {
                this.f118545OooOoO0 = (InterfaceC34572OooO0Oo) oooO0OO;
            }
            this.f118543OooOo0o.OooO0Oo(this);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        this.f118542OooOo.cancel();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final void clear() {
        this.f118545OooOoO0.clear();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean isEmpty() {
        return this.f118545OooOoO0.isEmpty();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oOO00OOO.OooO0O0
    public final void onComplete() {
        if (this.f118544OooOoO) {
            return;
        }
        this.f118544OooOoO = true;
        this.f118543OooOo0o.onComplete();
    }

    @Override // oOO00OOO.OooO0O0
    public final void onError(Throwable th) {
        if (this.f118544OooOoO) {
            C32430OooO00o.OooO00o(th);
        } else {
            this.f118544OooOoO = true;
            this.f118543OooOo0o.onError(th);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        this.f118542OooOo.request(j);
    }
}
