package Oooo0oO;

import OooOo.C20486OooOoO0;
import OooOo.C20492Oooo00O;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21047OooOoo0;
import java.util.ArrayList;

/* JADX INFO: renamed from: Oooo0oO.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21038OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0OOO0o f60946OooO00o = new o0OOO0o("provider");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0OOO0o f60947OooO0O0 = new o0OOO0o("provider");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0OOO0o f60948OooO0OO = new o0OOO0o("compositionLocalMap");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OOO0o f60949OooO0Oo = new o0OOO0o("providers");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0OOO0o f60951OooO0o0 = new o0OOO0o("reference");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C21042OooOo0o f60950OooO0o = new C21042OooOo0o();

    public static final void OooO00o(ArrayList arrayList, int i, int i2) {
        int iOooO0o0 = OooO0o0(i, arrayList);
        if (iOooO0o0 < 0) {
            iOooO0o0 = -(iOooO0o0 + 1);
        }
        while (iOooO0o0 < arrayList.size() && ((C21070Ooooo00) arrayList.get(iOooO0o0)).f61027OooO0O0 < i2) {
            arrayList.remove(iOooO0o0);
        }
    }

    public static final void OooO0O0(C21092o0000o0 c21092o0000o0, ArrayList arrayList, int i) {
        int[] iArr = c21092o0000o0.f61142OooO0O0;
        if (C21091o0000o.OooO0oO(iArr, i)) {
            arrayList.add(c21092o0000o0.OooO(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            OooO0O0(c21092o0000o0, arrayList, i3);
        }
    }

    public static final void OooO0OO(String str) {
        throw new C21031OooOOO(C20593OooO0Oo.OooO0O0("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void OooO0Oo(String str) {
        throw new C21031OooOOO(C20593OooO0Oo.OooO0O0("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void OooO0o(C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o) {
        int iOooOOOO;
        int[] iArr = c21096o0000oO0.f61180OooO0O0;
        int i = c21096o0000oO0.f61196OooOOoo;
        int iOooO0o = c21096o0000oO0.OooO0o(iArr, c21096o0000oO0.OooOOOo(c21096o0000oO0.OooOOo0(i) + i));
        for (int iOooO0o2 = c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(c21096o0000oO0.f61196OooOOoo)); iOooO0o2 < iOooO0o; iOooO0o2++) {
            Object obj = c21096o0000oO0.f61181OooO0OO[c21096o0000oO0.OooO0oO(iOooO0o2)];
            int iOooO0OO = -1;
            if (obj instanceof InterfaceC21032OooOOO0) {
                int iOooOOOO2 = c21096o0000oO0.OooOOOO() - iOooO0o2;
                InterfaceC21032OooOOO0 interfaceC21032OooOOO0 = (InterfaceC21032OooOOO0) obj;
                C20486OooOoO0<InterfaceC21032OooOOO0> c20486OooOoO0 = oooO00o.f60987OooO0o0;
                if (c20486OooOoO0 == null) {
                    int i2 = C20492Oooo00O.f58547OooO00o;
                    c20486OooOoO0 = new C20486OooOoO0<>((Object) null);
                    oooO00o.f60987OooO0o0 = c20486OooOoO0;
                }
                c20486OooOoO0.f58542OooO0O0[c20486OooOoO0.OooO0o(interfaceC21032OooOOO0)] = interfaceC21032OooOOO0;
                oooO00o.OooO0Oo(iOooOOOO2, -1, -1, interfaceC21032OooOOO0);
            }
            if (obj instanceof o0000OO) {
                int iOooOOOO3 = c21096o0000oO0.OooOOOO() - iOooO0o2;
                o0000OO o0000oo2 = (o0000OO) obj;
                C21025OooO0o0 c21025OooO0o0 = o0000oo2.f61133OooO0O0;
                if (c21025OooO0o0 == null || !c21025OooO0o0.OooO00o()) {
                    iOooOOOO = -1;
                } else {
                    iOooO0OO = c21096o0000oO0.OooO0OO(c21025OooO0o0);
                    iOooOOOO = c21096o0000oO0.OooOOOO() - c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(c21096o0000oO0.OooOOo0(iOooO0OO) + iOooO0OO));
                }
                oooO00o.OooO0Oo(iOooOOOO3, iOooO0OO, iOooOOOO, o0000oo2.f61132OooO00o);
            }
            if (obj instanceof o00000OO) {
                ((o00000OO) obj).OooO0Oo();
            }
        }
        c21096o0000oO0.OooOoo0();
    }

    public static final int OooO0o0(int i, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iOooO = kotlin.jvm.internal.OooOOO0.OooO(((C21070Ooooo00) arrayList.get(i3)).f61027OooO0O0, i);
            if (iOooO < 0) {
                i2 = i3 + 1;
            } else {
                if (iOooO <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void OooO0oO(boolean z) {
        if (z) {
            return;
        }
        OooO0OO("Check failed");
        throw null;
    }
}
