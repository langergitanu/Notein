package oO00oO0O;

import java.util.concurrent.atomic.AtomicReference;
import oO00o.InterfaceC32319OooO0o0;
import oO00oO0.EnumC32397OooO0O0;
import oO00oO00.InterfaceC32402OooO0O0;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0OoooO.C33519OooO00o;
import oO0o0OO.C33669o000oOoO;
import oOo00o0o.C34554OooO00o;

/* JADX INFO: renamed from: oO00oO0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32408OooO0Oo<T> extends AtomicReference<InterfaceC32925OooO0O0> implements InterfaceC32319OooO0o0<T>, InterfaceC32925OooO0O0 {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33519OooO00o.C33521OooO0o0 f116510OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32402OooO0O0<? super T> f116511OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33519OooO00o.OooO0O0 f116512OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33519OooO00o.C20319OooO00o f116513OooOoO0;

    public C32408OooO0Oo(InterfaceC32402OooO0O0 interfaceC32402OooO0O0) {
        C33519OooO00o.C33521OooO0o0 c33521OooO0o0 = C33519OooO00o.f121091OooO0o0;
        C33519OooO00o.C20319OooO00o c20319OooO00o = C33519OooO00o.f121089OooO0OO;
        C33519OooO00o.OooO0O0 oooO0O0 = C33519OooO00o.f121090OooO0Oo;
        this.f116511OooOo0o = interfaceC32402OooO0O0;
        this.f116510OooOo = c33521OooO0o0;
        this.f116513OooOoO0 = c20319OooO00o;
        this.f116512OooOoO = oooO0O0;
    }

    @Override // oO00o.InterfaceC32319OooO0o0
    public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        if (EnumC32397OooO0O0.OooO0OO(this, interfaceC32925OooO0O0)) {
            try {
                this.f116512OooOoO.getClass();
            } catch (Throwable th) {
                C33669o000oOoO.OooO0O0(th);
                interfaceC32925OooO0O0.dispose();
                onError(th);
            }
        }
    }

    public final boolean OooO0O0() {
        return get() == EnumC32397OooO0O0.f116501OooOo0o;
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        EnumC32397OooO0O0.OooO00o(this);
    }

    @Override // oO00o.InterfaceC32319OooO0o0
    public final void onComplete() {
        if (OooO0O0()) {
            return;
        }
        lazySet(EnumC32397OooO0O0.f116501OooOo0o);
        try {
            this.f116513OooOoO0.getClass();
        } catch (Throwable th) {
            C33669o000oOoO.OooO0O0(th);
            C32430OooO00o.OooO00o(th);
        }
    }

    @Override // oO00o.InterfaceC32319OooO0o0
    public final void onError(Throwable th) {
        if (OooO0O0()) {
            C32430OooO00o.OooO00o(th);
            return;
        }
        lazySet(EnumC32397OooO0O0.f116501OooOo0o);
        try {
            this.f116510OooOo.accept(th);
        } catch (Throwable th2) {
            C33669o000oOoO.OooO0O0(th2);
            C32430OooO00o.OooO00o(new C34554OooO00o(th, th2));
        }
    }

    @Override // oO00o.InterfaceC32319OooO0o0
    public final void onNext(T t) {
        if (OooO0O0()) {
            return;
        }
        try {
            this.f116511OooOo0o.accept(t);
        } catch (Throwable th) {
            C33669o000oOoO.OooO0O0(th);
            get().dispose();
            onError(th);
        }
    }
}
