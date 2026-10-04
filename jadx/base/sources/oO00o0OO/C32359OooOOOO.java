package oO00o0OO;

import java.util.concurrent.atomic.AtomicReference;
import oO0OooOO.AbstractC33500OooOOOo;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32359OooOOOO<T> extends AbstractC32346OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33500OooOOOo f116328OooOo;

    /* JADX INFO: renamed from: oO00o0OO.OooOOOO$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC33500OooOOOo f116329OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f116330OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Throwable f116331OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public T f116332OooOoO0;

        public OooO00o(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O, AbstractC33500OooOOOo abstractC33500OooOOOo) {
            this.f116330OooOo0o = interfaceC33495OooOO0O;
            this.f116329OooOo = abstractC33500OooOOOo;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0Oo(this, oooO0O0)) {
                this.f116330OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC35109OooO0O0.OooO00o(this);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            EnumC35109OooO0O0.OooO0OO(this, this.f116329OooOo.OooO0O0(this));
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116331OooOoO = th;
            EnumC35109OooO0O0.OooO0OO(this, this.f116329OooOo.OooO0O0(this));
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            this.f116332OooOoO0 = t;
            EnumC35109OooO0O0.OooO0OO(this, this.f116329OooOo.OooO0O0(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f116331OooOoO;
            InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O = this.f116330OooOo0o;
            if (th != null) {
                this.f116331OooOoO = null;
                interfaceC33495OooOO0O.onError(th);
                return;
            }
            T t = this.f116332OooOoO0;
            if (t == null) {
                interfaceC33495OooOO0O.onComplete();
            } else {
                this.f116332OooOoO0 = null;
                interfaceC33495OooOO0O.onSuccess(t);
            }
        }
    }

    public C32359OooOOOO(C32366OooOo0O c32366OooOo0O, AbstractC33500OooOOOo abstractC33500OooOOOo) {
        super(c32366OooOo0O);
        this.f116328OooOo = abstractC33500OooOOOo;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        this.f116290OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O, this.f116328OooOo));
    }
}
