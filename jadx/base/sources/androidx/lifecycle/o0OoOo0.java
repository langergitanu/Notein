package androidx.lifecycle;

import java.util.HashMap;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f65696OooO00o = 0;

    public static final InterfaceC33636Oooo00o OooO00o(AbstractC22019Ooooooo abstractC22019Ooooooo) {
        Object obj;
        Object obj2;
        HashMap map = abstractC22019Ooooooo.f65677OooO00o;
        if (map == null) {
            obj2 = null;
        } else {
            synchronized (map) {
                obj = abstractC22019Ooooooo.f65677OooO00o.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) obj2;
        if (interfaceC33636Oooo00o != null) {
            return interfaceC33636Oooo00o;
        }
        C33664o00000Oo c33664o00000OoOooO00o = o00000.OooOO0.OooO00o();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return (InterfaceC33636Oooo00o) abstractC22019Ooooooo.OooO0Oo(new C21972OooO0Oo(InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c33664o00000OoOooO00o, C33833OooOOOO.f121946OooO00o.o000OOoO())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }
}
