package oO00o0o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o00000.OooOO0;
import oO00o0oO.C32388OooO0OO;
import oO00o0oO.C32390OooO0o;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO00o0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32374OooO0Oo<T> extends AtomicInteger implements InterfaceC33493OooO0oo<T>, oOO00OOO.OooO0OO {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oOO00OOO.OooO0O0<? super T> f116400OooOo0o;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile boolean f116404OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C32388OooO0OO f116399OooOo = new C32388OooO0OO();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicLong f116402OooOoO0 = new AtomicLong();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicReference<oOO00OOO.OooO0OO> f116401OooOoO = new AtomicReference<>();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicBoolean f116403OooOoOO = new AtomicBoolean();

    public C32374OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        this.f116400OooOo0o = oooO0O0;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        if (!this.f116403OooOoOO.compareAndSet(false, true)) {
            oooO0OO.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.f116400OooOo0o.OooO0Oo(this);
        AtomicReference<oOO00OOO.OooO0OO> atomicReference = this.f116401OooOoO;
        AtomicLong atomicLong = this.f116402OooOoO0;
        if (EnumC33007OooO0oO.OooO0O0(atomicReference, oooO0OO)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                oooO0OO.request(andSet);
            }
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        if (this.f116404OooOoo0) {
            return;
        }
        EnumC33007OooO0oO.OooO00o(this.f116401OooOoO);
    }

    @Override // oOO00OOO.OooO0O0
    public final void onComplete() {
        this.f116404OooOoo0 = true;
        oOO00OOO.OooO0O0<? super T> oooO0O0 = this.f116400OooOo0o;
        C32388OooO0OO c32388OooO0OO = this.f116399OooOo;
        if (getAndIncrement() == 0) {
            c32388OooO0OO.getClass();
            Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
            if (thOooO0O0 != null) {
                oooO0O0.onError(thOooO0O0);
            } else {
                oooO0O0.onComplete();
            }
        }
    }

    @Override // oOO00OOO.OooO0O0
    public final void onError(Throwable th) {
        this.f116404OooOoo0 = true;
        oOO00OOO.OooO0O0<? super T> oooO0O0 = this.f116400OooOo0o;
        C32388OooO0OO c32388OooO0OO = this.f116399OooOo;
        c32388OooO0OO.getClass();
        if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
            oO0OOO0O.OooO00o.OooO0O0(th);
        } else if (getAndIncrement() == 0) {
            oooO0O0.onError(C32390OooO0o.OooO0O0(c32388OooO0OO));
        }
    }

    @Override // oOO00OOO.OooO0O0
    public final void onNext(T t) {
        if (get() == 0 && compareAndSet(0, 1)) {
            oOO00OOO.OooO0O0<? super T> oooO0O0 = this.f116400OooOo0o;
            oooO0O0.onNext(t);
            if (decrementAndGet() != 0) {
                C32388OooO0OO c32388OooO0OO = this.f116399OooOo;
                c32388OooO0OO.getClass();
                Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                if (thOooO0O0 != null) {
                    oooO0O0.onError(thOooO0O0);
                } else {
                    oooO0O0.onComplete();
                }
            }
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference<oOO00OOO.OooO0OO> atomicReference = this.f116401OooOoO;
        AtomicLong atomicLong = this.f116402OooOoO0;
        oOO00OOO.OooO0OO oooO0OO = atomicReference.get();
        if (oooO0OO != null) {
            oooO0OO.request(j);
            return;
        }
        if (EnumC33007OooO0oO.OooO0OO(j)) {
            OooOO0.OooO0O0(atomicLong, j);
            oOO00OOO.OooO0OO oooO0OO2 = atomicReference.get();
            if (oooO0OO2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    oooO0OO2.request(andSet);
                }
            }
        }
    }
}
