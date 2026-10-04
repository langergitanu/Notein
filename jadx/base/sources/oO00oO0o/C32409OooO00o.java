package oO00oO0o;

import java.util.concurrent.atomic.AtomicReference;
import oO00o.AbstractC32320OooO0oO;
import oO00o.InterfaceC32321OooO0oo;
import oO00oO0.EnumC32397OooO0O0;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.C33669o000oOoO;
import oO0o0o0O.C33868OooOO0o;
import oOo00oO0.C34561OooO0O0;

/* JADX INFO: renamed from: oO00oO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32409OooO00o<T> extends AbstractC32320OooO0oO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33868OooOO0o f116514OooO00o;

    /* JADX INFO: renamed from: oO00oO0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20227OooO00o<T> extends AtomicReference<InterfaceC32925OooO0O0> implements InterfaceC32925OooO0O0 {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32321OooO0oo<? super T> f116515OooOo0o;

        public C20227OooO00o(InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo) {
            this.f116515OooOo0o = interfaceC32321OooO0oo;
        }

        public final boolean OooO00o(Throwable th) {
            InterfaceC32925OooO0O0 andSet;
            if (th == null) {
                th = C34561OooO0O0.OooO00o("onError called with a null Throwable.");
            }
            InterfaceC32925OooO0O0 interfaceC32925OooO0O0 = get();
            EnumC32397OooO0O0 enumC32397OooO0O0 = EnumC32397OooO0O0.f116501OooOo0o;
            if (interfaceC32925OooO0O0 == enumC32397OooO0O0 || (andSet = getAndSet(enumC32397OooO0O0)) == enumC32397OooO0O0) {
                return false;
            }
            try {
                this.f116515OooOo0o.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            EnumC32397OooO0O0.OooO00o(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return OooO0O0.OooO00o.OooO0O0(C20227OooO00o.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public C32409OooO00o(C33868OooOO0o c33868OooOO0o) {
        this.f116514OooO00o = c33868OooOO0o;
    }

    @Override // oO00o.AbstractC32320OooO0oO
    public final void OooO0O0(InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo) {
        C20227OooO00o c20227OooO00o = new C20227OooO00o(interfaceC32321OooO0oo);
        interfaceC32321OooO0oo.OooO00o(c20227OooO00o);
        try {
            this.f116514OooO00o.OooO00o(c20227OooO00o);
        } catch (Throwable th) {
            C33669o000oOoO.OooO0O0(th);
            if (c20227OooO00o.OooO00o(th)) {
                return;
            }
            C32430OooO00o.OooO00o(th);
        }
    }
}
