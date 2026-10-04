package oO00o0OO;

import java.util.concurrent.atomic.AtomicReference;
import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32347OooO0O0<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {
    private static final long serialVersionUID = -6076952298809384986L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.OooO f116291OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o.OooO0OO f116292OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o.OooO0O0 f116293OooOoO0;

    public C32347OooO0O0() {
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        OooO00o.OooO oooO = oO00o0.OooO00o.f116240OooO0o0;
        OooO00o.OooO0O0 oooO0O0 = oO00o0.OooO00o.f116237OooO0OO;
        this.f116292OooOo0o = oooO0OO;
        this.f116291OooOo = oooO;
        this.f116293OooOoO0 = oooO0O0;
    }

    @Override // oO0OooOO.InterfaceC33495OooOO0O
    public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
        EnumC35109OooO0O0.OooO0Oo(this, oooO0O0);
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        EnumC35109OooO0O0.OooO00o(this);
    }

    @Override // oO0OooOO.InterfaceC33495OooOO0O
    public final void onComplete() {
        lazySet(EnumC35109OooO0O0.f126092OooOo0o);
        try {
            this.f116293OooOoO0.getClass();
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            oO0OOO0O.OooO00o.OooO0O0(th);
        }
    }

    @Override // oO0OooOO.InterfaceC33495OooOO0O
    public final void onError(Throwable th) {
        lazySet(EnumC35109OooO0O0.f126092OooOo0o);
        try {
            this.f116291OooOo.accept(th);
        } catch (Throwable th2) {
            C30416Oooo0OO.OooO00o(th2);
            oO0OOO0O.OooO00o.OooO0O0(new oO00o00O.OooO00o(th, th2));
        }
    }

    @Override // oO0OooOO.InterfaceC33495OooOO0O
    public final void onSuccess(T t) {
        lazySet(EnumC35109OooO0O0.f126092OooOo0o);
        try {
            this.f116292OooOo0o.getClass();
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            oO0OOO0O.OooO00o.OooO0O0(th);
        }
    }
}
