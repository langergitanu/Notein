package oO0o0OO;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0Oo00oO.C28035OooO00o;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0Ooo.C33835OooOOo;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33633Oooo0 {
    public static final C33822OooO0OO OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        if (interfaceC34415OooO0oo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o) == null) {
            interfaceC34415OooO0oo = interfaceC34415OooO0oo.plus(oO00o00.OooO0OO.OooO00o());
        }
        return new C33822OooO0OO(interfaceC34415OooO0oo);
    }

    public static final C33822OooO0OO OooO0O0() {
        C33664o00000Oo c33664o00000OoOooO00o = o00000.OooOO0.OooO00o();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return new C33822OooO0OO(InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c33664o00000OoOooO00o, C33833OooOOOO.f121946OooO00o));
    }

    public static final void OooO0OO(InterfaceC33636Oooo00o interfaceC33636Oooo00o, String str, Throwable th) {
        OooO0Oo(interfaceC33636Oooo00o, C28035OooO00o.OooO00o(str, th));
    }

    public static final void OooO0Oo(InterfaceC33636Oooo00o interfaceC33636Oooo00o, CancellationException cancellationException) {
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) interfaceC33636Oooo00o.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo != null) {
            interfaceC33672o00ooo.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC33636Oooo00o).toString());
        }
    }

    public static final boolean OooO0o(InterfaceC33636Oooo00o interfaceC33636Oooo00o) {
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) interfaceC33636Oooo00o.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo != null) {
            return interfaceC33672o00ooo.isActive();
        }
        return true;
    }

    public static final <R> Object OooO0o0(InterfaceC32508OooOOOo<? super InterfaceC33636Oooo00o, ? super Continuation<? super R>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super R> continuation) {
        C33835OooOOo c33835OooOOo = new C33835OooOOo(continuation, continuation.getContext());
        Object objOooO0o0 = o00OO00O.OooO0O0.OooO0o0(c33835OooOOo, c33835OooOOo, interfaceC32508OooOOOo);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooO0o0;
    }

    public static final C33822OooO0OO OooO0oO(InterfaceC33636Oooo00o interfaceC33636Oooo00o, AbstractC33659Oooooo abstractC33659Oooooo) {
        return new C33822OooO0OO(interfaceC33636Oooo00o.OooOOO0().plus(abstractC33659Oooooo));
    }
}
