package oO00oO0o;

import java.util.concurrent.atomic.AtomicReference;
import oO00o.AbstractC32318OooO0o;
import oO00o.AbstractC32320OooO0oO;
import oO00o.InterfaceC32321OooO0oo;
import oO00oO0.EnumC32397OooO0O0;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oO00oO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32411OooO0OO<T> extends AbstractC32320OooO0oO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC32320OooO0oO f116517OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC32318OooO0o f116518OooO0O0;

    /* JADX INFO: renamed from: oO00oO0o.OooO0OO$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<InterfaceC32925OooO0O0> implements InterfaceC32321OooO0oo<T>, InterfaceC32925OooO0O0, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC32318OooO0o f116519OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32321OooO0oo<? super T> f116520OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Throwable f116521OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public T f116522OooOoO0;

        public OooO00o(InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo, AbstractC32318OooO0o abstractC32318OooO0o) {
            this.f116520OooOo0o = interfaceC32321OooO0oo;
            this.f116519OooOo = abstractC32318OooO0o;
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
            if (EnumC32397OooO0O0.OooO0OO(this, interfaceC32925OooO0O0)) {
                this.f116520OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            EnumC32397OooO0O0.OooO00o(this);
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void onError(Throwable th) {
            this.f116521OooOoO = th;
            EnumC32397OooO0O0.OooO0O0(this, this.f116519OooOo.OooO0O0(this));
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void onSuccess(T t) {
            this.f116522OooOoO0 = t;
            EnumC32397OooO0O0.OooO0O0(this, this.f116519OooOo.OooO0O0(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f116521OooOoO;
            InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo = this.f116520OooOo0o;
            if (th != null) {
                interfaceC32321OooO0oo.onError(th);
            } else {
                interfaceC32321OooO0oo.onSuccess(this.f116522OooOoO0);
            }
        }
    }

    public C32411OooO0OO(AbstractC32320OooO0oO abstractC32320OooO0oO, AbstractC32318OooO0o abstractC32318OooO0o) {
        this.f116517OooO00o = abstractC32320OooO0oO;
        this.f116518OooO0O0 = abstractC32318OooO0o;
    }

    @Override // oO00o.AbstractC32320OooO0oO
    public final void OooO0O0(InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo) {
        this.f116517OooO00o.OooO00o(new OooO00o(interfaceC32321OooO0oo, this.f116518OooO0O0));
    }
}
