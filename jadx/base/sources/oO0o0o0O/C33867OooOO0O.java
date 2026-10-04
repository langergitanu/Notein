package oO0o0o0O;

import Oooo0oO.o000000O;
import oO00o.InterfaceC32321OooO0oo;
import oO00oO0.EnumC32397OooO0O0;
import oO00oO0o.C32409OooO00o;
import oO00ooO.C32435OooO0Oo;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.AbstractC33602OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00oO0.C34561OooO0O0;

/* JADX INFO: renamed from: oO0o0o0O.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33867OooOO0O<T> extends AbstractC33602OooO00o<T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C32409OooO00o.C20227OooO00o f122007OooOoO;

    public C33867OooOO0O(InterfaceC34415OooO0oo interfaceC34415OooO0oo, C32409OooO00o.C20227OooO00o c20227OooO00o) {
        super(interfaceC34415OooO0oo, false, true);
        this.f122007OooOoO = c20227OooO00o;
    }

    @Override // oO0o0OO.AbstractC33602OooO00o
    public final void Oooooo(boolean z, Throwable th) {
        try {
            if (this.f122007OooOoO.OooO00o(th)) {
                return;
            }
        } catch (Throwable th2) {
            C32435OooO0Oo.OooO00o(th, th2);
        }
        o000000O.OooO00o(th, this.f121272OooOoO0);
    }

    @Override // oO0o0OO.AbstractC33602OooO00o
    public final void OoooooO(T t) {
        InterfaceC32925OooO0O0 andSet;
        try {
            C32409OooO00o.C20227OooO00o c20227OooO00o = this.f122007OooOoO;
            InterfaceC32925OooO0O0 interfaceC32925OooO0O0 = c20227OooO00o.get();
            EnumC32397OooO0O0 enumC32397OooO0O0 = EnumC32397OooO0O0.f116501OooOo0o;
            if (interfaceC32925OooO0O0 == enumC32397OooO0O0 || (andSet = c20227OooO00o.getAndSet(enumC32397OooO0O0)) == enumC32397OooO0O0) {
                return;
            }
            InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo = c20227OooO00o.f116515OooOo0o;
            try {
                if (t == null) {
                    interfaceC32321OooO0oo.onError(C34561OooO0O0.OooO00o("onSuccess called with a null value."));
                } else {
                    interfaceC32321OooO0oo.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            o000000O.OooO00o(th2, this.f121272OooOoO0);
        }
    }
}
