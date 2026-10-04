package oO0o0o0O;

import java.util.concurrent.TimeUnit;
import o0Ooo000.RunnableC29359Oooo0;
import oO00oOO.C32416OooO0OO;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33645OoooO00;
import oO0o0OO.InterfaceC33651OoooOoO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0o0O.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33869OooOOO extends AbstractC33630OooOooO implements InterfaceC33645OoooO00 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32416OooO0OO f122010OooOoO0;

    public C33869OooOOO(C32416OooO0OO c32416OooO0OO) {
        this.f122010OooOoO0 = c32416OooO0OO;
    }

    @Override // oO0o0OO.InterfaceC33645OoooO00
    public final InterfaceC33651OoooOoO OooOooo(long j, Runnable runnable, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        final InterfaceC32925OooO0O0 interfaceC32925OooO0O0OooO0OO = this.f122010OooOoO0.OooO0OO(runnable, j, TimeUnit.MILLISECONDS);
        return new InterfaceC33651OoooOoO() { // from class: oO0o0o0O.OooOOO0
            @Override // oO0o0OO.InterfaceC33651OoooOoO
            public final void dispose() {
                interfaceC32925OooO0O0OooO0OO.dispose();
            }
        };
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C33869OooOOO) && ((C33869OooOOO) obj).f122010OooOoO0 == this.f122010OooOoO0;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f122010OooOoO0);
    }

    @Override // oO0o0OO.InterfaceC33645OoooO00
    public final void o0000o0(long j, C33614OooOOO0 c33614OooOOO0) {
        c33614OooOOO0.OooOo0(new C33860OooO0OO(this.f122010OooOoO0.OooO0OO(new RunnableC29359Oooo0(c33614OooOOO0, this), j, TimeUnit.MILLISECONDS), 0));
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        this.f122010OooOoO0.OooO0O0(runnable);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final String toString() {
        return this.f122010OooOoO0.toString();
    }
}
