package oO0o0OO;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0o0OO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC33610OooOO0 extends o000000O {

    /* JADX INFO: renamed from: oO0o0OO.OooOO0$OooO00o */
    public static final class OooO00o implements InterfaceC33610OooOO0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32507OooOO0o<Throwable, C32460OooOooO> f121292OooOo0o;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
            this.f121292OooOo0o = interfaceC32507OooOO0o;
        }

        @Override // oO0o0OO.InterfaceC33610OooOO0
        public final void OooO00o(Throwable th) {
            this.f121292OooOo0o.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.f121292OooOo0o.getClass().getSimpleName() + '@' + C33640Oooo0o0.OooO00o(this) + ']';
        }
    }

    void OooO00o(Throwable th);
}
