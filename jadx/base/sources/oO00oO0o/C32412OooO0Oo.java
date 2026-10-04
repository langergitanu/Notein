package oO00oO0o;

import java.util.concurrent.atomic.AtomicReference;
import oO00o.AbstractC32320OooO0oO;
import oO00o.InterfaceC32321OooO0oo;
import oO00oO0.C32400OooO0o0;
import oO00oO0.EnumC32397OooO0O0;
import oO00oOO.C32416OooO0OO;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oO00oO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32412OooO0Oo<T> extends AbstractC32320OooO0oO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC32320OooO0oO f116523OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32416OooO0OO f116524OooO0O0;

    /* JADX INFO: renamed from: oO00oO0o.OooO0Oo$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<InterfaceC32925OooO0O0> implements InterfaceC32321OooO0oo<T>, InterfaceC32925OooO0O0, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C32400OooO0o0 f116525OooOo = new C32400OooO0o0();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32321OooO0oo<? super T> f116526OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final AbstractC32320OooO0oO f116527OooOoO0;

        public OooO00o(InterfaceC32321OooO0oo interfaceC32321OooO0oo, AbstractC32320OooO0oO abstractC32320OooO0oO) {
            this.f116526OooOo0o = interfaceC32321OooO0oo;
            this.f116527OooOoO0 = abstractC32320OooO0oO;
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
            EnumC32397OooO0O0.OooO0OO(this, interfaceC32925OooO0O0);
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            EnumC32397OooO0O0.OooO00o(this);
            C32400OooO0o0 c32400OooO0o0 = this.f116525OooOo;
            c32400OooO0o0.getClass();
            EnumC32397OooO0O0.OooO00o(c32400OooO0o0);
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void onError(Throwable th) {
            this.f116526OooOo0o.onError(th);
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void onSuccess(T t) {
            this.f116526OooOo0o.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f116527OooOoO0.OooO00o(this);
        }
    }

    public C32412OooO0Oo(AbstractC32320OooO0oO abstractC32320OooO0oO, C32416OooO0OO c32416OooO0OO) {
        this.f116523OooO00o = abstractC32320OooO0oO;
        this.f116524OooO0O0 = c32416OooO0OO;
    }

    @Override // oO00o.AbstractC32320OooO0oO
    public final void OooO0O0(InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo) {
        OooO00o oooO00o = new OooO00o(interfaceC32321OooO0oo, this.f116523OooO00o);
        interfaceC32321OooO0oo.OooO00o(oooO00o);
        InterfaceC32925OooO0O0 interfaceC32925OooO0O0OooO0O0 = this.f116524OooO0O0.OooO0O0(oooO00o);
        C32400OooO0o0 c32400OooO0o0 = oooO00o.f116525OooOo;
        c32400OooO0o0.getClass();
        EnumC32397OooO0O0.OooO0O0(c32400OooO0o0, interfaceC32925OooO0O0OooO0O0);
    }
}
