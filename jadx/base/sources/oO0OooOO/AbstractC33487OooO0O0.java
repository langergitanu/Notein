package oO0OooOO;

import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32329OooO00o;
import oO00o0O.C32333OooO00o;
import oO00o0O.C32337OooO0o;

/* JADX INFO: renamed from: oO0OooOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33487OooO0O0 implements InterfaceC33489OooO0Oo {
    @Override // oO0OooOO.InterfaceC33489OooO0Oo
    public final void OooO00o(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
        try {
            OooO0o0(interfaceC33488OooO0OO);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            oO0OOO0O.OooO00o.OooO0O0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final C32333OooO00o OooO0OO(AbstractC33487OooO0O0 abstractC33487OooO0O0) {
        o00Oo0.OooO00o(abstractC33487OooO0O0, "other is null");
        return new C32333OooO00o(new InterfaceC33489OooO0Oo[]{this, abstractC33487OooO0O0});
    }

    public final C32337OooO0o OooO0Oo(InterfaceC32329OooO00o interfaceC32329OooO00o) {
        return new C32337OooO0o(this, oO00o0.OooO00o.f116238OooO0Oo, interfaceC32329OooO00o);
    }

    public abstract void OooO0o0(InterfaceC33488OooO0OO interfaceC33488OooO0OO);
}
