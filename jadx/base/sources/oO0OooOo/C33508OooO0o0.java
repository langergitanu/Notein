package oO0OooOo;

import Oooo0.C20871o0000Ooo;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import oO00o.AbstractC32314OooO00o;
import oO00o.AbstractC32318OooO0o;
import oO00o.InterfaceC32315OooO0O0;
import oO00oOO.C32416OooO0OO;
import oO00oOOo.EnumC32427OooO0O0;

/* JADX INFO: renamed from: oO0OooOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33508OooO0o0<T> extends AbstractC33504OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f121022OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32416OooO0OO f121023OooOoO0;

    /* JADX INFO: renamed from: oO0OooOo.OooO0o0$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<Thread> implements InterfaceC32315OooO0O0<T>, oOO00OOO.OooO0OO, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC32318OooO0o.OooO0O0 f121024OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32315OooO0O0 f121025OooOo0o;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final boolean f121028OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public oOO00OOO.OooO00o<T> f121029OooOoo0;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final AtomicReference<oOO00OOO.OooO0OO> f121027OooOoO0 = new AtomicReference<>();

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final AtomicLong f121026OooOoO = new AtomicLong();

        /* JADX INFO: renamed from: oO0OooOo.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class RunnableC20318OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final long f121030OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final oOO00OOO.OooO0OO f121031OooOo0o;

            public RunnableC20318OooO00o(long j, oOO00OOO.OooO0OO oooO0OO) {
                this.f121031OooOo0o = oooO0OO;
                this.f121030OooOo = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f121031OooOo0o.request(this.f121030OooOo);
            }
        }

        public OooO00o(InterfaceC32315OooO0O0 interfaceC32315OooO0O0, AbstractC32318OooO0o.OooO0O0 oooO0O0, oOO00OOO.OooO00o oooO00o, boolean z) {
            this.f121025OooOo0o = interfaceC32315OooO0O0;
            this.f121024OooOo = oooO0O0;
            this.f121029OooOoo0 = oooO00o;
            this.f121028OooOoOO = !z;
        }

        public final void OooO00o(long j, oOO00OOO.OooO0OO oooO0OO) {
            if (this.f121028OooOoOO || Thread.currentThread() == get()) {
                oooO0OO.request(j);
            } else {
                this.f121024OooOo.OooO0O0(new RunnableC20318OooO00o(j, oooO0OO));
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC32427OooO0O0.OooO0O0(this.f121027OooOoO0, oooO0OO)) {
                long andSet = this.f121026OooOoO.getAndSet(0L);
                if (andSet != 0) {
                    OooO00o(andSet, oooO0OO);
                }
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            EnumC32427OooO0O0.OooO00o(this.f121027OooOoO0);
            this.f121024OooOo.dispose();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            this.f121025OooOo0o.onComplete();
            this.f121024OooOo.dispose();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            this.f121025OooOo0o.onError(th);
            this.f121024OooOo.dispose();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            this.f121025OooOo0o.onNext(t);
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            if (EnumC32427OooO0O0.OooO0OO(j)) {
                AtomicReference<oOO00OOO.OooO0OO> atomicReference = this.f121027OooOoO0;
                oOO00OOO.OooO0OO oooO0OO = atomicReference.get();
                if (oooO0OO != null) {
                    OooO00o(j, oooO0OO);
                    return;
                }
                AtomicLong atomicLong = this.f121026OooOoO;
                C20871o0000Ooo.OooO00o(atomicLong, j);
                oOO00OOO.OooO0OO oooO0OO2 = atomicReference.get();
                if (oooO0OO2 != null) {
                    long andSet = atomicLong.getAndSet(0L);
                    if (andSet != 0) {
                        OooO00o(andSet, oooO0OO2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            oOO00OOO.OooO00o<T> oooO00o = this.f121029OooOoo0;
            this.f121029OooOoo0 = null;
            oooO00o.subscribe(this);
        }
    }

    public C33508OooO0o0(AbstractC32314OooO00o abstractC32314OooO00o, C32416OooO0OO c32416OooO0OO) {
        super(abstractC32314OooO00o);
        this.f121023OooOoO0 = c32416OooO0OO;
        this.f121022OooOoO = true;
    }

    @Override // oO00o.AbstractC32314OooO00o
    public final void OooO0O0(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        AbstractC32318OooO0o.OooO0O0 oooO0O0OooO00o = this.f121023OooOoO0.OooO00o();
        OooO00o oooO00o = new OooO00o((InterfaceC32315OooO0O0) oooO0O0, oooO0O0OooO00o, this.f121000OooOo, this.f121022OooOoO);
        oooO0O0.OooO0Oo(oooO00o);
        oooO0O0OooO00o.OooO0O0(oooO00o);
    }
}
