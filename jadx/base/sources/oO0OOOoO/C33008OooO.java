package oO0OOOoO;

import java.util.Iterator;
import java.util.List;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0O0.AbstractC32342OooO0OO;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.InterfaceC33499OooOOOO;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO0OOOoO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33008OooO<T> extends AbstractC33498OooOOO0<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List f119403OooOo0o;

    /* JADX INFO: renamed from: oO0OOOoO.OooO$OooO00o */
    public static final class OooO00o<T> extends AbstractC32342OooO0OO<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Iterator<? extends T> f119404OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33499OooOOOO<? super T> f119405OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f119406OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile boolean f119407OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f119408OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public boolean f119409OooOoo0;

        public OooO00o(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO, Iterator<? extends T> it) {
            this.f119405OooOo0o = interfaceC33499OooOOOO;
            this.f119404OooOo = it;
        }

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            this.f119406OooOoO = true;
            return 1;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final void clear() {
            this.f119408OooOoOO = true;
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f119407OooOoO0 = true;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final boolean isEmpty() {
            return this.f119408OooOoOO;
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() {
            if (this.f119408OooOoOO) {
                return null;
            }
            boolean z = this.f119409OooOoo0;
            Iterator<? extends T> it = this.f119404OooOo;
            if (!z) {
                this.f119409OooOoo0 = true;
            } else if (!it.hasNext()) {
                this.f119408OooOoOO = true;
                return null;
            }
            T next = it.next();
            o00Oo0.OooO00o(next, "The iterator returned a null value");
            return next;
        }
    }

    public C33008OooO(List list) {
        this.f119403OooOo0o = list;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        EnumC35110OooO0OO enumC35110OooO0OO = EnumC35110OooO0OO.f126094OooOo0o;
        try {
            Iterator<T> it = this.f119403OooOo0o.iterator();
            try {
                if (!it.hasNext()) {
                    interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
                    interfaceC33499OooOOOO.onComplete();
                    return;
                }
                OooO00o oooO00o = new OooO00o(interfaceC33499OooOOOO, it);
                interfaceC33499OooOOOO.OooO00o(oooO00o);
                if (oooO00o.f119406OooOoO) {
                    return;
                }
                while (!oooO00o.f119407OooOoO0) {
                    try {
                        T next = oooO00o.f119404OooOo.next();
                        o00Oo0.OooO00o(next, "The iterator returned a null value");
                        oooO00o.f119405OooOo0o.onNext(next);
                        if (oooO00o.f119407OooOoO0) {
                            return;
                        }
                        try {
                            if (!oooO00o.f119404OooOo.hasNext()) {
                                if (oooO00o.f119407OooOoO0) {
                                    return;
                                }
                                oooO00o.f119405OooOo0o.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            C30416Oooo0OO.OooO00o(th);
                            oooO00o.f119405OooOo0o.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        C30416Oooo0OO.OooO00o(th2);
                        oooO00o.f119405OooOo0o.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                C30416Oooo0OO.OooO00o(th3);
                interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
                interfaceC33499OooOOOO.onError(th3);
            }
        } catch (Throwable th4) {
            C30416Oooo0OO.OooO00o(th4);
            interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
            interfaceC33499OooOOOO.onError(th4);
        }
    }
}
