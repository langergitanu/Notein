package Oooo0;

import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import OooooO0.C21292OooO0oo;
import OooooO0.C21294OooOO0O;
import o00000.C24073OoooO;
import o00000.InterfaceC24054OooOo0;
import oo000o.InterfaceC34635OooOOOO;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 {
    public static void OooO00o(o00000.Oooo0 oooo0, C20864o00000o0 c20864o00000o0, C34695OooOOo0 c34695OooOOo0, InterfaceC34635OooOOOO layoutCoordinates, C24073OoooO textInputSession, boolean z, InterfaceC24054OooOo0 interfaceC24054OooOo0) {
        C21291OooO0oO c21291OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutCoordinates, "layoutCoordinates");
        kotlin.jvm.internal.OooOOO0.OooO0oO(textInputSession, "textInputSession");
        if (z) {
            int iOooO0O0 = interfaceC24054OooOo0.OooO0O0(C34696OooOOoo.OooO0OO(oooo0.f81084OooO0O0));
            if (iOooO0O0 < c34695OooOOo0.f124972OooO00o.f124963OooO00o.f124887OooOo0o.length()) {
                c21291OooO0oO = c34695OooOOo0.OooO0O0(iOooO0O0);
            } else if (iOooO0O0 != 0) {
                c21291OooO0oO = c34695OooOOo0.OooO0O0(iOooO0O0 - 1);
            } else {
                c21291OooO0oO = new C21291OooO0oO(0.0f, 0.0f, 1.0f, (int) (o0000O0O.OooO00o(c20864o00000o0.f60010OooO0O0, c20864o00000o0.f60015OooO0oO, c20864o00000o0.f60016OooO0oo, o0000O0O.f60030OooO00o, 1) & 4294967295L));
            }
            long jOooOOOo = layoutCoordinates.OooOOOo(C21289OooO0o.OooO00o(c21291OooO0oO.f61724OooO00o, c21291OooO0oO.f61725OooO0O0));
            C21291OooO0oO c21291OooO0oOOooO0Oo = C21292OooO0oo.OooO0Oo(C21289OooO0o.OooO00o(C21290OooO0o0.OooO0OO(jOooOOOo), C21290OooO0o0.OooO0Oo(jOooOOOo)), C21294OooOO0O.OooO00o(c21291OooO0oO.OooO0OO(), c21291OooO0oO.OooO0O0()));
            if (textInputSession.OooO00o()) {
                textInputSession.f81119OooO0O0.OooO00o(c21291OooO0oOOooO0Oo);
            }
        }
    }
}
