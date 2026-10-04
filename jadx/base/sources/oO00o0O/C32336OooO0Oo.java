package oO00o0O;

import com.google.firebase.inappmessaging.internal.CallableC22755OoooO0;
import o0o0OO0.C30416Oooo0OO;
import oO0OOO00.C32938OooO0Oo;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.InterfaceC33488OooO0OO;

/* JADX INFO: renamed from: oO00o0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32336OooO0Oo extends AbstractC33487OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final CallableC22755OoooO0 f116262OooOo0o;

    public C32336OooO0Oo(CallableC22755OoooO0 callableC22755OoooO0) {
        this.f116262OooOo0o = callableC22755OoooO0;
    }

    @Override // oO0OooOO.AbstractC33487OooO0O0
    public final void OooO0o0(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
        C32938OooO0Oo c32938OooO0Oo = new C32938OooO0Oo(oO00o0.OooO00o.f116236OooO0O0);
        interfaceC33488OooO0OO.OooO00o(c32938OooO0Oo);
        try {
            this.f116262OooOo0o.call();
            if (c32938OooO0Oo.OooO00o()) {
                return;
            }
            interfaceC33488OooO0OO.onComplete();
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            if (c32938OooO0Oo.OooO00o()) {
                return;
            }
            interfaceC33488OooO0OO.onError(th);
        }
    }
}
