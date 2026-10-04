package o00Ooo;

import java.util.LinkedHashMap;
import java.util.List;
import o00oO0O.InterfaceC25547o0ooOO0;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: o00Ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25076OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34635OooOOOO f85104OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25080OooOO0o f85105OooO0O0;

    public C25076OooO0o(InterfaceC34635OooOOOO rootCoordinates) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rootCoordinates, "rootCoordinates");
        this.f85104OooO00o = rootCoordinates;
        this.f85105OooO0O0 = new C25080OooOO0o();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(long j, List<? extends InterfaceC25547o0ooOO0> pointerInputNodes) {
        Object obj;
        OooOO0O oooOO0O;
        kotlin.jvm.internal.OooOOO0.OooO0oO(pointerInputNodes, "pointerInputNodes");
        C25080OooOO0o c25080OooOO0o = this.f85105OooO0O0;
        int size = pointerInputNodes.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC25547o0ooOO0 interfaceC25547o0ooOO0 = pointerInputNodes.get(i);
            if (z) {
                Oooo.OooO0O0 oooO0O0 = (Oooo.OooO0O0) c25080OooOO0o.f85125OooO00o;
                int i2 = oooO0O0.f59746OooOoO0;
                if (i2 > 0) {
                    Object[] objArr = oooO0O0.f59745OooOo0o;
                    int i3 = 0;
                    do {
                        obj = objArr[i3];
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O) obj).f85118OooO0O0, interfaceC25547o0ooOO0)) {
                            break;
                        } else {
                            i3++;
                        }
                    } while (i3 < i2);
                    obj = null;
                    oooOO0O = (OooOO0O) obj;
                    if (oooOO0O == null) {
                        oooOO0O.f85124OooO0oo = true;
                        C25084OooOOoo c25084OooOOoo = new C25084OooOOoo(j);
                        Oooo.OooO0O0<C25084OooOOoo> oooO0O02 = oooOO0O.f85119OooO0OO;
                        if (!oooO0O02.OooO0oO(c25084OooOOoo)) {
                            oooO0O02.OooO0O0(new C25084OooOOoo(j));
                        }
                        c25080OooOO0o = oooOO0O;
                    } else {
                        z = false;
                        OooOO0O oooOO0O2 = new OooOO0O(interfaceC25547o0ooOO0);
                        oooOO0O2.f85119OooO0OO.OooO0O0(new C25084OooOOoo(j));
                        ((Oooo.OooO0O0) c25080OooOO0o.f85125OooO00o).OooO0O0(oooOO0O2);
                        c25080OooOO0o = oooOO0O2;
                    }
                } else {
                    obj = null;
                    oooOO0O = (OooOO0O) obj;
                    if (oooOO0O == null) {
                    }
                }
            } else {
                OooOO0O oooOO0O22 = new OooOO0O(interfaceC25547o0ooOO0);
                oooOO0O22.f85119OooO0OO.OooO0O0(new C25084OooOOoo(j));
                ((Oooo.OooO0O0) c25080OooOO0o.f85125OooO00o).OooO0O0(oooOO0O22);
                c25080OooOO0o = oooOO0O22;
            }
        }
    }

    public final boolean OooO0O0(C25078OooO0oO c25078OooO0oO, boolean z) {
        boolean z2;
        boolean z3;
        C25080OooOO0o c25080OooOO0o = this.f85105OooO0O0;
        LinkedHashMap linkedHashMap = c25078OooO0oO.f85108OooO00o;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO = this.f85104OooO00o;
        if (c25080OooOO0o.OooO00o(linkedHashMap, interfaceC34635OooOOOO, c25078OooO0oO, z)) {
            Oooo.OooO0O0 oooO0O0 = (Oooo.OooO0O0) c25080OooOO0o.f85125OooO00o;
            int i = oooO0O0.f59746OooOoO0;
            if (i > 0) {
                Object[] objArr = oooO0O0.f59745OooOo0o;
                int i2 = 0;
                z2 = false;
                do {
                    z2 = ((OooOO0O) objArr[i2]).OooO0o(linkedHashMap, interfaceC34635OooOOOO, c25078OooO0oO, z) || z2;
                    i2++;
                } while (i2 < i);
            } else {
                z2 = false;
            }
            int i3 = oooO0O0.f59746OooOoO0;
            if (i3 > 0) {
                Object[] objArr2 = oooO0O0.f59745OooOo0o;
                int i4 = 0;
                z3 = false;
                do {
                    z3 = ((OooOO0O) objArr2[i4]).OooO0o0(c25078OooO0oO) || z3;
                    i4++;
                } while (i4 < i3);
            } else {
                z3 = false;
            }
            c25080OooOO0o.OooO0O0(c25078OooO0oO);
            if (z3 || z2) {
                return true;
            }
        }
        return false;
    }
}
