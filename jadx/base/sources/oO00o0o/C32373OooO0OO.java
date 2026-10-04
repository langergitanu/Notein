package oO00o0o;

import java.util.concurrent.atomic.AtomicReference;
import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO0OOOOo.OooOOOO;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO00o0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32373OooO0OO<T> extends AtomicReference<oOO00OOO.OooO0OO> implements InterfaceC33493OooO0oo<T>, oOO00OOO.OooO0OO, oO0OOO00.OooO0O0 {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.OooO f116395OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final com.google.firebase.inappmessaging.OooO0O0 f116396OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooOOOO f116397OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o.OooO0O0 f116398OooOoO0;

    public C32373OooO0OO(com.google.firebase.inappmessaging.OooO0O0 oooO0O0) {
        OooO00o.OooO oooO = oO00o0.OooO00o.f116240OooO0o0;
        OooO00o.OooO0O0 oooO0O02 = oO00o0.OooO00o.f116237OooO0OO;
        OooOOOO oooOOOO = OooOOOO.f119291OooOo0o;
        this.f116396OooOo0o = oooO0O0;
        this.f116395OooOo = oooO;
        this.f116398OooOoO0 = oooO0O02;
        this.f116397OooOoO = oooOOOO;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        if (EnumC33007OooO0oO.OooO0O0(this, oooO0OO)) {
            try {
                this.f116397OooOoO.accept(this);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                oooO0OO.cancel();
                onError(th);
            }
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        EnumC33007OooO0oO.OooO00o(this);
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        EnumC33007OooO0oO.OooO00o(this);
    }

    @Override // oOO00OOO.OooO0O0
    public final void onComplete() {
        oOO00OOO.OooO0OO oooO0OO = get();
        EnumC33007OooO0oO enumC33007OooO0oO = EnumC33007OooO0oO.f119402OooOo0o;
        if (oooO0OO != enumC33007OooO0oO) {
            lazySet(enumC33007OooO0oO);
            try {
                this.f116398OooOoO0.getClass();
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                oO0OOO0O.OooO00o.OooO0O0(th);
            }
        }
    }

    @Override // oOO00OOO.OooO0O0
    public final void onError(Throwable th) {
        oOO00OOO.OooO0OO oooO0OO = get();
        EnumC33007OooO0oO enumC33007OooO0oO = EnumC33007OooO0oO.f119402OooOo0o;
        if (oooO0OO == enumC33007OooO0oO) {
            oO0OOO0O.OooO00o.OooO0O0(th);
            return;
        }
        lazySet(enumC33007OooO0oO);
        try {
            this.f116395OooOo.accept(th);
        } catch (Throwable th2) {
            C30416Oooo0OO.OooO00o(th2);
            oO0OOO0O.OooO00o.OooO0O0(new oO00o00O.OooO00o(th, th2));
        }
    }

    @Override // oOO00OOO.OooO0O0
    public final void onNext(T t) {
        if (get() == EnumC33007OooO0oO.f119402OooOo0o) {
            return;
        }
        try {
            this.f116396OooOo0o.accept(t);
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        get().request(j);
    }
}
