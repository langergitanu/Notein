package oO00o0OO;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO00o00o.InterfaceC32331OooO0OO;
import oO00o0OO.C32357OooOOO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;
import oO0OooOO.InterfaceC33496OooOO0o;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32366OooOo0O<T, R> extends AbstractC33485OooO<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.C20215OooO00o f116363OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33496OooOO0o<? extends T>[] f116364OooOo0o;

    /* JADX INFO: renamed from: oO00o0OO.OooOo0O$OooO00o */
    public final class OooO00o implements InterfaceC32331OooO0OO<T, R> {
        public OooO00o() {
        }

        @Override // oO00o00o.InterfaceC32331OooO0OO
        public final R apply(T t) throws Exception {
            R r = (R) C32366OooOo0O.this.f116363OooOo.apply(new Object[]{t});
            o00Oo0.OooO00o(r, "The zipper returned a null value");
            return r;
        }
    }

    /* JADX INFO: renamed from: oO00o0OO.OooOo0O$OooO0O0 */
    public static final class OooO0O0<T, R> extends AtomicInteger implements oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = -5556924161382950569L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o.C20215OooO00o f116366OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super R> f116367OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final Object[] f116368OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final OooO0OO<T>[] f116369OooOoO0;

        public OooO0O0(InterfaceC33495OooOO0O interfaceC33495OooOO0O, int i, OooO00o.C20215OooO00o c20215OooO00o) {
            super(i);
            this.f116367OooOo0o = interfaceC33495OooOO0O;
            this.f116366OooOo = c20215OooO00o;
            OooO0OO<T>[] oooO0OOArr = new OooO0OO[i];
            for (int i2 = 0; i2 < i; i2++) {
                oooO0OOArr[i2] = new OooO0OO<>(this, i2);
            }
            this.f116369OooOoO0 = oooO0OOArr;
            this.f116368OooOoO = new Object[i];
        }

        public final void OooO00o(int i) {
            OooO0OO<T>[] oooO0OOArr = this.f116369OooOoO0;
            int length = oooO0OOArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                OooO0OO<T> oooO0OO = oooO0OOArr[i2];
                oooO0OO.getClass();
                EnumC35109OooO0O0.OooO00o(oooO0OO);
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                }
                OooO0OO<T> oooO0OO2 = oooO0OOArr[i];
                oooO0OO2.getClass();
                EnumC35109OooO0O0.OooO00o(oooO0OO2);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (OooO0OO<T> oooO0OO : this.f116369OooOoO0) {
                    oooO0OO.getClass();
                    EnumC35109OooO0O0.OooO00o(oooO0OO);
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO00o0OO.OooOo0O$OooO0OO */
    public static final class OooO0OO<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f116370OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0O0<T, ?> f116371OooOo0o;

        public OooO0OO(OooO0O0<T, ?> oooO0O0, int i) {
            this.f116371OooOo0o = oooO0O0;
            this.f116370OooOo = i;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            EnumC35109OooO0O0.OooO0Oo(this, oooO0O0);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            OooO0O0<T, ?> oooO0O0 = this.f116371OooOo0o;
            if (oooO0O0.getAndSet(0) > 0) {
                oooO0O0.OooO00o(this.f116370OooOo);
                oooO0O0.f116367OooOo0o.onComplete();
            }
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            OooO0O0<T, ?> oooO0O0 = this.f116371OooOo0o;
            if (oooO0O0.getAndSet(0) <= 0) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                oooO0O0.OooO00o(this.f116370OooOo);
                oooO0O0.f116367OooOo0o.onError(th);
            }
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            OooO0O0<T, ?> oooO0O0 = this.f116371OooOo0o;
            InterfaceC33495OooOO0O<? super Object> interfaceC33495OooOO0O = oooO0O0.f116367OooOo0o;
            int i = this.f116370OooOo;
            Object[] objArr = oooO0O0.f116368OooOoO;
            objArr[i] = t;
            if (oooO0O0.decrementAndGet() == 0) {
                try {
                    Object objApply = oooO0O0.f116366OooOo.apply(objArr);
                    o00Oo0.OooO00o(objApply, "The zipper returned a null value");
                    interfaceC33495OooOO0O.onSuccess(objApply);
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    interfaceC33495OooOO0O.onError(th);
                }
            }
        }
    }

    public C32366OooOo0O(InterfaceC33496OooOO0o[] interfaceC33496OooOO0oArr, OooO00o.C20215OooO00o c20215OooO00o) {
        this.f116364OooOo0o = interfaceC33496OooOO0oArr;
        this.f116363OooOo = c20215OooO00o;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super R> interfaceC33495OooOO0O) {
        InterfaceC33496OooOO0o<? extends T>[] interfaceC33496OooOO0oArr = this.f116364OooOo0o;
        int length = interfaceC33496OooOO0oArr.length;
        if (length == 1) {
            interfaceC33496OooOO0oArr[0].OooO00o(new C32357OooOOO.OooO00o(interfaceC33495OooOO0O, new OooO00o()));
            return;
        }
        OooO0O0 oooO0O0 = new OooO0O0(interfaceC33495OooOO0O, length, this.f116363OooOo);
        interfaceC33495OooOO0O.OooO00o(oooO0O0);
        for (int i = 0; i < length; i++) {
            if (oooO0O0.get() <= 0) {
                return;
            }
            InterfaceC33496OooOO0o<? extends T> interfaceC33496OooOO0o = interfaceC33496OooOO0oArr[i];
            if (interfaceC33496OooOO0o == null) {
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (oooO0O0.getAndSet(0) <= 0) {
                    oO0OOO0O.OooO00o.OooO0O0(nullPointerException);
                    return;
                } else {
                    oooO0O0.OooO00o(i);
                    oooO0O0.f116367OooOo0o.onError(nullPointerException);
                    return;
                }
            }
            interfaceC33496OooOO0o.OooO00o(oooO0O0.f116369OooOoO0[i]);
        }
    }
}
