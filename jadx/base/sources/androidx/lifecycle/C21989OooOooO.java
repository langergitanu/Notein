package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33664o00000Oo;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: androidx.lifecycle.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21989OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f65558OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f65559OooO0O0 = 0;

    public static final OooOo OooO00o(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21987OooOoo, "<this>");
        AbstractC21979OooOOo0 lifecycle = interfaceC21987OooOoo.getLifecycle();
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycle, "<this>");
        while (true) {
            AtomicReference<Object> atomicReference = lifecycle.f65535OooO00o;
            OooOo oooOo = (OooOo) atomicReference.get();
            if (oooOo != null) {
                return oooOo;
            }
            C33664o00000Oo c33664o00000OoOooO00o = o00000.OooOO0.OooO00o();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            OooOo oooOo2 = new OooOo(lifecycle, InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c33664o00000OoOooO00o, C33833OooOOOO.f121946OooO00o.o000OOoO()));
            while (!atomicReference.compareAndSet(null, oooOo2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOo2, C33833OooOOOO.f121946OooO00o.o000OOoO(), null, new C21983OooOo0o(oooOo2, null), 2);
            return oooOo2;
        }
    }
}
