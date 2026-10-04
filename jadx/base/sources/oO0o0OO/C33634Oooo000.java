package oO0o0OO;

import o00O0oo0.C24961OooO00o;
import oO00ooO.C32435OooO0Oo;
import oO0o0OO.InterfaceC33631OooOooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33634Oooo000 {
    public static final void OooO00o(Throwable th, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        try {
            InterfaceC33631OooOooo interfaceC33631OooOooo = (InterfaceC33631OooOooo) interfaceC34415OooO0oo.get(InterfaceC33631OooOooo.OooO00o.f121313OooOo0o);
            if (interfaceC33631OooOooo != null) {
                interfaceC33631OooOooo.o000O00O(th);
            } else {
                C24961OooO00o.OooO0O0(th, interfaceC34415OooO0oo);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C32435OooO0Oo.OooO00o(runtimeException, th);
                th = runtimeException;
            }
            C24961OooO00o.OooO0O0(th, interfaceC34415OooO0oo);
        }
    }
}
