package oO0OOOoO;

import com.google.firebase.inappmessaging.internal.C22762OoooOoO;
import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0O0.AbstractC32341OooO0O0;
import oO00o0oO.C32388OooO0OO;
import oO00o0oO.C32390OooO0o;
import oO0OooOO.InterfaceC33488OooO0OO;
import oO0OooOO.InterfaceC33489OooO0Oo;
import oO0OooOO.InterfaceC33499OooOOOO;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO0OOOoO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33015OooO0oO<T> extends AbstractC33009OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C22762OoooOoO f119450OooOo;

    /* JADX INFO: renamed from: oO0OOOoO.OooO0oO$OooO00o */
    public static final class OooO00o<T> extends AbstractC32341OooO0O0<T> implements InterfaceC33499OooOOOO<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33499OooOOOO<? super T> f119452OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C22762OoooOoO f119454OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f119455OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public volatile boolean f119456OooOoo0;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C32388OooO0OO f119451OooOo = new C32388OooO0OO();

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final oO0OOO00.OooO00o f119453OooOoO = new oO0OOO00.OooO00o();

        /* JADX INFO: renamed from: oO0OOOoO.OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
        public final class C20293OooO00o extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33488OooO0OO, oO0OOO00.OooO0O0 {
            private static final long serialVersionUID = 8606673141535671828L;

            public C20293OooO00o() {
            }

            @Override // oO0OooOO.InterfaceC33488OooO0OO
            public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
                EnumC35109OooO0O0.OooO0Oo(this, oooO0O0);
            }

            @Override // oO0OOO00.OooO0O0
            public final void dispose() {
                EnumC35109OooO0O0.OooO00o(this);
            }

            @Override // oO0OooOO.InterfaceC33488OooO0OO
            public final void onComplete() {
                OooO00o oooO00o = OooO00o.this;
                oooO00o.f119453OooOoO.OooO0OO(this);
                oooO00o.onComplete();
            }

            @Override // oO0OooOO.InterfaceC33488OooO0OO
            public final void onError(Throwable th) {
                OooO00o oooO00o = OooO00o.this;
                oooO00o.f119453OooOoO.OooO0OO(this);
                oooO00o.onError(th);
            }
        }

        public OooO00o(InterfaceC33499OooOOOO interfaceC33499OooOOOO, C22762OoooOoO c22762OoooOoO) {
            this.f119452OooOo0o = interfaceC33499OooOOOO;
            this.f119454OooOoO0 = c22762OoooOoO;
            lazySet(1);
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f119455OooOoOO, oooO0O0)) {
                this.f119455OooOoOO = oooO0O0;
                this.f119452OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            return 2;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final void clear() {
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f119456OooOoo0 = true;
            this.f119455OooOoOO.dispose();
            this.f119453OooOoO.dispose();
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final boolean isEmpty() {
            return true;
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                C32388OooO0OO c32388OooO0OO = this.f119451OooOo;
                c32388OooO0OO.getClass();
                Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO = this.f119452OooOo0o;
                if (thOooO0O0 != null) {
                    interfaceC33499OooOOOO.onError(thOooO0O0);
                } else {
                    interfaceC33499OooOOOO.onComplete();
                }
            }
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onError(Throwable th) {
            C32388OooO0OO c32388OooO0OO = this.f119451OooOo;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f119452OooOo0o.onError(C32390OooO0o.OooO0O0(c32388OooO0OO));
            }
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(T t) {
            try {
                Object objApply = this.f119454OooOoO0.apply(t);
                o00Oo0.OooO00o(objApply, "The mapper returned a null CompletableSource");
                InterfaceC33489OooO0Oo interfaceC33489OooO0Oo = (InterfaceC33489OooO0Oo) objApply;
                getAndIncrement();
                C20293OooO00o c20293OooO00o = new C20293OooO00o();
                if (this.f119456OooOoo0 || !this.f119453OooOoO.OooO00o(c20293OooO00o)) {
                    return;
                }
                interfaceC33489OooO0Oo.OooO00o(c20293OooO00o);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f119455OooOoOO.dispose();
                onError(th);
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            return null;
        }
    }

    public C33015OooO0oO(C33018OooOO0O c33018OooOO0O, C22762OoooOoO c22762OoooOoO) {
        super(c33018OooOO0O);
        this.f119450OooOo = c22762OoooOoO;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        this.f119410OooOo0o.OooO0O0(new OooO00o(interfaceC33499OooOOOO, this.f119450OooOo));
    }
}
