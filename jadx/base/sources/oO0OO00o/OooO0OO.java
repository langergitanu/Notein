package oO0OO00o;

import Oooo0.C20871o0000Ooo;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import oO00o.InterfaceC32315OooO0O0;
import oO00oOOo.EnumC32427OooO0O0;
import oOo00oO0.C34560OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO<T> extends AtomicInteger implements InterfaceC32315OooO0O0<T>, oOO00OOO.OooO0OO {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oOO00OOO.OooO0O0<? super T> f118551OooOo0o;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile boolean f118555OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34560OooO00o f118550OooOo = new C34560OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicLong f118553OooOoO0 = new AtomicLong();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicReference<oOO00OOO.OooO0OO> f118552OooOoO = new AtomicReference<>();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicBoolean f118554OooOoOO = new AtomicBoolean();

    public OooO0OO(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        this.f118551OooOo0o = oooO0O0;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        if (!this.f118554OooOoOO.compareAndSet(false, true)) {
            oooO0OO.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.f118551OooOo0o.OooO0Oo(this);
        AtomicReference<oOO00OOO.OooO0OO> atomicReference = this.f118552OooOoO;
        AtomicLong atomicLong = this.f118553OooOoO0;
        if (EnumC32427OooO0O0.OooO0O0(atomicReference, oooO0OO)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                oooO0OO.request(andSet);
            }
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        if (this.f118555OooOoo0) {
            return;
        }
        EnumC32427OooO0O0.OooO00o(this.f118552OooOoO);
    }

    @Override // oOO00OOO.OooO0O0
    public final void onComplete() {
        this.f118555OooOoo0 = true;
        oOO00OOO.OooO0O0<? super T> oooO0O0 = this.f118551OooOo0o;
        C34560OooO00o c34560OooO00o = this.f118550OooOo;
        if (getAndIncrement() == 0) {
            c34560OooO00o.OooO0OO(oooO0O0);
        }
    }

    @Override // oOO00OOO.OooO0O0
    public final void onError(Throwable th) {
        this.f118555OooOoo0 = true;
        oOO00OOO.OooO0O0<? super T> oooO0O0 = this.f118551OooOo0o;
        C34560OooO00o c34560OooO00o = this.f118550OooOo;
        if (c34560OooO00o.OooO0O0(th) && getAndIncrement() == 0) {
            c34560OooO00o.OooO0OO(oooO0O0);
        }
    }

    @Override // oOO00OOO.OooO0O0
    public final void onNext(T t) {
        if (get() == 0 && compareAndSet(0, 1)) {
            oOO00OOO.OooO0O0<? super T> oooO0O0 = this.f118551OooOo0o;
            oooO0O0.onNext(t);
            if (decrementAndGet() == 0) {
                return;
            }
            this.f118550OooOo.OooO0OO(oooO0O0);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference<oOO00OOO.OooO0OO> atomicReference = this.f118552OooOoO;
        AtomicLong atomicLong = this.f118553OooOoO0;
        oOO00OOO.OooO0OO oooO0OO = atomicReference.get();
        if (oooO0OO != null) {
            oooO0OO.request(j);
            return;
        }
        if (EnumC32427OooO0O0.OooO0OO(j)) {
            C20871o0000Ooo.OooO00o(atomicLong, j);
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
