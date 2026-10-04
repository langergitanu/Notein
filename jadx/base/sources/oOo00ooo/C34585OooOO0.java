package oOo00ooo;

import java.util.concurrent.atomic.AtomicReference;
import oO00o.AbstractC32316OooO0OO;
import oO00o.InterfaceC32319OooO0o0;
import oO00oO0.EnumC32397OooO0O0;
import oO00oOO.C32416OooO0OO;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oOo00ooo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34585OooOO0<T> extends AbstractC34577OooO00o<T, T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32416OooO0OO f123879OooO0O0;

    /* JADX INFO: renamed from: oOo00ooo.OooOO0$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<InterfaceC32925OooO0O0> implements InterfaceC32319OooO0o0<T>, InterfaceC32925OooO0O0 {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AtomicReference<InterfaceC32925OooO0O0> f123880OooOo = new AtomicReference<>();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32319OooO0o0<? super T> f123881OooOo0o;

        public OooO00o(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0) {
            this.f123881OooOo0o = interfaceC32319OooO0o0;
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
            EnumC32397OooO0O0.OooO0OO(this.f123880OooOo, interfaceC32925OooO0O0);
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            EnumC32397OooO0O0.OooO00o(this.f123880OooOo);
            EnumC32397OooO0O0.OooO00o(this);
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onComplete() {
            this.f123881OooOo0o.onComplete();
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onError(Throwable th) {
            this.f123881OooOo0o.onError(th);
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onNext(T t) {
            this.f123881OooOo0o.onNext(t);
        }
    }

    /* JADX INFO: renamed from: oOo00ooo.OooOO0$OooO0O0 */
    public final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO00o<T> f123883OooOo0o;

        public OooO0O0(OooO00o<T> oooO00o) {
            this.f123883OooOo0o = oooO00o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C34585OooOO0.this.f123831OooO00o.OooO00o(this.f123883OooOo0o);
        }
    }

    public C34585OooOO0(AbstractC32316OooO0OO abstractC32316OooO0OO, C32416OooO0OO c32416OooO0OO) {
        super(abstractC32316OooO0OO);
        this.f123879OooO0O0 = c32416OooO0OO;
    }

    @Override // oO00o.AbstractC32316OooO0OO
    public final void OooO0OO(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0) {
        OooO00o oooO00o = new OooO00o(interfaceC32319OooO0o0);
        interfaceC32319OooO0o0.OooO00o(oooO00o);
        EnumC32397OooO0O0.OooO0OO(oooO00o, this.f123879OooO0O0.OooO0O0(new OooO0O0(oooO00o)));
    }
}
