package oO00o00;

import java.util.concurrent.CancellationException;
import oO0o0OO.AbstractC33673o0ooOO0;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OO.o00oO0O;
import oO0o0OO.o0ooOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {
    public static C33671o00oO0o OooO00o() {
        return new C33671o00oO0o(null);
    }

    public static final void OooO0O0(InterfaceC34415OooO0oo interfaceC34415OooO0oo, CancellationException cancellationException) {
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) interfaceC34415OooO0oo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo != null) {
            interfaceC33672o00ooo.cancel(cancellationException);
        }
    }

    public static final void OooO0OO(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) interfaceC34415OooO0oo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo != null && !interfaceC33672o00ooo.isActive()) {
            throw interfaceC33672o00ooo.getCancellationException();
        }
    }

    public static final InterfaceC33672o00ooo OooO0Oo(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) interfaceC34415OooO0oo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo != null) {
            return interfaceC33672o00ooo;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC34415OooO0oo).toString());
    }

    public static final boolean OooO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) interfaceC34415OooO0oo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo != null) {
            return interfaceC33672o00ooo.isActive();
        }
        return true;
    }

    public static InterfaceC33651OoooOoO OooO0o0(InterfaceC33672o00ooo interfaceC33672o00ooo, AbstractC33673o0ooOO0 abstractC33673o0ooOO0) {
        return interfaceC33672o00ooo instanceof o0ooOOo ? ((o0ooOOo) interfaceC33672o00ooo).Oooo0oo(true, abstractC33673o0ooOO0) : interfaceC33672o00ooo.invokeOnCompletion(abstractC33673o0ooOO0.OooO(), true, new o00oO0O(1, abstractC33673o0ooOO0, AbstractC33673o0ooOO0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }
}
