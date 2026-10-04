package oO0o0OO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0o0Ooo.C33824OooO0o;
import oO0o0Ooo.C33844OooOoO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33669o000oOoO {
    public static final void OooO00o(C33614OooOOO0 c33614OooOOO0, Continuation continuation, boolean z) {
        Object obj = C33614OooOOO0.f121295OooOoo.get(c33614OooOOO0);
        Throwable thOooO0o0 = c33614OooOOO0.OooO0o0(obj);
        Object objOooO00o = thOooO0o0 != null ? C32446OooOOOo.OooO00o(thOooO0o0) : c33614OooOOO0.OooO0o(obj);
        if (!z) {
            continuation.resumeWith(objOooO00o);
            return;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C33824OooO0o c33824OooO0o = (C33824OooO0o) continuation;
        AbstractC32479OooO0OO abstractC32479OooO0OO = c33824OooO0o.f121920OooOoOO;
        InterfaceC34415OooO0oo context = abstractC32479OooO0OO.getContext();
        Object objOooO0OO = C33844OooOoO0.OooO0OO(context, c33824OooO0o.f121921OooOoo);
        o0000O0<?> o0000o0OooO0OO = objOooO0OO != C33844OooOoO0.f121957OooO00o ? C33628OooOoo.OooO0OO(abstractC32479OooO0OO, context, objOooO0OO) : null;
        try {
            abstractC32479OooO0OO.resumeWith(objOooO00o);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            if (o0000o0OooO0OO == null || o0000o0OooO0OO.o0OoOo0()) {
                C33844OooOoO0.OooO00o(context, objOooO0OO);
            }
        } catch (Throwable th) {
            if (o0000o0OooO0OO == null || o0000o0OooO0OO.o0OoOo0()) {
                C33844OooOoO0.OooO00o(context, objOooO0OO);
            }
            throw th;
        }
    }

    public static void OooO0O0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
