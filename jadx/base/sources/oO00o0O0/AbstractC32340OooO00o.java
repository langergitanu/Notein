package oO00o0O0;

import oO0OOOoo.InterfaceC33028OooO0o0;
import oO0OooOO.InterfaceC33499OooOOOO;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32340OooO00o<T, R> implements InterfaceC33499OooOOOO<T>, InterfaceC33028OooO0o0<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oO0OOO00.OooO0O0 f116283OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33499OooOOOO<? super R> f116284OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f116285OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC33028OooO0o0<T> f116286OooOoO0;

    public AbstractC32340OooO00o(InterfaceC33499OooOOOO<? super R> interfaceC33499OooOOOO) {
        this.f116284OooOo0o = interfaceC33499OooOOOO;
    }

    @Override // oO0OooOO.InterfaceC33499OooOOOO
    public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
        if (EnumC35109OooO0O0.OooO0o0(this.f116283OooOo, oooO0O0)) {
            this.f116283OooOo = oooO0O0;
            if (oooO0O0 instanceof InterfaceC33028OooO0o0) {
                this.f116286OooOoO0 = (InterfaceC33028OooO0o0) oooO0O0;
            }
            this.f116284OooOo0o.OooO00o(this);
        }
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
        this.f116286OooOoO0.clear();
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        this.f116283OooOo.dispose();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return this.f116286OooOoO0.isEmpty();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oO0OooOO.InterfaceC33499OooOOOO
    public final void onComplete() {
        if (this.f116285OooOoO) {
            return;
        }
        this.f116285OooOoO = true;
        this.f116284OooOo0o.onComplete();
    }

    @Override // oO0OooOO.InterfaceC33499OooOOOO
    public final void onError(Throwable th) {
        if (this.f116285OooOoO) {
            oO0OOO0O.OooO00o.OooO0O0(th);
        } else {
            this.f116285OooOoO = true;
            this.f116284OooOo0o.onError(th);
        }
    }
}
