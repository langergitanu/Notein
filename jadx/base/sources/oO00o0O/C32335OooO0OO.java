package oO00o0O;

import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32329OooO00o;
import oO0OOO00.C32938OooO0Oo;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.InterfaceC33488OooO0OO;

/* JADX INFO: renamed from: oO00o0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32335OooO0OO extends AbstractC33487OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32329OooO00o f116261OooOo0o;

    public C32335OooO0OO(InterfaceC32329OooO00o interfaceC32329OooO00o) {
        this.f116261OooOo0o = interfaceC32329OooO00o;
    }

    @Override // oO0OooOO.AbstractC33487OooO0O0
    public final void OooO0o0(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
        C32938OooO0Oo c32938OooO0Oo = new C32938OooO0Oo(oO00o0.OooO00o.f116236OooO0O0);
        interfaceC33488OooO0OO.OooO00o(c32938OooO0Oo);
        try {
            this.f116261OooOo0o.run();
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
