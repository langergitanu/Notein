package o0ooOO0;

import Oooo0oO.C21074OooooOo;
import Oooo0oO.C21082o00000oO;
import Oooo0oO.InterfaceC21078Ooooooo;
import OoooOoO.InterfaceC21235OooO0oO;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33633Oooo0;
import oO0o0Ooo.C33822OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0ooOO0.o000O0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC31588o000O0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f112859OooO00o = OooO00o.f112860OooO00o;

    /* JADX INFO: renamed from: o0ooOO0.o000O0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f112860OooO00o = new OooO00o();

        /* JADX INFO: renamed from: o0ooOO0.o000O0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20174OooO00o implements InterfaceC31588o000O0oo {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final C20174OooO00o f112861OooO0O0 = new C20174OooO00o();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [oOo0000O.OooO0oo] */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v6, types: [oOo0000O.OooO0oo] */
            /* JADX WARN: Type inference failed for: r1v7, types: [T, o0ooOO0.o0OO00O] */
            @Override // o0ooOO0.InterfaceC31588o000O0oo
            public final C21082o00000oO OooO00o(View view) {
                InterfaceC34415OooO0oo interfaceC34415OooO0oo;
                Oooo0oO.oo0o0Oo oo0o0oo;
                LinkedHashMap linkedHashMap = C31592o000Oo00.f112895OooO00o;
                InterfaceC34415OooO0oo interfaceC34415OooO0oo2 = oOo0000O.OooO.f123416OooOo0o;
                InterfaceC21078Ooooooo.OooO00o oooO00o = InterfaceC21078Ooooooo.OooO00o.f61048OooOo0o;
                C32447OooOOo c32447OooOOo = C31542OoooOOO.f112743Oooo0;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    interfaceC34415OooO0oo = (InterfaceC34415OooO0oo) C31542OoooOOO.f112743Oooo0.getValue();
                } else {
                    interfaceC34415OooO0oo = C31542OoooOOO.f112744Oooo0O0.get();
                    if (interfaceC34415OooO0oo == null) {
                        throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                    }
                }
                InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = interfaceC34415OooO0oo.plus(interfaceC34415OooO0oo2);
                InterfaceC21078Ooooooo interfaceC21078Ooooooo = (InterfaceC21078Ooooooo) interfaceC34415OooO0ooPlus.get(oooO00o);
                if (interfaceC21078Ooooooo != null) {
                    Oooo0oO.oo0o0Oo oo0o0oo2 = new Oooo0oO.oo0o0Oo(interfaceC21078Ooooooo);
                    C21074OooooOo c21074OooooOo = oo0o0oo2.f61268OooOo;
                    synchronized (c21074OooooOo.f61040OooO00o) {
                        c21074OooooOo.f61043OooO0Oo = false;
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    oo0o0oo = oo0o0oo2;
                } else {
                    oo0o0oo = null;
                }
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                InterfaceC21235OooO0oO interfaceC21235OooO0oO = (InterfaceC21235OooO0oO) interfaceC34415OooO0ooPlus.get(InterfaceC21235OooO0oO.OooO00o.f61615OooOo0o);
                ?? r1 = interfaceC21235OooO0oO;
                if (interfaceC21235OooO0oO == null) {
                    ?? o0oo00o2 = new o0OO00O();
                    c24034Oooo00O.f80942OooOo0o = o0oo00o2;
                    r1 = o0oo00o2;
                }
                if (oo0o0oo != null) {
                    interfaceC34415OooO0oo2 = oo0o0oo;
                }
                InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus2 = interfaceC34415OooO0ooPlus.plus(interfaceC34415OooO0oo2).plus(r1);
                C21082o00000oO c21082o00000oO = new C21082o00000oO(interfaceC34415OooO0ooPlus2);
                C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(interfaceC34415OooO0ooPlus2);
                InterfaceC21987OooOoo interfaceC21987OooOooOooO00o = androidx.lifecycle.oo000o.OooO00o(view);
                AbstractC21979OooOOo0 lifecycle = interfaceC21987OooOooOooO00o != null ? interfaceC21987OooOooOooO00o.getLifecycle() : null;
                if (lifecycle != null) {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC31589o000OO0o(view, c21082o00000oO));
                    lifecycle.OooO00o(new o000OOO(c33822OooO0OOOooO00o, oo0o0oo, c21082o00000oO, c24034Oooo00O, view));
                    return c21082o00000oO;
                }
                throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
            }
        }
    }

    C21082o00000oO OooO00o(View view);
}
