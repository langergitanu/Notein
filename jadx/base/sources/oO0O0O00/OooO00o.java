package oO0O0O00;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import oO0O0O0.AbstractC32570Oooo0O0;
import oOoo0.InterfaceC34599OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean OooO00o(AbstractC32570Oooo0O0 abstractC32570Oooo0O0) {
        if (abstractC32570Oooo0O0 instanceof InterfaceC34599OooO0oo) {
            Field fieldOooO00o = OooO0O0.OooO00o(abstractC32570Oooo0O0);
            if (!(fieldOooO00o != null ? fieldOooO00o.isAccessible() : true)) {
                return false;
            }
            Method methodOooO0O0 = OooO0O0.OooO0O0(abstractC32570Oooo0O0.getGetter());
            if (!(methodOooO0O0 != null ? methodOooO0O0.isAccessible() : true)) {
                return false;
            }
            Method methodOooO0O02 = OooO0O0.OooO0O0(((InterfaceC34599OooO0oo) abstractC32570Oooo0O0).OooO0o0());
            if (!(methodOooO0O02 != null ? methodOooO0O02.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldOooO00o2 = OooO0O0.OooO00o(abstractC32570Oooo0O0);
            if (!(fieldOooO00o2 != null ? fieldOooO00o2.isAccessible() : true)) {
                return false;
            }
            Method methodOooO0O03 = OooO0O0.OooO0O0(abstractC32570Oooo0O0.getGetter());
            if (!(methodOooO0O03 != null ? methodOooO0O03.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
